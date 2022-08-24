package net.xanthian.variantcraftingtables.mixin;

import com.google.gson.JsonElement;

import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;

import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.util.Recipes;

import org.apache.commons.lang3.tuple.Pair;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.*;

@Mixin(RecipeManager.class)
public abstract class RecipeManagerMixin {

    @Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo info) {
        for (Pair<String, String[]> woodType : Initialise.woodTypes) {
            map.put(new Identifier(Initialise.MOD_ID, woodType.getLeft() + "_crafting_table"), Recipes.createTablelRecipeJson(woodType.getLeft(), woodType.getRight()));
        }
    }
}