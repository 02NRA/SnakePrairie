package net.mcreator.demiplanedomicile.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.demiplanedomicile.procedures.MemoryPlayerFinishesUsingItemProcedure;
import net.mcreator.demiplanedomicile.procedures.MemoryOnDroppedItemEntityDestroyedProcedure;

public class MemoryItem extends Item {
	public MemoryItem() {
		super(new Item.Properties().rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(0).saturationModifier(0f).alwaysEdible().build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.SPYGLASS;
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return 16;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		MemoryPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}

	@Override
	public void onDestroyed(ItemEntity entity, DamageSource damagesource) {
		super.onDestroyed(entity, damagesource);
		MemoryOnDroppedItemEntityDestroyedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}
}