package net.xanthian.variantcraftingtables.util;

import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;

public class ModTextureMap {

    public static TextureMapping craftingTable(Block block, String bottom) {
        return new TextureMapping()
                .put(TextureSlot.PARTICLE, new Material(ModelLocationUtils.getModelLocation(block, "_front")))
                .put(TextureSlot.DOWN, new Material(Identifier.parse(bottom)))
                .put(TextureSlot.UP, new Material(ModelLocationUtils.getModelLocation(block, "_top")))
                .put(TextureSlot.NORTH, new Material(ModelLocationUtils.getModelLocation(block, "_front")))
                .put(TextureSlot.EAST, new Material(ModelLocationUtils.getModelLocation(block, "_side")))
                .put(TextureSlot.SOUTH, new Material(ModelLocationUtils.getModelLocation(block, "_side")))
                .put(TextureSlot.WEST, new Material(ModelLocationUtils.getModelLocation(block, "_front")));
    }
}