package net.mcreator.go_with_the_flow.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@EventBusSubscriber
public class OilFuelFuelBurningSuccessConditionProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double y, double z, Entity entity) {
		execute(null, world, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		boolean found = false;
		sx = -5;
		found = false;
		for (int _i1 = 0; _i1 < 5; _i1++) {
			if ((world.getBlockState(BlockPos.containing(entity.getLookAngle().x + sx, y, z))).getBlock() == Blocks.BLAST_FURNACE) {
				found = true;
			}
			sx = sx + 1;
		}
	}
}