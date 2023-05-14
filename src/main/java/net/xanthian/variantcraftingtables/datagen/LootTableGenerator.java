package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.xanthian.variantcraftingtables.craftingtables.CraftingTables;


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

        ConditionJsonProvider.write();
        LootCondition.Builder HAS_SILK_TOUCH = MatchToolLootCondition.builder(ItemPredicate.Builder.create()
                .enchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, NumberRange.IntRange.ANY)));
    }
}
