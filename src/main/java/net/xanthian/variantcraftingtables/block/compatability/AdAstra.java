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

public class AdAstra {

    public static Map<Identifier, Block> AA_TABLES = Maps.newHashMap();

    public static Block AA_AERONOS_CRAFTING_TABLE;
    public static Block AA_GLACIAN_CRAFTING_TABLE;
    public static Block AA_STROPHAR_CRAFTING_TABLE;

    public static void registerTables() {
        AA_AERONOS_CRAFTING_TABLE = registerCraftingTable("aa_aeronos_crafting_table");
        AA_GLACIAN_CRAFTING_TABLE = registerCraftingTable("aa_glacian_crafting_table");
        AA_STROPHAR_CRAFTING_TABLE = registerCraftingTable("aa_strophar_crafting_table");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        AA_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerCraftingTable(String name) {
        return register(name, new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE)));
    }
}