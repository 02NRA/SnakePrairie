/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thenewworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.thenewworld.block.RuinedEnchantingTableBlock;
import net.mcreator.thenewworld.block.AstralSandBlock;
import net.mcreator.thenewworld.TheNewWorldMod;

public class TheNewWorldModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TheNewWorldMod.MODID);
	public static final DeferredBlock<Block> ASTRAL_SAND;
	public static final DeferredBlock<Block> RUINED_ENCHANTING_TABLE;
	static {
		ASTRAL_SAND = REGISTRY.register("astral_sand", AstralSandBlock::new);
		RUINED_ENCHANTING_TABLE = REGISTRY.register("ruined_enchanting_table", RuinedEnchantingTableBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}