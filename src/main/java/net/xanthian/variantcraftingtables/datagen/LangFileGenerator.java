package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Blocks;
import net.xanthian.variantcraftingtables.block.Vanilla;

import java.util.concurrent.CompletableFuture;

public class LangFileGenerator extends FabricLanguageProvider {

    public LangFileGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {

        translationBuilder.add(Vanilla.ACACIA_CRAFTING_TABLE, "Acacia Crafting Table");
        translationBuilder.add(Vanilla.BAMBOO_CRAFTING_TABLE, "Bamboo Crafting Table");
        translationBuilder.add(Vanilla.BIRCH_CRAFTING_TABLE, "Birch Crafting Table");
        translationBuilder.add(Vanilla.CHERRY_CRAFTING_TABLE, "Cherry Crafting Table");
        translationBuilder.add(Vanilla.CRIMSON_CRAFTING_TABLE, "Crimson Crafting Table");
        translationBuilder.add(Vanilla.DARK_OAK_CRAFTING_TABLE, "Dark Oak Crafting Table");
        translationBuilder.add(Vanilla.JUNGLE_CRAFTING_TABLE, "Jungle Crafting Table");
        translationBuilder.add(Vanilla.MANGROVE_CRAFTING_TABLE, "Mangrove Crafting Table");
        translationBuilder.add(Blocks.CRAFTING_TABLE, "Oak Crafting Table");
        translationBuilder.add(Vanilla.PALE_OAK_CRAFTING_TABLE, "Pale Oak Crafting Table");
        translationBuilder.add(Vanilla.POPLAR_CRAFTING_TABLE, "Poplar Crafting Table");
        translationBuilder.add(Vanilla.SPRUCE_CRAFTING_TABLE, "Spruce Crafting Table");
        translationBuilder.add(Vanilla.WARPED_CRAFTING_TABLE, "Warped Crafting Table");
    }
}