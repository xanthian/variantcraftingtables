package net.xanthian.variantcraftingtables.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
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
            .displayName(Text.translatable("Variant Crafting Tables"))
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
        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
            entries.add(BeachParty.LDBP_PALM_CRAFTING_TABLE);
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            entries.add(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE);
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")){
            entries.add(Bewitchment.BW_CYPRESS_CRAFTING_TABLE);
            entries.add(Bewitchment.BW_DRAGONS_BLOOD_CRAFTING_TABLE);
            entries.add(Bewitchment.BW_ELDER_CRAFTING_TABLE);
            entries.add(Bewitchment.BW_JUNIPER_CRAFTING_TABLE);
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            entries.add(DeeperAndDarker.DAD_ECHO_CRAFTING_TABLE);
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            entries.add(Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE);
            entries.add(Promenade.PROM_MAPLE_CRAFTING_TABLE);
            entries.add(Promenade.PROM_PALM_CRAFTING_TABLE);
            entries.add(Promenade.PROM_SAKURA_CRAFTING_TABLE);
        }
        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")){
            entries.add(RegionsUnexplored.RU_ALPHA_OAK_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_BAOBAB_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_BLACK_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_BLACKWOOD_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_BLUE_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_BROWN_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_CHERRY_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_CYAN_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_CYPRESS_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_DEAD_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_EUCALYPTUS_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_GRAY_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_GREEN_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_JOSHUA_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_LARCH_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_LIME_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_MAGENTA_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_MAPLE_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_MAUVE_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_ORANGE_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_PALM_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_PINE_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_PINK_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_PURPLE_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_REDWOOD_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_RED_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_SCULKWOOD_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_WHITE_PAINTED_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_WILLOW_CRAFTING_TABLE);
            entries.add(RegionsUnexplored.RU_YELLOW_PAINTED_CRAFTING_TABLE);
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

    public static void registerItemGroup() {
    }
}