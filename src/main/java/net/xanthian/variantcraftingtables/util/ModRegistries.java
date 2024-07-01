package net.xanthian.variantcraftingtables.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        registerFuel();
    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(Vanilla.ACACIA_CRAFTING_TABLE, 300);
        registry.add(Vanilla.BAMBOO_CRAFTING_TABLE, 300);
        registry.add(Vanilla.BIRCH_CRAFTING_TABLE, 300);
        registry.add(Vanilla.CHERRY_CRAFTING_TABLE, 300);
        registry.add(Vanilla.DARK_OAK_CRAFTING_TABLE, 300);
        registry.add(Vanilla.JUNGLE_CRAFTING_TABLE, 300);
        registry.add(Vanilla.MANGROVE_CRAFTING_TABLE, 300);
        registry.add(Vanilla.SPRUCE_CRAFTING_TABLE, 300);

        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            registry.add(Blockus.BLS_HERRINGBONE_ACACIA_CRAFTING_TABLE, 300);
            registry.add(Blockus.BLS_HERRINGBONE_BAMBOO_CRAFTING_TABLE, 300);
            registry.add(Blockus.BLS_HERRINGBONE_BIRCH_CRAFTING_TABLE, 300);
            registry.add(Blockus.BLS_HERRINGBONE_CHARRED_CRAFTING_TABLE, 300);
            registry.add(Blockus.BLS_HERRINGBONE_CHERRY_CRAFTING_TABLE, 300);
            registry.add(Blockus.BLS_HERRINGBONE_DARK_OAK_CRAFTING_TABLE, 300);
            registry.add(Blockus.BLS_HERRINGBONE_JUNGLE_CRAFTING_TABLE, 300);
            registry.add(Blockus.BLS_HERRINGBONE_MANGROVE_CRAFTING_TABLE, 300);
            registry.add(Blockus.BLS_HERRINGBONE_OAK_CRAFTING_TABLE, 300);
            registry.add(Blockus.BLS_HERRINGBONE_RAW_BAMBOO_CRAFTING_TABLE, 300);
            registry.add(Blockus.BLS_HERRINGBONE_SPRUCE_CRAFTING_TABLE, 300);
            registry.add(Blockus.BLS_HERRINGBONE_WHITE_OAK_CRAFTING_TABLE, 300);
            registry.add(Blockus.BLS_RAW_BAMBOO_CRAFTING_TABLE, 300);
            registry.add(Blockus.BLS_WHITE_OAK_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
            for (Block block : Cinderscapes.CS_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_CRAFTING_TABLE, 300);
        }
    }
}