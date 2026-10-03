/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.expanded_toolbox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.expanded_toolbox.entity.PebbleProjectileEntity;
import net.mcreator.expanded_toolbox.ExpandedToolboxMod;

public class ExpandedToolboxModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, ExpandedToolboxMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<PebbleProjectileEntity>> PEBBLE_PROJECTILE = register("pebble_projectile",
			EntityType.Builder.<PebbleProjectileEntity>of(PebbleProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}