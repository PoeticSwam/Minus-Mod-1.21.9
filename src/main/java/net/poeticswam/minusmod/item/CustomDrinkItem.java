package net.poeticswam.minusmod.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.world.World;


public class CustomDrinkItem extends Item {

    public CustomDrinkItem(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);

        if (user instanceof PlayerEntity player && !player.getAbilities().creativeMode) {
            return new ItemStack(Items.GLASS_BOTTLE);
        }

        return stack;
    }
}