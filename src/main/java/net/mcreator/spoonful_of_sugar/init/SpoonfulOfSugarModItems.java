
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spoonful_of_sugar.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.spoonful_of_sugar.item.ToastedSkeweredMarshmallowItem;
import net.mcreator.spoonful_of_sugar.item.SmoreItem;
import net.mcreator.spoonful_of_sugar.item.SkeweredMarshmallowItem;
import net.mcreator.spoonful_of_sugar.item.MilkshakeItem;
import net.mcreator.spoonful_of_sugar.item.CookedEggItem;
import net.mcreator.spoonful_of_sugar.item.CerealBowlItem;
import net.mcreator.spoonful_of_sugar.SpoonfulOfSugarMod;

public class SpoonfulOfSugarModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SpoonfulOfSugarMod.MODID);
	public static final RegistryObject<Item> COOKED_EGG = REGISTRY.register("cooked_egg", () -> new CookedEggItem());
	public static final RegistryObject<Item> SKEWERED_MARSHMALLOW = REGISTRY.register("skewered_marshmallow", () -> new SkeweredMarshmallowItem());
	public static final RegistryObject<Item> TOASTED_SKEWERED_MARSHMALLOW = REGISTRY.register("toasted_skewered_marshmallow", () -> new ToastedSkeweredMarshmallowItem());
	public static final RegistryObject<Item> SMORE = REGISTRY.register("smore", () -> new SmoreItem());
	public static final RegistryObject<Item> MILKSHAKE = REGISTRY.register("milkshake", () -> new MilkshakeItem());
	public static final RegistryObject<Item> CEREAL_BOWL = REGISTRY.register("cereal_bowl", () -> new CerealBowlItem());
}
