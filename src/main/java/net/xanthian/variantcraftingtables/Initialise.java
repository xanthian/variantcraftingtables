package net.xanthian.variantcraftingtables;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;
import net.xanthian.variantcraftingtables.util.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantcraftingtables";

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "variantcraftingtables"));

    @Override
    public void onInitialize() {

        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("variantcraftingtables.group.variantcraftingtables"))
                .icon(() -> new ItemStack(Vanilla.MANGROVE_CRAFTING_TABLE))
                .entries((context, entries) -> {

                    entries.add(Vanilla.ACACIA_CRAFTING_TABLE);
                    entries.add(Vanilla.BAMBOO_CRAFTING_TABLE);
                    entries.add(Vanilla.BIRCH_CRAFTING_TABLE);
                    entries.add(Vanilla.CHERRY_CRAFTING_TABLE);
                    entries.add(Vanilla.CRIMSON_CRAFTING_TABLE);
                    entries.add(Vanilla.DARK_OAK_CRAFTING_TABLE);
                    entries.add(Vanilla.JUNGLE_CRAFTING_TABLE);
                    entries.add(Vanilla.MANGROVE_CRAFTING_TABLE);
                    entries.add(Blocks.CRAFTING_TABLE); // Oak
                    entries.add(Vanilla.SPRUCE_CRAFTING_TABLE);
                    entries.add(Vanilla.WARPED_CRAFTING_TABLE);

                    if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
                        entries.add(AdAstra.AA_AERONOS_CRAFTING_TABLE);
                        entries.add(AdAstra.AA_GLACIAN_CRAFTING_TABLE);
                        entries.add(AdAstra.AA_STROPHAR_CRAFTING_TABLE);
                    }
                    if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
                        entries.add(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE);
                    }
                    if (FabricLoader.getInstance().isModLoaded("promenade")) {
                        entries.add(Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE);
                        entries.add(Promenade.PROM_MAPLE_CRAFTING_TABLE);
                        entries.add(Promenade.PROM_PALM_CRAFTING_TABLE);
                        entries.add(Promenade.PROM_SAKURA_CRAFTING_TABLE);
                    }
                    if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
                        entries.add(SnifferPlus.SP_STONE_PINE_CRAFTING_TABLE);
                    }
                    if (FabricLoader.getInstance().isModLoaded("techreborn")) {
                        entries.add(TechReborn.TR_RUBBER_CRAFTING_TABLE);
                    }
                    if (FabricLoader.getInstance().isModLoaded("vinery")) {
                        entries.add(Vinery.LDV_CHERRY_CRAFTING_TABLE);
                    }

                })
                .build());

        Vanilla.registerTables();

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            AdAstra.registerTables();
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            BetterArcheology.registerTables();
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            Promenade.registerTables();
        }
        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
            SnifferPlus.registerTables();
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            TechReborn.registerTables();
        }
        if (FabricLoader.getInstance().isModLoaded("vinery")) {
            Vinery.registerTables();
        }

        ModRegistries.registerFuelandFlammable();
    }
}