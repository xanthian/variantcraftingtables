package net.xanthian.variantcraftingtables.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;

import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        registerFuel();
    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

/**
 Copy from {@link AbstractFurnaceBlockEntity#createFuelTimeMap()}
 **/

        registry.add(Vanilla.ACACIA_CRAFTING_TABLE,300);
        registry.add(Vanilla.BAMBOO_CRAFTING_TABLE,300);
        registry.add(Vanilla.BIRCH_CRAFTING_TABLE,300);
        registry.add(Vanilla.CHERRY_CRAFTING_TABLE,300);
        registry.add(Vanilla.DARK_OAK_CRAFTING_TABLE,300);
        registry.add(Vanilla.JUNGLE_CRAFTING_TABLE,300);
        registry.add(Vanilla.MANGROVE_CRAFTING_TABLE,300);
        registry.add(Vanilla.SPRUCE_CRAFTING_TABLE,300);

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            registry.add(AdAstra.AA_AERONOS_CRAFTING_TABLE, 300);
            registry.add(AdAstra.AA_GLACIAN_CRAFTING_TABLE, 300);
            registry.add(AdAstra.AA_STROPHAR_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
            registry.add(BeachParty.LDBP_PALM_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            registry.add(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            registry.add(Bewitchment.BW_CYPRESS_CRAFTING_TABLE,300);
            registry.add(Bewitchment.BW_DRAGONS_BLOOD_CRAFTING_TABLE,300);
            registry.add(Bewitchment.BW_ELDER_CRAFTING_TABLE,300);
            registry.add(Bewitchment.BW_JUNIPER_CRAFTING_TABLE,300);
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            registry.add(Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE,300);
            registry.add(Promenade.PROM_MAPLE_CRAFTING_TABLE,300);
            registry.add(Promenade.PROM_PALM_CRAFTING_TABLE,300);
            registry.add(Promenade.PROM_SAKURA_CRAFTING_TABLE,300);
        }
        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
            registry.add(RegionsUnexplored.RU_ALPHA_OAK_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BAOBAB_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BLACK_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BLACKWOOD_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BLUE_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BROWN_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_CHERRY_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_CYAN_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_CYPRESS_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_DEAD_CRAFTING_TABLE, 300);
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
            registry.add(RegionsUnexplored.RU_SCULKWOOD_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_WHITE_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_WILLOW_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_YELLOW_PAINTED_CRAFTING_TABLE, 300);
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