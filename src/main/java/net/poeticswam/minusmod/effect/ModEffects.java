package net.poeticswam.minusmod.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.poeticswam.minusmod.MinusMod;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> COLOGNE = registerStatusEffect("cologne",
            new CologneEffect(StatusEffectCategory.BENEFICIAL, 0x4a0033)
                    .addAttributeModifier(EntityAttributes.LUCK,
                            Identifier.of(MinusMod.MOD_ID, "cologne"),3,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> ROCKET = registerStatusEffect("rocket",
            new RocketEffect(StatusEffectCategory.NEUTRAL, 0xebff84)
                    .addAttributeModifier(EntityAttributes.JUMP_STRENGTH,
                            Identifier.of(MinusMod.MOD_ID, "rocket"),20,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> STONESKIN = registerStatusEffect("stoneskin",
            new StoneskinEffect(StatusEffectCategory.BENEFICIAL, 0x6e6e6e));


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MinusMod.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        MinusMod.LOGGER.info("Registering Mod Effects for " + MinusMod.MOD_ID);
    }
}
