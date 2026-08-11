package net.slayer.magicmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.slayer.magicmod.datagen.ModBlockLootTableProvider;
import net.slayer.magicmod.datagen.ModBlockTagsProvider;
import net.slayer.magicmod.datagen.ModModelProvider;
import net.slayer.magicmod.datagen.ModRecipeProvider;

public class MagicDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
