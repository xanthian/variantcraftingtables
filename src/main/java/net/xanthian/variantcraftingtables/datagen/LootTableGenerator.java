package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;

import net.minecraft.block.Block;
import net.minecraft.loot.LootTable;

import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;

import java.util.List;

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
            addDrop(table, (Block block) -> this.addConditions(drops(block), List.of(DefaultResourceConditions.allModsLoaded("ad_astra"))));
        }

        // Beach Party (Lets Do)
        addDrop(BeachParty.LDBP_PALM_CRAFTING_TABLE, addConditions(drops(BeachParty.LDBP_PALM_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("beachparty"))));

        // Better Archeology
        addDrop(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE, addConditions(drops(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("betterarcheology"))));

        // Bewitchment
        for (Block table : Bewitchment.BW_TABLES.values()) {
            addDrop(table, (Block block) -> this.addConditions(drops(block), List.of(DefaultResourceConditions.allModsLoaded("bewitchment"))));
        }

        // Deeper & Darker
        addDrop(DeeperAndDarker.DAD_ECHO_CRAFTING_TABLE, addConditions(drops(DeeperAndDarker.DAD_ECHO_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("deeperdarker"))));

        // MineCells
        addDrop(MineCells.MC_PUTRID_CRAFTING_TABLE, addConditions(drops(MineCells.MC_PUTRID_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("minecells"))));

        // Natures Spirit
        for (Block table : NaturesSpirit.NS_TABLES.values()) {
            addDrop(table, (Block block) -> this.addConditions(drops(block), List.of(DefaultResourceConditions.allModsLoaded("natures_spirit"))));
        }

        // Promenade
        for (Block table : Promenade.PROM_TABLES.values()) {
            addDrop(table, (Block block) -> this.addConditions(drops(block), List.of(DefaultResourceConditions.allModsLoaded("promenade"))));
        }

        // Regions Unexplored
        for (Block table : RegionsUnexplored.RU_TABLES.values()) {
            addDrop(table, (Block block) -> this.addConditions(drops(block), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        }

        // SnifferPlus
        addDrop(SnifferPlus.SP_STONE_PINE_CRAFTING_TABLE, addConditions(drops(SnifferPlus.SP_STONE_PINE_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("snifferplus"))));

        // Tech reborn
        addDrop(TechReborn.TR_RUBBER_CRAFTING_TABLE, addConditions(drops(TechReborn.TR_RUBBER_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("techreborn"))));

        // Vinery (Lets Do)
        addDrop(Vinery.LDV_CHERRY_CRAFTING_TABLE, addConditions(drops(Vinery.LDV_CHERRY_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("vinery"))));

    }
    private LootTable.Builder addConditions(LootTable.Builder builder, List<ConditionJsonProvider> conditions) {
        if (!conditions.isEmpty())
            FabricDataGenHelper.addConditions(builder, conditions.toArray(ConditionJsonProvider[]::new));
        return builder;
    }
}