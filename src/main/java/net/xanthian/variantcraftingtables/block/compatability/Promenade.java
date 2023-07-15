package net.xanthian.variantcraftingtables.block.compatability;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.block.VariantCraftingTableBlock;

public class Promenade {

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

    public static Block register(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerCraftingTable(String id) {
        return register(id, new VariantCraftingTableBlock());
    }
}