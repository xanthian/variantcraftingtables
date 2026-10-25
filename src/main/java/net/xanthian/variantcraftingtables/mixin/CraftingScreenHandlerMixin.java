package net.xanthian.variantcraftingtables.mixin;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.block.CraftingTableBlock;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CraftingMenu.class)
public abstract class CraftingScreenHandlerMixin {

    @Shadow
    @Final
    private ContainerLevelAccess access;

    @Inject(method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", at = @At("HEAD"), cancellable = true)
    private void variantcraftingtables$stillValid(Player player, CallbackInfoReturnable<Boolean> info) {
        if (access.evaluate((level, pos) -> level.getBlockState(pos).getBlock() instanceof CraftingTableBlock, true)) {
            info.setReturnValue(true);
        }
    }
}