package net.xanthian.variantcraftingtables.resource;

import com.google.gson.Gson;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.PackLocationInfo;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.MetadataSectionType;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.server.packs.resources.IoSupplier;
import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.block.DynamicTables;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/** An in-memory pack above vanilla defaults. Mod/user packs can override generated entries. */
public final class GeneratedTablePack implements PackResources {
    private static final Gson GSON = new Gson();
    private final PackType type;
    private final Map<Identifier, byte[]> resources = new LinkedHashMap<>();

    public GeneratedTablePack(PackType type, List<DynamicTables.Variant> variants) {
        this.type = type;
        Map<String, String> names = new LinkedHashMap<>();
        for (var variant : variants) {
            Identifier id = variant.id();
            String model = id.getNamespace() + ":block/" + id.getPath();
            if (type == PackType.CLIENT_RESOURCES) {
                put(id, "blockstates/", Map.of("variants", Map.of("", Map.of("model", model))));
                put(id, "items/", Map.of("model", Map.of("type", "minecraft:model", "model", model)));
                put(id, "models/block/", Map.of("parent", "minecraft:block/cube", "textures", Map.of(
                        "down", model + "_bottom", "up", model + "_top", "north", model + "_front",
                        "east", model + "_side", "south", model + "_side", "west", model + "_front",
                        "particle", model + "_front")));
                names.put("block." + id.getNamespace() + "." + id.getPath().replace('/', '.'), displayName(variant.planks()));
            } else {
                put(id, "recipe/", Map.of("type", "minecraft:crafting_shaped", "category", "misc",
                        "pattern", List.of("##", "##"), "key", Map.of("#", variant.ingredient().toString()),
                        "result", Map.of("id", id.toString())));
                put(id, "loot_table/blocks/", Map.of("type", "minecraft:block", "pools", List.of(Map.of(
                        "rolls", 1, "condition", Map.of("type", "minecraft:survives_explosion"),
                        "entries", List.of(Map.of("type", "minecraft:item", "name", id.toString()))))));
                put(id, "advancement/recipes/misc/", Map.of("parent", "minecraft:recipes/root",
                        "criteria", Map.of("has_planks", Map.of("trigger", "minecraft:inventory_changed",
                                "conditions", Map.of("items", List.of(Map.of("items", variant.ingredient().toString()))))),
                        "requirements", List.of(List.of("has_planks")), "rewards", Map.of("recipes", List.of(id.toString()))));
            }
        }
        if (!variants.isEmpty()) {
            Identifier mod = Identifier.fromNamespaceAndPath(Initialise.MOD_ID, "crafting_tables");
            if (type == PackType.CLIENT_RESOURCES) {
                names.put("block.minecraft.crafting_table", "Oak Crafting Table");
                names.put("tag.item.variantcraftingtables.crafting_tables", "Crafting Tables");
                put(Identifier.fromNamespaceAndPath(Initialise.MOD_ID, "en_us"), "lang/", names);
            } else {
                List<String> ids = variants.stream().map(variant -> variant.id().toString()).toList();
                put(mod, "tags/block/", Map.of("replace", false, "values", ids));
                put(mod, "tags/item/", Map.of("replace", false, "values", ids));
                Map<String, Object> tableTag = Map.of("replace", false, "values", List.of("#" + mod));
                put(Identifier.withDefaultNamespace("mineable/axe"), "tags/block/", tableTag);
                put(Identifier.fromNamespaceAndPath("c", "workbench"), "tags/block/", tableTag);
                put(Identifier.fromNamespaceAndPath("c", "workbench"), "tags/item/", tableTag);
                Identifier conversion = Identifier.fromNamespaceAndPath(Initialise.MOD_ID, "crafting_table_from_variants");
                put(conversion, "recipe/", Map.of("type", "minecraft:crafting_shapeless",
                        "ingredients", List.of("#" + mod), "result", Map.of("id", "minecraft:crafting_table")));
                put(conversion, "advancement/recipes/misc/", Map.of("parent", "minecraft:recipes/root",
                        "criteria", Map.of("has_crafting_table", Map.of("trigger", "minecraft:inventory_changed",
                                "conditions", Map.of("items", List.of(Map.of("items", "#" + mod))))),
                        "requirements", List.of(List.of("has_crafting_table")),
                        "rewards", Map.of("recipes", List.of(conversion.toString()))));
                put(Identifier.withDefaultNamespace("crafting_table"), "recipe/",
                        Map.of("type", "minecraft:crafting_shaped", "pattern", List.of("##", "##"),
                                "key", Map.of("#", "minecraft:oak_planks"),
                                "result", Map.of("id", "minecraft:crafting_table")));
                List<String> nonFlammable = variants.stream().filter(DynamicTables.Variant::nonFlammable)
                        .map(variant -> variant.id().toString()).toList();
                if (!nonFlammable.isEmpty()) {
                    put(Identifier.withDefaultNamespace("non_flammable_wood"), "tags/item/",
                            Map.of("replace", false, "values", nonFlammable));
                }
            }
        }
    }

    private void put(Identifier id, String directory, Object json) {
        resources.put(Identifier.fromNamespaceAndPath(id.getNamespace(), directory + id.getPath() + ".json"),
                GSON.toJson(json).getBytes(StandardCharsets.UTF_8));
    }

    private static String displayName(Identifier planks) {
        String path = planks.getPath().replaceFirst("(^|[/_])planks$", "").replace('/', ' ').replace('_', ' ').trim();
        if (path.isEmpty()) {
            path = planks.getNamespace().replace('_', ' ');
        }
        StringBuilder name = new StringBuilder();
        for (String word : path.split(" +")) {
            name.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(' ');
        }
        return name + "Crafting Table";
    }

    @Override
    public IoSupplier<InputStream> getResource(PackType type, Identifier id) {
        byte[] bytes = this.type == type ? resources.get(id) : null;
        return bytes == null ? null : () -> new ByteArrayInputStream(bytes);
    }

    @Override
    public void listResources(PackType type, String namespace, String prefix, ResourceOutput output) {
        if (this.type == type) {
            resources.forEach((id, bytes) -> {
                if (id.getNamespace().equals(namespace) && id.getPath().startsWith(prefix + "/")) {
                    output.accept(id, () -> new ByteArrayInputStream(bytes));
                }
            });
        }
    }

    @Override
    public Set<String> getNamespaces(PackType type) {
        return this.type == type ? resources.keySet().stream().map(Identifier::getNamespace)
                .collect(java.util.stream.Collectors.toUnmodifiableSet()) : Set.of();
    }

    @Override
    public PackLocationInfo location() {
        return new PackLocationInfo("variantcraftingtables:generated", Component.literal("Generated Crafting Tables"),
                PackSource.BUILT_IN, Optional.empty());
    }

    @Override
    public IoSupplier<InputStream> getRootResource(String... path) {
        return null;
    }

    @Override
    public <T> T getMetadataSection(MetadataSectionType<T> type) {
        return null;
    }

    @Override
    public void close() {
        // Only immutable byte arrays are retained; no open resources.
    }
}
