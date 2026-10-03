package net.mcreator.spoonful_of_sugar.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.spoonful_of_sugar.procedures.ApplyWhimsyProcedure;

public class SmoreItem extends Item {
	public SmoreItem() {
		super(new Item.Properties().stacksTo(16).food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		ApplyWhimsyProcedure.execute(entity);
		return retval;
	}
}