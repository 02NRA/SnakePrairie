package net.mcreator.justakritch.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OilFuelFuelBurningSuccessConditionProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getY(), event.player.getZ(), event.player);
		}
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
		for (int index0 = 0; index0 < 5; index0++) {
			if ((world.getBlockState(BlockPos.containing(entity.getLookAngle().x + sx, y, z))).getBlock() == Blocks.BLAST_FURNACE) {
				found = true;
			}
			sx = sx + 1;
		}
	}
}
