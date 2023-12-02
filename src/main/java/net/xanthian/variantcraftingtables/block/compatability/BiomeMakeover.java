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

public class BiomeMakeover {

    public static Map<Identifier, Block> BM_TABLES = Maps.newHashMap();

    public static Block BM_ANCIENT_OAK_CRAFTING_TABLE;
    public static Block BM_BLIGHTED_BALSA_CRAFTING_TABLE;
    public static Block BM_SWAMP_CYPRESS_CRAFTING_TABLE;
    public static Block BM_WILLOW_CRAFTING_TABLE;

    public static void registerTables() {
        BM_ANCIENT_OAK_CRAFTING_TABLE = registerCraftingTable("bm_ancient_oak_crafting_table");
        BM_BLIGHTED_BALSA_CRAFTING_TABLE = registerCraftingTable("bm_blighted_balsa_crafting_table");
        BM_SWAMP_CYPRESS_CRAFTING_TABLE = registerCraftingTable("bm_swamp_cypress_crafting_table");
        BM_WILLOW_CRAFTING_TABLE = registerCraftingTable("bm_willow_crafting_table");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BM_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerCraftingTable(String name) {
        return register(name, new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE)));
    }
}