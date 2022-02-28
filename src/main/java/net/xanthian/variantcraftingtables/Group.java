package net.xanthian.variantcraftingtables;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Group {
    public static final ItemGroup VCT = FabricItemGroupBuilder.build(new Identifier(Initialise.MOD_ID, "vct"),
            () -> new ItemStack(Blocks.CRAFTING_TABLE));
}