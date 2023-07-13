package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import net.minecraft.loot.LootTable;
import net.xanthian.variantcraftingtables.block.CraftingTables;
import net.xanthian.variantcraftingtables.block.compatability.TechReborn;

import java.util.List;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(CraftingTables.ACACIA_CRAFTING_TABLE);
        addDrop(CraftingTables.BAMBOO_CRAFTING_TABLE);
        addDrop(CraftingTables.BIRCH_CRAFTING_TABLE);
        addDrop(CraftingTables.CHERRY_CRAFTING_TABLE);
        addDrop(CraftingTables.DARK_OAK_CRAFTING_TABLE);
        addDrop(CraftingTables.JUNGLE_CRAFTING_TABLE);
        addDrop(CraftingTables.MANGROVE_CRAFTING_TABLE);
        addDrop(CraftingTables.SPRUCE_CRAFTING_TABLE);
        addDrop(CraftingTables.CRIMSON_CRAFTING_TABLE);
        addDrop(CraftingTables.WARPED_CRAFTING_TABLE);
        addDrop(CraftingTables.MANGROVE_CRAFTING_TABLE);
            addDrop(TechReborn.TR_RUBBER_CRAFTING_TABLE, addConditions(drops(TechReborn.TR_RUBBER_CRAFTING_TABLE), List.of(DefaultResourceConditions.allModsLoaded("techreborn"))));


    }
    // Currently not possible without internal api. Waiting on api update.
    @SuppressWarnings("UnstableApiUsage")
    private LootTable.Builder addConditions(LootTable.Builder builder, List<ConditionJsonProvider> conditions) {
        if (!conditions.isEmpty())
            FabricDataGenHelper.addConditions(builder, conditions.toArray(ConditionJsonProvider[]::new));
        return builder;
    }

}