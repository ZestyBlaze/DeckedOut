package dev.zestyblaze.deckedout.registry;

import dev.zestyblaze.deckedout.DeckedOut;
import dev.zestyblaze.deckedout.block.DOSweetBerryBushBlock;
import eu.pb4.polymer.core.api.block.SimplePolymerBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockRegistry {
    public static final Block ASH_BLOCK = register("ash_block", new SimplePolymerBlock(BlockBehaviour.Properties.copy(Blocks.SAND), Blocks.BASALT));
    public static final Block SWEET_BERRY_BUSH = register("sweet_berry_bush", new DOSweetBerryBushBlock());

    public static Block register(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, DeckedOut.id(name), block);
    }

    public static void register() {}
}
