package net.mcreator.demiplanedomicile.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.demiplanedomicile.init.DemiplaneDomicileModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SoulCampfirePlacedProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		Entity Spawnee = null;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SOUL_LANTERN && (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == DemiplaneDomicileModBlocks.SANCTUM_ANIMAE.get()) {
			if (world instanceof net.minecraft.server.level.ServerLevel serverLevel) {
				int targetX = (int) Math.round(x);
				int targetY = (int) Math.round(y - 1);
				int targetZ = (int) Math.round(z);
				String posKey = targetX + "_" + targetY + "_" + targetZ;
				net.mcreator.demiplanedomicile.MobStorage storage = net.mcreator.demiplanedomicile.MobStorage.get(serverLevel);
				String nbtString = storage.getData().get(posKey);
				if (nbtString != null && !nbtString.isEmpty()) {
					try {
						net.minecraft.nbt.CompoundTag resurrectedTag = net.minecraft.nbt.TagParser.parseTag(nbtString);
						net.minecraft.world.entity.Entity resurrectedEntity = net.minecraft.world.entity.EntityType.loadEntityRecursive(resurrectedTag, serverLevel, e -> {
							e.absMoveTo(x + 0.5, y, z + 0.5, e.getYRot(), e.getXRot());
							return e;
						});
						if (resurrectedEntity != null) {
							resurrectedEntity.setUUID(java.util.UUID.randomUUID());
							serverLevel.addFreshEntity(resurrectedEntity);
							storage.getData().remove(posKey);
							storage.setDirty();
							// Play sound effect
							serverLevel.playSound(null, x, y, z, net.minecraft.sounds.SoundEvents.CANDLE_EXTINGUISH, net.minecraft.sounds.SoundSource.BLOCKS, 3.0f, 0.5f);
							// Fully erase both blocks into air without dropping items
							serverLevel.setBlock(new net.minecraft.core.BlockPos((int) Math.round(x), (int) Math.round(y), (int) Math.round(z)), net.minecraft.world.level.block.Blocks.AIR.defaultBlockState(), 3);
							serverLevel.setBlock(new net.minecraft.core.BlockPos(targetX, targetY, targetZ), net.minecraft.world.level.block.Blocks.AIR.defaultBlockState(), 3);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					serverLevel.getServer().getPlayerList().broadcastSystemMessage(net.minecraft.network.chat.Component.literal("§c[Error] No persistent data found for key: " + posKey), false);
				}
			}
		}
	}
}