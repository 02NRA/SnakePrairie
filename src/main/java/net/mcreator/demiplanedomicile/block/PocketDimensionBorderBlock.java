package net.mcreator.demiplanedomicile.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class PocketDimensionBorderBlock extends Block {
	public PocketDimensionBorderBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.EMPTY).strength(-1, 3600000).lightLevel(blockstate -> 15).pushReaction(PushReaction.BLOCK));
	}
}