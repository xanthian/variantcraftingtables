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

public class Botania {

    public static Map<Identifier, Block> BOT_TABLES = Maps.newHashMap();

    public static Block BOT_DREAMWOOD_CRAFTING_TABLE;
    public static Block BOT_LIVINGWOOD_CRAFTING_TABLE;
    public static Block BOT_SHIMMERWOOD_CRAFTING_TABLE;

    public static void registerTables() {
        BOT_DREAMWOOD_CRAFTING_TABLE = registerCraftingTable("bot_dreamwood_crafting_table");
        BOT_LIVINGWOOD_CRAFTING_TABLE = registerCraftingTable("bot_livingwood_crafting_table");
        BOT_SHIMMERWOOD_CRAFTING_TABLE = registerCraftingTable("bot_shimmerwood_crafting_table");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BOT_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerCraftingTable(String name) {
        return register(name, new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE)));
    }
}