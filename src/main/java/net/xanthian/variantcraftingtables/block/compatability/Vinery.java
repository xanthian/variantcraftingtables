package net.xanthian.variantcraftingtables.block.compatability;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.block.VariantCraftingTableBlock;

public class Vinery {

    public static Block LDV_CHERRY_CRAFTING_TABLE;

    public static void registerTables() {
        LDV_CHERRY_CRAFTING_TABLE = registerCraftingTable("ldv_cherry_crafting_table");
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