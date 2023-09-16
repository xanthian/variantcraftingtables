package net.xanthian.variantcraftingtables.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;

import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;

import static net.xanthian.variantcraftingtables.Initialise.isModVersion;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        registerFuel();
    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        for (Block block : Vanilla.VANILLA_CRAFTING_TABLES.values()) {
            registry.add(block, 300);
        }

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            for (Block block : AdAstra.AA_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
            registry.add(BeachParty.LDBP_PALM_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            registry.add(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            for (Block block : Bewitchment.BW_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            registry.add(DeeperAndDarker.DAD_ECHO_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("minecells")) {
            registry.add(MineCells.MC_PUTRID_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            registry.add(Promenade.PROM_MAPLE_CRAFTING_TABLE, 300);
            registry.add(Promenade.PROM_PALM_CRAFTING_TABLE, 300);
            registry.add(Promenade.PROM_SAKURA_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
            registry.add(RegionsUnexplored.RU_ALPHA_OAK_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BAOBAB_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BLACK_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BLACKWOOD_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BLUE_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BROWN_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_CYAN_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_CYPRESS_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_EUCALYPTUS_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_GRAY_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_GREEN_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_JOSHUA_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_LARCH_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_LIME_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_MAGENTA_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_MAPLE_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_MAUVE_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_ORANGE_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_PALM_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_PINE_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_PINK_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_PURPLE_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_REDWOOD_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_RED_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_WHITE_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_WILLOW_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_YELLOW_PAINTED_CRAFTING_TABLE, 300);
            if (isModVersion("regions_unexplored", "0.4")) {
                registry.add(RegionsUnexplored.RU_CHERRY_CRAFTING_TABLE, 300);
                registry.add(RegionsUnexplored.RU_SCULKWOOD_CRAFTING_TABLE, 300);
            } else {
                registry.add(RegionsUnexplored.RU_KAPOK_CRAFTING_TABLE, 300);
                registry.add(RegionsUnexplored.RU_MAGNOLIA_CRAFTING_TABLE, 300);
                registry.add(RegionsUnexplored.RU_SOCOTRA_CRAFTING_TABLE, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
            registry.add(SnifferPlus.SP_STONE_PINE_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("vinery")) {
            registry.add(Vinery.LDV_CHERRY_CRAFTING_TABLE, 300);
        }
    }
}