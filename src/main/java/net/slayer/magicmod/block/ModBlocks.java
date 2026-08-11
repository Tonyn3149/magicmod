package net.slayer.magicmod.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.slayer.magicmod.Magic;

import java.util.function.Function;

public class ModBlocks {

    public static final Block VOIDSTONE_BLOCK = registerBlock("voidstone_block",
            properties -> new Block(properties
                    .strength(2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));

    public static final Block RAWVOIDSTONE_BLOCK = registerBlock("rawvoidstone_block",
            properties -> new Block(properties
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .instrument(NoteBlockInstrument.BASEDRUM)));









    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function){
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Magic.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Magic.MOD_ID, name), toRegister);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Magic.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Magic.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        Magic.LOGGER.info("Registering Mod Blocks " + Magic.MOD_ID);
    }
}
