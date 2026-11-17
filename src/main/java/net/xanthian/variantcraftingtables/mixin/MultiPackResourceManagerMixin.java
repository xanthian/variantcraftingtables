package net.xanthian.variantcraftingtables.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.resources.MultiPackResourceManager;
import net.xanthian.variantcraftingtables.block.DynamicTables;
import net.xanthian.variantcraftingtables.resource.GeneratedTablePack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.ArrayList;
import java.util.List;

@Mixin(MultiPackResourceManager.class)
public abstract class MultiPackResourceManagerMixin {
    @ModifyVariable(method = "<init>", at = @At("HEAD"), argsOnly = true)
    private static List<PackResources> variantcraftingtables$addGeneratedPack(
            List<PackResources> packs, @Local(argsOnly = true) PackType type) {
        if (DynamicTables.variants().isEmpty()) {
            return packs;
        }
        List<PackResources> result = new ArrayList<>(packs);
        int insertion = 0;
        for (int i = 0; i < packs.size(); i++) {
            if (packs.get(i).packId().equals("vanilla")) {
                insertion = i + 1;
                break;
            }
        }
        // Override vanilla's generic plank recipe, but allow other mods and user packs to override us.
        result.add(insertion, new GeneratedTablePack(type, DynamicTables.variants()));
        return result;
    }
}
