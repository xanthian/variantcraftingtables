package net.xanthian.variantcraftingtables.block;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.block.Block;

/** Server-side validity override; the client continues using vanilla's crafting menu and screen. */
public final class VariantCraftingMenu extends CraftingMenu {
    private final ContainerLevelAccess tableAccess;
    private final Block table;

    public VariantCraftingMenu(int syncId, Inventory inventory, ContainerLevelAccess access, Block table) {
        super(syncId, inventory, access);
        this.tableAccess = access;
        this.table = table;
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(tableAccess, player, table);
    }
}
