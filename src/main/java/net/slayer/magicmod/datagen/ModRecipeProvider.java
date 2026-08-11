package net.slayer.magicmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;
import net.slayer.magicmod.Item.ModItems;
import net.slayer.magicmod.Magic;
import net.slayer.magicmod.block.ModBlocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> MAGIC_SMELLABLE = List.of(ModItems.RAWVOIDSTONE );

                oreSmelting(MAGIC_SMELLABLE, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.VOIDSTONE, 0.1f, 200, "magic");
                oreBlasting(MAGIC_SMELLABLE, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.VOIDSTONE, 0.1f, 100, "magic");

                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.VOIDSTONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VOIDSTONE_BLOCK);

                shaped(RecipeCategory.MISC, ModBlocks.RAWVOIDSTONE_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.RAWVOIDSTONE)
                        .unlockedBy(getHasName(ModItems.RAWVOIDSTONE), has(ModItems.RAWVOIDSTONE))
                        .group("magic")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.RAWVOIDSTONE, 9)
                        .requires(ModBlocks.RAWVOIDSTONE_BLOCK)
                        .unlockedBy(getHasName(ModItems.RAWVOIDSTONE), has(ModItems.RAWVOIDSTONE))
                        .group("magic")
                        .save(output, "raw_voidstone"));
            }
        };
    }

    @Override
    public String getName() {
        return "Magicmod Recipes ";
    }
}
