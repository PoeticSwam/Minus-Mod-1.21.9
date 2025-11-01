package net.poeticswam.minusmod;

import net.fabricmc.api.ModInitializer;

import net.poeticswam.minusmod.effect.ModEffects;
import net.poeticswam.minusmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinusMod implements ModInitializer {
	public static final String MOD_ID = "minusmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModEffects.registerEffects();
    }
}