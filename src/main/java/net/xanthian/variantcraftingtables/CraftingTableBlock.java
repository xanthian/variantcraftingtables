package net.xanthian.variantcraftingtables;

import net.minecraft.block.Blocks;

public class CraftingTableBlock extends net.minecraft.block.CraftingTableBlock {

    public CraftingTableBlock() {
        super(Settings.copy(Blocks.CRAFTING_TABLE));
    }
}