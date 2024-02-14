
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.expanded_toolbox.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.expanded_toolbox.ExpandedToolboxMod;

public class ExpandedToolboxModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExpandedToolboxMod.MODID);
	public static final RegistryObject<CreativeModeTab> JUST_A_KRITCH = REGISTRY.register("just_a_kritch",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.expanded_toolbox.just_a_kritch")).icon(() -> new ItemStack(Blocks.COMMAND_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(ExpandedToolboxModItems.SHIV.get());
				tabData.accept(ExpandedToolboxModItems.POTION_OF_GLOW.get());
				tabData.accept(ExpandedToolboxModItems.PEBBLE.get());
				tabData.accept(ExpandedToolboxModItems.SLING_SHOT.get());
				tabData.accept(ExpandedToolboxModBlocks.CLEANED_GLASS.get().asItem());
			}).withSearchBar().build());
}
