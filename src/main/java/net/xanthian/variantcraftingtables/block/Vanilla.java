package net.xanthian.variantcraftingtables.block;

import com.google.common.collect.Maps;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.CookingFuel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.storage.loot.providers.number.floats.ContextFloatProviders;
import net.minecraft.world.level.storage.loot.providers.number.floats.ResolvableFloat;
import net.minecraft.world.level.storage.loot.providers.number.ints.ResolvableInt;
import net.xanthian.variantcraftingtables.Initialise;

import java.util.Map;

public class Vanilla {

    // Must be declared before the blocks, because registerBlock() writes to it during static init
    public static final Map<Identifier, Block> VANILLA_CRAFTING_TABLES = Maps.newHashMap();

    public static final Block ACACIA_CRAFTING_TABLE = registerBlock("acacia_crafting_table", copyOfVanilla(), 300);
    public static final Block BAMBOO_CRAFTING_TABLE = registerBlock("bamboo_crafting_table", copyOfVanilla(), 300);
    public static final Block BIRCH_CRAFTING_TABLE = registerBlock("birch_crafting_table", copyOfVanilla(), 300);
    public static final Block CHERRY_CRAFTING_TABLE = registerBlock("cherry_crafting_table", copyOfVanilla(), 300);
    public static final Block CRIMSON_CRAFTING_TABLE = registerBlock("crimson_crafting_table", netherWood(MapColor.CRIMSON_STEM), 0);
    public static final Block DARK_OAK_CRAFTING_TABLE = registerBlock("dark_oak_crafting_table", copyOfVanilla(), 300);
    public static final Block JUNGLE_CRAFTING_TABLE = registerBlock("jungle_crafting_table", copyOfVanilla(), 300);
    public static final Block MANGROVE_CRAFTING_TABLE = registerBlock("mangrove_crafting_table", copyOfVanilla(), 300);
    public static final Block PALE_OAK_CRAFTING_TABLE = registerBlock("pale_oak_crafting_table", copyOfVanilla(), 300);
    public static final Block POPLAR_CRAFTING_TABLE = registerBlock("poplar_crafting_table", copyOfVanilla(), 300);
    public static final Block SPRUCE_CRAFTING_TABLE = registerBlock("spruce_crafting_table", copyOfVanilla(), 300);
    public static final Block WARPED_CRAFTING_TABLE = registerBlock("warped_crafting_table", netherWood(MapColor.WARPED_STEM), 0);
    // Vanilla Crafting Table is made from Oak

    private static BlockBehaviour.Properties copyOfVanilla() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE);
    }

    private static BlockBehaviour.Properties netherWood(MapColor color) {
        return BlockBehaviour.Properties.of()
                .mapColor(color)
                .instrument(NoteBlockInstrument.BASS)
                .strength(2.5F)
                .sound(SoundType.WOOD);
    }

    private static Block registerBlock(String name, BlockBehaviour.Properties properties, int burnTicks) {
        Identifier id = Identifier.fromNamespaceAndPath(Initialise.MOD_ID, name);

        Block block = new CraftingTableBlock(properties.setId(ResourceKey.create(Registries.BLOCK, id)));
        Registry.register(BuiltInRegistries.BLOCK, id, block);

        registerBlockItem(id, block, burnTicks);

        VANILLA_CRAFTING_TABLES.put(id, block);
        return block;
    }

    private static void registerBlockItem(Identifier id, Block block, int burnTicks) {
        Item.Properties itemProperties = new Item.Properties()
                .useBlockDescriptionPrefix()
                .setId(ResourceKey.create(Registries.ITEM, id));

        if (burnTicks > 0) {
            itemProperties = itemProperties.component(DataComponents.COOKING_FUEL,
                    new CookingFuel(new ResolvableInt.Constant(burnTicks),
                            ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)));
        }

        Registry.register(BuiltInRegistries.ITEM, id, new BlockItem(block, itemProperties));
    }

    /** Called from Initialise to force this class to load, which registers everything. */
    public static void registerTables() {
    }
}