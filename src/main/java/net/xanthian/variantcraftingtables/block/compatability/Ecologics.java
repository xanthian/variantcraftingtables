package net.xanthian.variantcraftingtables.block.compatability;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.Initialise;

import java.util.Map;

public class Ecologics {

    public static Map<Identifier, Block> ECO_TABLES = Maps.newHashMap();

    public static Block ECO_AZALEA_CRAFTING_TABLE;
    public static Block ECO_COCONUT_CRAFTING_TABLE;
    public static Block ECO_FLOWERING_AZALEA_CRAFTING_TABLE;
    public static Block ECO_WALLNUT_CRAFTING_TABLE;

    public static void registerTables() {
        ECO_AZALEA_CRAFTING_TABLE = registerCraftingTable("eco_azalea_crafting_table");
        ECO_COCONUT_CRAFTING_TABLE = registerCraftingTable("eco_coconut_crafting_table");
        ECO_FLOWERING_AZALEA_CRAFTING_TABLE = registerCraftingTable("eco_flowering_azalea_crafting_table");
        ECO_WALLNUT_CRAFTING_TABLE = registerCraftingTable("eco_walnut_crafting_table");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        ECO_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static Block registerCraftingTable(String name) {
        return register(name, new CraftingTableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE)));
    }
}