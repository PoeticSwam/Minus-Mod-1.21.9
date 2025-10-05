package net.poeticswam.minusmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.poeticswam.minusmod.MinusMod;

public class ModItems {

    public static final Item

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MinusMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MinusMod.LOGGER.info("Registering Mod Items for" + MinusMod.MOD_ID);
    }
}
