package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TextureMap;
import net.xanthian.variantcraftingtables.craftingtables.CraftingTables;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.ACACIA_CRAFTING_TABLE, Blocks.ACACIA_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.BAMBOO_CRAFTING_TABLE, Blocks.BAMBOO_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.BIRCH_CRAFTING_TABLE, Blocks.BIRCH_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.CHERRY_CRAFTING_TABLE, Blocks.CHERRY_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.DARK_OAK_CRAFTING_TABLE, Blocks.DARK_OAK_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.JUNGLE_CRAFTING_TABLE, Blocks.JUNGLE_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.MANGROVE_CRAFTING_TABLE, Blocks.MANGROVE_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.SPRUCE_CRAFTING_TABLE, Blocks.SPRUCE_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.CRIMSON_CRAFTING_TABLE, Blocks.CRIMSON_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.WARPED_CRAFTING_TABLE, Blocks.WARPED_PLANKS, TextureMap::frontSideWithCustomBottom);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
