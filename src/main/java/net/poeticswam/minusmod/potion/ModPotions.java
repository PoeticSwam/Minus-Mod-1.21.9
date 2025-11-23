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

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(MinusMod.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        MinusMod.LOGGER.info("Registering Mod Potions for" + MinusMod.MOD_ID);
    }
}