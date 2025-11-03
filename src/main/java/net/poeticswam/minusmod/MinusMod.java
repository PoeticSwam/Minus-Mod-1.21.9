package net.poeticswam.minusmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.poeticswam.minusmod.effect.ModEffects;
import net.poeticswam.minusmod.item.ModItems;
import net.poeticswam.minusmod.potion.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinusMod implements ModInitializer {
	public static final String MOD_ID = "minusmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModEffects.registerEffects();
        ModPotions.registerPotions();
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(Potions.MUNDANE, Items.SLIME_BALL, ModPotions.MONSTER_MASTER_COLOGNE);
        });
    }
}