package net.xanthian.variantcraftingtables;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;
import net.xanthian.variantcraftingtables.util.ModCreativeTab;
import net.xanthian.variantcraftingtables.util.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantcraftingtables";

    public static void ifModLoaded(String modId, Runnable runnable) {
        if (FabricLoader.getInstance().isModLoaded(modId)) {
            runnable.run();
        }
    }

    @Override
    public void onInitialize() {

        Vanilla.registerTables();

        //ifModLoaded("ad_astra", AdAstra::registerTables);
        //ifModLoaded("beachparty", BeachParty::registerTables);
        //ifModLoaded("betterarcheology", BetterArcheology::registerTables);
        //ifModLoaded("bewitchment", Bewitchment::registerTables);
        //ifModLoaded("biomemakeover", BiomeMakeover::registerTables);
        ifModLoaded("blockus", Blockus::registerTables);
        //ifModLoaded("botania", Botania::registerTables);
        ifModLoaded("cinderscapes", Cinderscapes::registerTables);
        //ifModLoaded("deeperdarker", DeeperAndDarker::registerTables);
        //ifModLoaded("desolation", Desolation::registerTables);
        //ifModLoaded("ecologics", Ecologics::registerTables);
        //ifModLoaded("eldritch_end", EldritchEnd::registerTables);
        //ifModLoaded("meadow", Meadow::registerTables);
        //ifModLoaded("minecells", MineCells::registerTables);
        ifModLoaded("natures_spirit", NaturesSpirit::registerTables);
        //ifModLoaded("promenade", Promenade::registerTables);
        //ifModLoaded("regions_unexplored", RegionsUnexplored::registerTables);
        //ifModLoaded("snifferplus", SnifferPlus::registerTables);
        ifModLoaded("techreborn", TechReborn::registerTables);
        //ifModLoaded("vinery", Vinery::registerTables);

        ModRegistries.registerFuelandFlammable();
        ModCreativeTab.registerItemGroup();

        //Datagen Block - disable for client run
        //Botania.registerTables();
        //SnifferPlus.registerTables();
    }
}