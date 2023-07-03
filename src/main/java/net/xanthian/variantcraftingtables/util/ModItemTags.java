package net.xanthian.variantcraftingtables.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static net.xanthian.variantcraftingtables.Initialise.MOD_ID;

public class ModItemTags {

    public static final TagKey<Item> CRAFTINGTABLES = register("crafting_tables");

    private ModItemTags() {
    }

    private static TagKey<Item> register(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(MOD_ID, id));
    }
}
