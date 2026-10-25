package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.block.Vanilla;

import java.util.concurrent.CompletableFuture;

public class ItemTagGenerator extends FabricTagsProvider.ItemTagsProvider {

    public static final TagKey<Item> CRAFTING_TABLES = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Initialise.MOD_ID, "crafting_tables"));
    private static final TagKey<Item> C_WORKBENCH = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("c", "workbench"));

    public ItemTagGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    private static ResourceKey<Item> itemKey(String path) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Initialise.MOD_ID, path));
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

        for (Identifier id : Vanilla.VANILLA_CRAFTING_TABLES.keySet()) {
            builder(CRAFTING_TABLES).add(ResourceKey.create(Registries.ITEM, id));
        }

        builder(ItemTags.NON_FLAMMABLE_WOOD)
                .add(itemKey("crimson_crafting_table"))
                .add(itemKey("warped_crafting_table"));

        builder(C_WORKBENCH)
                .forceAddTag(CRAFTING_TABLES);
    }
}