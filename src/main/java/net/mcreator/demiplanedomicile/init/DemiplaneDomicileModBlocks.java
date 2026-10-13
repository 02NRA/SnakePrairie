/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.demiplanedomicile.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.demiplanedomicile.block.BlockOfMemoriesBlock;
import net.mcreator.demiplanedomicile.block.BlockOfDreamDustBlock;
import net.mcreator.demiplanedomicile.DemiplaneDomicileMod;

public class DemiplaneDomicileModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DemiplaneDomicileMod.MODID);
	public static final DeferredBlock<Block> BLOCK_OF_DREAM_DUST;
	public static final DeferredBlock<Block> BLOCK_OF_MEMORIES;
	static {
		BLOCK_OF_DREAM_DUST = REGISTRY.register("block_of_dream_dust", BlockOfDreamDustBlock::new);
		BLOCK_OF_MEMORIES = REGISTRY.register("block_of_memories", BlockOfMemoriesBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}