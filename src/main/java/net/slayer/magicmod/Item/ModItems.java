package net.slayer.magicmod.Item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.slayer.magicmod.Magic;

import java.util.function.Function;

public class ModItems {

    //----------------------------Dark magic----------------------------

    //mineral
    public static final Item RAWVOIDSTONE = registerItem("rawvoidstone", Item::new);
    public static final Item VOIDSTONE = registerItem("voidstone", Item::new);
    public static final Item HOLLOWCOAL = registerItem("hollowcoal", Item::new);


    //mob drop
    public static final Item FANG = registerItem("fang", Item::new);
    public static final Item ICHOR = registerItem("ichor", Item::new);

        //recipe
    public static final Item ROTTALLOW = registerItem("rottallow", Item::new);

        //collecting
    public static final Item BANSHEEWAIL = registerItem("bansheewail", Item::new);
    public static final Item PLAGUESPORE = registerItem("plaguespore", Item::new);
    public static final Item CORPSEFLOWER = registerItem("corpseflower", Item::new);
    public static final Item MIASMA = registerItem("miasma", Item::new);

    //----------------------------Wizard style magic----------------------------

        //minning
    public static final Item ARCANECRYSTAL = registerItem("arcanecrystal", Item::new);
    public static final Item PRISMQUARTZ = registerItem("prismquartz", Item::new);
    public static final Item MITHRIL = registerItem("mithril", Item::new);

        //finding
    public static final Item ANCIENTPAGE = registerItem("ancientpage", Item::new);
    public static final Item LOCKEDGRIMOIRE = registerItem("lockedgrimoire", Item::new);

        //crafting
    public static final Item CHALK = registerItem("chalk", Item::new);

        //liquids
    public static final Item LIQUIDSTARLIGHT = registerItem("liquidstarlight", Item::new);
    public static final Item DISTILLVAPOR = registerItem("distillvapor", Item::new);

    //----------------------------Nature magic----------------------------

        //minning
    public static final Item AMBERROOTRESIN = registerItem("amberrootresin", Item::new);
    public static final Item THORNSHARD = registerItem("thornshard", Item::new);

        //finding
    public static final Item EMBERLEAF = registerItem("emberleaf", Item::new);
    public static final Item FROSTBUD = registerItem("frostbud", Item::new);
    public static final Item STORMPETAL = registerItem("stormpetal", Item::new);
    public static final Item WORLDTREESAP = registerItem("worldtreesap", Item::new);
    public static final Item SPORELINGCAP = registerItem("sporelingcap", Item::new);
    public static final Item SPRINGWATER = registerItem("springwater", Item::new);
    public static final Item DRUIDICTOTEM = registerItem("druidictotem", Item::new);
    public static final Item ELDERWOODRUNE = registerItem("elderwoodrune", Item::new);
    public static final Item MORNINGDEW = registerItem("morningdew", Item::new);

    //mob drop
    public static final Item GOLEMCORE = registerItem("golemcore", Item::new);
    public static final Item PIXIEDUST = registerItem("pixiedust", Item::new);
    public static final Item BEASTHEART = registerItem("beastheart", Item::new);

    //----------------------------Neutral----------------------------
    public static final Item LEYLINEDUST = registerItem("leylinedust", Item::new);





    private static Item registerItem(String name, Function<Item.Properties, Item> function){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Magic.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Magic.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Magic.LOGGER.info("Registering Items " + Magic.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(RAWVOIDSTONE);
            output.accept(VOIDSTONE);
            output.accept(FANG);
            output.accept(ICHOR);
            output.accept(ARCANECRYSTAL);
            output.accept(ANCIENTPAGE);
            output.accept(LEYLINEDUST);
            output.accept(PIXIEDUST);
            output.accept(GOLEMCORE);
            output.accept(ROTTALLOW);
            output.accept(BANSHEEWAIL);
            output.accept(PLAGUESPORE);
            output.accept(CORPSEFLOWER);
            output.accept(MIASMA);
            output.accept(PRISMQUARTZ);
            output.accept(CHALK);
            output.accept(MITHRIL);
            output.accept(HOLLOWCOAL);
            output.accept(LOCKEDGRIMOIRE);
            output.accept(LIQUIDSTARLIGHT);
            output.accept(DISTILLVAPOR);
            output.accept(AMBERROOTRESIN);
            output.accept(THORNSHARD);
            output.accept(EMBERLEAF);
            output.accept(FROSTBUD);
            output.accept(STORMPETAL);
            output.accept(WORLDTREESAP);
            output.accept(SPORELINGCAP);
            output.accept(SPRINGWATER);
            output.accept(DRUIDICTOTEM);
            output.accept(ELDERWOODRUNE);
            output.accept(BEASTHEART);
            output.accept(MORNINGDEW);
        });
    }
}
