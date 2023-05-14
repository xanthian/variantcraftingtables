package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.xanthian.variantcraftingtables.craftingtables.CraftingTables;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.ACACIA_CRAFTING_TABLE, Items.ACACIA_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.BAMBOO_CRAFTING_TABLE, Items.BAMBOO_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.BIRCH_CRAFTING_TABLE, Items.BIRCH_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.CHERRY_CRAFTING_TABLE, Items.CHERRY_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.DARK_OAK_CRAFTING_TABLE, Items.DARK_OAK_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.JUNGLE_CRAFTING_TABLE, Items.JUNGLE_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.MANGROVE_CRAFTING_TABLE, Items.MANGROVE_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.SPRUCE_CRAFTING_TABLE, Items.SPRUCE_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.CRIMSON_CRAFTING_TABLE, Items.CRIMSON_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.WARPED_CRAFTING_TABLE, Items.WARPED_PLANKS);
    }
}
