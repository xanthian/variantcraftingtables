package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantcraftingtables.block.*;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantcraftingtables.util.ModItemTags.CRAFTINGTABLES;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Item> NON_FLAMMABLE_WOOD = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:non_flammable_wood"));
    private static final TagKey<Item> WORKBENCH = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:workbench"));

        @Override
        protected void configure (RegistryWrapper.WrapperLookup arg){

            getOrCreateTagBuilder(CRAFTINGTABLES)
                    .add(CraftingTables.ACACIA_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.BAMBOO_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.BIRCH_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.CHERRY_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.CRIMSON_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.DARK_OAK_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.JUNGLE_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.MANGROVE_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.SPRUCE_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.WARPED_CRAFTING_TABLE.asItem());

            getOrCreateTagBuilder(NON_FLAMMABLE_WOOD)
                    .add(CraftingTables.CRIMSON_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.WARPED_CRAFTING_TABLE.asItem());

            getOrCreateTagBuilder(WORKBENCH)
                    .addTag(CRAFTINGTABLES);
        }
    }