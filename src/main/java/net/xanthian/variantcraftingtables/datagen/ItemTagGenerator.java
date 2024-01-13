package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantcraftingtables.util.ModItemTags.CRAFTING_TABLES;


public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {

    private static final TagKey<Item> C_WORKBENCH = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:workbench"));

    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        registerTags(Vanilla.VANILLA_CRAFTING_TABLES);

        registerTags(AdAstra.AA_TABLES);
        registerTags(BeachParty.LDBP_TABLES);
        registerTags(BetterArcheology.BA_TABLES);
        registerTags(Bewitchment.BW_TABLES);
        registerTags(BiomeMakeover.BM_TABLES);
        registerTags(Blockus.BLS_TABLES);
        registerTags(Botania.BOT_TABLES);
        registerTags(Cinderscapes.CS_TABLES);
        registerTags(DeeperAndDarker.DAD_TABLES);
        registerTags(Desolation.DS_TABLES);
        registerTags(Ecologics.ECO_TABLES);
        registerTags(EldritchEnd.EE_TABLES);
        registerTags(Meadow.LDM_TABLES);
        registerTags(MineCells.MC_TABLES);
        registerTags(NaturesSpirit.NS_TABLES);
        registerTags(Promenade.PROM_TABLES);
        registerTags(RegionsUnexplored.RU_TABLES);
        registerTags(SnifferPlus.SP_TABLES);
        registerTags(TechReborn.TR_TABLES);
        registerTags(Vinery.LDV_TABLES);

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                .add(Vanilla.CRIMSON_CRAFTING_TABLE.asItem())
                .add(Vanilla.WARPED_CRAFTING_TABLE.asItem())
                .addOptional(new Identifier("variantcraftingtables:bls_charred_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:bls_herringbone_charred_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:bls_herringbone_crimson_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:bls_herringbone_warped_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:prom_dark_amaranth_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_brimwood_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_cobalt_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_dead_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_yellow_bioshroom_crafting_table"));

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