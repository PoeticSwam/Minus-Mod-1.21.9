package net.poeticswam.minusmod.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.item.consume.RemoveEffectsConsumeEffect;
import net.minecraft.sound.SoundEvents;
import static net.minecraft.component.type.ConsumableComponents.drink;

public class ModConsumableComponents {
    public static final ConsumableComponent MELON_JUICE = drink().consumeSeconds(2.0F).sound(SoundEvents.ENTITY_GENERIC_DRINK).consumeEffect(new RemoveEffectsConsumeEffect(StatusEffects.NAUSEA)).build();
    public static final ConsumableComponent FERMENTED_MELON_JUICE = drink().consumeSeconds(2.0F).sound(SoundEvents.ENTITY_GENERIC_DRINK).consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0))).consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 1))).build();
}