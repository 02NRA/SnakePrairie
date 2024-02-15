package net.mcreator.go_with_the_flow.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.go_with_the_flow.GoWithTheFlowMod;

public class OilShaleBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SQUID_INK, x, y, z, 7, 3, 3, 3, 1);
		GoWithTheFlowMod.queueServerWork(20, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.NONE);
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		});
	}
}
