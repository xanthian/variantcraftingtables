package net.xanthian.variantcraftingtables.craftingtables;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class VariantCraftingTableBlock extends CraftingTableBlock {

    public static final TagKey<Block> WORKBENCH_BLOCK = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c", "workbench"));
    public static final TagKey<Item> WORKBENCH_ITEM = TagKey.of(Registries.ITEM.getKey(), new Identifier("c", "workbench"));

    public VariantCraftingTableBlock() {
        super(Settings.copy(Blocks.CRAFTING_TABLE));
    }
}