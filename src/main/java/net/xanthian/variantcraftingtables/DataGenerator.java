package net.xanthian.variantcraftingtables;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.xanthian.variantcraftingtables.datagen.LootTableGenerator;
import net.xanthian.variantcraftingtables.datagen.ModelGenerator;
import net.xanthian.variantcraftingtables.datagen.RecipeGenerator;

public class DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(LootTableGenerator::new);
        pack.addProvider(RecipeGenerator::new);
        pack.addProvider(ModelGenerator::new);

    }
}
