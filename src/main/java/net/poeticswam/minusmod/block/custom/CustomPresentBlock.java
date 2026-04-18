package net.poeticswam.minusmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class CustomPresentBlock extends Block {
    private static final VoxelShape SHAPE = VoxelShapes.union(createCuboidShape(3, 0, 3,13, 8, 13), createCuboidShape(2, 6, 2, 14, 9, 14));

    public CustomPresentBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
