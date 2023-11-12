package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.registry.tag.BlockTags.AXE_MINEABLE;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {

    public static final TagKey<Block> CRAFTING_TABLES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(Initialise.MOD_ID, "crafting_tables"));
    private static final TagKey<Block> C_WORKBENCH = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:workbench"));

    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        registerTags(Vanilla.VANILLA_CRAFTING_TABLES);

        registerTags(AdAstra.AA_TABLES);
        registerTags(BeachParty.LDBP_TABLES);
        registerTags(BetterArcheology.BA_TABLES);
        registerTags(Bewitchment.BW_TABLES);
        registerTags(Blockus.BLS_TABLES);
        registerTags(DeeperAndDarker.DAD_TABLES);
        registerTags(EldritchEnd.EE_TABLES);
        registerTags(MineCells.MC_TABLES);
        registerTags(NaturesSpirit.NS_TABLES);
        registerTags(Promenade.PROM_TABLES);
        registerTags(RegionsUnexplored.RU_TABLES);
        registerTags(SnifferPlus.SP_TABLES);
        registerTags(TechReborn.TR_TABLES);
        registerTags(Vinery.LDV_TABLES);

        getOrCreateTagBuilder(AXE_MINEABLE)
                .forceAddTag(CRAFTING_TABLES);

        getOrCreateTagBuilder(C_WORKBENCH)
                .forceAddTag(CRAFTING_TABLES);

    }

    private void registerTags(Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            Identifier lootTableId = block.getLootTableId();
            String newPath = lootTableId.getPath().replaceFirst("blocks/", "");
            Identifier modifiedId = new Identifier(lootTableId.getNamespace(), newPath);

            getOrCreateTagBuilder(CRAFTING_TABLES)
                    .addOptional(modifiedId);
        }
    }
}