package net.xanthian.variantcraftingtables.block;

import net.minecraft.block.Blocks;
import net.minecraft.block.CraftingTableBlock;

public class VariantCraftingTableBlock extends CraftingTableBlock {

    public VariantCraftingTableBlock() {
        super(Settings.copy(Blocks.CRAFTING_TABLE));
    }
}