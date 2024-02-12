
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spoonful_of_sugar.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.spoonful_of_sugar.potion.WhimsyMobEffect;
import net.mcreator.spoonful_of_sugar.SpoonfulOfSugarMod;

public class SpoonfulOfSugarModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SpoonfulOfSugarMod.MODID);
	public static final RegistryObject<MobEffect> WHIMSY = REGISTRY.register("whimsy", () -> new WhimsyMobEffect());
}
