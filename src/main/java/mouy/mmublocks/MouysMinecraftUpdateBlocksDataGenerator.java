package mouy.mmublocks;

import mouy.mmublocks.datagen.LootTableProvider;
import mouy.mmublocks.datagen.ModelProvider;
import mouy.mmublocks.datagen.RecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MouysMinecraftUpdateBlocksDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		fabricDataGenerator.createPack().addProvider(ModelProvider::new);
		fabricDataGenerator.createPack().addProvider(RecipeProvider::new);
		fabricDataGenerator.createPack().addProvider(LootTableProvider::new);
	}
}
