package net.mcreator.expanded_toolbox.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.expanded_toolbox.init.ExpandedToolboxModMobEffects;

public class GlowEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ExpandedToolboxModMobEffects.GLOW) ? _livEnt.getEffect(ExpandedToolboxModMobEffects.GLOW).getDuration() : 0, 0));
	}
}