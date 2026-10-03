/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spoonful_of_sugar.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.spoonful_of_sugar.item.*;
import net.mcreator.spoonful_of_sugar.SpoonfulOfSugarMod;

public class SpoonfulOfSugarModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SpoonfulOfSugarMod.MODID);
	public static final DeferredItem<Item> COOKED_EGG;
	public static final DeferredItem<Item> SKEWERED_MARSHMALLOW;
	public static final DeferredItem<Item> TOASTED_SKEWERED_MARSHMALLOW;
	public static final DeferredItem<Item> SMORE;
	public static final DeferredItem<Item> MILKSHAKE;
	public static final DeferredItem<Item> CEREAL_BOWL;
	static {
		COOKED_EGG = REGISTRY.register("cooked_egg", CookedEggItem::new);
		SKEWERED_MARSHMALLOW = REGISTRY.register("skewered_marshmallow", SkeweredMarshmallowItem::new);
		TOASTED_SKEWERED_MARSHMALLOW = REGISTRY.register("toasted_skewered_marshmallow", ToastedSkeweredMarshmallowItem::new);
		SMORE = REGISTRY.register("smore", SmoreItem::new);
		MILKSHAKE = REGISTRY.register("milkshake", MilkshakeItem::new);
		CEREAL_BOWL = REGISTRY.register("cereal_bowl", CerealBowlItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}