package net.xanthian.variantcraftingtables.client;

import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.xanthian.variantcraftingtables.block.DynamicTables;
import net.xanthian.variantcraftingtables.block.VariantCraftingTableBlock;

import java.util.IdentityHashMap;
import java.util.Map;

/** Identifies the plank provider, rather than the mod owning the generated table's registry ID. */
public final class SourceModTooltip {
    private SourceModTooltip() {
    }

    public static void register() {
        // Resolve lazily: the client entrypoint runs before the tables are registered.
        Map<Item, Component> sourceNames = new IdentityHashMap<>();
        ItemTooltipCallback.EVENT.register((stack, context, flags, lines) -> {
            Item item = stack.getItem();
            if (item != Items.CRAFTING_TABLE
                    && !(item instanceof BlockItem blockItem && blockItem.getBlock() instanceof VariantCraftingTableBlock)) {
                return;
            }
            Component sourceName = sourceNames.computeIfAbsent(item, key -> {
                String namespace = key == Items.CRAFTING_TABLE ? "minecraft" : DynamicTables.variants().stream()
                        .filter(variant -> variant.block().asItem() == key)
                        .map(variant -> variant.planks().getNamespace()).findFirst().orElse(null);
                if (namespace == null) {
                    return null;
                }
                String name = FabricLoader.getInstance().getModContainer(namespace)
                        .map(mod -> mod.getMetadata().getName()).orElse(namespace);
                return Component.literal(name).withStyle(ChatFormatting.GRAY, ChatFormatting.ITALIC);
            });
            if (sourceName != null) {
                lines.add(Math.min(1, lines.size()), sourceName.copy());
            }
        });
    }
}
