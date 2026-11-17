package net.xanthian.variantcraftingtables.block;

import com.mojang.logging.LogUtils;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents;
import net.fabricmc.fabric.api.event.Event;
import net.minecraft.resources.Identifier;
import net.xanthian.variantcraftingtables.Initialise;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.core.registries.BuiltInRegistries;

/** Copies the plank's actual fire odds, including mod registrations backed by block tags. */
public final class TableFireBehavior {
    private static final FlammableBlockRegistry FIRE = FlammableBlockRegistry.getDefaultInstance();

    private TableFireBehavior() {
    }

    public static void register() {
        Identifier phase = Identifier.fromNamespaceAndPath(Initialise.MOD_ID, "inherit_plank_fire");
        CommonLifecycleEvents.TAGS_LOADED.addPhaseOrdering(Event.DEFAULT_PHASE, phase);
        CommonLifecycleEvents.TAGS_LOADED.register(phase, (registries, client) -> refresh());
    }

    public static void refresh() {
        for (var variant : DynamicTables.variants()) {
            var planks = BuiltInRegistries.BLOCK.getValue(variant.planks());
            FlammableBlockRegistry.Entry entry;
            try {
                entry = FIRE.get(planks);
            } catch (RuntimeException exception) {
                LogUtils.getLogger().warn("Could not read fire behaviour for {}; keeping crafting table {} non-burning",
                        variant.planks(), variant.id(), exception);
                FIRE.add(variant.block(), 0, 0);
                continue;
            }
            FIRE.add(variant.block(), entry);
        }
    }
}
