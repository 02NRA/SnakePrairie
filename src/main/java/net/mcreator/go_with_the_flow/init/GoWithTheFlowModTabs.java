
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.go_with_the_flow.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.go_with_the_flow.GoWithTheFlowMod;

public class GoWithTheFlowModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GoWithTheFlowMod.MODID);
	public static final RegistryObject<CreativeModeTab> JUST_A_KRITCH = REGISTRY.register("just_a_kritch",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.go_with_the_flow.just_a_kritch")).icon(() -> new ItemStack(Blocks.COMMAND_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(GoWithTheFlowModItems.QUICKSAND_BUCKET.get());
				tabData.accept(GoWithTheFlowModItems.OIL_BUCKET.get());
			}).withSearchBar().build());
}
