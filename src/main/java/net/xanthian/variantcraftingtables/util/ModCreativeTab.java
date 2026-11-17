package net.xanthian.variantcraftingtables.util;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.block.DynamicTables;

import java.util.ArrayList;
import java.util.Comparator;

public class ModCreativeTab {

    public static final ResourceKey<CreativeModeTab> ITEM_GROUP_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Initialise.MOD_ID, "variantcraftingtables"));

    public static final CreativeModeTab ITEM_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            ITEM_GROUP_KEY,

            FabricCreativeModeTab.builder()
                    .title(Component.literal("Variant Crafting Tables"))
                    .icon(() -> new ItemStack(DynamicTables.variants().stream()
                            .filter(variant -> variant.planks().equals(Identifier.withDefaultNamespace("mangrove_planks")))
                            .map(DynamicTables.Variant::block).findFirst().orElse(Blocks.CRAFTING_TABLE)))
                    .displayItems((context, output) -> {

                        var tables = new ArrayList<ItemStack>();
                        tables.add(new ItemStack(Blocks.CRAFTING_TABLE)); // Oak joins the same alphabetical list.
                        DynamicTables.variants().forEach(variant -> tables.add(new ItemStack(variant.block())));
                        tables.sort(Comparator.comparing((ItemStack stack) -> stack.getHoverName().getString(),
                                        String.CASE_INSENSITIVE_ORDER)
                                .thenComparing(stack -> BuiltInRegistries.ITEM.getKey(stack.getItem()).toString()));
                        tables.forEach(output::accept);

                    })
                    .backgroundTexture(Identifier.withDefaultNamespace("textures/gui/container/creative_inventory/tab_variantcraftingtables.png"))
                    .hideTitle()
                    .build());

    public static void registerItemGroup() {
    }
}
