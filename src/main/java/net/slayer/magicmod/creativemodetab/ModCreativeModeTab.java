package net.slayer.magicmod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.slayer.magicmod.Item.ModItems;
import net.slayer.magicmod.Magic;
import net.slayer.magicmod.block.ModBlocks;

public class ModCreativeModeTab {

    public static final CreativeModeTab MAGIC_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Magic.MOD_ID, "magic_mod_name"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(ModItems.AMBERROOTRESIN))
                    .title(Component.translatable("creativemodetab.magicmod.magic_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.FANG);
                        output.accept(ModItems.ICHOR);
                        output.accept(ModItems.ARCANECRYSTAL);
                        output.accept(ModItems.ANCIENTPAGE);
                        output.accept(ModItems.LEYLINEDUST);
                        output.accept(ModItems.PIXIEDUST);
                        output.accept(ModItems.GOLEMCORE);
                        output.accept(ModItems.ROTTALLOW);
                        output.accept(ModItems.BANSHEEWAIL);
                        output.accept(ModItems.PLAGUESPORE);
                        output.accept(ModItems.CORPSEFLOWER);
                        output.accept(ModItems.MIASMA);
                        output.accept(ModItems.PRISMQUARTZ);
                        output.accept(ModItems.CHALK);
                        output.accept(ModItems.MITHRIL);
                        output.accept(ModItems.HOLLOWCOAL);
                        output.accept(ModItems.LOCKEDGRIMOIRE);
                        output.accept(ModItems.LIQUIDSTARLIGHT);
                        output.accept(ModItems.DISTILLVAPOR);
                        output.accept(ModItems.AMBERROOTRESIN);
                        output.accept(ModItems.THORNSHARD);
                        output.accept(ModItems.EMBERLEAF);
                        output.accept(ModItems.FROSTBUD);
                        output.accept(ModItems.STORMPETAL);
                        output.accept(ModItems.WORLDTREESAP);
                        output.accept(ModItems.SPORELINGCAP);
                        output.accept(ModItems.SPRINGWATER);
                        output.accept(ModItems.DRUIDICTOTEM);
                        output.accept(ModItems.ELDERWOODRUNE);
                        output.accept(ModItems.BEASTHEART);
                        output.accept(ModItems.MORNINGDEW);
                        output.accept(ModItems.RAWVOIDSTONE);
                        output.accept(ModItems.VOIDSTONE);

                        output.accept(ModBlocks.VOIDSTONE_BLOCK);
                        output.accept(ModBlocks.RAWVOIDSTONE_BLOCK);
                    }).build());

    public static void registerModCreativeModeTab (){
        Magic.LOGGER.info("Registering Creative mode tab" + Magic.MOD_ID);
    }
}
