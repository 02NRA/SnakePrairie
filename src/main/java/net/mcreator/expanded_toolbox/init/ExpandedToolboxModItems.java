
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.expanded_toolbox.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.expanded_toolbox.item.SlingShotItem;
import net.mcreator.expanded_toolbox.item.ShivItem;
import net.mcreator.expanded_toolbox.item.PotionOfGlowLongItem;
import net.mcreator.expanded_toolbox.item.PotionOfGlowItem;
import net.mcreator.expanded_toolbox.item.PebbleItem;
import net.mcreator.expanded_toolbox.ExpandedToolboxMod;

public class ExpandedToolboxModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ExpandedToolboxMod.MODID);
	public static final RegistryObject<Item> SHIV = REGISTRY.register("shiv", () -> new ShivItem());
	public static final RegistryObject<Item> POTION_OF_GLOW = REGISTRY.register("potion_of_glow", () -> new PotionOfGlowItem());
	public static final RegistryObject<Item> PEBBLE = REGISTRY.register("pebble", () -> new PebbleItem());
	public static final RegistryObject<Item> SLING_SHOT = REGISTRY.register("sling_shot", () -> new SlingShotItem());
	public static final RegistryObject<Item> CLEANED_GLASS = block(ExpandedToolboxModBlocks.CLEANED_GLASS);
	public static final RegistryObject<Item> LAME_CLEANED_GLASS = block(ExpandedToolboxModBlocks.LAME_CLEANED_GLASS);
	public static final RegistryObject<Item> POTION_OF_GLOW_LONG = REGISTRY.register("potion_of_glow_long", () -> new PotionOfGlowLongItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
