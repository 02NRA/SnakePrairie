/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.go_with_the_flow.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.go_with_the_flow.block.QuicksandBlock;
import net.mcreator.go_with_the_flow.block.OilShaleBlock;
import net.mcreator.go_with_the_flow.block.OilBlock;
import net.mcreator.go_with_the_flow.GoWithTheFlowMod;

public class GoWithTheFlowModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(GoWithTheFlowMod.MODID);
	public static final DeferredBlock<Block> QUICKSAND;
	public static final DeferredBlock<Block> OIL;
	public static final DeferredBlock<Block> OIL_SHALE;
	static {
		QUICKSAND = REGISTRY.register("quicksand", QuicksandBlock::new);
		OIL = REGISTRY.register("oil", OilBlock::new);
		OIL_SHALE = REGISTRY.register("oil_shale", OilShaleBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}