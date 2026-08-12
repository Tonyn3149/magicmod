package net.slayer.magicmod.spell;

import net.slayer.magicmod.Magic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ModSpell {

    private static final Map<String, InterfaceAbility> ABILITIES = new HashMap<>();

    public static void register(InterfaceAbility ability){
        ABILITIES.put(ability.getName(), ability);
    }

    public static InterfaceAbility get(String name){
        return ABILITIES.get(name);
    }

    public static Collection<InterfaceAbility> getAll() {
        return ABILITIES.values();
    }

    public static void registerSpells() {
        Magic.LOGGER.info("Registering Spells " + Magic.MOD_ID);


    }
}
