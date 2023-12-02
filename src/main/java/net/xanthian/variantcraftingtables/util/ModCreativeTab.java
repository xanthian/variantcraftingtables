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
            new Identifier(Initialise.MOD_ID, "variantcraftingtables"),

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

                        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
                            for (Block block : AdAstra.AA_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
                            entries.add(BeachParty.LDBP_PALM_CRAFTING_TABLE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
                            entries.add(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
                            for (Block block : Bewitchment.BW_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
                            for (Block block : BiomeMakeover.BM_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("blockus")) {
                            for (Block block : Blockus.BLS_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("botania")) {
                            for (Block block : Botania.BOT_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
                            for (Block block : Cinderscapes.CS_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
                            entries.add(DeeperAndDarker.DAD_ECHO_CRAFTING_TABLE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("desolation")) {
                            entries.add(Desolation.DS_CHARRED_CRAFTING_TABLE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("eldritch_end")) {
                            entries.add(EldritchEnd.EE_PRIMORDIAL_CRAFTING_TABLE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("minecells")) {
                            entries.add(MineCells.MC_PUTRID_CRAFTING_TABLE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
                            for (Block block : NaturesSpirit.NS_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("promenade")) {
                            for (Block block : Promenade.PROM_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
                            for (Block block : RegionsUnexplored.RU_TABLES.values()) {
                                entries.add(block);
                            }
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
                    .texture("variantcraftingtables.png").noRenderedName().build());

    public static void registerItemGroup() {
    }
}