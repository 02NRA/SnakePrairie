/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thenewworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thenewworld.TheNewWorldMod;

public class TheNewWorldModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TheNewWorldMod.MODID);
	public static final DeferredItem<Item> ASTRAL_SAND;
	public static final DeferredItem<Item> RUINED_ENCHANTING_TABLE;
	static {
		ASTRAL_SAND = block(TheNewWorldModBlocks.ASTRAL_SAND);
		RUINED_ENCHANTING_TABLE = block(TheNewWorldModBlocks.RUINED_ENCHANTING_TABLE);
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