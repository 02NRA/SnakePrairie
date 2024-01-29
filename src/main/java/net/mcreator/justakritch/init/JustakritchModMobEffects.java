
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justakritch.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.justakritch.potion.WhimsyMobEffect;
import net.mcreator.justakritch.JustakritchMod;

public class JustakritchModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, JustakritchMod.MODID);
	public static final RegistryObject<MobEffect> WHIMSY = REGISTRY.register("whimsy", () -> new WhimsyMobEffect());
}
