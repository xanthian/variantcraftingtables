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
                .add(CraftingTables.ACACIA_CRAFTING_TABLE)
                .add(CraftingTables.BAMBOO_CRAFTING_TABLE)
                .add(CraftingTables.BIRCH_CRAFTING_TABLE)
                .add(CraftingTables.CHERRY_CRAFTING_TABLE)
                .add(CraftingTables.CRIMSON_CRAFTING_TABLE)
                .add(CraftingTables.DARK_OAK_CRAFTING_TABLE)
                .add(CraftingTables.JUNGLE_CRAFTING_TABLE)
                .add(CraftingTables.MANGROVE_CRAFTING_TABLE)
                .add(CraftingTables.SPRUCE_CRAFTING_TABLE)
                .add(CraftingTables.WARPED_CRAFTING_TABLE)
                        .addOptional(new Identifier("variantcraftingtables:tr_rubber_crafting_table"));


        getOrCreateTagBuilder(MINEABLE_AXE)
                .forceAddTag(CRAFTINGTABLES);

        getOrCreateTagBuilder(WORKBENCH)
                .forceAddTag(CRAFTINGTABLES);
    }
}