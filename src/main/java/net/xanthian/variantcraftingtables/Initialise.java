package net.xanthian.variantcraftingtables;

import net.fabricmc.api.ModInitializer;
import net.xanthian.variantcraftingtables.util.ModCreativeTab;
import net.xanthian.variantcraftingtables.block.TableFireBehavior;
import net.xanthian.variantcraftingtables.block.TableFuelBehavior;
import net.xanthian.variantcraftingtables.block.DynamicTables;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantcraftingtables";

    @Override
    public void onInitialize() {
        TableFireBehavior.register();
        TableFuelBehavior.register();
        DynamicTables.register();
        ModCreativeTab.registerItemGroup();

    }
}
