
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thenewworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thenewworld.TheNewWorldMod;

public class TheNewWorldModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheNewWorldMod.MODID);
	public static final RegistryObject<Item> RUINED_ENCHANTING_TABLE = block(TheNewWorldModBlocks.RUINED_ENCHANTING_TABLE);
	public static final RegistryObject<Item> ASTRAL_SAND = block(TheNewWorldModBlocks.ASTRAL_SAND);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
