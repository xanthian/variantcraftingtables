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
import net.xanthian.variantcraftingtables.block.Vanilla;

public class ModCreativeTab {

    public static final ResourceKey<CreativeModeTab> ITEM_GROUP_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Initialise.MOD_ID, "variantcraftingtables"));

    public static final CreativeModeTab ITEM_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            ITEM_GROUP_KEY,

            FabricCreativeModeTab.builder()
                    .title(Component.literal("Variant Crafting Tables"))
                    .icon(() -> new ItemStack(Vanilla.MANGROVE_CRAFTING_TABLE))
                    .displayItems((context, output) -> {

                        output.accept(Vanilla.ACACIA_CRAFTING_TABLE);
                        output.accept(Vanilla.BAMBOO_CRAFTING_TABLE);
                        output.accept(Vanilla.BIRCH_CRAFTING_TABLE);
                        output.accept(Vanilla.CHERRY_CRAFTING_TABLE);
                        output.accept(Vanilla.CRIMSON_CRAFTING_TABLE);
                        output.accept(Vanilla.DARK_OAK_CRAFTING_TABLE);
                        output.accept(Vanilla.JUNGLE_CRAFTING_TABLE);
                        output.accept(Vanilla.MANGROVE_CRAFTING_TABLE);
                        output.accept(Blocks.CRAFTING_TABLE); // Oak
                        output.accept(Vanilla.PALE_OAK_CRAFTING_TABLE);
                        output.accept(Vanilla.POPLAR_CRAFTING_TABLE);
                        output.accept(Vanilla.SPRUCE_CRAFTING_TABLE);
                        output.accept(Vanilla.WARPED_CRAFTING_TABLE);

                    })
                    .backgroundTexture(Identifier.withDefaultNamespace("textures/gui/container/creative_inventory/tab_variantcraftingtables.png"))
                    .hideTitle()
                    .build());

    public static void registerItemGroup() {
    }
}