/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.expanded_toolbox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.expanded_toolbox.procedures.GlowEffectExpiresProcedure;
import net.mcreator.expanded_toolbox.potion.GlowMobEffect;
import net.mcreator.expanded_toolbox.ExpandedToolboxMod;

@EventBusSubscriber
public class ExpandedToolboxModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, ExpandedToolboxMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> GLOW = REGISTRY.register("glow", GlowMobEffect::new);

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(GLOW)) {
			GlowEffectExpiresProcedure.execute(entity);
		}
	}
}