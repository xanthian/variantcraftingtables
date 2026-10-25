package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.world.level.block.Blocks;
import net.xanthian.variantcraftingtables.block.Vanilla;

public class ModelGenerator extends FabricModelProvider {

    public ModelGenerator(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

        blockStateModelGenerator.createCraftingTableLike(Vanilla.ACACIA_CRAFTING_TABLE, Blocks.ACACIA_PLANKS, TextureMapping::craftingTable);
        blockStateModelGenerator.createCraftingTableLike(Vanilla.BAMBOO_CRAFTING_TABLE, Blocks.BAMBOO_PLANKS, TextureMapping::craftingTable);
        blockStateModelGenerator.createCraftingTableLike(Vanilla.BIRCH_CRAFTING_TABLE, Blocks.BIRCH_PLANKS, TextureMapping::craftingTable);
        blockStateModelGenerator.createCraftingTableLike(Vanilla.CHERRY_CRAFTING_TABLE, Blocks.CHERRY_PLANKS, TextureMapping::craftingTable);
        blockStateModelGenerator.createCraftingTableLike(Vanilla.CRIMSON_CRAFTING_TABLE, Blocks.CRIMSON_PLANKS, TextureMapping::craftingTable);
        blockStateModelGenerator.createCraftingTableLike(Vanilla.DARK_OAK_CRAFTING_TABLE, Blocks.DARK_OAK_PLANKS, TextureMapping::craftingTable);
        blockStateModelGenerator.createCraftingTableLike(Vanilla.JUNGLE_CRAFTING_TABLE, Blocks.JUNGLE_PLANKS, TextureMapping::craftingTable);
        blockStateModelGenerator.createCraftingTableLike(Vanilla.MANGROVE_CRAFTING_TABLE, Blocks.MANGROVE_PLANKS, TextureMapping::craftingTable);
        blockStateModelGenerator.createCraftingTableLike(Vanilla.PALE_OAK_CRAFTING_TABLE, Blocks.PALE_OAK_PLANKS, TextureMapping::craftingTable);
        blockStateModelGenerator.createCraftingTableLike(Vanilla.POPLAR_CRAFTING_TABLE, Blocks.POPLAR_PLANKS, TextureMapping::craftingTable);
        blockStateModelGenerator.createCraftingTableLike(Vanilla.SPRUCE_CRAFTING_TABLE, Blocks.SPRUCE_PLANKS, TextureMapping::craftingTable);
        blockStateModelGenerator.createCraftingTableLike(Vanilla.WARPED_CRAFTING_TABLE, Blocks.WARPED_PLANKS, TextureMapping::craftingTable);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    }

    @Override
    public String getName() {
        return "Variant Crafting Tables Model Provider";
    }
}