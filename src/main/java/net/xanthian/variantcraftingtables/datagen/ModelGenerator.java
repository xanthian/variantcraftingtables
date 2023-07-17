package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TextureMap;

import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.ACACIA_CRAFTING_TABLE, Blocks.ACACIA_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.BAMBOO_CRAFTING_TABLE, Blocks.BAMBOO_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.BIRCH_CRAFTING_TABLE, Blocks.BIRCH_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.CHERRY_CRAFTING_TABLE, Blocks.CHERRY_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.DARK_OAK_CRAFTING_TABLE, Blocks.DARK_OAK_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.JUNGLE_CRAFTING_TABLE, Blocks.JUNGLE_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.MANGROVE_CRAFTING_TABLE, Blocks.MANGROVE_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.SPRUCE_CRAFTING_TABLE, Blocks.SPRUCE_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.CRIMSON_CRAFTING_TABLE, Blocks.CRIMSON_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.WARPED_CRAFTING_TABLE, Blocks.WARPED_PLANKS, TextureMap::frontSideWithCustomBottom);


        //blockStateModelGenerator.registerCubeWithCustomTextures(AdAstra.AA_AERONOS_CRAFTING_TABLE, earth.terrarium.ad_astra.common.registry.ModBlocks.AERONOS_PLANKS.get(), TextureMap::frontSideWithCustomBottom);
        //blockStateModelGenerator.registerCubeWithCustomTextures(AdAstra.AA_GLACIAN_CRAFTING_TABLE, earth.terrarium.ad_astra.common.registry.ModBlocks.GLACIAN_PLANKS.get(), TextureMap::frontSideWithCustomBottom);
        //blockStateModelGenerator.registerCubeWithCustomTextures(AdAstra.AA_STROPHAR_CRAFTING_TABLE, earth.terrarium.ad_astra.common.registry.ModBlocks.STROPHAR_PLANKS.get(), TextureMap::frontSideWithCustomBottom);

        blockStateModelGenerator.registerCubeWithCustomTextures(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("betterarcheology:rotten_planks")), TextureMap::frontSideWithCustomBottom);

        blockStateModelGenerator.registerCubeWithCustomTextures(Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("promenade:dark_amaranth_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Promenade.PROM_MAPLE_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("promenade:maple_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Promenade.PROM_PALM_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("promenade:palm_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Promenade.PROM_SAKURA_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("promenade:sakura_planks")), TextureMap::frontSideWithCustomBottom);

        //blockStateModelGenerator.registerCubeWithCustomTextures(SnifferPlus.SP_STONE_PINE_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("snifferplus:stone_pine_planks")), TextureMap::frontSideWithCustomBottom);

        blockStateModelGenerator.registerCubeWithCustomTextures(TechReborn.TR_RUBBER_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("techreborn:rubber_planks")), TextureMap::frontSideWithCustomBottom);

        blockStateModelGenerator.registerCubeWithCustomTextures(Vinery.LDV_CHERRY_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("vinery:cherry_planks")), TextureMap::frontSideWithCustomBottom);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}