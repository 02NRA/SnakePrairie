package net.mcreator.demiplanedomicile.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.demiplanedomicile.procedures.MemoryPlayerFinishesUsingItemProcedure;
import net.mcreator.demiplanedomicile.procedures.MemoryOnDroppedItemEntityDestroyedProcedure;

public class MemoryItem extends Item {
	public MemoryItem() {
		super(new Item.Properties().rarity(Rarity.RARE));
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
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		entity.startUsingItem(hand);
		return ar;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		MemoryPlayerFinishesUsingItemProcedure.execute(world, x, y, z, entity);
		return retval;
	}

	@Override
	public void onDestroyed(ItemEntity entity, DamageSource damagesource) {
		super.onDestroyed(entity, damagesource);
		MemoryOnDroppedItemEntityDestroyedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}
}