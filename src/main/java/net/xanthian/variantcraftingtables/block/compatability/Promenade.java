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

public class Promenade {

    public static Map<Identifier, Block> PROM_TABLES = Maps.newHashMap();

    public static Block PROM_DARK_AMARANTH_CRAFTING_TABLE;
    public static Block PROM_MAPLE_CRAFTING_TABLE;
    public static Block PROM_PALM_CRAFTING_TABLE;
    public static Block PROM_SAKURA_CRAFTING_TABLE;

    public static void registerTables() {
        PROM_DARK_AMARANTH_CRAFTING_TABLE = registerCraftingTable("prom_dark_amaranth_crafting_table");
        PROM_MAPLE_CRAFTING_TABLE = registerCraftingTable("prom_maple_crafting_table");
        PROM_PALM_CRAFTING_TABLE = registerCraftingTable("prom_palm_crafting_table");
        PROM_SAKURA_CRAFTING_TABLE = registerCraftingTable("prom_sakura_crafting_table");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        PROM_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerCraftingTable(String name) {
        return register(name, new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE)));
    }
}