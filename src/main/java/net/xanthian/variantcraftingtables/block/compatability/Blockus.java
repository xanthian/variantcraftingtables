package net.xanthian.variantcraftingtables.block.compatability;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.Initialise;

import java.util.Map;

public class Blockus {

    public static Map<Identifier, Block> BLS_TABLES = Maps.newHashMap();

    public static Block BLS_CHARRED_CRAFTING_TABLE;
    public static Block BLS_HERRINGBONE_ACACIA_CRAFTING_TABLE;
    public static Block BLS_HERRINGBONE_BAMBOO_CRAFTING_TABLE;
    public static Block BLS_HERRINGBONE_BIRCH_CRAFTING_TABLE;
    public static Block BLS_HERRINGBONE_CHARRED_CRAFTING_TABLE;
    public static Block BLS_HERRINGBONE_CHERRY_CRAFTING_TABLE;
    public static Block BLS_HERRINGBONE_CRIMSON_CRAFTING_TABLE;
    public static Block BLS_HERRINGBONE_DARK_OAK_CRAFTING_TABLE;
    public static Block BLS_HERRINGBONE_JUNGLE_CRAFTING_TABLE;
    public static Block BLS_HERRINGBONE_MANGROVE_CRAFTING_TABLE;
    public static Block BLS_HERRINGBONE_OAK_CRAFTING_TABLE;
    public static Block BLS_HERRINGBONE_RAW_BAMBOO_CRAFTING_TABLE;
    public static Block BLS_HERRINGBONE_SPRUCE_CRAFTING_TABLE;
    public static Block BLS_HERRINGBONE_WARPED_CRAFTING_TABLE;
    public static Block BLS_HERRINGBONE_WHITE_OAK_CRAFTING_TABLE;
    public static Block BLS_RAW_BAMBOO_CRAFTING_TABLE;
    public static Block BLS_WHITE_OAK_CRAFTING_TABLE;

    public static void registerTables() {

        BLS_CHARRED_CRAFTING_TABLE = registerCraftingTable("bls_charred_crafting_table");
        BLS_HERRINGBONE_ACACIA_CRAFTING_TABLE = registerCraftingTable("bls_herringbone_acacia_crafting_table");
        BLS_HERRINGBONE_BAMBOO_CRAFTING_TABLE = registerCraftingTable("bls_herringbone_bamboo_crafting_table");
        BLS_HERRINGBONE_BIRCH_CRAFTING_TABLE = registerCraftingTable("bls_herringbone_birch_crafting_table");
        BLS_HERRINGBONE_CHARRED_CRAFTING_TABLE = registerCraftingTable("bls_herringbone_charred_crafting_table");
        BLS_HERRINGBONE_CHERRY_CRAFTING_TABLE = registerCraftingTable("bls_herringbone_cherry_crafting_table");
        BLS_HERRINGBONE_CRIMSON_CRAFTING_TABLE = registerCraftingTable("bls_herringbone_crimson_crafting_table");
        BLS_HERRINGBONE_DARK_OAK_CRAFTING_TABLE = registerCraftingTable("bls_herringbone_dark_oak_crafting_table");
        BLS_HERRINGBONE_JUNGLE_CRAFTING_TABLE = registerCraftingTable("bls_herringbone_jungle_crafting_table");
        BLS_HERRINGBONE_MANGROVE_CRAFTING_TABLE = registerCraftingTable("bls_herringbone_mangrove_crafting_table");
        BLS_HERRINGBONE_OAK_CRAFTING_TABLE = registerCraftingTable("bls_herringbone_oak_crafting_table");
        BLS_HERRINGBONE_RAW_BAMBOO_CRAFTING_TABLE = registerCraftingTable("bls_herringbone_raw_bamboo_crafting_table");
        BLS_HERRINGBONE_SPRUCE_CRAFTING_TABLE = registerCraftingTable("bls_herringbone_spruce_crafting_table");
        BLS_HERRINGBONE_WARPED_CRAFTING_TABLE = registerCraftingTable("bls_herringbone_warped_crafting_table");
        BLS_HERRINGBONE_WHITE_OAK_CRAFTING_TABLE = registerCraftingTable("bls_herringbone_white_oak_crafting_table");
        BLS_RAW_BAMBOO_CRAFTING_TABLE = registerCraftingTable("bls_raw_bamboo_crafting_table");
        BLS_WHITE_OAK_CRAFTING_TABLE = registerCraftingTable("bls_white_oak_crafting_table");

    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        BLS_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerCraftingTable(String name) {
        return register(name, new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE)));
    }
}