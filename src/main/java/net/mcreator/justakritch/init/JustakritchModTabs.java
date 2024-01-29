
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justakritch.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.justakritch.JustakritchMod;

public class JustakritchModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JustakritchMod.MODID);
	public static final RegistryObject<CreativeModeTab> JUST_A_KRITCH = REGISTRY.register("just_a_kritch",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.justakritch.just_a_kritch")).icon(() -> new ItemStack(Blocks.COMMAND_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(JustakritchModItems.QUICKSAND_BUCKET.get());
				tabData.accept(JustakritchModItems.SHIV.get());
				tabData.accept(JustakritchModItems.POTION_OF_GLOW.get());
				tabData.accept(JustakritchModItems.COOKED_EGG.get());
				tabData.accept(JustakritchModItems.PEBBLE.get());
				tabData.accept(JustakritchModItems.SLING_SHOT.get());
				tabData.accept(JustakritchModItems.SKEWERED_MARSHMALLOW.get());
				tabData.accept(JustakritchModItems.TOASTED_SKEWERED_MARSHMALLOW.get());
				tabData.accept(JustakritchModItems.SMORE.get());
			}).withSearchBar().build());
}
