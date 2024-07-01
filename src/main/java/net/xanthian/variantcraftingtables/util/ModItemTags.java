package net.xanthian.variantcraftingtables.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.Initialise;

public class ModItemTags {

    public static final TagKey<Item> CRAFTING_TABLES = register("crafting_tables");

    private ModItemTags() {
    }

    private static TagKey<Item> register(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(Initialise.MOD_ID, id));
    }
}
