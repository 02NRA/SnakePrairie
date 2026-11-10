package net.mcreator.demiplanedomicile.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.demiplanedomicile.init.DemiplaneDomicileModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class EntityDiesProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		CompoundTag SavedEntity = new CompoundTag();
		if (entity.getPersistentData().getBoolean("Memorialized") == true) {
			world.setBlock(BlockPos.containing(Math.round(x), Math.round(y), Math.round(z)), DemiplaneDomicileModBlocks.SANCTUM_ANIMAE.get().defaultBlockState(), 3);
			entity.getPersistentData().putBoolean("Memorialized", false);
			if (entity != null && world instanceof net.minecraft.server.level.ServerLevel serverLevel) {
				net.minecraft.nbt.CompoundTag entityNbt = new net.minecraft.nbt.CompoundTag();
				entity.save(entityNbt);
				entityNbt.remove("Pos");
				entityNbt.remove("DeathTime");
				float maxHealth = 20.0f;
				if (entity instanceof net.minecraft.world.entity.LivingEntity living) {
					maxHealth = living.getMaxHealth();
				}
				entityNbt.putFloat("Health", maxHealth);
				// Use consistent rounding
				int bx = (int) Math.round(x);
				int by = (int) Math.round(y);
				int bz = (int) Math.round(z);
				String key = bx + "_" + by + "_" + bz;
				net.mcreator.demiplanedomicile.MobStorage.DATA.put(key, entityNbt.toString());
				// Debug chat message to confirm storage
				serverLevel.getServer().getPlayerList().broadcastSystemMessage(net.minecraft.network.chat.Component.literal("§a[Saved] Stored mob at: " + key), false);
			}
		}
	}
}