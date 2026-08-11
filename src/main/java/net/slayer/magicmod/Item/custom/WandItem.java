package net.slayer.magicmod.Item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import org.jspecify.annotations.NonNull;

public class WandItem extends Item {
    public WandItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context){



        return InteractionResult.SUCCESS;
    }
}
