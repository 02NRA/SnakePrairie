
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tigerclawfirstmod.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.tigerclawfirstmod.TigerclawfirstmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TigerclawfirstmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TigerclawfirstmodMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(TigerclawfirstmodModBlocks.MAPLE_LOG.get().asItem());
			tabData.accept(TigerclawfirstmodModBlocks.MAPLE_WOOD.get().asItem());
			tabData.accept(TigerclawfirstmodModBlocks.MAPLE_PLANKS.get().asItem());
			tabData.accept(TigerclawfirstmodModBlocks.MAPLE_STAIRS.get().asItem());
			tabData.accept(TigerclawfirstmodModBlocks.MAPLE_SLAB.get().asItem());
			tabData.accept(TigerclawfirstmodModBlocks.MAPLE_FENCE.get().asItem());
			tabData.accept(TigerclawfirstmodModBlocks.MAPLE_FENCE_GATE.get().asItem());
			tabData.accept(TigerclawfirstmodModBlocks.MAPLE_PRESSURE_PLATE.get().asItem());
			tabData.accept(TigerclawfirstmodModBlocks.MAPLE_BUTTON.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(TigerclawfirstmodModItems.AMBER_CHUNK.get());
			tabData.accept(TigerclawfirstmodModItems.SAP_BUCKET.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(TigerclawfirstmodModBlocks.MAPLE_LEAVES.get().asItem());
			tabData.accept(TigerclawfirstmodModBlocks.MAPLE_SAPLING.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TigerclawfirstmodModItems.AMBER_PICKAXE.get());
		}
	}
}
