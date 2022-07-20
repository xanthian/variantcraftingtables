package net.xanthian.variantcraftingtables.craftingtables;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variantcraftingtables.CraftingTableBlock;
import net.xanthian.variantcraftingtables.Group;
import net.xanthian.variantcraftingtables.Initialise;

public class CraftingTables {

    // Vanilla
    public static void registerVanillaTables() {
        CraftingTableBlock ACACIA_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("acacia_crafting_table", ACACIA_CRAFTING_TABLE,true);
        CraftingTableBlock BIRCH_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("birch_crafting_table", BIRCH_CRAFTING_TABLE,true);
        CraftingTableBlock DARK_OAK_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("dark_oak_crafting_table", DARK_OAK_CRAFTING_TABLE,true);
        CraftingTableBlock JUNGLE_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("jungle_crafting_table", JUNGLE_CRAFTING_TABLE,true);
        CraftingTableBlock SPRUCE_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("spruce_crafting_table", SPRUCE_CRAFTING_TABLE,true);
        CraftingTableBlock MANGROVE_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("mangrove_crafting_table", MANGROVE_CRAFTING_TABLE,true);
    }

    // Better Nether
    public static void registerNetherTables() {
        CraftingTableBlock CRIMSON_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("crimson_crafting_table", CRIMSON_CRAFTING_TABLE, false);
        CraftingTableBlock WARPED_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("warped_crafting_table", WARPED_CRAFTING_TABLE, false);
    }

    // Tech Reborn
    public static void registerTRTables () {
        CraftingTableBlock RUBBER_CRAFTING_TABLE = new CraftingTableBlock();
            registerCraftingTableBlock("rubber_crafting_table", RUBBER_CRAFTING_TABLE, true);
    }

    // Blockus
    public static void registerBlockusTables () {
        CraftingTableBlock BAMBOO_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("bamboo_crafting_table", BAMBOO_CRAFTING_TABLE,true);
        CraftingTableBlock CHARRED_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("charred_crafting_table", CHARRED_CRAFTING_TABLE, true);
        CraftingTableBlock LEGACY_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("legacy_crafting_table",LEGACY_CRAFTING_TABLE,true);
        CraftingTableBlock WHITE_OAK_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("white_oak_crafting_table", WHITE_OAK_CRAFTING_TABLE,true);
        CraftingTableBlock HERRINGBONE_ACACIA_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("herringbone_acacia_crafting_table", HERRINGBONE_ACACIA_CRAFTING_TABLE,true);
        CraftingTableBlock HERRINGBONE_BIRCH_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("herringbone_birch_crafting_table", HERRINGBONE_BIRCH_CRAFTING_TABLE,true);
        CraftingTableBlock HERRINGBONE_DARK_OAK_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("herringbone_dark_oak_crafting_table", HERRINGBONE_DARK_OAK_CRAFTING_TABLE,true);
        CraftingTableBlock HERRINGBONE_JUNGLE_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("herringbone_jungle_crafting_table", HERRINGBONE_JUNGLE_CRAFTING_TABLE,true);
        CraftingTableBlock HERRINGBONE_OAK_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("herringbone_oak_crafting_table", HERRINGBONE_OAK_CRAFTING_TABLE,true);
        CraftingTableBlock HERRINGBONE_SPRUCE_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("herringbone_spruce_crafting_table", HERRINGBONE_SPRUCE_CRAFTING_TABLE,true);
        CraftingTableBlock HERRINGBONE_WHITE_OAK_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("herringbone_white_oak_crafting_table", HERRINGBONE_WHITE_OAK_CRAFTING_TABLE,true);
        CraftingTableBlock HERRINGBONE_BAMBOO_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("herringbone_bamboo_crafting_table", HERRINGBONE_BAMBOO_CRAFTING_TABLE,true);
        CraftingTableBlock HERRINGBONE_CHARRED_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("herringbone_charred_crafting_table", HERRINGBONE_CHARRED_CRAFTING_TABLE, true);
        CraftingTableBlock HERRINGBONE_CRIMSON_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("herringbone_crimson_crafting_table", HERRINGBONE_CRIMSON_CRAFTING_TABLE, false);
        CraftingTableBlock HERRINGBONE_WARPED_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("herringbone_warped_crafting_table", HERRINGBONE_WARPED_CRAFTING_TABLE, false);
    }

    // Promenade
    public static void registerPromenadeTables () {
        CraftingTableBlock CHERRY_OAK_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "cherry_oak_crafting_table",CHERRY_OAK_CRAFTING_TABLE, true);
        CraftingTableBlock DARK_AMARANTH_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "dark_amaranth_crafting_table",DARK_AMARANTH_CRAFTING_TABLE, true);
        CraftingTableBlock PALM_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "palm_crafting_table",PALM_CRAFTING_TABLE, true);
    }

    // Bewitchment
    public static void registerBewitchmentTables () {
        CraftingTableBlock CYPRESS_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "cypress_crafting_table", CYPRESS_CRAFTING_TABLE,true);
        CraftingTableBlock DRAGONS_BLOOD_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("dragons_blood_crafting_table", DRAGONS_BLOOD_CRAFTING_TABLE,true);
        CraftingTableBlock ELDER_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("elder_crafting_table", ELDER_CRAFTING_TABLE,true);
        CraftingTableBlock JUNIPER_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "juniper_crafting_table", JUNIPER_CRAFTING_TABLE,true);
    }

    // Botania
    public static void registerBotaniaTables () {
        CraftingTableBlock DREAMWOOD_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "dreamwood_crafting_table", DREAMWOOD_CRAFTING_TABLE,true);
        CraftingTableBlock LIVINGWOOD_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "livingwood_crafting_table", LIVINGWOOD_CRAFTING_TABLE,true);
        CraftingTableBlock MOSSY_DREAMWOOD_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "mossy_dreamwood_crafting_table", MOSSY_DREAMWOOD_CRAFTING_TABLE,true);
        CraftingTableBlock MOSSY_LIVINGWOOD_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "mossy_livingwood_crafting_table", MOSSY_LIVINGWOOD_CRAFTING_TABLE,true);
        CraftingTableBlock SHIMMERWOOD_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "shimmerwood_crafting_table", SHIMMERWOOD_CRAFTING_TABLE,true);
    }

    // Spectrum
    public static void registerSpectrumTables () {
        CraftingTableBlock BLACK_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "black_crafting_table", BLACK_CRAFTING_TABLE,true);
        CraftingTableBlock BLUE_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "blue_crafting_table", BLUE_CRAFTING_TABLE,true);
        CraftingTableBlock BROWN_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "brown_crafting_table", BROWN_CRAFTING_TABLE,true);
        CraftingTableBlock CYAN_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "cyan_crafting_table", CYAN_CRAFTING_TABLE,true);
        CraftingTableBlock GRAY_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "gray_crafting_table", GRAY_CRAFTING_TABLE,true);
        CraftingTableBlock GREEN_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "green_crafting_table", GREEN_CRAFTING_TABLE,true);
        CraftingTableBlock LIGHT_BLUE_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "light_blue_crafting_table", LIGHT_BLUE_CRAFTING_TABLE,true);
        CraftingTableBlock LIGHT_GRAY_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "light_gray_crafting_table", LIGHT_GRAY_CRAFTING_TABLE, true);
        CraftingTableBlock LIME_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "lime_crafting_table", LIME_CRAFTING_TABLE,true);
        CraftingTableBlock MAGENTA_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "magenta_crafting_table", MAGENTA_CRAFTING_TABLE,true);
        CraftingTableBlock ORANGE_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "orange_crafting_table", ORANGE_CRAFTING_TABLE,true);
        CraftingTableBlock PINK_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "pink_crafting_table", PINK_CRAFTING_TABLE,true);
        CraftingTableBlock PURPLE_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "purple_crafting_table", PURPLE_CRAFTING_TABLE,true);
        CraftingTableBlock RED_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "red_crafting_table", RED_CRAFTING_TABLE, true);
        CraftingTableBlock WHITE_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "white_crafting_table", WHITE_CRAFTING_TABLE,true);
        CraftingTableBlock YELLOW_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "yellow_crafting_table", YELLOW_CRAFTING_TABLE,true);
    }

    // Biome Makeover
    public static void registerBiomeMakeoverTables () {
        CraftingTableBlock ANCIENT_OAK_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "ancient_oak_crafting_table", ANCIENT_OAK_CRAFTING_TABLE, true);
        CraftingTableBlock BLIGHTED_BALSA_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "blighted_balsa_crafting_table", BLIGHTED_BALSA_CRAFTING_TABLE,true);
        CraftingTableBlock SWAMP_CYPRESS_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "swamp_cypress_crafting_table", SWAMP_CYPRESS_CRAFTING_TABLE, true);
        CraftingTableBlock WILLOW_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "willow_crafting_table", WILLOW_CRAFTING_TABLE, true);
    }

    // Simple Mango
    public static void registerSimpleMangoTables () {
        CraftingTableBlock MANGO_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "mango_crafting_table", MANGO_CRAFTING_TABLE,true);
    }

    // Wilder World
    public static void registerWilderWorldTables () {
        CraftingTableBlock WISTERIA_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "wisteria_crafting_table", WISTERIA_CRAFTING_TABLE, true);
    }

    // Vanilla Enhanced
    public static void registerVanillaEnhancedTables () {
        CraftingTableBlock BAMBOO_CRAFTING_TABLE_VE = new CraftingTableBlock();
        registerCraftingTableBlock( "bamboo_crafting_table_ve",BAMBOO_CRAFTING_TABLE_VE, true);
        CraftingTableBlock REDWOOD_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "redwood_crafting_table", REDWOOD_CRAFTING_TABLE,true);
    }

    // Better Azalea
    public static void registerBetterAzaleaTables () {
        CraftingTableBlock AZALEA_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("azalea_crafting_table", AZALEA_CRAFTING_TABLE,  true);
        CraftingTableBlock FLOWERING_AZALEA_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "flowering_azalea_crafting_table", FLOWERING_AZALEA_CRAFTING_TABLE,true);
    }

    // Twigs
    public static void registerTwigsTables () {
        CraftingTableBlock STRIPPED_BAMBOO_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "stripped_bamboo_crafting_table", STRIPPED_BAMBOO_CRAFTING_TABLE, true);
    }

    // Tokenable Decoration
    public static void registerTokenableDecorationTables () {
        CraftingTableBlock MOSSY_ACACIA_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "mossy_acacia_crafting_table", MOSSY_ACACIA_CRAFTING_TABLE,true);
        CraftingTableBlock MOSSY_BIRCH_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "mossy_birch_crafting_table",MOSSY_BIRCH_CRAFTING_TABLE, true);
        CraftingTableBlock MOSSY_DARK_OAK_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "mossy_dark_oak_crafting_table", MOSSY_DARK_OAK_CRAFTING_TABLE,true);
        CraftingTableBlock MOSSY_JUNGLE_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "mossy_jungle_crafting_table", MOSSY_JUNGLE_CRAFTING_TABLE, true);
        CraftingTableBlock MOSSY_OAK_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("mossy_oak_crafting_table", MOSSY_OAK_CRAFTING_TABLE, true);
        CraftingTableBlock MOSSY_SPRUCE_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock( "mossy_spruce_crafting_table", MOSSY_SPRUCE_CRAFTING_TABLE,true);
    }

    // The Aether-Paradise Lost
    public static void registerTheAetherTables () {
        CraftingTableBlock CRYSTAL_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("crystal_crafting_table", CRYSTAL_CRAFTING_TABLE, true);
        CraftingTableBlock GOLDEN_OAK_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("golden_oak_crafting_table", GOLDEN_OAK_CRAFTING_TABLE, true);
        CraftingTableBlock ORANGE_CRAFTING_TABLE_PL = new CraftingTableBlock();
        registerCraftingTableBlock("orange_crafting_table_pl", ORANGE_CRAFTING_TABLE_PL, true);
        CraftingTableBlock SKYROOT_CRAFTING_TABLE = new CraftingTableBlock();
        registerCraftingTableBlock("skyroot_crafting_table", SKYROOT_CRAFTING_TABLE, true);
        CraftingTableBlock WISTERIA_CRAFTING_TABLE_PL = new CraftingTableBlock();
        registerCraftingTableBlock("wisteria_crafting_table_pl", WISTERIA_CRAFTING_TABLE_PL, true);
    }

    private static void registerCraftingTableBlock(String Id, Block block, boolean canBurn) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Group.VCT)));
        if (canBurn) FuelRegistry.INSTANCE.add(block, 300);
    }
}