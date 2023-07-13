package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.minecraft.block.Blocks;

import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.block.*;
import net.xanthian.variantcraftingtables.block.compatability.TechReborn;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(Initialise.ITEM_GROUP, "Variant Crafting Tables");

        translationBuilder.add(CraftingTables.ACACIA_CRAFTING_TABLE, "Acacia Crafting Table");
        translationBuilder.add(CraftingTables.BAMBOO_CRAFTING_TABLE, "Bamboo Crafting Table");
        translationBuilder.add(CraftingTables.BIRCH_CRAFTING_TABLE, "Birch Crafting Table");
        translationBuilder.add(CraftingTables.CHERRY_CRAFTING_TABLE, "Cherry Crafting Table");
        translationBuilder.add(CraftingTables.CRIMSON_CRAFTING_TABLE, "Crimson Crafting Table");
        translationBuilder.add(CraftingTables.DARK_OAK_CRAFTING_TABLE, "Dark Oak Crafting Table");
        translationBuilder.add(CraftingTables.JUNGLE_CRAFTING_TABLE, "Jungle Crafting Table");
        translationBuilder.add(CraftingTables.MANGROVE_CRAFTING_TABLE, "Mangrove Crafting Table");
        translationBuilder.add(Blocks.CRAFTING_TABLE, "Oak Crafting Table");
        translationBuilder.add(CraftingTables.SPRUCE_CRAFTING_TABLE, "Spruce Crafting Table");
        translationBuilder.add(CraftingTables.WARPED_CRAFTING_TABLE, "Warped Crafting Table");
                translationBuilder.add(TechReborn.TR_RUBBER_CRAFTING_TABLE, "Rubber Crafting Table");
    }
}