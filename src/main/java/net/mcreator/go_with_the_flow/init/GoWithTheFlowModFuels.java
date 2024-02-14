
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.go_with_the_flow.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class GoWithTheFlowModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == GoWithTheFlowModItems.OIL_BUCKET.get())
			event.setBurnTime(10000);
	}
}
