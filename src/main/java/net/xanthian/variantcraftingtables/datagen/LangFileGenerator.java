package net.xanthian.variantcraftingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
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

        registerTranslations(translationBuilder, Vanilla.VANILLA_CRAFTING_TABLES);

        registerTranslations(translationBuilder, AdAstra.AA_TABLES);
        registerTranslations(translationBuilder, BeachParty.LDBP_TABLES);
        registerTranslations(translationBuilder, BetterArcheology.BA_TABLES);
        registerTranslations(translationBuilder, Bewitchment.BW_TABLES);
        registerTranslations(translationBuilder, Blockus.BLS_TABLES);
        registerTranslations(translationBuilder, DeeperAndDarker.DAD_TABLES);
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