package net.xanthian.variantcraftingtables.craftingtables;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variantcraftingtables.Initialise;

public class CraftingTables {

    // Vanilla
    public static void registerVanillaTables() {
        VariantCraftingTableBlock ACACIA_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("acacia_crafting_table", ACACIA_CRAFTING_TABLE,true);
        VariantCraftingTableBlock BIRCH_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("birch_crafting_table", BIRCH_CRAFTING_TABLE,true);
        VariantCraftingTableBlock DARK_OAK_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("dark_oak_crafting_table", DARK_OAK_CRAFTING_TABLE,true);
        VariantCraftingTableBlock JUNGLE_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("jungle_crafting_table", JUNGLE_CRAFTING_TABLE,true);
        VariantCraftingTableBlock SPRUCE_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("spruce_crafting_table", SPRUCE_CRAFTING_TABLE,true);
        VariantCraftingTableBlock MANGROVE_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("mangrove_crafting_table", MANGROVE_CRAFTING_TABLE,true);
    }

    // Better Nether
    public static void registerNetherTables() {
        VariantCraftingTableBlock CRIMSON_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("crimson_crafting_table", CRIMSON_CRAFTING_TABLE, false);
        VariantCraftingTableBlock WARPED_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("warped_crafting_table", WARPED_CRAFTING_TABLE, false);
    }

    // Tech Reborn
    public static void registerTRTables () {
        VariantCraftingTableBlock RUBBER_CRAFTING_TABLE = new VariantCraftingTableBlock();
            registerCraftingTableBlock("rubber_crafting_table", RUBBER_CRAFTING_TABLE, true);
    }

    // Blockus
    public static void registerBlockusTables () {
        VariantCraftingTableBlock BAMBOO_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("bamboo_crafting_table", BAMBOO_CRAFTING_TABLE,true);
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
        final Block JADE_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("jade_crafting_table", JADE_CRAFTING_TABLE, true);
        final Block MOON_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("moon_crafting_table", MOON_CRAFTING_TABLE, true);
        final Block SHADOW_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock("shadow_crafting_table", SHADOW_CRAFTING_TABLE, true);
    }
    // Traverse
    public static void registerTraverseTables() {
        VariantCraftingTableBlock FIR_CRAFTING_TABLE = new VariantCraftingTableBlock();
        registerCraftingTableBlock( "fir_crafting_table", FIR_CRAFTING_TABLE, true);
    }

    private static void registerCraftingTableBlock(String Id, Block block, boolean canBurn) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.VCT)));
        if (canBurn) FuelRegistry.INSTANCE.add(block, 300);
    }
}