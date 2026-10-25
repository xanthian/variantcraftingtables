package net.xanthian.variantcraftingtables.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.xanthian.variantcraftingtables.Initialise;

public class ModItemTags {

    public static final TagKey<Item> CRAFTING_TABLES = register("crafting_tables");

    private ModItemTags() {
    }

    private static TagKey<Item> register(String id) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Initialise.MOD_ID, id));
    }
}