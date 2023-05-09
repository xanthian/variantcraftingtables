package net.xanthian.variantcraftingtables.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.craftingtables.CraftingTables;

import java.util.Comparator;

public class ModItemGroup {

    public static void registerGroup() {
    }

    public static final ItemGroup VARIANT_CRAFTING_TABLES =
            FabricItemGroup.builder(new Identifier(Initialise.MOD_ID, "variant_crafting_tables"))
                    .displayName(Text.literal("Variant Crafting Tables"))
                    .icon(() -> new ItemStack(CraftingTables.MANGROVE_CRAFTING_TABLE))
                    .entries((context, entries) -> {
                        entries.addAll(Registries.ITEM.getIds().stream()
                                .filter(identifier -> identifier.getNamespace().matches(Initialise.MOD_ID))
                                .sorted(Comparator.comparing(Identifier::getPath))
                                .map(Registries.ITEM::get)
                                .map(ItemStack::new)
                                .filter(input -> !input.isEmpty())
                                .toList());
                    })
                    .build();
}