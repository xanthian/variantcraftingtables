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

public class RegionsUnexplored {

    public static Map<Identifier, Block> RU_TABLES = Maps.newHashMap();

    public static Block RU_ALPHA_CRAFTING_TABLE;
    public static Block RU_BAOBAB_CRAFTING_TABLE;
    public static Block RU_BLACK_PAINTED_CRAFTING_TABLE;
    public static Block RU_BLACKWOOD_CRAFTING_TABLE;
    public static Block RU_BLUE_BIOSHROOM_CRAFTING_TABLE;
    public static Block RU_BLUE_PAINTED_CRAFTING_TABLE;
    public static Block RU_BRIMWOOD_CRAFTING_TABLE;
    public static Block RU_BROWN_PAINTED_CRAFTING_TABLE;
    public static Block RU_COBALT_CRAFTING_TABLE;
    public static Block RU_CYAN_PAINTED_CRAFTING_TABLE;
    public static Block RU_CYPRESS_CRAFTING_TABLE;
    public static Block RU_DEAD_CRAFTING_TABLE;
    public static Block RU_EUCALYPTUS_CRAFTING_TABLE;
    public static Block RU_GRAY_PAINTED_CRAFTING_TABLE;
    public static Block RU_GREEN_BIOSHROOM_CRAFTING_TABLE;
    public static Block RU_GREEN_PAINTED_CRAFTING_TABLE;
    public static Block RU_JOSHUA_CRAFTING_TABLE;
    public static Block RU_KAPOK_CRAFTING_TABLE;
    public static Block RU_LARCH_CRAFTING_TABLE;
    public static Block RU_LIGHT_BLUE_PAINTED_CRAFTING_TABLE;
    public static Block RU_LIGHT_GRAY_PAINTED_CRAFTING_TABLE;
    public static Block RU_LIME_PAINTED_CRAFTING_TABLE;
    public static Block RU_MAGENTA_PAINTED_CRAFTING_TABLE;
    public static Block RU_MAGNOLIA_CRAFTING_TABLE;
    public static Block RU_MAPLE_CRAFTING_TABLE;
    public static Block RU_MAUVE_CRAFTING_TABLE;
    public static Block RU_ORANGE_PAINTED_CRAFTING_TABLE;
    public static Block RU_PALM_CRAFTING_TABLE;
    public static Block RU_PINE_CRAFTING_TABLE;
    public static Block RU_PINK_BIOSHROOM_CRAFTING_TABLE;
    public static Block RU_PINK_PAINTED_CRAFTING_TABLE;
    public static Block RU_PURPLE_PAINTED_CRAFTING_TABLE;
    public static Block RU_REDWOOD_CRAFTING_TABLE;
    public static Block RU_RED_PAINTED_CRAFTING_TABLE;
    public static Block RU_SOCOTRA_CRAFTING_TABLE;
    public static Block RU_WHITE_PAINTED_CRAFTING_TABLE;
    public static Block RU_WILLOW_CRAFTING_TABLE;
    public static Block RU_YELLOW_BIOSHROOM_CRAFTING_TABLE;
    public static Block RU_YELLOW_PAINTED_CRAFTING_TABLE;

    public static void registerTables() {
        RU_ALPHA_CRAFTING_TABLE = registerCraftingTable("ru_alpha_crafting_table");
        RU_BAOBAB_CRAFTING_TABLE = registerCraftingTable("ru_baobab_crafting_table");
        RU_BLACK_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_black_painted_crafting_table");
        RU_BLACKWOOD_CRAFTING_TABLE = registerCraftingTable("ru_blackwood_crafting_table");
        RU_BLUE_BIOSHROOM_CRAFTING_TABLE = registerCraftingTable("ru_blue_bioshroom_crafting_table");
        RU_BLUE_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_blue_painted_crafting_table");
        RU_BRIMWOOD_CRAFTING_TABLE = registerCraftingTable("ru_brimwood_crafting_table");
        RU_BROWN_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_brown_painted_crafting_table");
        RU_COBALT_CRAFTING_TABLE = registerCraftingTable("ru_cobalt_crafting_table");
        RU_CYAN_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_cyan_painted_crafting_table");
        RU_CYPRESS_CRAFTING_TABLE = registerCraftingTable("ru_cypress_crafting_table");
        RU_DEAD_CRAFTING_TABLE = registerCraftingTable("ru_dead_crafting_table");
        RU_EUCALYPTUS_CRAFTING_TABLE = registerCraftingTable("ru_eucalyptus_crafting_table");
        RU_GREEN_BIOSHROOM_CRAFTING_TABLE = registerCraftingTable("ru_green_bioshroom_crafting_table");
        RU_GREEN_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_green_painted_crafting_table");
        RU_GRAY_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_gray_painted_crafting_table");
        RU_JOSHUA_CRAFTING_TABLE = registerCraftingTable("ru_joshua_crafting_table");
        RU_KAPOK_CRAFTING_TABLE = registerCraftingTable("ru_kapok_crafting_table");
        RU_LARCH_CRAFTING_TABLE = registerCraftingTable("ru_larch_crafting_table");
        RU_LIGHT_BLUE_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_light_blue_painted_crafting_table");
        RU_LIGHT_GRAY_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_light_gray_painted_crafting_table");
        RU_LIME_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_lime_painted_crafting_table");
        RU_MAGENTA_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_magenta_painted_crafting_table");
        RU_MAGNOLIA_CRAFTING_TABLE = registerCraftingTable("ru_magnolia_crafting_table");
        RU_MAPLE_CRAFTING_TABLE = registerCraftingTable("ru_maple_crafting_table");
        RU_MAUVE_CRAFTING_TABLE = registerCraftingTable("ru_mauve_crafting_table");
        RU_ORANGE_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_orange_painted_crafting_table");
        RU_PALM_CRAFTING_TABLE = registerCraftingTable("ru_palm_crafting_table");
        RU_PINE_CRAFTING_TABLE = registerCraftingTable("ru_pine_crafting_table");
        RU_PINK_BIOSHROOM_CRAFTING_TABLE = registerCraftingTable("ru_pink_bioshroom_crafting_table");
        RU_PINK_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_pink_painted_crafting_table");
        RU_PURPLE_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_purple_painted_crafting_table");
        RU_RED_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_red_painted_crafting_table");
        RU_REDWOOD_CRAFTING_TABLE = registerCraftingTable("ru_redwood_crafting_table");
        RU_SOCOTRA_CRAFTING_TABLE = registerCraftingTable("ru_socotra_crafting_table");
        RU_WHITE_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_white_painted_crafting_table");
        RU_WILLOW_CRAFTING_TABLE = registerCraftingTable("ru_willow_crafting_table");
        RU_YELLOW_BIOSHROOM_CRAFTING_TABLE = registerCraftingTable("ru_yellow_bioshroom_crafting_table");
        RU_YELLOW_PAINTED_CRAFTING_TABLE = registerCraftingTable("ru_yellow_painted_crafting_table");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        RU_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return block;
    }

    private static Block registerCraftingTable(String name) {
        return register(name, new CraftingTableBlock(AbstractBlock.Settings.copy(Blocks.CRAFTING_TABLE)));
    }
}