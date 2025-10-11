package net.poeticswam.minusmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.poeticswam.minusmod.MinusMod;

public class ModItems {

    public static final Item CREEPER_CRUNCH_ICE_CREAM = registerItem("creeper_crunch_ice_cream", new Item(new Item.Settings().food(ModFoodComponents.CREEPER_CRUNCH_ICE_CREAM).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"creeper_crunch_ice_cream")))));
    public static final Item GHAST_TEAR_SWIRL_ICE_CREAM = registerItem("ghast_tear_swirl_ice_cream", new Item(new Item.Settings().food(ModFoodComponents.GHAST_TEAR_SWIRL_ICE_CREAM).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MinusMod.MOD_ID,"ghast_tear_swirl_ice_cream")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MinusMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MinusMod.LOGGER.info("Registering Mod Items for" + MinusMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(CREEPER_CRUNCH_ICE_CREAM);
        });

    }
}
