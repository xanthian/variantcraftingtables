package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;

import net.minecraft.block.Block;

import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;
public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        for (Block block : Vanilla.VANILLA_CRAFTING_TABLES.values()){
            addDrop(block);
        }

        // Ad Astra
        for (Block table : AdAstra.AA_TABLES.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded("ad_astra")).addDrop(table, this::drops);
        }

        // Beach Party (Lets Do)
        withConditions(DefaultResourceConditions.allModsLoaded("beachparty")).addDrop(BeachParty.LDBP_PALM_CRAFTING_TABLE);

        // Better Archeology
        withConditions(DefaultResourceConditions.allModsLoaded("betterarcheology")).addDrop(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE);

        // Bewitchment
        for (Block table : Bewitchment.BW_TABLES.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded("bewitchment")).addDrop(table, this::drops);
        }

        // Deeper & Darker
        withConditions(DefaultResourceConditions.allModsLoaded("deeperdarker")).addDrop(DeeperAndDarker.DAD_ECHO_CRAFTING_TABLE);

        // MineCells
        withConditions(DefaultResourceConditions.allModsLoaded("minecells")).addDrop(MineCells.MC_PUTRID_CRAFTING_TABLE);

        // Natures Spirit
        for (Block table : NaturesSpirit.NS_TABLES.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded("natures_spirit")).addDrop(table, this::drops);
        }

        // Promenade
        for (Block table : Promenade.PROM_TABLES.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded("promenade")).addDrop(table, this::drops);
        }

        // Regions Unexplored
        for (Block table : RegionsUnexplored.RU_TABLES.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded("regions_unexplored")).addDrop(table, this::drops);
        }

        // SnifferPlus
        withConditions(DefaultResourceConditions.allModsLoaded("snifferplus")).addDrop(SnifferPlus.SP_STONE_PINE_CRAFTING_TABLE);

        // Tech reborn
        withConditions(DefaultResourceConditions.allModsLoaded("techreborn")).addDrop(TechReborn.TR_RUBBER_CRAFTING_TABLE);

        // Vinery (Lets Do)
        withConditions(DefaultResourceConditions.allModsLoaded("vinery")).addDrop(Vinery.LDV_CHERRY_CRAFTING_TABLE);

    }
}