package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;

import java.util.Map;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    private void registerLootTables(Map<Identifier, Block> blockMap, String modId) {
        for (Block block : blockMap.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded(modId)).addDrop(block);
        }
    }

    @Override
    public void generate() {

        for (Block block : Vanilla.VANILLA_CRAFTING_TABLES.values()) {
            addDrop(block);
        }

        registerLootTables(AdAstra.AA_TABLES, "ad_astra");
        registerLootTables(BeachParty.LDBP_TABLES, "beachparty");
        registerLootTables(BetterArcheology.BA_TABLES, "betterarcheology");
        registerLootTables(Bewitchment.BW_TABLES, "bewitchment");
        registerLootTables(BiomeMakeover.BM_TABLES, "biomemakeover");
        registerLootTables(Blockus.BLS_TABLES, "blockus");
        registerLootTables(Botania.BOT_TABLES, "botania");
        registerLootTables(Cinderscapes.CS_TABLES, "cinderscape");
        registerLootTables(DeeperAndDarker.DAD_TABLES, "deeperdarker");
        registerLootTables(Desolation.DS_TABLES, "desolation");
        registerLootTables(EldritchEnd.EE_TABLES, "eldritch_end");
        registerLootTables(MineCells.MC_TABLES, "minecells");
        registerSpecialLootTable(NaturesSpirit.NS_TABLES, "natures_spirit");
        registerLootTables(Promenade.PROM_TABLES, "promenade");
        registerSpecialLootTable(RegionsUnexplored.RU_TABLES, "regions_unexplored");
        registerLootTables(SnifferPlus.SP_TABLES, "snifferplus");
        registerLootTables(TechReborn.TR_TABLES, "techreborn");
        registerLootTables(Vinery.LDV_TABLES, "vinery");
    }

    public void registerSpecialLootTable(Map<Identifier, Block> tables, String modId) {
        for (Map.Entry<Identifier, Block> entry : tables.entrySet()) {
            Identifier tableId = entry.getKey();
            Block table = entry.getValue();
            String path = tableId.getPath();
            String name = path.replace("variantcraftingtables:", "").replace("_crafting_table", "").replaceFirst("^[^_]+_", "");
            withConditions(DefaultResourceConditions.and(
                    DefaultResourceConditions.allModsLoaded(modId),
                    DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier(modId + ":" + name + "_planks")))
            )).addDrop(table);
        }
    }
}