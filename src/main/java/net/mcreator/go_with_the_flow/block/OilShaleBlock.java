package net.mcreator.go_with_the_flow.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.go_with_the_flow.procedures.OilShaleOnBlockRightClickedProcedure;
import net.mcreator.go_with_the_flow.procedures.OilShaleBlockDestroyedByPlayerProcedure;
import net.mcreator.go_with_the_flow.procedures.OilShaleBlockDestroyedByExplosionProcedure;

public class OilShaleBlock extends Block {
	public OilShaleBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.BASALT).strength(1.25f, 2f).requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		OilShaleBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}

	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion e) {
		super.wasExploded(world, pos, e);
		OilShaleBlockDestroyedByExplosionProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void attack(BlockState blockstate, Level world, BlockPos pos, Player entity) {
		super.attack(blockstate, world, pos, entity);
		OilShaleOnBlockRightClickedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}
}