/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.expanded_toolbox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

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
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ExpandedToolboxMod.MODID);
	public static final DeferredItem<Item> SHIV;
	public static final DeferredItem<Item> POTION_OF_GLOW;
	public static final DeferredItem<Item> PEBBLE;
	public static final DeferredItem<Item> SLING_SHOT;
	public static final DeferredItem<Item> CLEANED_GLASS;
	public static final DeferredItem<Item> LAME_CLEANED_GLASS;
	public static final DeferredItem<Item> POTION_OF_GLOW_LONG;
	static {
		SHIV = REGISTRY.register("shiv", ShivItem::new);
		POTION_OF_GLOW = REGISTRY.register("potion_of_glow", PotionOfGlowItem::new);
		PEBBLE = REGISTRY.register("pebble", PebbleItem::new);
		SLING_SHOT = REGISTRY.register("sling_shot", SlingShotItem::new);
		CLEANED_GLASS = block(ExpandedToolboxModBlocks.CLEANED_GLASS);
		LAME_CLEANED_GLASS = block(ExpandedToolboxModBlocks.LAME_CLEANED_GLASS);
		POTION_OF_GLOW_LONG = REGISTRY.register("potion_of_glow_long", PotionOfGlowLongItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}