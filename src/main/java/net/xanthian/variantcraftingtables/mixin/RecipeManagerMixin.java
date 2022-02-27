package net.xanthian.variantcraftingtables.mixin;

import com.google.gson.JsonElement;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.recipe.RecipeType;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.profiler.Profiler;
import net.minecraft.world.World;

import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.Recipes;
import org.apache.commons.lang3.tuple.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.*;

@Mixin(RecipeManager.class)
public abstract class RecipeManagerMixin {

    @Shadow
    private <C extends Inventory, T extends Recipe<C>> Map<Identifier, Recipe<C>> getAllOfType(RecipeType<T> type) {
        return null;
    }

    /**
     * @author Paulevs (amended by Xanthian)
     */
    @Inject(method = "getFirstMatch", at = @At(value = "HEAD"), cancellable = true)
    private <C extends Inventory, T extends Recipe<C>> void getFirstMatch(RecipeType<T> type, C inventory, World world, CallbackInfoReturnable<Optional<T>> info) {
        Map<Identifier, Recipe<C>> typeMap = getAllOfType(type);
        Collection<Recipe<C>> values = typeMap.values();
        List<Recipe<C>> list = new ArrayList<>(values);
        list.sort((v1, v2) -> {
            boolean b1 = v1.getId().getNamespace().equals("minecraft");
            boolean b2 = v2.getId().getNamespace().equals("minecraft");
            return b1 ^ b2 ? (b1 ? 1 : -1) : 0;
        });
        info.setReturnValue(list.stream().flatMap((recipe -> Util.stream(type.match(recipe, world, inventory)))).findFirst());
    }

    @Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo info) {
        for (Pair<String, String[]> woodType : Initialise.woodTypes) {
            map.put(new Identifier(Initialise.MOD_ID, woodType.getLeft() + "_crafting_table"), Recipes.createTablelRecipeJson(woodType.getLeft(), woodType.getRight()));
        }
    }
}