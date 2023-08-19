package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.block.*;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.registry.tag.BlockTags.AXE_MINEABLE;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static final TagKey<Block> CRAFTINGTABLES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(Initialise.MOD_ID,"crafting_tables"));
    private static final TagKey<Block> WORKBENCH = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:workbench"));

    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(CRAFTINGTABLES)
                .add(Vanilla.ACACIA_CRAFTING_TABLE)
                .add(Vanilla.BAMBOO_CRAFTING_TABLE)
                .add(Vanilla.BIRCH_CRAFTING_TABLE)
                .add(Vanilla.CHERRY_CRAFTING_TABLE)
                .add(Vanilla.CRIMSON_CRAFTING_TABLE)
                .add(Vanilla.DARK_OAK_CRAFTING_TABLE)
                .add(Vanilla.JUNGLE_CRAFTING_TABLE)
                .add(Vanilla.MANGROVE_CRAFTING_TABLE)
                .add(Vanilla.SPRUCE_CRAFTING_TABLE)
                .add(Vanilla.WARPED_CRAFTING_TABLE)

                .addOptional(new Identifier("variantcraftingtables:aa_aeronos_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:aa_glacian_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:aa_stropar_crafting_table"))

                .addOptional(new Identifier("variantcraftingtables:ldbp_palm_crafting_table"))

                .addOptional(new Identifier("variantcraftingtables:ba_rotten_crafting_table"))

                .addOptional(new Identifier("variantcraftingtables:bw_cypress_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:bw_dragons_blood_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:bw_elder_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:bw_juniper_crafting_table"))

                .addOptional(new Identifier("variantcraftingtables:prom_dark_amaranth_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:prom_maple_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:prom_palm_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:prom_sakura_crafting_table"))

                .addOptional(new Identifier("variantcraftingtables:ru_alpha_oak_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_baobab_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_black_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_blackwood_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_blue_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_brown_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_cherry_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_cyan_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_cypress_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_dead_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_eucalyptus_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_green_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_gray_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_joshua_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_larch_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_light_blue_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_light_gray_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_lime_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_magenta_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_maple_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_mauve_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_orange_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_palm_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_pine_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_pink_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_purple_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_red_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_redwood_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_sculkwood_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_white_painted_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_willow_crafting_table"))
                .addOptional(new Identifier("variantcraftingtables:ru_yellow_painted_crafting_table"))

                .addOptional(new Identifier("variantcraftingtables:sp_stone_pine_crafting_table"))

                .addOptional(new Identifier("variantcraftingtables:tr_rubber_crafting_table"))

                .addOptional(new Identifier("variantcraftingtables:ldv_cherry_crafting_table"));

        getOrCreateTagBuilder(AXE_MINEABLE)
                .forceAddTag(CRAFTINGTABLES);

        getOrCreateTagBuilder(WORKBENCH)
                .forceAddTag(CRAFTINGTABLES);
    }
}