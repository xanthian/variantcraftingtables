package net.xanthian.variantcraftingtables.block;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import net.xanthian.variantcraftingtables.Initialise;

import java.util.Map;

public class Vanilla {

    public static Map<Identifier, Block> VANILLA_CRAFTING_TABLES = Maps.newHashMap();

    public static final CraftingTableBlock ACACIA_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    public static final CraftingTableBlock BAMBOO_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    public static final CraftingTableBlock BIRCH_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    public static final CraftingTableBlock CHERRY_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    public static final CraftingTableBlock CRIMSON_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD));
    public static final CraftingTableBlock DARK_OAK_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    public static final CraftingTableBlock JUNGLE_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    public static final CraftingTableBlock MANGROVE_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    // Vanilla Crafting Table is made from Oak
    public static final CraftingTableBlock SPRUCE_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    public static final CraftingTableBlock WARPED_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).instrument(Instrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD));


    public static void registerTables() {
        registerCraftingTableBlock("acacia_crafting_table", ACACIA_CRAFTING_TABLE);
        registerCraftingTableBlock("bamboo_crafting_table", BAMBOO_CRAFTING_TABLE);
        registerCraftingTableBlock("birch_crafting_table", BIRCH_CRAFTING_TABLE);
        registerCraftingTableBlock("cherry_crafting_table", CHERRY_CRAFTING_TABLE);
        registerCraftingTableBlock("dark_oak_crafting_table", DARK_OAK_CRAFTING_TABLE);
        registerCraftingTableBlock("jungle_crafting_table", JUNGLE_CRAFTING_TABLE);
        registerCraftingTableBlock("mangrove_crafting_table", MANGROVE_CRAFTING_TABLE);
        registerCraftingTableBlock("spruce_crafting_table", SPRUCE_CRAFTING_TABLE);
        registerCraftingTableBlock("crimson_crafting_table", CRIMSON_CRAFTING_TABLE);
        registerCraftingTableBlock("warped_crafting_table", WARPED_CRAFTING_TABLE);
    }

    private static void registerCraftingTableBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        VANILLA_CRAFTING_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }
}