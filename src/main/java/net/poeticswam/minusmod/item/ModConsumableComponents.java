package net.poeticswam.minusmod.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.RemoveEffectsConsumeEffect;
import net.minecraft.sound.SoundEvents;
import static net.minecraft.component.type.ConsumableComponents.drink;

public class ModConsumableComponents {
    public static final ConsumableComponent MELON_JUICE = drink().consumeSeconds(2.0F).sound(SoundEvents.ENTITY_GENERIC_DRINK).consumeEffect(new RemoveEffectsConsumeEffect(StatusEffects.NAUSEA)).build();
}