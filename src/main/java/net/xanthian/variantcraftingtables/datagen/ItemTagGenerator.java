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
                    .add(Vanilla.ACACIA_CRAFTING_TABLE.asItem())
                    .add(Vanilla.BAMBOO_CRAFTING_TABLE.asItem())
                    .add(Vanilla.BIRCH_CRAFTING_TABLE.asItem())
                    .add(Vanilla.CHERRY_CRAFTING_TABLE.asItem())
                    .add(Vanilla.CRIMSON_CRAFTING_TABLE.asItem())
                    .add(Vanilla.DARK_OAK_CRAFTING_TABLE.asItem())
                    .add(Vanilla.JUNGLE_CRAFTING_TABLE.asItem())
                    .add(Vanilla.MANGROVE_CRAFTING_TABLE.asItem())
                    .add(Vanilla.SPRUCE_CRAFTING_TABLE.asItem())
                    .add(Vanilla.WARPED_CRAFTING_TABLE.asItem())

                    .addOptional(new Identifier("variantcraftingtables:aa_aeronos_crafting_table"))
                    .addOptional(new Identifier("variantcraftingtables:aa_glacian_crafting_table"))
                    .addOptional(new Identifier("variantcraftingtables:aa_stropar_crafting_table"))

                    .addOptional(new Identifier("variantcraftingtables:ba_rotten_crafting_table"))

                    .addOptional(new Identifier("variantcraftingtables:sp_stone_pine_crafting_table"))

                    .addOptional(new Identifier("variantcraftingtables:prom_dark_amaranth_crafting_table"))
                    .addOptional(new Identifier("variantcraftingtables:prom_maple_crafting_table"))
                    .addOptional(new Identifier("variantcraftingtables:prom_palm_crafting_table"))
                    .addOptional(new Identifier("variantcraftingtables:prom_sakura_crafting_table"))

                    .addOptional(new Identifier("variantcraftingtables:tr_rubber_crafting_table"))

                    .addOptional(new Identifier("variantcraftingtables:ldv_cherry_crafting_table"));

            getOrCreateTagBuilder(NON_FLAMMABLE_WOOD)
                    .add(Vanilla.CRIMSON_CRAFTING_TABLE.asItem())
                    .add(Vanilla.WARPED_CRAFTING_TABLE.asItem());

            getOrCreateTagBuilder(WORKBENCH)
                    .forceAddTag(CRAFTINGTABLES);
        }
    }