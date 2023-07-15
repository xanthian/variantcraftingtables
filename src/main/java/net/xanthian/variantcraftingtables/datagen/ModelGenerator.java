package net.xanthian.variantcraftingtables.datagen;

import com.helliongames.snifferplus.registration.SnifferPlusBlocks;
import fr.hugman.promenade.registry.content.*;
import net.Pandarix.betterarcheology.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TextureMap;

import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;
import techreborn.init.TRContent;

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

        blockStateModelGenerator.registerCubeWithCustomTextures(AdAstra.AA_AERONOS_CRAFTING_TABLE, earth.terrarium.ad_astra.common.registry.ModBlocks.AERONOS_PLANKS.get(), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(AdAstra.AA_GLACIAN_CRAFTING_TABLE, earth.terrarium.ad_astra.common.registry.ModBlocks.GLACIAN_PLANKS.get(), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(AdAstra.AA_STROPHAR_CRAFTING_TABLE, earth.terrarium.ad_astra.common.registry.ModBlocks.STROPHAR_PLANKS.get(), TextureMap::frontSideWithCustomBottom);

        blockStateModelGenerator.registerCubeWithCustomTextures(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE, ModBlocks.ROTTEN_PLANKS, TextureMap::frontSideWithCustomBottom);

        blockStateModelGenerator.registerCubeWithCustomTextures(HellionsSniffer.HS_STONE_PINE_CRAFTING_TABLE, SnifferPlusBlocks.STONE_PINE_PLANKS.get(), TextureMap::frontSideWithCustomBottom);

        blockStateModelGenerator.registerCubeWithCustomTextures(Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE, AmaranthContent.DARK_AMARANTH_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Promenade.PROM_MAPLE_CRAFTING_TABLE, MapleContent.MAPLE_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Promenade.PROM_PALM_CRAFTING_TABLE, TropicalContent.PALM_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Promenade.PROM_SAKURA_CRAFTING_TABLE, SakuraContent.SAKURA_PLANKS, TextureMap::frontSideWithCustomBottom);

        blockStateModelGenerator.registerCubeWithCustomTextures(TechReborn.TR_RUBBER_CRAFTING_TABLE, TRContent.RUBBER_PLANKS, TextureMap::frontSideWithCustomBottom);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}