package net.slayer.magicmod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.slayer.magicmod.Item.ModItems;
import net.slayer.magicmod.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.VOIDSTONE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.AMBERROOTRESIN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ANCIENTPAGE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ARCANECRYSTAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BANSHEEWAIL, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHALK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BEASTHEART, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CORPSEFLOWER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DISTILLVAPOR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DRUIDICTOTEM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ELDERWOODRUNE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMBERLEAF, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FANG, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FROSTBUD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.GOLEMCORE, ModelTemplates.FLAT_ITEM);
    }
}
