/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.expanded_toolbox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.expanded_toolbox.ExpandedToolboxMod;

public class ExpandedToolboxModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, ExpandedToolboxMod.MODID);
	public static final DeferredHolder<Potion, Potion> GLOWING = REGISTRY.register("glowing", () -> new Potion(new MobEffectInstance(ExpandedToolboxModMobEffects.GLOW, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> GLOWING_EXTENDED = REGISTRY.register("glowing_extended", () -> new Potion(new MobEffectInstance(ExpandedToolboxModMobEffects.GLOW, 9600, 0, false, true)));
}