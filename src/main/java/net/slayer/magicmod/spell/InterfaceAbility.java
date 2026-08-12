package net.slayer.magicmod.spell;

import net.minecraft.world.entity.player.Player;

public interface InterfaceAbility {

    void execute(Player player);

    String getName();

    String getDescription();

    int getCooldown();


    boolean getOnCooldown(Player player);

    int getRemainingCooldown(Player player);


}
