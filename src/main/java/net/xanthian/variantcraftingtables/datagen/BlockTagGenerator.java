package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.block.Vanilla;

import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends FabricTagsProvider.BlockTagsProvider {

    public static final TagKey<Block> CRAFTING_TABLES = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Initialise.MOD_ID, "crafting_tables"));
    private static final TagKey<Block> C_WORKBENCH = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("c", "workbench"));

    public BlockTagGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

        for (Identifier id : Vanilla.VANILLA_CRAFTING_TABLES.keySet()) {
            builder(CRAFTING_TABLES).add(ResourceKey.create(Registries.BLOCK, id));
        }

        builder(BlockTags.MINEABLE_WITH_AXE)
                .forceAddTag(CRAFTING_TABLES);

        builder(C_WORKBENCH)
                .forceAddTag(CRAFTING_TABLES);
    }
}