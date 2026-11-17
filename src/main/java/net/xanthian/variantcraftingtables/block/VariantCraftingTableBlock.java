package net.xanthian.variantcraftingtables.block;

import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

/** Identifies generated variants while retaining the vanilla crafting screen and title. */
public final class VariantCraftingTableBlock extends CraftingTableBlock {
    public VariantCraftingTableBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        return new SimpleMenuProvider((syncId, inventory, player) ->
                new VariantCraftingMenu(syncId, inventory, ContainerLevelAccess.create(level, pos), this),
                Component.translatable("container.crafting"));
    }
}
