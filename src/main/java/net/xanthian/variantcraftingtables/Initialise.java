package net.xanthian.variantcraftingtables;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;

import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;
import net.xanthian.variantcraftingtables.util.ModCreativeTab;
import net.xanthian.variantcraftingtables.util.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantcraftingtables";

    @Override
    public void onInitialize() {

        Vanilla.registerTables();

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) { // DISABLE FOR DATAGEN
            AdAstra.registerTables();
        }
        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
            BeachParty.registerTables();
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            BetterArcheology.registerTables();
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            Bewitchment.registerTables();
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) { // DISABLE FOR DATAGEN
            DeeperAndDarker.registerTables();
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            Promenade.registerTables();
        }
        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
            RegionsUnexplored.registerTables();
        }
        if (FabricLoader.getInstance().isModLoaded("snifferplus")) { // DISABLE FOR DATAGEN
            SnifferPlus.registerTables();
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            TechReborn.registerTables();
        }
        if (FabricLoader.getInstance().isModLoaded("vinery")) {
            Vinery.registerTables();
        }

        ModRegistries.registerFuelandFlammable();
        ModCreativeTab.registerItemGroup();
    }
}