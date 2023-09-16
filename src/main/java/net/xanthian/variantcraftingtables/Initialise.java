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

        ifModLoaded("deeperdarker", DeeperAndDarker::registerTables); // DISABLE FOR DATAGEN

        ifModLoaded("minecells", MineCells::registerTables);

        ifModLoaded("natures_spirit", NaturesSpirit::registerTables);  // DISABLE FOR DATAGEN

        ifModLoaded("promenade", Promenade::registerTables);

        ifModLoaded("regions_unexplored", () -> {
            RegionsUnexplored.registerTables();
            //RegionsUnexplored.register04Tables(); // ENABLE FOR DATAGEN
            //RegionsUnexplored.register05Tables(); // ENABLE FOR DATAGEN
            if (isModVersion("regions_unexplored", "0.4")) {
                RegionsUnexplored.register04Tables(); // DISABLE FOR DATAGEN
            } else {
                RegionsUnexplored.register05Tables(); // DISABLE FOR DATAGEN
            }
        });

        ifModLoaded("snifferplus", SnifferPlus::registerTables); // DISABLE FOR DATAGEN

        ifModLoaded("techreborn", TechReborn::registerTables);

        ifModLoaded("vinery", Vinery::registerTables);


        ModRegistries.registerFuelandFlammable();
        ModCreativeTab.registerItemGroup();

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