package net.xanthian.variantcraftingtables.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.SpriteSourceRegistry;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.xanthian.variantcraftingtables.block.DynamicTables;
import net.minecraft.resources.Identifier;
import net.xanthian.variantcraftingtables.Initialise;

public final class DynamicTexturesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientLifecycleEvents.CLIENT_STARTED.register(client -> DynamicTables.logRegistration());
        SourceModTooltip.register();
        SpriteSourceRegistry.register(Identifier.fromNamespaceAndPath(Initialise.MOD_ID, "crafting_tables"),
                CraftingTableSpriteSource.CODEC);
    }
}
