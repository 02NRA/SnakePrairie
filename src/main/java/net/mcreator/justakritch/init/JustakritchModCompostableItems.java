
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justakritch.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JustakritchModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(Items.ROTTEN_FLESH, 0.3f);
		ComposterBlock.COMPOSTABLES.put(Blocks.GRASS_BLOCK.asItem(), 0.3f);
	}
}
