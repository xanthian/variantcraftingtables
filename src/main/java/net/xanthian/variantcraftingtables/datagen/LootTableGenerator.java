package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.block.Block;
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
        registerLootTables(Blockus.BLS_TABLES, "blockus");
        registerLootTables(DeeperAndDarker.DAD_TABLES, "deeperdarker");
        registerLootTables(EldritchEnd.EE_TABLES, "eldritch_end");
        registerLootTables(MineCells.MC_TABLES, "minecells");
        registerLootTables(NaturesSpirit.NS_TABLES, "natures_spirit");
        registerLootTables(Promenade.PROM_TABLES, "promenade");
        registerLootTables(RegionsUnexplored.RU_TABLES, "regions_unexplored");
        registerLootTables(SnifferPlus.SP_TABLES, "snifferplus");
        registerLootTables(TechReborn.TR_TABLES, "techreborn");
        registerLootTables(Vinery.LDV_TABLES, "vinery");
    }
}