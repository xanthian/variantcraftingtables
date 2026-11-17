package net.xanthian.variantcraftingtables.block;

import com.mojang.logging.LogUtils;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.xanthian.variantcraftingtables.Initialise;

import java.util.Comparator;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/** Handles existing and future plank block items through Fabric's registry callbacks. */
public final class DynamicTables {
    public record Variant(Identifier id, Identifier planks, Identifier ingredient, Block block,
                          boolean nonFlammable) {
    }

    private static List<Variant> variants = List.of();
    private static boolean initialized;
    private static boolean logged;
    private static Set<Identifier> blockTags = Set.of();
    private static Set<Identifier> itemTags = Set.of();
    private static Set<Identifier> nonFlammable = Set.of();
    private static final Set<Identifier> processed = new HashSet<>();
    private static final Map<Block, Identifier> pendingItems = new IdentityHashMap<>();
    private static final Map<Identifier, Variant> registered = new TreeMap<>(Comparator.comparing(Identifier::toString));

    private DynamicTables() {
    }

    public static List<Variant> variants() {
        return variants;
    }

    public static void register() {
        if (initialized) {
            return;
        }
        initialized = true;

        List<java.nio.file.Path> roots = FabricLoader.getInstance().getAllMods().stream()
                .sorted(Comparator.comparing(mod -> mod.getMetadata().getId()))
                .flatMap(mod -> mod.getRootPaths().stream()).toList();
        PlankDiscovery discovery = new PlankDiscovery(roots);
        blockTags = discovery.entries("block", Identifier.withDefaultNamespace("planks"));
        itemTags = discovery.entries("item", Identifier.withDefaultNamespace("planks"));
        nonFlammable = discovery.entries("item", Identifier.withDefaultNamespace("non_flammable_wood"));

        // Normally blocks arrive before their items. Also handle the reverse registration order.
        RegistryEntryAddedCallback.allEntries(BuiltInRegistries.BLOCK, holder -> {
            Identifier ingredient = pendingItems.remove(holder.value());
            if (ingredient != null) {
                registerCandidate(holder.value(), ingredient);
            }
        });
        RegistryEntryAddedCallback.allEntries(BuiltInRegistries.ITEM, holder -> {
            if (holder.value() instanceof BlockItem item && !(item.getBlock() instanceof CraftingTableBlock)) {
                registerCandidate(item.getBlock(), holder.key().identifier());
            }
        });
        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.SERVER) {
            ServerLifecycleEvents.SERVER_STARTING.register(server -> logRegistration());
        }
    }

    private static void registerCandidate(Block planks, Identifier ingredient) {
        // DefaultedRegistry.getKey would report minecraft:air for an unregistered block.
        Identifier plankId = BuiltInRegistries.BLOCK.getResourceKey(planks).map(ResourceKey::identifier).orElse(null);
        if (plankId == null) {
            pendingItems.put(planks, ingredient);
            return;
        }
        if (plankId.equals(Identifier.withDefaultNamespace("oak_planks"))
                || (!PlankDiscovery.hasPlankName(plankId) && !blockTags.contains(plankId) && !itemTags.contains(ingredient))
                || !processed.add(plankId)) {
            return;
        }
        Identifier id = tableId(plankId);
        if (BuiltInRegistries.BLOCK.containsKey(id) || BuiltInRegistries.ITEM.containsKey(id)) {
            LogUtils.getLogger().warn("Skipping crafting table for {}: {} is already registered", plankId, id);
            return;
        }
        // Never let a defaulted registry turn a missing ingredient into an air recipe.
        if (ingredient.equals(Identifier.withDefaultNamespace("air")) || !BuiltInRegistries.ITEM.containsKey(ingredient)) {
            LogUtils.getLogger().warn("Skipping crafting table for {}: ingredient {} is not a registered usable item",
                    plankId, ingredient);
            return;
        }
        // Read mod-owned behaviour before constructing objects with intrusive registry holders.
        // A failed source read changes only properties, never the client/server table catalogue.
        var blockProperties = tableProperties(planks, plankId)
                .overrideLootTable(java.util.Optional.of(ResourceKey.create(Registries.LOOT_TABLE,
                        id.withPrefix("blocks/"))))
                .setId(ResourceKey.create(Registries.BLOCK, id));
        Block block;
        String stage = "constructing the block";
        try {
            block = new VariantCraftingTableBlock(blockProperties);
            stage = "constructing the item";
            Item.Properties properties = new Item.Properties().useBlockDescriptionPrefix()
                    .setId(ResourceKey.create(Registries.ITEM, id));
            BlockItem item = new BlockItem(block, properties);
            // Prepare both objects before writing either registry. Constructor failures cannot
            // safely be skipped either: constructors may already have created intrusive holders.
            stage = "registering the block";
            Registry.register(BuiltInRegistries.BLOCK, id, block);
            stage = "registering the item";
            Registry.register(BuiltInRegistries.ITEM, id, item);
        } catch (RuntimeException exception) {
            throw new IllegalStateException("[Variant Crafting Tables] Failed " + stage + " for " + id
                    + " from plank " + plankId + " (ingredient " + ingredient + ")."
                    + " Loading must stop because registry changes cannot be safely rolled back.", exception);
        }
        registered.put(id, new Variant(id, plankId, ingredient, block, nonFlammable.contains(ingredient)));
        // Consumers always see an immutable, sorted catalogue, regardless of registration order.
        variants = List.copyOf(registered.values());
    }

    private static BlockBehaviour.Properties tableProperties(Block planks, Identifier plankId) {
        // Vanilla table properties, starting without the oak table's lava-ignition flag.
        // That flag can only be enabled by the properties API, so copying oak cannot clear it.
        var properties = BlockBehaviour.Properties.of().mapColor(MapColor.WOOD)
                .instrument(NoteBlockInstrument.BASS).strength(2.5F).sound(SoundType.WOOD);
        boolean ignitedByLava = false;
        try {
            ignitedByLava = planks.defaultBlockState().ignitedByLava();
        } catch (RuntimeException exception) {
            LogUtils.getLogger().warn("Could not read lava ignition for {}; keeping its crafting table lava-safe",
                    plankId, exception);
        }
        if (ignitedByLava) {
            properties.ignitedByLava();
        }
        return properties;
    }

    public static void logRegistration() {
        if (logged) {
            return;
        }
        logged = true;
        var logger = LogUtils.getLogger();
        var byMod = variants.stream().collect(Collectors.groupingBy(
                variant -> variant.planks().getNamespace(), TreeMap::new, Collectors.toList()));
        byMod.forEach((mod, tables) -> {
            // Keep every wood name in a single log entry per source namespace.
            String woods = tables.stream().map(variant -> {
                String plank = variant.planks().getPath();
                String wood = plank.replaceFirst("(^|[/_])planks?$", "");
                return wood.isEmpty() ? mod : wood.replace('_', ' ').replace('/', ' ');
            }).collect(Collectors.joining(", "));
            logger.info("{}: detected {} planks, added tables for {}", mod, tables.size(), woods);
        });
        // Full IDs remain available for diagnostics without filling the normal startup log.
        variants.forEach(variant -> logger.debug("[Variant Crafting Tables] Detected {}; registered {}",
                variant.planks(), variant.id()));
        long vanilla = variants.stream().filter(variant -> variant.planks().getNamespace().equals("minecraft")).count();
        logger.info("[Variant Crafting Tables] Loaded {} crafting tables ({} generated: {} vanilla, {} modded; plus existing oak)",
                variants.size() + 1, variants.size(), vanilla, variants.size() - vanilla);
    }

    public static Identifier tableId(Identifier planks) {
        // Retain the full source ID: similarly named woods from different mods cannot collide.
        String path = planks.getNamespace().equals("minecraft")
                ? planks.getPath().replaceFirst("_planks$", "") + "_crafting_table"
                : "mod/" + planks.getNamespace() + "/" + planks.getPath() + "_crafting_table";
        return Identifier.fromNamespaceAndPath(Initialise.MOD_ID, path);
    }
}
