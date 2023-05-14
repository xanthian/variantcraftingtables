package net.xanthian.variantcraftingtables.craftingtables;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.Initialise;

public class CraftingTables {

    // Vanilla
    public static final VariantCraftingTableBlock ACACIA_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock BAMBOO_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock BIRCH_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock CHERRY_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock DARK_OAK_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock JUNGLE_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock MANGROVE_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock SPRUCE_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock WARPED_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock CRIMSON_CRAFTING_TABLE = new VariantCraftingTableBlock();

    public static void registerVanillaTables() {
        registerCraftingTableBlock("acacia_crafting_table", ACACIA_CRAFTING_TABLE,true);
        registerCraftingTableBlock("bamboo_crafting_table", BAMBOO_CRAFTING_TABLE,true);
        registerCraftingTableBlock("birch_crafting_table", BIRCH_CRAFTING_TABLE,true);
        registerCraftingTableBlock("cherry_crafting_table", CHERRY_CRAFTING_TABLE,true);
        registerCraftingTableBlock("dark_oak_crafting_table", DARK_OAK_CRAFTING_TABLE,true);
        registerCraftingTableBlock("jungle_crafting_table", JUNGLE_CRAFTING_TABLE,true);
        registerCraftingTableBlock("mangrove_crafting_table", MANGROVE_CRAFTING_TABLE,true);
        registerCraftingTableBlock("spruce_crafting_table", SPRUCE_CRAFTING_TABLE,true);
        registerCraftingTableBlock("crimson_crafting_table", CRIMSON_CRAFTING_TABLE, false);
        registerCraftingTableBlock("warped_crafting_table", WARPED_CRAFTING_TABLE, false);
    }

    // Tech Reborn
    public static final VariantCraftingTableBlock RUBBER_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static void registerTechRebornTables() {
        registerCraftingTableBlock("rubber_crafting_table", RUBBER_CRAFTING_TABLE, true);
    }


    // Blockus
    public static void registerBlockusTables () {
        VariantCraftingTableBlock BAMBOO_CRAFTING_TABLE_BL = new VariantCraftingTableBlock();
        registerCraftingTableBlock("bamboo_crafting_table_bl", BAMBOO_CRAFTING_TABLE_BL,true);
        VariantCraftingTableBlock CHARRED_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("charred_crafting_table", CHARRED_CRAFTING_TABLE, true);
        VariantCraftingTableBlock LEGACY_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("legacy_crafting_table",LEGACY_CRAFTING_TABLE,true);
        VariantCraftingTableBlock WHITE_OAK_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("white_oak_crafting_table", WHITE_OAK_CRAFTING_TABLE,true);
        VariantCraftingTableBlock HERRINGBONE_ACACIA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("herringbone_acacia_crafting_table", HERRINGBONE_ACACIA_CRAFTING_TABLE,true);
        VariantCraftingTableBlock HERRINGBONE_BIRCH_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("herringbone_birch_crafting_table", HERRINGBONE_BIRCH_CRAFTING_TABLE,true);
        VariantCraftingTableBlock HERRINGBONE_DARK_OAK_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("herringbone_dark_oak_crafting_table", HERRINGBONE_DARK_OAK_CRAFTING_TABLE,true);
        VariantCraftingTableBlock HERRINGBONE_JUNGLE_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("herringbone_jungle_crafting_table", HERRINGBONE_JUNGLE_CRAFTING_TABLE,true);
        VariantCraftingTableBlock HERRINGBONE_MANGROVE_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("herringbone_mangrove_crafting_table", HERRINGBONE_MANGROVE_CRAFTING_TABLE,true);
        VariantCraftingTableBlock HERRINGBONE_OAK_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("herringbone_oak_crafting_table", HERRINGBONE_OAK_CRAFTING_TABLE,true);
        VariantCraftingTableBlock HERRINGBONE_SPRUCE_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("herringbone_spruce_crafting_table", HERRINGBONE_SPRUCE_CRAFTING_TABLE,true);
        VariantCraftingTableBlock HERRINGBONE_WHITE_OAK_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("herringbone_white_oak_crafting_table", HERRINGBONE_WHITE_OAK_CRAFTING_TABLE,true);
        VariantCraftingTableBlock HERRINGBONE_BAMBOO_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("herringbone_bamboo_crafting_table", HERRINGBONE_BAMBOO_CRAFTING_TABLE,true);
        VariantCraftingTableBlock HERRINGBONE_CHARRED_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("herringbone_charred_crafting_table", HERRINGBONE_CHARRED_CRAFTING_TABLE, true);
        VariantCraftingTableBlock HERRINGBONE_CRIMSON_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("herringbone_crimson_crafting_table", HERRINGBONE_CRIMSON_CRAFTING_TABLE, false);
        VariantCraftingTableBlock HERRINGBONE_WARPED_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("herringbone_warped_crafting_table", HERRINGBONE_WARPED_CRAFTING_TABLE, false);
    }

    // Promenade
    public static void registerPromenadeTables () {
        VariantCraftingTableBlock CHERRY_OAK_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "cherry_oak_crafting_table",CHERRY_OAK_CRAFTING_TABLE, true);
        VariantCraftingTableBlock DARK_AMARANTH_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "dark_amaranth_crafting_table",DARK_AMARANTH_CRAFTING_TABLE, true);
        VariantCraftingTableBlock PALM_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "palm_crafting_table",PALM_CRAFTING_TABLE, true);
    }

    // Bewitchment
    public static void registerBewitchmentTables () {
        VariantCraftingTableBlock CYPRESS_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "cypress_crafting_table", CYPRESS_CRAFTING_TABLE,true);
        VariantCraftingTableBlock DRAGONS_BLOOD_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("dragons_blood_crafting_table", DRAGONS_BLOOD_CRAFTING_TABLE,true);
        VariantCraftingTableBlock ELDER_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("elder_crafting_table", ELDER_CRAFTING_TABLE,true);
        VariantCraftingTableBlock JUNIPER_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "juniper_crafting_table", JUNIPER_CRAFTING_TABLE,true);
    }

    // Botania
    public static void registerBotaniaTables () {
        VariantCraftingTableBlock DREAMWOOD_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "dreamwood_crafting_table", DREAMWOOD_CRAFTING_TABLE,true);
        VariantCraftingTableBlock LIVINGWOOD_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "livingwood_crafting_table", LIVINGWOOD_CRAFTING_TABLE,true);
        VariantCraftingTableBlock MOSSY_DREAMWOOD_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "mossy_dreamwood_crafting_table", MOSSY_DREAMWOOD_CRAFTING_TABLE,true);
        VariantCraftingTableBlock MOSSY_LIVINGWOOD_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "mossy_livingwood_crafting_table", MOSSY_LIVINGWOOD_CRAFTING_TABLE,true);
        VariantCraftingTableBlock SHIMMERWOOD_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "shimmerwood_crafting_table", SHIMMERWOOD_CRAFTING_TABLE,true);
    }

    // Spectrum
    public static void registerSpectrumTables () {
        VariantCraftingTableBlock BLACK_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "black_crafting_table", BLACK_CRAFTING_TABLE,true);
        VariantCraftingTableBlock BLUE_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "blue_crafting_table", BLUE_CRAFTING_TABLE,true);
        VariantCraftingTableBlock BROWN_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "brown_crafting_table", BROWN_CRAFTING_TABLE,true);
        VariantCraftingTableBlock CYAN_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "cyan_crafting_table", CYAN_CRAFTING_TABLE,true);
        VariantCraftingTableBlock GRAY_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "gray_crafting_table", GRAY_CRAFTING_TABLE,true);
        VariantCraftingTableBlock GREEN_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "green_crafting_table", GREEN_CRAFTING_TABLE,true);
        VariantCraftingTableBlock LIGHT_BLUE_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "light_blue_crafting_table", LIGHT_BLUE_CRAFTING_TABLE,true);
        VariantCraftingTableBlock LIGHT_GRAY_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "light_gray_crafting_table", LIGHT_GRAY_CRAFTING_TABLE, true);
        VariantCraftingTableBlock LIME_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "lime_crafting_table", LIME_CRAFTING_TABLE,true);
        VariantCraftingTableBlock MAGENTA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "magenta_crafting_table", MAGENTA_CRAFTING_TABLE,true);
        VariantCraftingTableBlock ORANGE_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "orange_crafting_table", ORANGE_CRAFTING_TABLE,true);
        VariantCraftingTableBlock PINK_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "pink_crafting_table", PINK_CRAFTING_TABLE,true);
        VariantCraftingTableBlock PURPLE_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "purple_crafting_table", PURPLE_CRAFTING_TABLE,true);
        VariantCraftingTableBlock RED_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "red_crafting_table", RED_CRAFTING_TABLE, true);
        VariantCraftingTableBlock WHITE_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "white_crafting_table", WHITE_CRAFTING_TABLE,true);
        VariantCraftingTableBlock YELLOW_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "yellow_crafting_table", YELLOW_CRAFTING_TABLE,true);
    }

    // Biome Makeover
    public static void registerBiomeMakeoverTables () {
        VariantCraftingTableBlock ANCIENT_OAK_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "ancient_oak_crafting_table", ANCIENT_OAK_CRAFTING_TABLE, true);
        VariantCraftingTableBlock BLIGHTED_BALSA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "blighted_balsa_crafting_table", BLIGHTED_BALSA_CRAFTING_TABLE,true);
        VariantCraftingTableBlock SWAMP_CYPRESS_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "swamp_cypress_crafting_table", SWAMP_CYPRESS_CRAFTING_TABLE, true);
        VariantCraftingTableBlock WILLOW_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "willow_crafting_table", WILLOW_CRAFTING_TABLE, true);
    }

    // Simple Mango
    public static void registerSimpleMangoTables () {
        VariantCraftingTableBlock MANGO_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "mango_crafting_table", MANGO_CRAFTING_TABLE,true);
    }

    // Wilder World
    public static void registerWilderWorldTables () {
        VariantCraftingTableBlock WISTERIA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "wisteria_crafting_table", WISTERIA_CRAFTING_TABLE, true);
    }

    // Enriched
    public static void registerEnrichedTables () {
        VariantCraftingTableBlock BAMBOO_CRAFTING_TABLE_VE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "bamboo_crafting_table_ve",BAMBOO_CRAFTING_TABLE_VE, true);
        VariantCraftingTableBlock REDWOOD_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "redwood_crafting_table", REDWOOD_CRAFTING_TABLE,true);
    }

    // Ecologics
    public static void registerEcologicsTables() {
        final VariantCraftingTableBlock AZALEA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("azalea_crafting_table", AZALEA_CRAFTING_TABLE, true);
        final VariantCraftingTableBlock COCONUT_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("coconut_crafting_table", COCONUT_CRAFTING_TABLE, true);
        final VariantCraftingTableBlock FLOWERING_AZALEA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("flowering_azalea_crafting_table", FLOWERING_AZALEA_CRAFTING_TABLE, true);
        final VariantCraftingTableBlock WALNUT_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("walnut_crafting_table", WALNUT_CRAFTING_TABLE, true);
    }

    // Twigs
    public static void registerTwigsTables () {
        VariantCraftingTableBlock STRIPPED_BAMBOO_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "stripped_bamboo_crafting_table", STRIPPED_BAMBOO_CRAFTING_TABLE, true);
    }

    // Paradise Lost
    public static void registerTheAetherTables () {
        VariantCraftingTableBlock CRYSTAL_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("crystal_crafting_table", CRYSTAL_CRAFTING_TABLE, true);
        VariantCraftingTableBlock GOLDEN_OAK_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("golden_oak_crafting_table", GOLDEN_OAK_CRAFTING_TABLE, true);
        VariantCraftingTableBlock ORANGE_CRAFTING_TABLE_PL = new VariantCraftingTableBlock();
        registerCraftingTableBlock("orange_crafting_table_pl", ORANGE_CRAFTING_TABLE_PL, true);
        VariantCraftingTableBlock SKYROOT_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("skyroot_crafting_table", SKYROOT_CRAFTING_TABLE, true);
        VariantCraftingTableBlock WISTERIA_CRAFTING_TABLE_PL = new VariantCraftingTableBlock();
        registerCraftingTableBlock("wisteria_crafting_table_pl", WISTERIA_CRAFTING_TABLE_PL, true);
    }

    // Croptopia
    public static void registerCroptopiaTables () {
        VariantCraftingTableBlock CINNAMON_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "cinnamon_crafting_table", CINNAMON_CRAFTING_TABLE, true);
    }

    // Epic Paladins (arclight)
    public static void registerArclightTables() {
        VariantCraftingTableBlock JADE_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("jade_crafting_table", JADE_CRAFTING_TABLE, true);
        VariantCraftingTableBlock MOON_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("moon_crafting_table", MOON_CRAFTING_TABLE, true);
        VariantCraftingTableBlock SHADOW_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("shadow_crafting_table", SHADOW_CRAFTING_TABLE, true);
    }
    // Traverse
    public static void registerTraverseTables() {
        VariantCraftingTableBlock FIR_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "fir_crafting_table", FIR_CRAFTING_TABLE, true);
    }
    // Terrestria
    public static void registerTerrestriaTables() {
        VariantCraftingTableBlock CYPRESS_CRAFTING_TABLE2 = new VariantCraftingTableBlock();
        registerCraftingTableBlock("cypress_crafting_table2", CYPRESS_CRAFTING_TABLE2, true);
        VariantCraftingTableBlock HEMLOCK_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("hemlock_crafting_table", HEMLOCK_CRAFTING_TABLE, true);
        VariantCraftingTableBlock JAPANESE_MAPLE_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("japanese_maple_crafting_table", JAPANESE_MAPLE_CRAFTING_TABLE, true);
        VariantCraftingTableBlock RAINBOW_EUCALYPTUS_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("rainbow_eucalyptus_crafting_table", RAINBOW_EUCALYPTUS_CRAFTING_TABLE, true);
        VariantCraftingTableBlock REDWOOD_CRAFTING_TABLE2 = new VariantCraftingTableBlock();
        registerCraftingTableBlock("redwood_crafting_table2", REDWOOD_CRAFTING_TABLE2, true);
        VariantCraftingTableBlock RUBBER_CRAFTING_TABLE2 = new VariantCraftingTableBlock();
        registerCraftingTableBlock("rubber_crafting_table2", RUBBER_CRAFTING_TABLE2, true);
        VariantCraftingTableBlock SAKURA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("sakura_crafting_table", SAKURA_CRAFTING_TABLE, true);
        VariantCraftingTableBlock WILLOW_CRAFTING_TABLE2 = new VariantCraftingTableBlock();
        registerCraftingTableBlock("willow_crafting_table2", WILLOW_CRAFTING_TABLE2, true);
        VariantCraftingTableBlock YUCCA_PALM_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("yucca_palm_crafting_table", YUCCA_PALM_CRAFTING_TABLE, true);
    }
    // Cinderscapes
    public static void registerCinderscapesTables() {
        VariantCraftingTableBlock SCORCHED_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("scorched_crafting_table", SCORCHED_CRAFTING_TABLE, true);
        VariantCraftingTableBlock UMBRAL_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("umbral_crafting_table", UMBRAL_CRAFTING_TABLE, true);
    }
    // Colourful Azaleas
    public static void registerColorfulAzaleasTables() {
        VariantCraftingTableBlock AZULE_AZALEA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("azule_azalea_crafting_table", AZULE_AZALEA_CRAFTING_TABLE, true);
        VariantCraftingTableBlock BRIGHT_AZALEA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("bright_azalea_crafting_table", BRIGHT_AZALEA_CRAFTING_TABLE, true);
        VariantCraftingTableBlock FISS_AZALEA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("fiss_azalea_crafting_table", FISS_AZALEA_CRAFTING_TABLE, true);
        VariantCraftingTableBlock ROZE_AZALEA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("roze_azalea_crafting_table", ROZE_AZALEA_CRAFTING_TABLE, true);
        VariantCraftingTableBlock TECAL_AZALEA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("tecal_azalea_crafting_table", TECAL_AZALEA_CRAFTING_TABLE, true);
        VariantCraftingTableBlock TITANIUM_AZALEA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("titanium_azalea_crafting_table", TITANIUM_AZALEA_CRAFTING_TABLE, true);
        VariantCraftingTableBlock WALNUT_AZALEA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("walnut_azalea_crafting_table", WALNUT_AZALEA_CRAFTING_TABLE, true);
    }
    // Wilder Wilds
    public static void registerWilderWildsTables() {
        VariantCraftingTableBlock BAOBAB_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("baobab_crafting_table", BAOBAB_CRAFTING_TABLE, true);
        VariantCraftingTableBlock CYPRESS_CRAFTING_TABLE3 = new VariantCraftingTableBlock();
        registerCraftingTableBlock("cypress_crafting_table3", CYPRESS_CRAFTING_TABLE3, true);
    }
    // Deeper & Darker
    public static void registerDeeperandDarkerTables() {
        VariantCraftingTableBlock ECHO_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "echo_crafting_table", ECHO_CRAFTING_TABLE, true);
    }
    // Vinery
    public static void registerVineryTables() {
        VariantCraftingTableBlock CHERRY_CRAFTING_TABLE_VI = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "cherry_crafting_table_vi", CHERRY_CRAFTING_TABLE_VI, true);
    }
    // Twilight Forest
    public static void registerTwilightForestTables() {
        VariantCraftingTableBlock CANOPY_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "canopy_crafting_table", CANOPY_CRAFTING_TABLE, true);
        VariantCraftingTableBlock DARK_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "dark_crafting_table", DARK_CRAFTING_TABLE, true);
        VariantCraftingTableBlock MANGROVE_CRAFTING_TABLE2 = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "mangrove_crafting_table2", MANGROVE_CRAFTING_TABLE2, true);
        VariantCraftingTableBlock MINING_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "mining_crafting_table", MINING_CRAFTING_TABLE, true);
        VariantCraftingTableBlock SORTING_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "sorting_crafting_table", SORTING_CRAFTING_TABLE, true);
        VariantCraftingTableBlock TIME_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "time_crafting_table", TIME_CRAFTING_TABLE, true);
        VariantCraftingTableBlock TRANSFORMATION_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "transformation_crafting_table", TRANSFORMATION_CRAFTING_TABLE, true);
        VariantCraftingTableBlock TWILIGHT_OAK_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "twilight_oak_crafting_table", TWILIGHT_OAK_CRAFTING_TABLE, true);
    }
    // Charm
    public static void registerCharmTables() {
        VariantCraftingTableBlock EBONY_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "ebony_crafting_table", EBONY_CRAFTING_TABLE, true);
    }
    // Immersive Weathering
    public static void registerImmersiveWeatheringTables() {
        VariantCraftingTableBlock CHARRED_CRAFTING_TABLE2 = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "charred_crafting_table2", CHARRED_CRAFTING_TABLE2, true);
    }


    private static void registerCraftingTableBlock(String Id, Block block, boolean canBurn) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        if (canBurn) FuelRegistry.INSTANCE.add(block, 300);
    }
}