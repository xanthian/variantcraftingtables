package net.xanthian.variantcraftingtables;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class BlockTags {

    public static final Tag.Identified<Block> CRAFTING_TABLES = create("crafting_tables");


    private BlockTags() {
        return;
    }

    private static Tag.Identified<Block> create(String path) {
        return TagFactory.BLOCK.create(new Identifier(Initialise.MOD_ID, path));
    }
}
