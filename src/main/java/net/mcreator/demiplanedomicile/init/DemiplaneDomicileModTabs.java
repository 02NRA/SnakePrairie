/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.demiplanedomicile.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.demiplanedomicile.DemiplaneDomicileMod;

@EventBusSubscriber
public class DemiplaneDomicileModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DemiplaneDomicileMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(DemiplaneDomicileModBlocks.BLOCK_OF_DREAM_DUST.get().asItem());
			tabData.accept(DemiplaneDomicileModBlocks.BLOCK_OF_MEMORIES.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(DemiplaneDomicileModItems.DREAM.get());
			tabData.accept(DemiplaneDomicileModItems.POCKET_DIMENSION_ITEM.get());
			tabData.accept(DemiplaneDomicileModItems.MEMORY.get());
			tabData.accept(DemiplaneDomicileModItems.BAUBLE.get());
		}
	}
}