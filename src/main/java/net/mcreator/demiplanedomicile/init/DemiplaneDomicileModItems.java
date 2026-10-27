/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.demiplanedomicile.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.demiplanedomicile.item.*;
import net.mcreator.demiplanedomicile.DemiplaneDomicileMod;

public class DemiplaneDomicileModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DemiplaneDomicileMod.MODID);
	public static final DeferredItem<Item> BLOCK_OF_DREAM_DUST;
	public static final DeferredItem<Item> DREAM;
	public static final DeferredItem<Item> POCKET_DIMENSION_ITEM;
	public static final DeferredItem<Item> MEMORY;
	public static final DeferredItem<Item> BLOCK_OF_MEMORIES;
	public static final DeferredItem<Item> NIGHTMARE;
	public static final DeferredItem<Item> BAUBLE;
	public static final DeferredItem<Item> DOOMSDAY_CLOCK;
	static {
		BLOCK_OF_DREAM_DUST = block(DemiplaneDomicileModBlocks.BLOCK_OF_DREAM_DUST, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant());
		DREAM = REGISTRY.register("dream", DreamItem::new);
		POCKET_DIMENSION_ITEM = REGISTRY.register("pocket_dimension_item", PocketDimensionItemItem::new);
		MEMORY = REGISTRY.register("memory", MemoryItem::new);
		BLOCK_OF_MEMORIES = block(DemiplaneDomicileModBlocks.BLOCK_OF_MEMORIES, new Item.Properties().rarity(Rarity.RARE));
		NIGHTMARE = REGISTRY.register("nightmare", NightmareItem::new);
		BAUBLE = REGISTRY.register("bauble", BaubleItem::new);
		DOOMSDAY_CLOCK = REGISTRY.register("doomsday_clock", DoomsdayClockItem::new);
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