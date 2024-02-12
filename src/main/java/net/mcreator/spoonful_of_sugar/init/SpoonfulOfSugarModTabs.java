
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spoonful_of_sugar.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.spoonful_of_sugar.SpoonfulOfSugarMod;

public class SpoonfulOfSugarModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpoonfulOfSugarMod.MODID);
	public static final RegistryObject<CreativeModeTab> JUST_A_KRITCH = REGISTRY.register("just_a_kritch",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.spoonful_of_sugar.just_a_kritch")).icon(() -> new ItemStack(Blocks.COMMAND_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(SpoonfulOfSugarModItems.COOKED_EGG.get());
				tabData.accept(SpoonfulOfSugarModItems.SKEWERED_MARSHMALLOW.get());
				tabData.accept(SpoonfulOfSugarModItems.TOASTED_SKEWERED_MARSHMALLOW.get());
				tabData.accept(SpoonfulOfSugarModItems.SMORE.get());
			}).withSearchBar().build());
}
