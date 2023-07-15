package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import net.minecraft.loot.LootTable;
import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;

import java.util.List;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(Vanilla.ACACIA_CRAFTING_TABLE);
        addDrop(Vanilla.BAMBOO_CRAFTING_TABLE);
        addDrop(Vanilla.BIRCH_CRAFTING_TABLE);
        addDrop(Vanilla.CHERRY_CRAFTING_TABLE);
        addDrop(Vanilla.DARK_OAK_CRAFTING_TABLE);
        addDrop(Vanilla.JUNGLE_CRAFTING_TABLE);
        addDrop(Vanilla.MANGROVE_CRAFTING_TABLE);
        addDrop(Vanilla.SPRUCE_CRAFTING_TABLE);
        addDrop(Vanilla.CRIMSON_CRAFTING_TABLE);
        addDrop(Vanilla.WARPED_CRAFTING_TABLE);
        addDrop(Vanilla.MANGROVE_CRAFTING_TABLE);

        addDrop(AdAstra.AA_AERONOS_CRAFTING_TABLE, addConditions(drops(AdAstra.AA_AERONOS_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("ad_astra"))));
        addDrop(AdAstra.AA_GLACIAN_CRAFTING_TABLE, addConditions(drops(AdAstra.AA_GLACIAN_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("ad_astra"))));
        addDrop(AdAstra.AA_STROPHAR_CRAFTING_TABLE, addConditions(drops(AdAstra.AA_STROPHAR_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("ad_astra"))));

        addDrop(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE, addConditions(drops(BetterArcheology.BA_ROTTEN_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("betterarcheology"))));

        addDrop(HellionsSniffer.HS_STONE_PINE_CRAFTING_TABLE, addConditions(drops(HellionsSniffer.HS_STONE_PINE_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("snifferplus"))));

        addDrop(Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE, addConditions(drops(Promenade.PROM_DARK_AMARANTH_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("promenade"))));
        addDrop(Promenade.PROM_MAPLE_CRAFTING_TABLE, addConditions(drops(Promenade.PROM_MAPLE_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("promenade"))));
        addDrop(Promenade.PROM_PALM_CRAFTING_TABLE, addConditions(drops(Promenade.PROM_PALM_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("promenade"))));
        addDrop(Promenade.PROM_SAKURA_CRAFTING_TABLE, addConditions(drops(Promenade.PROM_SAKURA_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("promenade"))));

        addDrop(TechReborn.TR_RUBBER_CRAFTING_TABLE, addConditions(drops(TechReborn.TR_RUBBER_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("techreborn"))));


    }
    private LootTable.Builder addConditions(LootTable.Builder builder, List<ConditionJsonProvider> conditions) {
        if (!conditions.isEmpty())
            FabricDataGenHelper.addConditions(builder, conditions.toArray(ConditionJsonProvider[]::new));
        return builder;
    }

}