package net.xanthian.variantcraftingtables;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ItemTags {

    public static final Tag.Identified<Item> CRAFTING_TABLES = create("crafting_tables");

    private ItemTags() {
        return;
    }

    private static Tag.Identified<Item> create(String path) {
        return TagFactory.ITEM.create(new Identifier(Initialise.MOD_ID, path));
    }
}
