package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.minecraft.block.Blocks;

import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.block.*;
import net.xanthian.variantcraftingtables.block.compatability.*;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        // Item group
        translationBuilder.add(Initialise.ITEM_GROUP, "Variant Crafting Tables");
        //Vanilla
        translationBuilder.add(Vanilla.ACACIA_CRAFTING_TABLE, "Acacia Crafting Table");
        translationBuilder.add(Vanilla.BAMBOO_CRAFTING_TABLE, "Bamboo Crafting Table");
        translationBuilder.add(Vanilla.BIRCH_CRAFTING_TABLE, "Birch Crafting Table");
        translationBuilder.add(Vanilla.CHERRY_CRAFTING_TABLE, "Cherry Crafting Table");
        translationBuilder.add(Vanilla.CRIMSON_CRAFTING_TABLE, "Crimson Crafting Table");
        translationBuilder.add(Vanilla.DARK_OAK_CRAFTING_TABLE, "Dark Oak Crafting Table");
        translationBuilder.add(Vanilla.JUNGLE_CRAFTING_TABLE, "Jungle Crafting Table");
        translationBuilder.add(Vanilla.MANGROVE_CRAFTING_TABLE, "Mangrove Crafting Table");
        translationBuilder.add(Blocks.CRAFTING_TABLE, "Oak Crafting Table");
        translationBuilder.add(Vanilla.SPRUCE_CRAFTING_TABLE, "Spruce Crafting Table");
        translationBuilder.add(Vanilla.WARPED_CRAFTING_TABLE, "Warped Crafting Table");
        // Ad Astra
        translationBuilder.add(AdAstra.AA_AERONOS_CRAFTING_TABLE, "Aeronos Crafting Table");
        translationBuilder.add(AdAstra.AA_GLACIAN_CRAFTING_TABLE, "Glacian Crafting Table");
        translationBuilder.add(AdAstra.AA_STROPHAR_CRAFTING_TABLE, "Strophar Crafting Table");
        // Beach Party (Lets Do)
        translationBuilder.add(BeachParty.LDBP_PALM_CRAFTING_TABLE, "Palm Crafting Table");
        // Better Archeology
        translationBuilder.add(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE, "Rotten Crafting Table");
        // Bewitchment
        translationBuilder.add(Bewitchment.BW_CYPRESS_CRAFTING_TABLE, "Cypress Crafting Table");
        translationBuilder.add(Bewitchment.BW_DRAGONS_BLOOD_CRAFTING_TABLE, "Dragon's Blood Crafting Table");
        translationBuilder.add(Bewitchment.BW_ELDER_CRAFTING_TABLE, "Elder Crafting Table");
        translationBuilder.add(Bewitchment.BW_JUNIPER_CRAFTING_TABLE, "Juniper Crafting Table");
        // Promenade
        translationBuilder.add(Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE, "Dark Amaranth Crafting Table");
        translationBuilder.add(Promenade.PROM_MAPLE_CRAFTING_TABLE, "Maple Crafting Table");
        translationBuilder.add(Promenade.PROM_PALM_CRAFTING_TABLE, "Palm Crafting Table");
        translationBuilder.add(Promenade.PROM_SAKURA_CRAFTING_TABLE, "Sakura Crafting Table");
        // Regions Unexplored
        translationBuilder.add(RegionsUnexplored.RU_ALPHA_OAK_CRAFTING_TABLE, "Alpha Oak Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_BAOBAB_CRAFTING_TABLE,"Baobab Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_BLACK_PAINTED_CRAFTING_TABLE,"Black Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_BLACKWOOD_CRAFTING_TABLE,"Blackwood Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_BLUE_PAINTED_CRAFTING_TABLE, "Blue Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_BROWN_PAINTED_CRAFTING_TABLE, "Brown Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_CHERRY_CRAFTING_TABLE, "Cherry Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_CYAN_PAINTED_CRAFTING_TABLE, "Cyan Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_CYPRESS_CRAFTING_TABLE, "Cypress Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_DEAD_CRAFTING_TABLE, "Dead Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_EUCALYPTUS_CRAFTING_TABLE, "Eucalyptus Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_GRAY_PAINTED_CRAFTING_TABLE, "Gray Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_GREEN_PAINTED_CRAFTING_TABLE, "Green Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_JOSHUA_CRAFTING_TABLE, "Joshua Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_LARCH_CRAFTING_TABLE, "Larch Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_CRAFTING_TABLE, "Light Blue Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_CRAFTING_TABLE, "Light Gray Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_LIME_PAINTED_CRAFTING_TABLE, "Lime Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_MAGENTA_PAINTED_CRAFTING_TABLE, "Magenta Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_MAPLE_CRAFTING_TABLE, "Maple Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_MAUVE_CRAFTING_TABLE, "Mauve Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_ORANGE_PAINTED_CRAFTING_TABLE, "Orange Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_PALM_CRAFTING_TABLE, "Palm Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_PINE_CRAFTING_TABLE, "Pine Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_PINK_PAINTED_CRAFTING_TABLE, "Pink Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_PURPLE_PAINTED_CRAFTING_TABLE, "Purple Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_REDWOOD_CRAFTING_TABLE, "Redwood Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_RED_PAINTED_CRAFTING_TABLE, "Red Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_SCULKWOOD_CRAFTING_TABLE, "Sculkwood Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_WHITE_PAINTED_CRAFTING_TABLE, "White Painted Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_WILLOW_CRAFTING_TABLE, "Willow Crafting Table");
        translationBuilder.add(RegionsUnexplored.RU_YELLOW_PAINTED_CRAFTING_TABLE, "Yellow Painted Crafting Table");
        // SnifferPlus
        translationBuilder.add(SnifferPlus.SP_STONE_PINE_CRAFTING_TABLE, "Stone Pine Crafting Table");
        // Tech Reborn
        translationBuilder.add(TechReborn.TR_RUBBER_CRAFTING_TABLE, "Rubber Crafting Table");
        // Vinery
        translationBuilder.add(Vinery.LDV_CHERRY_CRAFTING_TABLE,"Cherry Crafting Table");
    }
}