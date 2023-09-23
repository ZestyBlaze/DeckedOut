package dev.zestyblaze.deckedout.block;

import eu.pb4.polymer.core.api.block.PolymerBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;

public class DOSweetBerryBushBlock extends SweetBerryBushBlock implements PolymerBlock {
    public DOSweetBerryBushBlock() {
        super(Properties.copy(Blocks.SWEET_BERRY_BUSH));
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) { }

    @Override
    public Block getPolymerBlock(BlockState state) {
        return Blocks.SWEET_BERRY_BUSH;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        if (state.getValue(AGE).equals(0)) return Blocks.SWEET_BERRY_BUSH.defaultBlockState().setValue(AGE, 0);
        if (state.getValue(AGE).equals(1)) return Blocks.SWEET_BERRY_BUSH.defaultBlockState().setValue(AGE, 1);
        if (state.getValue(AGE).equals(2)) return Blocks.SWEET_BERRY_BUSH.defaultBlockState().setValue(AGE, 2);
        return Blocks.SWEET_BERRY_BUSH.defaultBlockState().setValue(AGE, 3);
    }
}
