package net.poeticswam.minusmod.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.poeticswam.minusmod.MinusMod;
import net.poeticswam.minusmod.effect.ModEffects;

public class ModPotions {

    public static final RegistryEntry<Potion> MONSTER_MASTER_COLOGNE = registerPotion("monster_master_cologne",
            new Potion("monster_master_cologne", new StatusEffectInstance(ModEffects.COLOGNE, 1200, 0)));

    public static final RegistryEntry<Potion> ROCKET_POTION = registerPotion("rocket_potion",
            new Potion("rocket_potion", new StatusEffectInstance(ModEffects.ROCKET, 160, 0)));

    public static final RegistryEntry<Potion> STONESKIN_POTION_1 = registerPotion("stoneskin_potion_1",
            new Potion("stoneskin_potion", new StatusEffectInstance(ModEffects.STONESKIN, 3600, 0)));

    public static final RegistryEntry<Potion> STONESKIN_POTION_2 = registerPotion("stoneskin_potion_2",
            new Potion("stoneskin_potion", new StatusEffectInstance(ModEffects.STONESKIN, 3600, 1)));

    public static final RegistryEntry<Potion> STONESKIN_POTION_3 = registerPotion("stoneskin_potion_3",
            new Potion("stoneskin_potion", new StatusEffectInstance(ModEffects.STONESKIN, 3600, 2)));

    public static final RegistryEntry<Potion> STONESKIN_POTION_4 = registerPotion("stoneskin_potion_4",
            new Potion("stoneskin_potion", new StatusEffectInstance(ModEffects.STONESKIN, 3600, 3)));

    public static final RegistryEntry<Potion> STONESKIN_POTION_5 = registerPotion("stoneskin_potion_5",
            new Potion("stoneskin_potion", new StatusEffectInstance(ModEffects.STONESKIN, 3600, 4)));


    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(MinusMod.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        MinusMod.LOGGER.info("Registering Mod Potions for " + MinusMod.MOD_ID);
    }
}