package net.xanthian.variantcraftingtables.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;

import net.xanthian.variantcraftingtables.block.CraftingTables;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        registerFuel();
    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

/**
 Copy from {@link AbstractFurnaceBlockEntity#createFuelTimeMap()}
 **/

        registry.add(CraftingTables.ACACIA_CRAFTING_TABLE, 300);
        registry.add(CraftingTables.BAMBOO_CRAFTING_TABLE, 300);
        registry.add(CraftingTables.BIRCH_CRAFTING_TABLE, 300);
        registry.add(CraftingTables.CHERRY_CRAFTING_TABLE, 300);
        registry.add(CraftingTables.DARK_OAK_CRAFTING_TABLE, 300);
        registry.add(CraftingTables.JUNGLE_CRAFTING_TABLE, 300);
        registry.add(CraftingTables.MANGROVE_CRAFTING_TABLE, 300);
        registry.add(CraftingTables.SPRUCE_CRAFTING_TABLE, 300);

    }
}