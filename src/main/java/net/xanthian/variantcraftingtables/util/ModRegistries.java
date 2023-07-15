package net.xanthian.variantcraftingtables.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;

import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.Promenade;
import net.xanthian.variantcraftingtables.block.compatability.TechReborn;

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

        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            registry.add(Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE,300);
            registry.add(Promenade.PROM_MAPLE_CRAFTING_TABLE,300);
            registry.add(Promenade.PROM_PALM_CRAFTING_TABLE,300);
            registry.add(Promenade.PROM_SAKURA_CRAFTING_TABLE,300);
        }
    }
}