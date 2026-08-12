package net.slayer.magicmod.spell.impl.fire;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.slayer.magicmod.spell.BaseAbillity;

import java.util.logging.Level;

public class FireballAbillity extends BaseAbillity {

    public FireballAbillity(){
        this.name = "FireBall";
        this.description = "Cast a fireball";
        this.cooldown = 40
    }

    @Override
    public void execute(Player player) {
        if(!getOnCooldown(player)){
            return;
        }
        setCooldown(player);

        Level level = player.level();

        double reach = 20.0;
        Vec3 start = player.getEyePosition();
        Vec3 look = player.getViewVector(1.0f);
        Vec3 end = start.add(look.scale(reach));
    }
}
