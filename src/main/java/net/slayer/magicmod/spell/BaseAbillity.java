package net.slayer.magicmod.spell;

import net.minecraft.world.entity.player.Player;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseAbillity implements InterfaceAbility{
    protected String name;
    protected String description;
    protected int cooldown;
    protected static Map<String, Long> cooldowns = new HashMap<>();

    @Override
    public abstract void execute(Player player);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCooldown() {
        return cooldown;
    }

    @Override
    public boolean getOnCooldown(Player player) {
        String key = player.getUUID() + ":" + name;
        if(!cooldowns.containsKey(key)){
            return false;
        }

        return System.currentTimeMillis() < cooldowns.get(key);
    }

    @Override
    public int getRemainingCooldown(Player player) {
        if (!getOnCooldown(player)) {
            return 0;
        }
        String key = player.getUUID() + ":" + name;
        long remaining = cooldowns.get(key) - System.currentTimeMillis();
        return (int) Math.ceil(remaining / 50.0);
    }

    protected void setCooldown(Player player) {
        String key = player.getUUID() + ":" + name;
        cooldowns.put(key, System.currentTimeMillis() + (cooldown * 50L));
    }
}
