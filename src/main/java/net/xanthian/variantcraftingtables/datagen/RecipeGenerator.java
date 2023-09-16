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

        // Ad Astra (disabled)
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("ad_astra")),RecipeCategory.MISC, AdAstra.AA_AERONOS_CRAFTING_TABLE, ModItems.AERONOS_PLANKS.get());
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("ad_astra")),RecipeCategory.MISC, AdAstra.AA_GLACIAN_CRAFTING_TABLE, ModItems.GLACIAN_PLANKS.get());
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("ad_astra")),RecipeCategory.MISC, AdAstra.AA_STROPHAR_CRAFTING_TABLE, ModItems.STROPHAR_PLANKS.get());

        // Beach Party (Lets Do)
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("beachparty")),RecipeCategory.MISC, BeachParty.LDBP_PALM_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("beachparty:palm_planks")));

        // Better Archeology
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("betterarcheology")),RecipeCategory.MISC, BetterArcheology.BA_ROTTEN_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("betterarcheology:rotten_planks")));

        // Bewitchment
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("bewitchment")),RecipeCategory.MISC, Bewitchment.BW_CYPRESS_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("bewitchment:cypress_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("bewitchment")),RecipeCategory.MISC, Bewitchment.BW_DRAGONS_BLOOD_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("bewitchment:dragons_blood_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("bewitchment")),RecipeCategory.MISC, Bewitchment.BW_ELDER_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("bewitchment:elder_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("bewitchment")),RecipeCategory.MISC, Bewitchment.BW_JUNIPER_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("bewitchment:juniper_planks")));

        // Deeper & Darker (disabled)
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("deeperdarker")),RecipeCategory.MISC, DeeperAndDarker.DAD_ECHO_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("deeperanddarker:echo_planks")));

        // MineCells
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("minecells")),RecipeCategory.MISC, MineCells.MC_PUTRID_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("minecells:putrid_planks")));

        // Natures Spirit (disabled)
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")),RecipeCategory.MISC, NaturesSpirit.NS_ASPEN_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:aspen_planks")));
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")),RecipeCategory.MISC, NaturesSpirit.NS_CYPRESS_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:cypress_planks")));
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")),RecipeCategory.MISC, NaturesSpirit.NS_FIR_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:fir_planks")));
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")),RecipeCategory.MISC, NaturesSpirit.NS_JOSHUA_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:joshua_planks")));
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")),RecipeCategory.MISC, NaturesSpirit.NS_MAPLE_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:maple_planks")));
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")),RecipeCategory.MISC, NaturesSpirit.NS_OLIVE_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:olive_planks")));
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")),RecipeCategory.MISC, NaturesSpirit.NS_REDWOOD_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:redwood_planks")));
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")),RecipeCategory.MISC, NaturesSpirit.NS_SUGI_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:sugi_planks")));
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")),RecipeCategory.MISC, NaturesSpirit.NS_WILLOW_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:willow_planks")));
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")),RecipeCategory.MISC, NaturesSpirit.NS_WISTERIA_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:wisteria_planks")));

        // Promenade
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")),RecipeCategory.MISC, Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("promenade:dark_amaranth_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")),RecipeCategory.MISC, Promenade.PROM_MAPLE_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("promenade:maple_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")),RecipeCategory.MISC, Promenade.PROM_PALM_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("promenade:palm_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")),RecipeCategory.MISC, Promenade.PROM_SAKURA_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("promenade:sakura_planks")));

        // Regions Unexplored
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_ALPHA_OAK_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:alpha_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_BAOBAB_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:baobab_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_BLACK_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:black_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_BLACKWOOD_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:blackwood_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_BLUE_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:blue_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_BROWN_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:brown_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_CYAN_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:cyan_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_CYPRESS_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:cypress_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_DEAD_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:dead_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_EUCALYPTUS_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:eucalyptus_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_GREEN_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:green_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_GRAY_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:gray_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_JOSHUA_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:joshua_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_LARCH_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:larch_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:light_blue_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:light_gray_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_LIME_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:lime_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_MAGENTA_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:magenta_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_MAPLE_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:maple_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_MAUVE_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:mauve_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_ORANGE_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:orange_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_PALM_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:palm_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_PINE_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:pine_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_PINK_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:pink_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_PURPLE_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:purple_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_RED_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:red_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_REDWOOD_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:redwood_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_WHITE_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:white_painted_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_WILLOW_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:willow_planks")));
        offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")),RecipeCategory.MISC, RegionsUnexplored.RU_YELLOW_PAINTED_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:yellow_painted_planks")));
        //0.4.1 (disabled)
            //offer2x2CompactingRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:cherry_planks"))))), RecipeCategory.MISC, RegionsUnexplored.RU_CHERRY_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:cherry_planks")));
            //offer2x2CompactingRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:sculkwood_planks"))))), RecipeCategory.MISC, RegionsUnexplored.RU_SCULKWOOD_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:sculkwood_planks")));
        //0.5.0
            offer2x2CompactingRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:brimwood_planks"))))),RecipeCategory.MISC, RegionsUnexplored.RU_BRIMWOOD_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:brimwood_planks")));
            offer2x2CompactingRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:cobalt_planks"))))),RecipeCategory.MISC, RegionsUnexplored.RU_COBALT_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:cobalt_planks")));
            offer2x2CompactingRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:kapok_planks"))))),RecipeCategory.MISC, RegionsUnexplored.RU_KAPOK_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:kapok_planks")));
            offer2x2CompactingRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:magnolia_planks"))))),RecipeCategory.MISC, RegionsUnexplored.RU_MAGNOLIA_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:magnolia_planks")));
            offer2x2CompactingRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:socotra_planks"))))),RecipeCategory.MISC, RegionsUnexplored.RU_SOCOTRA_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:socotra_planks")));
            offer2x2CompactingRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.itemsRegistered(Registries.ITEM.get(new Identifier("regions_unexplored:yellow_bioshroom_planks"))))),RecipeCategory.MISC, RegionsUnexplored.RU_YELLOW_BIOSHROOM_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:yellow_bioshroom_planks")));

        // SnifferPlus (disabled)
        //offer2x2CompactingRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("snifferplus")),RecipeCategory.MISC, HellionsSniffer.HS_STONE_PINE_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("snifferplus:stone_pine_planks")));

        // Tech Reborn
        offer2x2CompactingRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("techreborn")),RecipeCategory.MISC, TechReborn.TR_RUBBER_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("techreborn:rubber_planks")));

        // Vinery (Lets Do)
        offer2x2CompactingRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("vinery")),RecipeCategory.MISC, Vinery.LDV_CHERRY_CRAFTING_TABLE, Registries.ITEM.get(new Identifier("vinery:cherry_planks")));

        // Uncrafting recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CRAFTING_TABLE,1)
                .input(ModItemTags.CRAFTING_TABLES)
                .criterion("has_crafting_table",InventoryChangedCriterion.Conditions.items(Items.CRAFTING_TABLE))
                .offerTo(exporter,new Identifier("variantcraftingtables", "crafting_table"));
    }
}