
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thenewworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.thenewworld.TheNewWorldMod;

public class TheNewWorldModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheNewWorldMod.MODID);
	public static final RegistryObject<CreativeModeTab> THE_NEW_WORLD = REGISTRY.register("the_new_world",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_new_world.the_new_world")).icon(() -> new ItemStack(Blocks.COMMAND_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(TheNewWorldModBlocks.RUINED_ENCHANTING_TABLE.get().asItem());
				tabData.accept(TheNewWorldModBlocks.ASTRAL_SAND.get().asItem());
			}).withSearchBar().build());
}
