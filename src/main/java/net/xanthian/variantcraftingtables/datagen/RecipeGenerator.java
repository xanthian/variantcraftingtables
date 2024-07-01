package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;
import net.xanthian.variantcraftingtables.util.ModItemTags;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class RecipeGenerator extends FabricRecipeProvider {


    public RecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static void offerCraftingTableRecipe(RecipeExporter exporter, ItemConvertible table, ItemConvertible planks) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, table)
                .input('#', planks)
                .pattern("##").pattern("##")
                .criterion("has_planks", VanillaRecipeProvider.conditionsFromItem(planks))
                .offerTo(exporter);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerCraftingTableRecipe(exporter, Vanilla.ACACIA_CRAFTING_TABLE, Items.ACACIA_PLANKS);
        offerCraftingTableRecipe(exporter, Vanilla.BAMBOO_CRAFTING_TABLE, Items.BAMBOO_PLANKS);
        offerCraftingTableRecipe(exporter, Vanilla.BIRCH_CRAFTING_TABLE, Items.BIRCH_PLANKS);
        offerCraftingTableRecipe(exporter, Vanilla.CHERRY_CRAFTING_TABLE, Items.CHERRY_PLANKS);
        offerCraftingTableRecipe(exporter, Vanilla.DARK_OAK_CRAFTING_TABLE, Items.DARK_OAK_PLANKS);
        offerCraftingTableRecipe(exporter, Vanilla.JUNGLE_CRAFTING_TABLE, Items.JUNGLE_PLANKS);
        offerCraftingTableRecipe(exporter, Vanilla.MANGROVE_CRAFTING_TABLE, Items.MANGROVE_PLANKS);
        offerCraftingTableRecipe(exporter, Vanilla.SPRUCE_CRAFTING_TABLE, Items.SPRUCE_PLANKS);
        offerCraftingTableRecipe(exporter, Vanilla.CRIMSON_CRAFTING_TABLE, Items.CRIMSON_PLANKS);
        offerCraftingTableRecipe(exporter, Vanilla.WARPED_CRAFTING_TABLE, Items.WARPED_PLANKS);

        registerCraftingTableRecipe(exporter, AdAstra.AA_TABLES, "ad_astra");
        registerCraftingTableRecipe(exporter, BeachParty.LDBP_TABLES, "beachparty");
        registerCraftingTableRecipe(exporter, BetterArcheology.BA_TABLES, "betterarcheology");
        registerCraftingTableRecipe(exporter, Bewitchment.BW_TABLES, "bewitchment");
        registerCraftingTableRecipe(exporter, BiomeMakeover.BM_TABLES, "biomemakeover");
        registerCraftingTableRecipe(exporter, Blockus.BLS_TABLES, "blockus");
        registerCraftingTableRecipe(exporter, Botania.BOT_TABLES, "botania");
        registerCraftingTableRecipe(exporter, Cinderscapes.CS_TABLES, "cinderscapes");
        registerCraftingTableRecipe(exporter, DeeperAndDarker.DAD_TABLES, "deeperdarker");
        registerCraftingTableRecipe(exporter, Desolation.DS_TABLES, "desolation");
        registerCraftingTableRecipe(exporter, Ecologics.ECO_TABLES, "ecologics");
        registerCraftingTableRecipe(exporter, EldritchEnd.EE_TABLES, "eldritch_end");
        registerCraftingTableRecipe(exporter, Meadow.LDM_TABLES, "meadow");
        registerCraftingTableRecipe(exporter, MineCells.MC_TABLES, "minecells");
        registerCraftingTableRecipe(exporter, NaturesSpirit.NS_TABLES, "natures_spirit");
        registerCraftingTableRecipe(exporter, Promenade.PROM_TABLES, "promenade");
        registerCraftingTableRecipe(exporter, RegionsUnexplored.RU_TABLES, "regions_unexplored");
        registerCraftingTableRecipe(exporter, SnifferPlus.SP_TABLES, "snifferplus");
        registerCraftingTableRecipe(exporter, TechReborn.TR_TABLES, "techreborn");
        registerCraftingTableRecipe(exporter, Vinery.LDV_TABLES, "vinery");

        // Uncrafting recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CRAFTING_TABLE)
                .input(ModItemTags.CRAFTING_TABLES)
                .criterion("has_crafting_table", InventoryChangedCriterion.Conditions.items(Items.CRAFTING_TABLE))
                .offerTo(exporter, Identifier.of("variantcraftingtables", "crafting_table"));
    }

    public void registerCraftingTableRecipe(RecipeExporter exporter, Map<Identifier, Block> tables, String modId) {
        registerCraftingTableRecipe(exporter, tables, modId, "_planks");
    }

    public void registerCraftingTableRecipe(RecipeExporter exporter, Map<Identifier, Block> tables, String modId, String plankSuffix) {
        for (Map.Entry<Identifier, Block> entry : tables.entrySet()) {
            Identifier tableId = entry.getKey();
            Block table = entry.getValue();
            String path = tableId.getPath();
            String name = path.replace("variantcraftingtables:", "").replace("_crafting_table", "").replaceFirst("^[^_]+_", "");
            String plankPath = modId + ":" + name + plankSuffix;
            offerCraftingTableRecipe(withConditions(exporter, ResourceConditions.and(ResourceConditions.allModsLoaded(modId),
                            ResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(plankPath))))),
                    table, Registries.ITEM.get(Identifier.of(plankPath)));
        }
    }
}