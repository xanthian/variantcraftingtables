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
        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
            for (Block block : BiomeMakeover.BM_TABLES.values()) {
                registry.add(block, 300);
            }
        }
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
        if (FabricLoader.getInstance().isModLoaded("botania")) {
            for (Block block : Botania.BOT_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
            for (Block block : Cinderscapes.CS_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            registry.add(DeeperAndDarker.DAD_ECHO_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("desolation")) {
            registry.add(Desolation.DS_CHARRED_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("ecologics")) {
            for (Block block : Ecologics.ECO_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("eldritch_end")) {
            registry.add(EldritchEnd.EE_PRIMORDIAL_CRAFTING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("meadow")) {
            registry.add(Meadow.LDM_PINE_CRAFTING_TABLE, 300);
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
            registry.add(RegionsUnexplored.RU_ALPHA_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BAOBAB_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BLACK_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BLACKWOOD_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BLUE_BIOSHROOM_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BLUE_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BROWN_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_CYAN_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_CYPRESS_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_EUCALYPTUS_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_GRAY_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_GREEN_BIOSHROOM_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_GREEN_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_JOSHUA_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_KAPOK_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_LARCH_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_LIME_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_MAGENTA_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_MAGNOLIA_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_MAPLE_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_MAUVE_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_ORANGE_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_PALM_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_PINK_BIOSHROOM_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_PINE_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_PINK_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_PURPLE_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_REDWOOD_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_RED_PAINTED_CRAFTING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_SOCOTRA_CRAFTING_TABLE, 300);
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