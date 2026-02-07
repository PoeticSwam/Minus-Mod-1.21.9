package net.poeticswam.minusmod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class CustomIceCreamItem extends Item {

    public CustomIceCreamItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);

        if (user instanceof PlayerEntity player && !player.getAbilities().creativeMode) {
            ItemStack stick = new ItemStack(Items.STICK);

            if (!player.getInventory().insertStack(stick)) {
                player.dropItem(stick, false);
            }
        }

        return stack;
    }
}