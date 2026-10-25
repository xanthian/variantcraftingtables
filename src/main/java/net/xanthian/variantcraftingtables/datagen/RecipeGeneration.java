package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.util.ModItemTags;

import java.util.concurrent.CompletableFuture;

public class RecipeGeneration extends FabricRecipeProvider {

    public RecipeGeneration(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider,
                                                  BootstrapContext<Recipe<?>> recipeOutput,
                                                  BootstrapContext<Advancement> advancementOutput) {
        return new RecipeProvider(recipeOutput, advancementOutput) {

            @Override
            public void buildRecipes() {
                craftingTable(Vanilla.ACACIA_CRAFTING_TABLE, Items.ACACIA_PLANKS);
                craftingTable(Vanilla.BAMBOO_CRAFTING_TABLE, Items.BAMBOO_PLANKS);
                craftingTable(Vanilla.BIRCH_CRAFTING_TABLE, Items.BIRCH_PLANKS);
                craftingTable(Vanilla.CHERRY_CRAFTING_TABLE, Items.CHERRY_PLANKS);
                craftingTable(Vanilla.DARK_OAK_CRAFTING_TABLE, Items.DARK_OAK_PLANKS);
                craftingTable(Vanilla.JUNGLE_CRAFTING_TABLE, Items.JUNGLE_PLANKS);
                craftingTable(Vanilla.MANGROVE_CRAFTING_TABLE, Items.MANGROVE_PLANKS);
                craftingTable(Vanilla.PALE_OAK_CRAFTING_TABLE, Items.PALE_OAK_PLANKS);
                craftingTable(Vanilla.POPLAR_CRAFTING_TABLE, Items.POPLAR_PLANKS);
                craftingTable(Vanilla.SPRUCE_CRAFTING_TABLE, Items.SPRUCE_PLANKS);
                craftingTable(Vanilla.CRIMSON_CRAFTING_TABLE, Items.CRIMSON_PLANKS);
                craftingTable(Vanilla.WARPED_CRAFTING_TABLE, Items.WARPED_PLANKS);

                // Uncrafting recipe
                shapeless(RecipeCategory.MISC, Items.CRAFTING_TABLE)
                        .requires(ModItemTags.CRAFTING_TABLES)
                        .unlockedBy("has_crafting_table", has(Items.CRAFTING_TABLE))
                        .save(output, Initialise.MOD_ID + ":crafting_table_from_variants");
            }

            private void craftingTable(ItemLike table, ItemLike planks) {
                shaped(RecipeCategory.MISC, table)
                        .define('#', planks)
                        .pattern("##")
                        .pattern("##")
                        .unlockedBy("has_planks", has(planks))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "Variant Crafting Tables Recipe Provider";
    }
}