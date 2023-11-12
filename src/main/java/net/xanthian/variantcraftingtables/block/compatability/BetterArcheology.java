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

public class BetterArcheology {

    public static Map<Identifier, Block> BA_TABLES = Maps.newHashMap();

    public static Block BA_ROTTEN_CRAFTING_TABLE;

    public static void registerTables() {
        BA_ROTTEN_CRAFTING_TABLE = registerCraftingTable("ba_rotten_crafting_table");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        BA_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerCraftingTable(String name) {
        return register(name, new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE)));
    }
}