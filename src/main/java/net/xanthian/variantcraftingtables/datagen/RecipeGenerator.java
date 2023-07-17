package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;
import net.xanthian.variantcraftingtables.util.ModItemTags;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, Vanilla.ACACIA_CRAFTING_TABLE, Items.ACACIA_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, Vanilla.BAMBOO_CRAFTING_TABLE, Items.BAMBOO_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, Vanilla.BIRCH_CRAFTING_TABLE, Items.BIRCH_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, Vanilla.CHERRY_CRAFTING_TABLE, Items.CHERRY_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, Vanilla.DARK_OAK_CRAFTING_TABLE, Items.DARK_OAK_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, Vanilla.JUNGLE_CRAFTING_TABLE, Items.JUNGLE_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, Vanilla.MANGROVE_CRAFTING_TABLE, Items.MANGROVE_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, Vanilla.SPRUCE_CRAFTING_TABLE, Items.SPRUCE_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, Vanilla.CRIMSON_CRAFTING_TABLE, Items.CRIMSON_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, Vanilla.WARPED_CRAFTING_TABLE, Items.WARPED_PLANKS);

        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("ad_astra")),RecipeCategory.MISC, AdAstra.AA_AERONOS_CRAFTING_TABLE, ModItems.AERONOS_PLANKS.get());
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("ad_astra")),RecipeCategory.MISC, AdAstra.AA_GLACIAN_CRAFTING_TABLE, ModItems.GLACIAN_PLANKS.get());
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("ad_astra")),RecipeCategory.MISC, AdAstra.AA_STROPHAR_CRAFTING_TABLE, ModItems.STROPHAR_PLANKS.get());

        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("betterarcheology")),RecipeCategory.MISC, BetterArcheology.BA_ROTTEN_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("betterarcheology:rotten_planks")));

        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")),RecipeCategory.MISC, Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("promenade:dark_amaranth_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")),RecipeCategory.MISC, Promenade.PROM_MAPLE_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("promenade:maple_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")),RecipeCategory.MISC, Promenade.PROM_PALM_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("promenade:palm_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")),RecipeCategory.MISC, Promenade.PROM_SAKURA_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("promenade:sakura_planks")));

        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("snifferplus")),RecipeCategory.MISC, HellionsSniffer.HS_STONE_PINE_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("snifferplus:stone_pine_planks")));

        offer2x2CompactingRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("techreborn")),RecipeCategory.MISC, TechReborn.TR_RUBBER_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("techreborn:rubber_planks")));

        offer2x2CompactingRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("vinery")),RecipeCategory.MISC, Vinery.LDV_CHERRY_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("vinery:cherry_planks")));

        // Uncrafting recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CRAFTING_TABLE,1)
                .input(ModItemTags.CRAFTINGTABLES)
                .criterion("has_crafting_table",InventoryChangedCriterion.Conditions.items(Items.CRAFTING_TABLE))
                .offerTo(exporter,new Identifier("variantcraftingtables", "crafting_table"));
    }
}