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

import net.xanthian.variantcraftingtables.block.CraftingTables;
import net.xanthian.variantcraftingtables.block.compatability.TechReborn;
import net.xanthian.variantcraftingtables.util.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantcraftingtables";

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "variantcraftingtables"));

    @Override
    public void onInitialize() {

        // Custom Item Group
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("variantcraftingtables.group.variantcraftingtables"))
                .icon(() -> new ItemStack(CraftingTables.MANGROVE_CRAFTING_TABLE))
                .entries((context, entries) -> {

                    entries.add(CraftingTables.ACACIA_CRAFTING_TABLE);
                    entries.add(CraftingTables.BAMBOO_CRAFTING_TABLE);
                    entries.add(CraftingTables.BIRCH_CRAFTING_TABLE);
                    entries.add(CraftingTables.CHERRY_CRAFTING_TABLE);
                    entries.add(CraftingTables.CRIMSON_CRAFTING_TABLE);
                    entries.add(CraftingTables.DARK_OAK_CRAFTING_TABLE);
                    entries.add(CraftingTables.JUNGLE_CRAFTING_TABLE);
                    entries.add(CraftingTables.MANGROVE_CRAFTING_TABLE);
                    entries.add(Blocks.CRAFTING_TABLE); // Oak
                    entries.add(CraftingTables.SPRUCE_CRAFTING_TABLE);
                    entries.add(CraftingTables.WARPED_CRAFTING_TABLE);
                    if (FabricLoader.getInstance().isModLoaded("techreborn")) {
                        entries.add(TechReborn.TR_RUBBER_CRAFTING_TABLE);
                    }
                })
                .build());

        CraftingTables.registerVanillaTables();
        ModRegistries.registerFuelandFlammable();

        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            TechReborn.registerTechRebornTables();
        }
    }
}