
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justakritch.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class JustakritchModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == Items.GUNPOWDER)
			event.setBurnTime(100);
		else if (itemstack.getItem() == JustakritchModItems.OIL_BUCKET.get())
			event.setBurnTime(10000);
	}
}
