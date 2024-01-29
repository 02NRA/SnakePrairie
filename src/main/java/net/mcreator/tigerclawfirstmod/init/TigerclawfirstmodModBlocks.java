
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tigerclawfirstmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.tigerclawfirstmod.block.MapleWoodBlock;
import net.mcreator.tigerclawfirstmod.block.MapleStairsBlock;
import net.mcreator.tigerclawfirstmod.block.MapleSlabBlock;
import net.mcreator.tigerclawfirstmod.block.MapleSaplingBlock;
import net.mcreator.tigerclawfirstmod.block.MaplePressurePlateBlock;
import net.mcreator.tigerclawfirstmod.block.MaplePlanksBlock;
import net.mcreator.tigerclawfirstmod.block.MapleLogBlock;
import net.mcreator.tigerclawfirstmod.block.MapleLeavesBlock;
import net.mcreator.tigerclawfirstmod.block.MapleFenceGateBlock;
import net.mcreator.tigerclawfirstmod.block.MapleFenceBlock;
import net.mcreator.tigerclawfirstmod.block.MapleButtonBlock;
import net.mcreator.tigerclawfirstmod.TigerclawfirstmodMod;

public class TigerclawfirstmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TigerclawfirstmodMod.MODID);
	public static final RegistryObject<Block> MAPLE_LOG = REGISTRY.register("maple_log", () -> new MapleLogBlock());
	public static final RegistryObject<Block> MAPLE_WOOD = REGISTRY.register("maple_wood", () -> new MapleWoodBlock());
	public static final RegistryObject<Block> MAPLE_PLANKS = REGISTRY.register("maple_planks", () -> new MaplePlanksBlock());
	public static final RegistryObject<Block> MAPLE_LEAVES = REGISTRY.register("maple_leaves", () -> new MapleLeavesBlock());
	public static final RegistryObject<Block> MAPLE_STAIRS = REGISTRY.register("maple_stairs", () -> new MapleStairsBlock());
	public static final RegistryObject<Block> MAPLE_SLAB = REGISTRY.register("maple_slab", () -> new MapleSlabBlock());
	public static final RegistryObject<Block> MAPLE_FENCE = REGISTRY.register("maple_fence", () -> new MapleFenceBlock());
	public static final RegistryObject<Block> MAPLE_FENCE_GATE = REGISTRY.register("maple_fence_gate", () -> new MapleFenceGateBlock());
	public static final RegistryObject<Block> MAPLE_PRESSURE_PLATE = REGISTRY.register("maple_pressure_plate", () -> new MaplePressurePlateBlock());
	public static final RegistryObject<Block> MAPLE_BUTTON = REGISTRY.register("maple_button", () -> new MapleButtonBlock());
	public static final RegistryObject<Block> MAPLE_SAPLING = REGISTRY.register("maple_sapling", () -> new MapleSaplingBlock());
}
