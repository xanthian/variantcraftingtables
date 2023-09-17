package net.xanthian.variantcraftingtables;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;

import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;
import net.xanthian.variantcraftingtables.util.ModCreativeTab;
import net.xanthian.variantcraftingtables.util.ModRegistries;

public class Initialise implements ModInitializer {


    public static final String MOD_ID = "variantcraftingtables";

    @Override
    public void onInitialize() {

        Vanilla.registerTables();

        ifModLoaded("ad_astra", AdAstra::registerTables);

        ifModLoaded("beachparty", BeachParty::registerTables);

        ifModLoaded("betterarcheology", BetterArcheology::registerTables);

        ifModLoaded("bewitchment", Bewitchment::registerTables);

        ifModLoaded("deeperdarker", DeeperAndDarker::registerTables);

        ifModLoaded("minecells", MineCells::registerTables);

        ifModLoaded("natures_spirit", NaturesSpirit::registerTables);

        ifModLoaded("promenade", Promenade::registerTables);

        ifModLoaded("regions_unexplored", () -> {
            RegionsUnexplored.registerTables();
            if (isModVersion("regions_unexplored", "0.4")) {
                RegionsUnexplored.register04Tables();
            } else {
                RegionsUnexplored.register05Tables();
            }
        });

        ifModLoaded("snifferplus", SnifferPlus::registerTables);

        ifModLoaded("techreborn", TechReborn::registerTables);

        ifModLoaded("vinery", Vinery::registerTables);

        ModRegistries.registerFuelandFlammable();
        ModCreativeTab.registerItemGroup();

        // Datagen Block - disable for client run
        //SnifferPlus.registerTables();
        //RegionsUnexplored.register04Tables();
        //NaturesSpirit.registerTables();
        //DeeperAndDarker.registerTables();
        //AdAstra.registerTables();

    }

    public static void ifModLoaded(String modId, Runnable runnable) {
        if (FabricLoader.getInstance().isModLoaded(modId)) {
            runnable.run();
        }
    }
    public static boolean isModVersion(String modId, String ver) {
        return FabricLoader.getInstance()
                .getModContainer(modId)
                .map(ModContainer::getMetadata)
                .map(ModMetadata::getVersion)
                .map(Version::getFriendlyString)
                .filter(version -> version.startsWith(ver))
                .isPresent();
    }
}