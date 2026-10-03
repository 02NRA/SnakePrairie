package net.mcreator.spoonful_of_sugar.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedEggItem extends Item {
	public CookedEggItem() {
		super(new Item.Properties().stacksTo(16).food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.6f).build()));
	}
}