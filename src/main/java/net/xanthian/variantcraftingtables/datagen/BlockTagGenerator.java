package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantcraftingtables.block.*;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantcraftingtables.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static final TagKey<Block> CRAFTINGTABLES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"crafting_tables"));
    private static final TagKey<Block> MINEABLE_AXE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/axe"));
    private static final TagKey<Block> WORKBENCH = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:workbench"));

    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(CRAFTINGTABLES)
                .add(Vanilla.ACACIA_CRAFTING_TABLE)
                .add(Vanilla.BAMBOO_CRAFTING_TABLE)
                .add(Vanilla.BIRCH_CRAFTING_TABLE)
                .add(Vanilla.CHERRY_CRAFTING_TABLE)
                .add(Vanilla.CRIMSON_CRAFTING_TABLE)
                .add(Vanilla.DARK_OAK_CRAFTING_TABLE)
                .add(Vanilla.JUNGLE_CRAFTING_TABLE)
                .add(Vanilla.MANGROVE_CRAFTING_TABLE)
                .add(Vanilla.SPRUCE_CRAFTING_TABLE)
                .add(Vanilla.WARPED_CRAFTING_TABLE)

                .addOptional(new Identifier("variantcraftingtables:aa_aeronos_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:aa_glacian_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:aa_stropar_crafting_table"))

                .addOptional(new Identifier("variantcraftingtables:ba_rotten_crafting_table"))

                .addOptional(new Identifier("variantcraftingtables:hs_stone_pine_crafting_table"))

                .addOptional(new Identifier("variantcraftingtables:prom_dark_amaranth_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:prom_maple_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:prom_palm_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:prom_sakura_crafting_table"))

                .addOptional(new Identifier("variantcraftingtables:tr_rubber_crafting_table"));



        getOrCreateTagBuilder(MINEABLE_AXE)
                .forceAddTag(CRAFTINGTABLES);

        getOrCreateTagBuilder(WORKBENCH)
                .forceAddTag(CRAFTINGTABLES);
    }
}