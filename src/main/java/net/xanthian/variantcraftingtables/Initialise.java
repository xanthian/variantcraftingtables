package net.xanthian.variantcraftingtables;

import com.google.common.collect.Lists;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.SharedConstants;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.craftingtables.CraftingTables;
import org.apache.commons.lang3.tuple.Pair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantcraftingtables";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static List<Pair<String, String[]>> woodTypes = Lists.newArrayList();

    public static final ItemGroup VCT = FabricItemGroupBuilder.build(new Identifier(Initialise.MOD_ID, "vct"),
            () -> new ItemStack(Blocks.CRAFTING_TABLE));

    @Override
    public void onInitialize() {

        woodTypes.add(Pair.of("acacia", new String[0]));
        woodTypes.add(Pair.of("birch", new String[0]));
        woodTypes.add(Pair.of("dark_oak", new String[0]));
        woodTypes.add(Pair.of("jungle", new String[0]));
        woodTypes.add(Pair.of("spruce", new String[0]));
        CraftingTables.registerVanillaTables();
        if (SharedConstants.getGameVersion().getName().startsWith("1.19")) {
            woodTypes.add(Pair.of("mangrove", new String[0]));
            CraftingTables.registerVanilla119Tables();
        }
        if (!FabricLoader.getInstance().isModLoaded("betternether")) {
            woodTypes.add(Pair.of("crimson", new String[0]));
            woodTypes.add(Pair.of("warped", new String[0]));
            CraftingTables.registerNetherTables();
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            LOGGER.info("Better Nether detected, removing Crafting Tables from Varied Crafting Tables");
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            woodTypes.add(Pair.of("rubber", new String[]{"techreborn"}));
            CraftingTables.registerTRTables();
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            woodTypes.add(Pair.of("cypress", new String[]{"bewitchment"}));
            woodTypes.add(Pair.of("dragons_blood", new String[]{"bewitchment"}));
            woodTypes.add(Pair.of("elder", new String[]{"bewitchment"}));
            woodTypes.add(Pair.of("juniper", new String[]{"bewitchment"}));
            CraftingTables.registerBewitchmentTables();
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
            woodTypes.add(Pair.of("herringbone_mangrove", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_oak", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_spruce", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_crimson", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_warped", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_bamboo", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_charred", new String[]{"blockus"}));
            woodTypes.add(Pair.of("herringbone_white_oak", new String[]{"blockus"}));
            CraftingTables.registerBlockusTables();
        }
        if (FabricLoader.getInstance().isModLoaded("botania")) {
            woodTypes.add(Pair.of("dreamwood", new String[]{"botania"}));
            woodTypes.add(Pair.of("livingwood", new String[]{"botania"}));
            woodTypes.add(Pair.of("mossy_dreamwood", new String[]{"botania"}));
            woodTypes.add(Pair.of("mossy_livingwood", new String[]{"botania"}));
            woodTypes.add(Pair.of("shimmerwood", new String[]{"botania"}));
            CraftingTables.registerBotaniaTables();
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            woodTypes.add(Pair.of("cherry_oak", new String[]{"promenade"}));
            woodTypes.add(Pair.of("dark_amaranth", new String[]{"promenade"}));
            woodTypes.add(Pair.of("palm", new String[]{"promenade"}));
            CraftingTables.registerPromenadeTables();
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
        }
        if (FabricLoader.getInstance().isModLoaded("wilderworld")) {
            woodTypes.add(Pair.of("wisteria", new String[]{"wilderworld"}));
            CraftingTables.registerWilderWorldTables();
        }
        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
            woodTypes.add(Pair.of("ancient_oak", new String[]{"biomemakeover"}));
            woodTypes.add(Pair.of("blighted_balsa", new String[]{"biomemakeover"}));
            woodTypes.add(Pair.of("swamp_cypress", new String[]{"biomemakeover"}));
            woodTypes.add(Pair.of("willow", new String[]{"biomemakeover"}));
            CraftingTables.registerBiomeMakeoverTables();
        }
        if (FabricLoader.getInstance().isModLoaded("simplemango")) {
            woodTypes.add(Pair.of("mango", new String[]{"simplemango"}));
            CraftingTables.registerSimpleMangoTables();
        }
        if (FabricLoader.getInstance().isModLoaded("enriched")) {
            woodTypes.add(Pair.of("bamboo", new String[]{"enriched"}));
            woodTypes.add(Pair.of("redwood", new String[]{"enriched"}));
            CraftingTables.registerEnrichedTables();
        }
        if (FabricLoader.getInstance().isModLoaded("ecologics")) {
            woodTypes.add(Pair.of("azalea", new String[]{"ecologics"}));
            woodTypes.add(Pair.of("coconut", new String[]{"ecologics"}));
            woodTypes.add(Pair.of("flowering_azalea", new String[]{"ecologics"}));
            woodTypes.add(Pair.of("walnut", new String[]{"ecologics"}));
            CraftingTables.registerEcologicsTables();
        }
        if (FabricLoader.getInstance().isModLoaded("twigs")) {
            woodTypes.add(Pair.of("stripped_bamboo", new String[]{"twigs"}));
            CraftingTables.registerTwigsTables();
        }
        if (FabricLoader.getInstance().isModLoaded("paradise_lost")) {
            woodTypes.add(Pair.of("golden_oak", new String[]{"paradise_lost"}));
            woodTypes.add(Pair.of("crystal", new String[]{"paradise_lost"}));
            woodTypes.add(Pair.of("skyroot", new String[]{"paradise_lost"}));
            CraftingTables.registerTheAetherTables();
        }
        if (FabricLoader.getInstance().isModLoaded("croptopia")) {
            woodTypes.add(Pair.of("cinnamon", new String[]{"croptopia"}));
            CraftingTables.registerCroptopiaTables();
        }
        if (FabricLoader.getInstance().isModLoaded("arclight")) {
            woodTypes.add(Pair.of("jade", new String[]{"arclight"}));
            woodTypes.add(Pair.of("moon", new String[]{"arclight"}));
            woodTypes.add(Pair.of("shadow", new String[]{"arclight"}));
            CraftingTables.registerArclightTables();
        }
        if (FabricLoader.getInstance().isModLoaded("traverse")) {
            woodTypes.add(Pair.of("fir", new String[]{"traverse"}));
            CraftingTables.registerTraverseTables();
        }
        if (FabricLoader.getInstance().isModLoaded("terrestria")) {
            //woodTypes.add(Pair.of("cypress", new String[]{"terrestria"}));
            woodTypes.add(Pair.of("hemlock", new String[]{"terrestria"}));
            woodTypes.add(Pair.of("japanese_maple", new String[]{"terrestria"}));
            woodTypes.add(Pair.of("rainbow_eucalyptus", new String[]{"terrestria"}));
            //woodTypes.add(Pair.of("redwood", new String[]{"terrestria"}));
            //woodTypes.add(Pair.of("rubber", new String[]{"terrestria"}));
            woodTypes.add(Pair.of("sakura", new String[]{"terrestria"}));
            //woodTypes.add(Pair.of("willow", new String[]{"terrestria"}));
            woodTypes.add(Pair.of("yucca_palm", new String[]{"terrestria"}));
            CraftingTables.registerTerrestriaTables();
        }
        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
            woodTypes.add(Pair.of("scorched", new String[]{"cinderscapes"}));
            woodTypes.add(Pair.of("umbral", new String[]{"cinderscapes"}));
            CraftingTables.registerCinderscapesTables();
        }
        if (FabricLoader.getInstance().isModLoaded("colorful-azaleas")) {
            woodTypes.add(Pair.of("azule_azalea", new String[]{"colorful-azaleas"}));
            woodTypes.add(Pair.of("bright_azalea", new String[]{"colorful-azaleas"}));
            woodTypes.add(Pair.of("fiss_azalea", new String[]{"colorful-azaleas"}));
            woodTypes.add(Pair.of("roze_azalea", new String[]{"colorful-azaleas"}));
            woodTypes.add(Pair.of("tecal_azalea", new String[]{"colorful-azaleas"}));
            woodTypes.add(Pair.of("titanium_azalea", new String[]{"colorful-azaleas"}));
            woodTypes.add(Pair.of("walnut_azalea", new String[]{"colorful-azaleas"}));
            CraftingTables.registerColorfulAzaleasTables();
        }
        if (FabricLoader.getInstance().isModLoaded("wilderwild")) {
            woodTypes.add(Pair.of("baobab", new String[]{"wilderwild"}));
            //woodTypes.add(Pair.of("cypress", new String[]{"wilderwild"}));
            CraftingTables.registerWilderWildsTables();
        }
    }
}