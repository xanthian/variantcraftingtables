package net.xanthian.variantcraftingtables.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;

public class ModCreativeTab {

    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Initialise.MOD_ID, "variantcraftingtables"),

            FabricItemGroup.builder()
                    .displayName(Text.literal("Variant Crafting Tables"))
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


                        if (FabricLoader.getInstance().isModLoaded("blockus")) {
                            for (Block block : Blockus.BLS_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
                            for (Block block : Cinderscapes.CS_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
                            for (Block block : NaturesSpirit.NS_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
                            entries.add(TechReborn.TR_RUBBER_CRAFTING_TABLE);
                        }

                    })
                    .texture(Identifier.ofVanilla("textures/gui/container/creative_inventory/tab_variantcraftingtables.png")).noRenderedName().build());

    public static void registerItemGroup() {
    }
}