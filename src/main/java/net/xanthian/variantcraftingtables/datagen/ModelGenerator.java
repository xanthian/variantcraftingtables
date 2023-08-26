package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;

import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;
import net.xanthian.variantcraftingtables.util.ModTextureMap;

import java.util.function.BiFunction;

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
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.CRIMSON_CRAFTING_TABLE, Blocks.CRIMSON_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.DARK_OAK_CRAFTING_TABLE, Blocks.DARK_OAK_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.JUNGLE_CRAFTING_TABLE, Blocks.JUNGLE_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.MANGROVE_CRAFTING_TABLE, Blocks.MANGROVE_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.SPRUCE_CRAFTING_TABLE, Blocks.SPRUCE_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.WARPED_CRAFTING_TABLE, Blocks.WARPED_PLANKS, TextureMap::frontSideWithCustomBottom);

        // Ad Astra (disabled)
        registerNonStandardCube(blockStateModelGenerator, AdAstra.AA_AERONOS_CRAFTING_TABLE, "ad_astra:block/aeronos_planks", ModTextureMap::janky);
        registerNonStandardCube(blockStateModelGenerator, AdAstra.AA_GLACIAN_CRAFTING_TABLE, "ad_astra:block/glacian_planks", ModTextureMap::janky);
        registerNonStandardCube(blockStateModelGenerator, AdAstra.AA_STROPHAR_CRAFTING_TABLE, "ad_astra:block/strophar_planks", ModTextureMap::janky);
        // Beach Party (Lets Do)
        registerNonStandardCube(blockStateModelGenerator,BeachParty.LDBP_PALM_CRAFTING_TABLE, "beachparty:block/palm_planks0",ModTextureMap::janky);
        // Better Archeology
        blockStateModelGenerator.registerCubeWithCustomTextures(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("betterarcheology:rotten_planks")), TextureMap::frontSideWithCustomBottom);
        // Bewitchment
        blockStateModelGenerator.registerCubeWithCustomTextures(Bewitchment.BW_CYPRESS_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("bewitchment:cypress_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bewitchment.BW_DRAGONS_BLOOD_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("bewitchment:dragons_blood_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bewitchment.BW_ELDER_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("bewitchment:elder_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bewitchment.BW_JUNIPER_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("bewitchment:juniper_planks")), TextureMap::frontSideWithCustomBottom);
        // Deeper & Darker
        registerNonStandardCube(blockStateModelGenerator,DeeperAndDarker.DAD_ECHO_CRAFTING_TABLE,  "deeperdarker:block/echo_planks", ModTextureMap::janky);
        // Promenade
        registerNonStandardCube(blockStateModelGenerator, Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE, "promenade:block/dark_amaranth/planks", ModTextureMap::janky);
        registerNonStandardCube(blockStateModelGenerator, Promenade.PROM_MAPLE_CRAFTING_TABLE, "promenade:block/maple/planks", ModTextureMap::janky);
        registerNonStandardCube(blockStateModelGenerator, Promenade.PROM_PALM_CRAFTING_TABLE, "promenade:block/palm/planks", ModTextureMap::janky);
        registerNonStandardCube(blockStateModelGenerator, Promenade.PROM_SAKURA_CRAFTING_TABLE, "promenade:block/sakura/planks", ModTextureMap::janky);
        // Regions Unexplored
        registerNonStandardCube(blockStateModelGenerator,RegionsUnexplored.RU_ALPHA_OAK_CRAFTING_TABLE, "regions_unexplored:block/alpha_oak_planks",ModTextureMap::janky);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_BAOBAB_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:baobab_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_BLACK_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:black_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_BLACKWOOD_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:blackwood_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_BLUE_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:blue_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_BROWN_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:brown_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_CHERRY_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:cherry_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_CYAN_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:cyan_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_CYPRESS_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:cypress_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_DEAD_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:dead_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_EUCALYPTUS_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:eucalyptus_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_GREEN_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:green_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_GRAY_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:gray_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_JOSHUA_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:joshua_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_LARCH_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:larch_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:light_blue_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:light_gray_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_LIME_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:lime_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_MAGENTA_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:magenta_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_MAPLE_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:maple_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_MAUVE_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:mauve_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_ORANGE_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:orange_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_PALM_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:palm_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_PINE_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:pine_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_PINK_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:pink_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_PURPLE_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:purple_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_RED_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:red_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_REDWOOD_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:redwood_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_SCULKWOOD_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:sculkwood_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_WHITE_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:white_painted_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_WILLOW_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:willow_planks")), TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_YELLOW_PAINTED_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("regions_unexplored:yellow_painted_planks")), TextureMap::frontSideWithCustomBottom);
        // SnifferPlus (disabled)
        registerNonStandardCube(blockStateModelGenerator, SnifferPlus.SP_STONE_PINE_CRAFTING_TABLE, "snifferplus:block/stone_pine_planks", ModTextureMap::janky);
        // Tech Reborn
        blockStateModelGenerator.registerCubeWithCustomTextures(TechReborn.TR_RUBBER_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("techreborn:rubber_planks")), TextureMap::frontSideWithCustomBottom);
        // Vinery (Lets Do)
        blockStateModelGenerator.registerCubeWithCustomTextures(Vinery.LDV_CHERRY_CRAFTING_TABLE, Registries.BLOCK.get(new Identifier("vinery:cherry_planks")), TextureMap::frontSideWithCustomBottom);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    // Used for those mods that cant follow a standard _planks naming convention or those that don't load via gradle.
    public final void registerNonStandardCube(BlockStateModelGenerator blockStateModelGenerator, Block block, String string, BiFunction<Block, String, TextureMap> texturesFactory) {
        TextureMap textureMap = texturesFactory.apply(block, string);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, Models.CUBE.upload(block, textureMap, blockStateModelGenerator.modelCollector)));
    }
}
