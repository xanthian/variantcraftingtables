package net.xanthian.variantcraftingtables.mixin;

import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.*;

    @Mixin(RecipeManager.class)
    public abstract class RecipeManagerMixin {

        @Shadow
        private <C extends Inventory, T extends Recipe<C>> Map<Identifier, Recipe<C>> getAllOfType(RecipeType<T> type) {
            return null;
        }

        @Shadow private Map<RecipeType<?>, Map<Identifier, Recipe<?>>> recipes;

        /**
         * @author Paulevs
         */
        @Overwrite
        public <C extends Inventory, T extends Recipe<C>> Optional<T> getFirstMatch(RecipeType<T> type, C inventory, World world) {

            Collection<Recipe<C>> values = getAllOfType(type).values();
            List<Recipe<C>> list = new ArrayList<>(values);
            String mc = new Identifier("").getNamespace();

            list.sort((v1, v2) -> {
                boolean b1 = v1.getId().getNamespace().equals(mc);
                return (b1 ^ v2.getId().getNamespace().equals(mc)) ? (b1 ? 1 : -1) : 0;
            });
            return list.stream().flatMap((recipe -> Util.stream(type.match(recipe, world, inventory)))).findFirst();

        }
    }