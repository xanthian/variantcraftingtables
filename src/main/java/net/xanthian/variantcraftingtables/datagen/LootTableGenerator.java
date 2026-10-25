package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.xanthian.variantcraftingtables.block.Vanilla;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class LootTableGenerator extends FabricBlockLootSubProvider {

    public LootTableGenerator(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    private void registerLootTables(Map<Identifier, Block> blockMap, String modId) {
        for (Block block : blockMap.values()) {
            withConditions(ResourceConditions.allModsLoaded(modId)).dropSelf(block);
        }
    }

    @Override
    public void generate() {

        for (Block block : Vanilla.VANILLA_CRAFTING_TABLES.values()) {
            dropSelf(block);
        }

    }

    public void registerSpecialLootTable(Map<Identifier, Block> tables, String modId) {
        for (Map.Entry<Identifier, Block> entry : tables.entrySet()) {
            Identifier tableId = entry.getKey();
            Block table = entry.getValue();
            String path = tableId.getPath();
            String name = path.replace("variantcraftingtables:", "").replace("_crafting_table", "").replaceFirst("^[^_]+_", "");
            withConditions(ResourceConditions.and(
                    ResourceConditions.allModsLoaded(modId),
                    ResourceConditions.registryContains(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(modId, name + "_planks")))
            )).dropSelf(table);
        }
    }
}