package net.poeticswam.minusmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.EggItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.poeticswam.minusmod.MinusMod;
import net.poeticswam.minusmod.item.custom.CustomDrinkItem;
import net.poeticswam.minusmod.item.custom.CustomStewItem;

public class ModItems {

    public static final Item CREEPER_CRUNCH_ICE_CREAM = registerItem("creeper_crunch_ice_cream", new Item(new Item.Settings().food(ModFoodComponents.CREEPER_CRUNCH_ICE_CREAM).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"creeper_crunch_ice_cream")))));
    public static final Item GHAST_TEAR_SWIRL_ICE_CREAM = registerItem("ghast_tear_swirl_ice_cream", new Item(new Item.Settings().food(ModFoodComponents.GHAST_TEAR_SWIRL_ICE_CREAM).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"ghast_tear_swirl_ice_cream")))));
    public static final Item MAGMA_CREAM_RIPPLE_ICE_CREAM = registerItem("magma_cream_ripple_ice_cream", new Item(new Item.Settings().food(ModFoodComponents.MAGMA_CREAM_RIPPLE_ICE_CREAM).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"magma_cream_ripple_ice_cream")))));
    public static final Item DIAMOND_ORE_CHUNK_ICE_CREAM = registerItem("diamond_ore_chunk_ice_cream", new Item(new Item.Settings().food(ModFoodComponents.DIAMOND_ORE_CHUNK_ICE_CREAM).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"diamond_ore_chunk_ice_cream")))));
    public static final Item FERMENTED_POTATO = registerItem("fermented_potato", new Item(new Item.Settings().food(ModFoodComponents.FERMENTED_POTATO).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"fermented_potato")))));
    public static final Item GRASS_STEW = registerItem("grass_stew", new CustomStewItem(new Item.Settings().maxCount(1).food(ModFoodComponents.GRASS_STEW).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"grass_stew")))));
    public static final Item MUD_SOUP = registerItem("mud_soup", new CustomStewItem(new Item.Settings().maxCount(1).food(ModFoodComponents.MUD_SOUP).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"mud_soup")))));
    public static final Item COARSE_DIRT_STEW = registerItem("coarse_dirt_stew", new CustomStewItem(new Item.Settings().maxCount(1).food(ModFoodComponents.COARSE_DIRT_STEW).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"coarse_dirt_stew")))));
    public static final Item GRAVEL_SANDWICH = registerItem("gravel_sandwich", new Item(new Item.Settings().food(ModFoodComponents.GRAVEL_SANDWICH).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"gravel_sandwich")))));
    public static final Item SLIME_PIE = registerItem("slime_pie", new Item(new Item.Settings().food(ModFoodComponents.SLIME_PIE).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"slime_pie")))));
    public static final Item WATER_MELON_DRINK = registerItem("water_melon_drink", new CustomDrinkItem(new Item.Settings().food(ModFoodComponents.WATER_MELON_DRINK, ModConsumableComponents.WATER_MELON_DRINK).maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"water_melon_drink")))));

    public static final Item SPIDER_LEG = registerItem("spider_leg", new Item(new Item.Settings().food(ModFoodComponents.SPIDER_LEG).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"spider_leg")))));
    public static final Item COOKED_SPIDER_LEG = registerItem("cooked_spider_leg", new Item(new Item.Settings().food(ModFoodComponents.COOKED_SPIDER_LEG).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"cooked_spider_leg")))));

    public static final Item BLACK_COLORED_EGG = registerItem("black_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"black_colored_egg")))));
    public static final Item BLUE_COLORED_EGG = registerItem("blue_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"blue_colored_egg")))));
    public static final Item BROWN_COLORED_EGG = registerItem("brown_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"brown_colored_egg")))));
    public static final Item CYAN_COLORED_EGG = registerItem("cyan_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"cyan_colored_egg")))));
    public static final Item GRAY_COLORED_EGG = registerItem("gray_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"gray_colored_egg")))));
    public static final Item GREEN_COLORED_EGG = registerItem("green_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"green_colored_egg")))));
    public static final Item LIGHT_BLUE_COLORED_EGG = registerItem("light_blue_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"light_blue_colored_egg")))));
    public static final Item LIGHT_GRAY_COLORED_EGG = registerItem("light_gray_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"light_gray_colored_egg")))));
    public static final Item LIME_COLORED_EGG = registerItem("lime_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"lime_colored_egg")))));
    public static final Item MAGENTA_COLORED_EGG = registerItem("magenta_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"magenta_colored_egg")))));
    public static final Item ORANGE_COLORED_EGG = registerItem("orange_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"orange_colored_egg")))));
    public static final Item PINK_COLORED_EGG = registerItem("pink_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"pink_colored_egg")))));
    public static final Item PURPLE_COLORED_EGG = registerItem("purple_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"purple_colored_egg")))));
    public static final Item RED_COLORED_EGG = registerItem("red_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"red_colored_egg")))));
    public static final Item WHITE_COLORED_EGG = registerItem("white_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"white_colored_egg")))));
    public static final Item YELLOW_COLORED_EGG = registerItem("yellow_colored_egg", new EggItem(new Item.Settings().maxCount(16).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"yellow_colored_egg")))));

    public static final Item FERMENTED_GLOWSTONE_DUST = registerItem("fermented_glowstone_dust", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"fermented_glowstone_dust")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MinusMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MinusMod.LOGGER.info("Registering Mod Items for " + MinusMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(CREEPER_CRUNCH_ICE_CREAM);
            entries.add(GHAST_TEAR_SWIRL_ICE_CREAM);
            entries.add(MAGMA_CREAM_RIPPLE_ICE_CREAM);
            entries.add(DIAMOND_ORE_CHUNK_ICE_CREAM);
            entries.add(FERMENTED_POTATO);
            entries.add(GRASS_STEW);
            entries.add(MUD_SOUP);
            entries.add(COARSE_DIRT_STEW);
            entries.add(GRAVEL_SANDWICH);
            entries.add(SPIDER_LEG);
            entries.add(COOKED_SPIDER_LEG);
            entries.add(SLIME_PIE);
            entries.add(WATER_MELON_DRINK);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BLACK_COLORED_EGG);
            entries.add(BLUE_COLORED_EGG);
            entries.add(BROWN_COLORED_EGG);
            entries.add(CYAN_COLORED_EGG);
            entries.add(GRAY_COLORED_EGG);
            entries.add(GREEN_COLORED_EGG);
            entries.add(LIGHT_BLUE_COLORED_EGG);
            entries.add(LIGHT_GRAY_COLORED_EGG);
            entries.add(LIME_COLORED_EGG);
            entries.add(MAGENTA_COLORED_EGG);
            entries.add(ORANGE_COLORED_EGG);
            entries.add(PINK_COLORED_EGG);
            entries.add(PURPLE_COLORED_EGG);
            entries.add(RED_COLORED_EGG);
            entries.add(WHITE_COLORED_EGG);
            entries.add(YELLOW_COLORED_EGG);
            entries.add(FERMENTED_GLOWSTONE_DUST);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(BLACK_COLORED_EGG);
            entries.add(BLUE_COLORED_EGG);
            entries.add(BROWN_COLORED_EGG);
            entries.add(CYAN_COLORED_EGG);
            entries.add(GRAY_COLORED_EGG);
            entries.add(GREEN_COLORED_EGG);
            entries.add(LIGHT_BLUE_COLORED_EGG);
            entries.add(LIGHT_GRAY_COLORED_EGG);
            entries.add(LIME_COLORED_EGG);
            entries.add(MAGENTA_COLORED_EGG);
            entries.add(ORANGE_COLORED_EGG);
            entries.add(PINK_COLORED_EGG);
            entries.add(PURPLE_COLORED_EGG);
            entries.add(RED_COLORED_EGG);
            entries.add(WHITE_COLORED_EGG);
            entries.add(YELLOW_COLORED_EGG);
        });
    }
}
