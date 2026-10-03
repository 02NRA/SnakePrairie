/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spoonful_of_sugar.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.spoonful_of_sugar.potion.WhimsyMobEffect;
import net.mcreator.spoonful_of_sugar.potion.BrainFreezeMobEffect;
import net.mcreator.spoonful_of_sugar.SpoonfulOfSugarMod;

public class SpoonfulOfSugarModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, SpoonfulOfSugarMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> WHIMSY = REGISTRY.register("whimsy", WhimsyMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> BRAIN_FREEZE = REGISTRY.register("brain_freeze", BrainFreezeMobEffect::new);
}