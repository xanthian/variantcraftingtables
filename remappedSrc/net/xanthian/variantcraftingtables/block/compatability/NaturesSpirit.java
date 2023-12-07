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

public class NaturesSpirit {

    public static Map<Identifier, Block> NS_TABLES = Maps.newHashMap();

    public static Block NS_ASPEN_CRAFTING_TABLE;
    public static Block NS_CYPRESS_CRAFTING_TABLE;
    public static Block NS_FIR_CRAFTING_TABLE;
    public static Block NS_JOSHUA_CRAFTING_TABLE;
    public static Block NS_MAPLE_CRAFTING_TABLE;
    public static Block NS_OLIVE_CRAFTING_TABLE;
    public static Block NS_REDWOOD_CRAFTING_TABLE;
    public static Block NS_SUGI_CRAFTING_TABLE;
    public static Block NS_WILLOW_CRAFTING_TABLE;
    public static Block NS_WISTERIA_CRAFTING_TABLE;

    public static Block NS_CEDAR_CRAFTING_TABLE;
    public static Block NS_COCONUT_CRAFTING_TABLE;
    public static Block NS_GHAF_CRAFTING_TABLE;
    public static Block NS_LARCH_CRAFTING_TABLE;
    public static Block NS_PALO_VERDE_CRAFTING_TABLE;

    public static void registerTables() {
        NS_ASPEN_CRAFTING_TABLE = registerCraftingTable("ns_aspen_crafting_table");
        NS_CYPRESS_CRAFTING_TABLE = registerCraftingTable("ns_cypress_crafting_table");
        NS_FIR_CRAFTING_TABLE = registerCraftingTable("ns_fir_crafting_table");
        NS_JOSHUA_CRAFTING_TABLE = registerCraftingTable("ns_joshua_crafting_table");
        NS_MAPLE_CRAFTING_TABLE = registerCraftingTable("ns_maple_crafting_table");
        NS_OLIVE_CRAFTING_TABLE = registerCraftingTable("ns_olive_crafting_table");
        NS_REDWOOD_CRAFTING_TABLE = registerCraftingTable("ns_redwood_crafting_table");
        NS_SUGI_CRAFTING_TABLE = registerCraftingTable("ns_sugi_crafting_table");
        NS_WILLOW_CRAFTING_TABLE = registerCraftingTable("ns_willow_crafting_table");
        NS_WISTERIA_CRAFTING_TABLE = registerCraftingTable("ns_wisteria_crafting_table");

        NS_CEDAR_CRAFTING_TABLE = registerCraftingTable("ns_cedar_crafting_table");
        NS_COCONUT_CRAFTING_TABLE = registerCraftingTable("ns_coconut_crafting_table");
        NS_GHAF_CRAFTING_TABLE = registerCraftingTable("ns_ghaf_crafting_table");
        NS_LARCH_CRAFTING_TABLE = registerCraftingTable("ns_larch_crafting_table");
        NS_PALO_VERDE_CRAFTING_TABLE = registerCraftingTable("ns_palo_verde_crafting_table");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        NS_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerCraftingTable(String name) {
        return register(name, new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE)));
    }
}