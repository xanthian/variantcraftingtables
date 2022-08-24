package net.xanthian.variantcraftingtables.craftingtables;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VariantCraftingTableBlock extends CraftingTableBlock {

    public static final TagKey<Block> WORKBENCH_BLOCK = TagKey.of(Registry.BLOCK_KEY, new Identifier("c", "workbench"));
    public static final TagKey<Item> WORKBENCH_ITEM = TagKey.of(Registry.ITEM_KEY, new Identifier("c", "workbench"));

    public VariantCraftingTableBlock() {
        super(Settings.copy(Blocks.CRAFTING_TABLE));
    }
}