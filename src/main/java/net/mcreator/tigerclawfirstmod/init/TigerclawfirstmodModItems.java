
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tigerclawfirstmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.tigerclawfirstmod.item.SapBucketItem;
import net.mcreator.tigerclawfirstmod.item.AmberPickaxeItem;
import net.mcreator.tigerclawfirstmod.item.AmberChunkItem;
import net.mcreator.tigerclawfirstmod.TigerclawfirstmodMod;

public class TigerclawfirstmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TigerclawfirstmodMod.MODID);
	public static final RegistryObject<Item> MAPLE_LOG = block(TigerclawfirstmodModBlocks.MAPLE_LOG);
	public static final RegistryObject<Item> MAPLE_WOOD = block(TigerclawfirstmodModBlocks.MAPLE_WOOD);
	public static final RegistryObject<Item> MAPLE_PLANKS = block(TigerclawfirstmodModBlocks.MAPLE_PLANKS);
	public static final RegistryObject<Item> MAPLE_LEAVES = block(TigerclawfirstmodModBlocks.MAPLE_LEAVES);
	public static final RegistryObject<Item> MAPLE_STAIRS = block(TigerclawfirstmodModBlocks.MAPLE_STAIRS);
	public static final RegistryObject<Item> MAPLE_SLAB = block(TigerclawfirstmodModBlocks.MAPLE_SLAB);
	public static final RegistryObject<Item> MAPLE_FENCE = block(TigerclawfirstmodModBlocks.MAPLE_FENCE);
	public static final RegistryObject<Item> MAPLE_FENCE_GATE = block(TigerclawfirstmodModBlocks.MAPLE_FENCE_GATE);
	public static final RegistryObject<Item> MAPLE_PRESSURE_PLATE = block(TigerclawfirstmodModBlocks.MAPLE_PRESSURE_PLATE);
	public static final RegistryObject<Item> MAPLE_BUTTON = block(TigerclawfirstmodModBlocks.MAPLE_BUTTON);
	public static final RegistryObject<Item> MAPLE_SAPLING = block(TigerclawfirstmodModBlocks.MAPLE_SAPLING);
	public static final RegistryObject<Item> AMBER_PICKAXE = REGISTRY.register("amber_pickaxe", () -> new AmberPickaxeItem());
	public static final RegistryObject<Item> AMBER_CHUNK = REGISTRY.register("amber_chunk", () -> new AmberChunkItem());
	public static final RegistryObject<Item> SAP_BUCKET = REGISTRY.register("sap_bucket", () -> new SapBucketItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
