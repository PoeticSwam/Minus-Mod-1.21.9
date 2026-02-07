package net.poeticswam.minusmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.poeticswam.minusmod.block.ModBlocks;
import net.poeticswam.minusmod.effect.ModEffects;
import net.poeticswam.minusmod.item.ModItems;
import net.poeticswam.minusmod.potion.ModPotions;
import net.poeticswam.minusmod.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

public class MinusMod implements ModInitializer {
	public static final String MOD_ID = "minusmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
        ModEffects.registerEffects();
        ModPotions.registerPotions();
        ModLootTableModifiers.modifyLootTables();
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.registerPotionRecipe(Potions.MUNDANE, Items.SLIME_BALL, ModPotions.MONSTER_MASTER_COLOGNE));
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.registerPotionRecipe(Potions.LEAPING, ModItems.FERMENTED_GLOWSTONE_DUST, ModPotions.ROCKET_POTION));
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(mod -> ServerLifecycleEvents.SERVER_STARTING.register(server -> LOGGER.info("MinusMod dev data pack should now be loaded")));
    }
}