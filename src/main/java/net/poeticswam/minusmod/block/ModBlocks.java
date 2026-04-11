package net.poeticswam.minusmod.block;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.poeticswam.minusmod.MinusMod;

public class ModBlocks {

    // --- Gravity Blocks ---
    public static final Block SUGAR_BLOCK = registerFallingBlock("sugar_block", AbstractBlock.Settings.create().mapColor(MapColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND));

    // --- Normal Blocks ---
    public static final Block PRESENT_EMPTY = registerBlock("present_empty", AbstractBlock.Settings.create().mapColor(MapColor.BLUE).strength(1F).sounds(BlockSoundGroup.WOOL).nonOpaque());
    public static final Block PRESENT = registerBlock("present", AbstractBlock.Settings.create().mapColor(MapColor.BLUE).strength(1F).sounds(BlockSoundGroup.WOOL).nonOpaque());
    public static final Block EXAMPLE_BLOCK = registerBlock("example_block", AbstractBlock.Settings.create().mapColor(MapColor.PINK).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(BlockSoundGroup.WOOL));

    private static Block registerBlock(String name, AbstractBlock.Settings settings) {
        Identifier id = Identifier.of(MinusMod.MOD_ID, name);
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, id);

        Block block = new Block(settings.registryKey(blockKey));
        registerBlockItem(name, block);

        return Registry.register(Registries.BLOCK, blockKey, block);
    }


    private static Block registerFallingBlock(String name, AbstractBlock.Settings settings) {
        Identifier id = Identifier.of(MinusMod.MOD_ID, name);
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, id);

        FallingBlock block = new FallingBlock(settings.registryKey(blockKey)) {
            @Override
            protected MapCodec<? extends FallingBlock> getCodec() {
                return null;
            }

            @Override
            public int getColor(BlockState state, BlockView world, BlockPos pos) {
                return 0;
            }
        };
        registerBlockItem(name, block);

        return Registry.register(Registries.BLOCK, blockKey, block);
    }


    private static void registerBlockItem(String name, Block block) {
        Identifier id = Identifier.of(MinusMod.MOD_ID, name);
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);

        BlockItem item = new BlockItem(
                block,
                new Item.Settings().registryKey(itemKey)
        );
        Registry.register(Registries.ITEM, itemKey, item);
    }


    public static void registerModBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(SUGAR_BLOCK);
            entries.add(EXAMPLE_BLOCK);
            entries.add(PRESENT_EMPTY);
            entries.add(PRESENT);
        });
    }
}
