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

        translationBuilder.add(Initialise.ITEM_GROUP, "Variant Crafting Tables");

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

        translationBuilder.add(AdAstra.AA_AERONOS_CRAFTING_TABLE, "Aeronos Crafting Table");
        translationBuilder.add(AdAstra.AA_GLACIAN_CRAFTING_TABLE, "Glacian Crafting Table");
        translationBuilder.add(AdAstra.AA_STROPHAR_CRAFTING_TABLE, "Strophar Crafting Table");

        translationBuilder.add(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE, "Rotten Crafting Table");

        translationBuilder.add(HellionsSniffer.HS_STONE_PINE_CRAFTING_TABLE, "Stone Pine Crafting Table");

        translationBuilder.add(Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE, "Dark Amaranth Crafting Table");
        translationBuilder.add(Promenade.PROM_MAPLE_CRAFTING_TABLE, "Maple Crafting Table");
        translationBuilder.add(Promenade.PROM_PALM_CRAFTING_TABLE, "Palm Crafting Table");
        translationBuilder.add(Promenade.PROM_SAKURA_CRAFTING_TABLE, "Sakura Crafting Table");

        translationBuilder.add(TechReborn.TR_RUBBER_CRAFTING_TABLE, "Rubber Crafting Table");

    }
}