package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.xanthian.variantcraftingtables.block.Vanilla;
import net.xanthian.variantcraftingtables.block.compatability.*;

import java.util.Map;

public class LangFileGenerator extends FabricLanguageProvider {

    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public static String generateBlockDisplayName(Block block) {
        Identifier name = Registries.BLOCK.getId(block);
        String blockName = name.getPath();
        int underscoreIndex = blockName.indexOf('_');
        if (underscoreIndex != -1 && underscoreIndex < blockName.length() - 1) {
            blockName = blockName.substring(underscoreIndex + 1);
        }
        String[] parts = blockName.split("_");
        StringBuilder displayName = new StringBuilder();
        for (String part : parts) {
            displayName.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1)).append(" ");
        }
        return displayName.toString().trim();
    }

    private static void registerTranslations(TranslationBuilder translationBuilder, Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            translationBuilder.add(block, generateBlockDisplayName(block));
        }
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(Vanilla.ACACIA_CRAFTING_TABLE, "Acacia Crafting Table");
        translationBuilder.add(Vanilla.BAMBOO_CRAFTING_TABLE, "Bamboo Crafting Table");
        translationBuilder.add(Vanilla.BIRCH_CRAFTING_TABLE, "Birch Crafting Table");
        translationBuilder.add(Vanilla.CHERRY_CRAFTING_TABLE, "Cherry Crafting Table");
        translationBuilder.add(Vanilla.CRIMSON_CRAFTING_TABLE, "Crimson Crafting Table");
        translationBuilder.add(Vanilla.DARK_OAK_CRAFTING_TABLE, "Dark Oak Crafting Table");
        translationBuilder.add(Vanilla.JUNGLE_CRAFTING_TABLE, "Jungle Crafting Table");
        translationBuilder.add(Vanilla.MANGROVE_CRAFTING_TABLE, "Mangrove Crafting Table");
        translationBuilder.add(Blocks.CRAFTING_TABLE, "Oak Crafting Table");
        translationBuilder.add(Vanilla.SPRUCE_CRAFTING_TABLE, "Spruce Crafting Table");
        translationBuilder.add(Vanilla.WARPED_CRAFTING_TABLE, "Warped Crafting Table");

        registerTranslations(translationBuilder, AdAstra.AA_TABLES);
        registerTranslations(translationBuilder, BeachParty.LDBP_TABLES);
        registerTranslations(translationBuilder, BetterArcheology.BA_TABLES);
        registerTranslations(translationBuilder, Bewitchment.BW_TABLES);
        registerTranslations(translationBuilder, BiomeMakeover.BM_TABLES);
        registerTranslations(translationBuilder, Blockus.BLS_TABLES);
        registerTranslations(translationBuilder, Botania.BOT_TABLES);
        registerTranslations(translationBuilder, Cinderscapes.CS_TABLES);
        registerTranslations(translationBuilder, DeeperAndDarker.DAD_TABLES);
        registerTranslations(translationBuilder, Desolation.DS_TABLES);
        registerTranslations(translationBuilder, EldritchEnd.EE_TABLES);
        registerTranslations(translationBuilder, MineCells.MC_TABLES);
        registerTranslations(translationBuilder, NaturesSpirit.NS_TABLES);
        registerTranslations(translationBuilder, Promenade.PROM_TABLES);
        registerTranslations(translationBuilder, RegionsUnexplored.RU_TABLES);
        registerTranslations(translationBuilder, SnifferPlus.SP_TABLES);
        registerTranslations(translationBuilder, TechReborn.TR_TABLES);
        registerTranslations(translationBuilder, Vinery.LDV_TABLES);
    }
}