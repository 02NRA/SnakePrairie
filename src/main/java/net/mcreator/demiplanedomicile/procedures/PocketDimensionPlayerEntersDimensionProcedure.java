package net.mcreator.demiplanedomicile.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.demiplanedomicile.DemiplaneDomicileMod;

public class PocketDimensionPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double pocketDimensionOffset = 0;
		// Assigns the calculated UUID hash coordinate directly to your procedure's local variable
		pocketDimensionOffset = (double) (Math.abs(entity.getUUID().toString().hashCode()) % 100000) * 10;
		{
			Entity _ent = entity;
			double _tx = (pocketDimensionOffset + 6);
			double _ty = 203;
			double _tz = 405;
			_ent.teleportTo(_tx, _ty, _tz);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(_tx, _ty, _tz, _ent.getYRot(), _ent.getXRot());
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 20, 1));
		entity.getPersistentData().putDouble("pocketDimensionOffset", pocketDimensionOffset);
		DemiplaneDomicileMod.queueServerWork(1, () -> {
			if (world.canSeeSkyFromBelowWater(BlockPos.containing(entity.getPersistentData().getDouble("pocketDimensionOffset") + 7, 203, 403))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("demiplane_domicile", "pocket_dimension_memory"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(entity.getPersistentData().getDouble("pocketDimensionOffset"), 199, 398), BlockPos.containing(entity.getPersistentData().getDouble("pocketDimensionOffset"), 199, 398),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		});
	}
}