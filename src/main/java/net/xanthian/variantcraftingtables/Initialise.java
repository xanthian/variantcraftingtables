package net.xanthian.variantcraftingtables;

import com.google.common.collect.Lists;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import net.xanthian.variantcraftingtables.craftingtables.CraftingTables;
import org.apache.commons.lang3.tuple.Pair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantcraftingtables";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static List<Pair<String, String[]>> woodTypes = Lists.newArrayList(
    );


    @Override
    public void onInitialize() {

        CraftingTables.registerVanillaTables();
        woodTypes.add(Pair.of("acacia", new String[0]));
        woodTypes.add(Pair.of("birch", new String[0]));
        woodTypes.add(Pair.of("dark_oak", new String[0]));
        woodTypes.add(Pair.of("jungle", new String[0]));
        woodTypes.add(Pair.of("spruce", new String[0]));

        if (!FabricLoader.getInstance().isModLoaded("betternether")) {
            CraftingTables.registerNetherTables();
            woodTypes.add(Pair.of("crimson", new String[0]));
            woodTypes.add(Pair.of("warped", new String[0]));
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            LOGGER.info("Better Nether detected, removing Crafting Tables from Varied Crafting Tables");

        }

        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            woodTypes.add(Pair.of("rubber", new String[]{"techreborn"}));
            CraftingTables.registerTRTables();
            LOGGER.info("Tech Reborn detected, creating Crafting Tables from Tech Reborn Planks");
        }

        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            woodTypes.add(Pair.of("cypress", new String[]{"bewitchment"}));
            woodTypes.add(Pair.of("dragons_blood", new String[]{"bewitchment"}));
            woodTypes.add(Pair.of("elder", new String[]{"bewitchment"}));
            woodTypes.add(Pair.of("juniper", new String[]{"bewitchment"}));
            CraftingTables.registerBewitchmentTables();
            LOGGER.info("Bewitchment detected, creating Crafting Tables from Bewitchment Planks");
        }

        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            woodTypes.add(Pair.of("bamboo", new String[]{"blockus"}));
            woodTypes.add(Pair.of("charred", new String[]{"blockus"}));
            woodTypes.add(Pair.of("legacy", new String[]{"blockus"}));
            woodTypes.add(Pair.of("white_oak", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_acacia", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_birch", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_dark_oak", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_jungle", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_spruce", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_crimson", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_warped", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_bamboo", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_charred", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_white_oak", new String[]{"blockus"}));
            CraftingTables.registerBlockusTables();
            LOGGER.info("Blockus detected, creating Crafting Tables from Blockus Planks");
        }

        if (FabricLoader.getInstance().isModLoaded("botania")) {
            woodTypes.add(Pair.of("dreamwood", new String[]{"botania"}));
            woodTypes.add(Pair.of("livingwood", new String[]{"botania"}));
            woodTypes.add(Pair.of("mossy_dreamwood", new String[]{"botania"}));
            woodTypes.add(Pair.of("mossy_livingwood", new String[]{"botania"}));
            woodTypes.add(Pair.of("shimmerwood", new String[]{"botania"}));
            CraftingTables.registerBotaniaTables();
            LOGGER.info("Botania detected, creating Crafting Tables from Botania Planks");
        }

        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            woodTypes.add(Pair.of("cherry_oak", new String[]{"promenade"}));
            woodTypes.add(Pair.of("dark_amaranth", new String[]{"promenade"}));
            woodTypes.add(Pair.of("palm", new String[]{"promenade"}));
            CraftingTables.registerPromenadeTables();
            LOGGER.info("Promenade detected, creating Crafting Tables from Promenade Planks");
        }

        if (FabricLoader.getInstance().isModLoaded("spectrum")) {
            woodTypes.add(Pair.of("black", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("blue", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("brown", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("cyan", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("gray", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("green", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("light_blue", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("light_gray", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("lime", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("magenta", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("orange", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("pink", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("purple", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("red", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("white", new String[]{"spectrum"}));
            woodTypes.add(Pair.of("yellow", new String[]{"spectrum"}));
            CraftingTables.registerSpectrumTables();
            LOGGER.info("Spectrum detected, creating Crafting Tables from Spectrum Planks");
        }

        if (FabricLoader.getInstance().isModLoaded("wilderworld")) {
            woodTypes.add(Pair.of("wisteria", new String[]{"wilderworld"}));
            CraftingTables.registerWilderWorldTables();
            LOGGER.info("Wilder World detected, creating Crafting Tables from Wilder World Planks");
        }

        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
            woodTypes.add(Pair.of("ancient_oak", new String[]{"biomemakeover"}));
            woodTypes.add(Pair.of("blighted_balsa", new String[]{"biomemakeover"}));
            woodTypes.add(Pair.of("swamp_cypress", new String[]{"biomemakeover"}));
            woodTypes.add(Pair.of("willow", new String[]{"biomemakeover"}));
            CraftingTables.registerBiomeMakeoverTables();
            LOGGER.info("Biome Makeover detected, creating Crafting Tables from Biome Makeover Planks");
        }
        if (FabricLoader.getInstance().isModLoaded("simplemango")) {
            woodTypes.add(Pair.of("mango", new String[]{"simplemango"}));
            CraftingTables.registerSimpleMangoTables();
            LOGGER.info("Simple Mango detected, creating Crafting Tables from Simple Mango Planks");
        }
        if (FabricLoader.getInstance().isModLoaded("vanillaenhanced")) {
            woodTypes.add(Pair.of("bamboo", new String[]{"vanillaenhanced"}));
            woodTypes.add(Pair.of("redwood", new String[]{"vanillaenhanced"}));
            CraftingTables.registerVanillaEnhancedTables();
            LOGGER.info("Vanilla Enhanced detected, creating Crafting Tables from Vanilla Enhanced Planks");

        }
        if (FabricLoader.getInstance().isModLoaded("betterazalea")) {
            woodTypes.add(Pair.of("azalea", new String[]{"betterazalea"}));
            woodTypes.add(Pair.of("flowering_azalea", new String[]{"betterazalea"}));
            CraftingTables.registerBetterAzaleaTables();
            LOGGER.info("Better Azalea detected, creating Crafting Tables from Better Azalea Planks");
        }
        if (FabricLoader.getInstance().isModLoaded("twigs")) {
            woodTypes.add(Pair.of("stripped_bamboo", new String[]{"twigs"}));
            CraftingTables.registerTwigsTables();
            LOGGER.info("Twigs detected, creating Crafting Tables from Twigs Planks");
        }

        if (FabricLoader.getInstance().isModLoaded("twm")) {
            CraftingTables.registerTheWildModTables();
            woodTypes.add(Pair.of("mangrove", new String[]{"twm"}));
            LOGGER.info("TWM detected, creating Crafting Tables from TWM Planks");
        }

        if (FabricLoader.getInstance().isModLoaded("tokenabledecoration")) {
            CraftingTables.registerTokenableDecorationTables();
            //woodTypes.add(Pair.of("mossy_acacia", new String[]{"tokenabledecoration"}));
            //woodTypes.add(Pair.of("mossy_birch", new String[]{"tokenabledecoration"}));
            //woodTypes.add(Pair.of("mossy_dark_oak", new String[]{"tokenabledecoration"}));
            //woodTypes.add(Pair.of("mossy_jungle", new String[]{"tokenabledecoration"}));
            //woodTypes.add(Pair.of("mossy_oak", new String[]{"tokenabledecoration"}));
            //woodTypes.add(Pair.of("mossy_spruce", new String[]{"tokenabledecoration"}));
            LOGGER.info("Tokenable Decoration detected, creating Crafting Tables from Tokenable Decoration Planks");
        }

        if (FabricLoader.getInstance().isModLoaded("the_aether")) {
            CraftingTables.registerTheAetherTables();
            woodTypes.add(Pair.of("golden_oak", new String[]{"the_aether"}));
            woodTypes.add(Pair.of("crystal", new String[]{"the_aether"}));
            woodTypes.add(Pair.of("skyroot", new String[]{"the_aether"}));
            LOGGER.info("The Aether - Paradise Lost detected, creating Crafting Tables from The Aether Planks");
        }
    }
}