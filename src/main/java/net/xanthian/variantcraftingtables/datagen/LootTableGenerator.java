package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;

import net.minecraft.block.Block;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
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
        addDrop(AdAstra.AA_AERONOS_CRAFTING_TABLE, addConditions(drops(AdAstra.AA_AERONOS_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("ad_astra"))));
        addDrop(AdAstra.AA_GLACIAN_CRAFTING_TABLE, addConditions(drops(AdAstra.AA_GLACIAN_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("ad_astra"))));
        addDrop(AdAstra.AA_STROPHAR_CRAFTING_TABLE, addConditions(drops(AdAstra.AA_STROPHAR_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("ad_astra"))));
        // Beach Party (Lets Do)
        addDrop(BeachParty.LDBP_PALM_CRAFTING_TABLE, addConditions(drops(BeachParty.LDBP_PALM_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("beachparty"))));
        // Better Archeology
        addDrop(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE, addConditions(drops(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("betterarcheology"))));
        // Bewitchment
        addDrop(Bewitchment.BW_CYPRESS_CRAFTING_TABLE, addConditions(drops(Bewitchment.BW_CYPRESS_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("bewitchment"))));
        addDrop(Bewitchment.BW_DRAGONS_BLOOD_CRAFTING_TABLE, addConditions(drops(Bewitchment.BW_DRAGONS_BLOOD_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("bewitchment"))));
        addDrop(Bewitchment.BW_ELDER_CRAFTING_TABLE, addConditions(drops(Bewitchment.BW_ELDER_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("bewitchment"))));
        addDrop(Bewitchment.BW_JUNIPER_CRAFTING_TABLE, addConditions(drops(Bewitchment.BW_JUNIPER_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("bewitchment"))));
        // Deeper & Darker
        addDrop(DeeperAndDarker.DAD_ECHO_CRAFTING_TABLE, addConditions(drops(DeeperAndDarker.DAD_ECHO_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("deeperdarker"))));
        // MineCells
        addDrop(MineCells.MC_PUTRID_CRAFTING_TABLE, addConditions(drops(MineCells.MC_PUTRID_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("minecells"))));
        // Natures Spirit
        addDrop(NaturesSpirit.NS_ASPEN_CRAFTING_TABLE, addConditions(drops(NaturesSpirit.NS_ASPEN_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("natures_spirit"))));
        addDrop(NaturesSpirit.NS_CYPRESS_CRAFTING_TABLE, addConditions(drops(NaturesSpirit.NS_CYPRESS_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("natures_spirit"))));
        addDrop(NaturesSpirit.NS_FIR_CRAFTING_TABLE, addConditions(drops(NaturesSpirit.NS_FIR_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("natures_spirit"))));
        addDrop(NaturesSpirit.NS_JOSHUA_CRAFTING_TABLE, addConditions(drops(NaturesSpirit.NS_JOSHUA_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("natures_spirit"))));
        addDrop(NaturesSpirit.NS_MAPLE_CRAFTING_TABLE, addConditions(drops(NaturesSpirit.NS_MAPLE_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("natures_spirit"))));
        addDrop(NaturesSpirit.NS_OLIVE_CRAFTING_TABLE, addConditions(drops(NaturesSpirit.NS_OLIVE_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("natures_spirit"))));
        addDrop(NaturesSpirit.NS_REDWOOD_CRAFTING_TABLE, addConditions(drops(NaturesSpirit.NS_REDWOOD_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("natures_spirit"))));
        addDrop(NaturesSpirit.NS_SUGI_CRAFTING_TABLE, addConditions(drops(NaturesSpirit.NS_SUGI_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("natures_spirit"))));
        addDrop(NaturesSpirit.NS_WILLOW_CRAFTING_TABLE, addConditions(drops(NaturesSpirit.NS_WILLOW_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("natures_spirit"))));
        addDrop(NaturesSpirit.NS_WISTERIA_CRAFTING_TABLE, addConditions(drops(NaturesSpirit.NS_WISTERIA_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("natures_spirit"))));
        // Promenade
        addDrop(Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE, addConditions(drops(Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("promenade"))));
        addDrop(Promenade.PROM_MAPLE_CRAFTING_TABLE, addConditions(drops(Promenade.PROM_MAPLE_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("promenade"))));
        addDrop(Promenade.PROM_PALM_CRAFTING_TABLE, addConditions(drops(Promenade.PROM_PALM_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("promenade"))));
        addDrop(Promenade.PROM_SAKURA_CRAFTING_TABLE, addConditions(drops(Promenade.PROM_SAKURA_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("promenade"))));
        // Regions Unexplored
        addDrop(RegionsUnexplored.RU_ALPHA_OAK_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_ALPHA_OAK_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BAOBAB_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_BAOBAB_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BLACK_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_BLACK_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BLACKWOOD_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_BLACKWOOD_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BLUE_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_BLUE_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BROWN_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_BROWN_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_CYAN_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_CYAN_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_CYPRESS_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_CYPRESS_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_DEAD_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_DEAD_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_EUCALYPTUS_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_EUCALYPTUS_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_GREEN_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_GREEN_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_GRAY_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_GRAY_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_JOSHUA_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_JOSHUA_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_LARCH_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_LARCH_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_LIME_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_LIME_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_MAGENTA_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_MAGENTA_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_MAPLE_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_MAPLE_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_MAUVE_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_MAUVE_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_ORANGE_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_ORANGE_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_PALM_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_PALM_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_PINE_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_PINE_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_PINK_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_PINK_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_PURPLE_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_PURPLE_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_RED_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_RED_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_REDWOOD_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_REDWOOD_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_WHITE_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_WHITE_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_WILLOW_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_WILLOW_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_YELLOW_PAINTED_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_YELLOW_PAINTED_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
            //addDrop(RegionsUnexplored.RU_CHERRY_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_CHERRY_CRAFTING_TABLE), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:cherry_planks")))))));
            //addDrop(RegionsUnexplored.RU_SCULKWOOD_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_SCULKWOOD_CRAFTING_TABLE), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:sculkwood_planks")))))));
            addDrop(RegionsUnexplored.RU_BRIMWOOD_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_BRIMWOOD_CRAFTING_TABLE), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:brimwood_planks")))))));
            addDrop(RegionsUnexplored.RU_COBALT_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_COBALT_CRAFTING_TABLE), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:cobalt_planks")))))));
            addDrop(RegionsUnexplored.RU_KAPOK_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_KAPOK_CRAFTING_TABLE), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:kapok_planks")))))));
            addDrop(RegionsUnexplored.RU_MAGNOLIA_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_MAGNOLIA_CRAFTING_TABLE), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:magnolia_planks")))))));
            addDrop(RegionsUnexplored.RU_SOCOTRA_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_SOCOTRA_CRAFTING_TABLE), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:socotra_planks")))))));
            addDrop(RegionsUnexplored.RU_YELLOW_BIOSHROOM_CRAFTING_TABLE, addConditions(drops(RegionsUnexplored.RU_YELLOW_BIOSHROOM_CRAFTING_TABLE), List.of(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:yellow_bioshroom_planks")))))));

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