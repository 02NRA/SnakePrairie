/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.expanded_toolbox.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.expanded_toolbox.block.LameCleanedGlassBlock;
import net.mcreator.expanded_toolbox.block.CleanedGlassBlock;
import net.mcreator.expanded_toolbox.ExpandedToolboxMod;

public class ExpandedToolboxModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ExpandedToolboxMod.MODID);
	public static final DeferredBlock<Block> CLEANED_GLASS;
	public static final DeferredBlock<Block> LAME_CLEANED_GLASS;
	static {
		CLEANED_GLASS = REGISTRY.register("cleaned_glass", CleanedGlassBlock::new);
		LAME_CLEANED_GLASS = REGISTRY.register("lame_cleaned_glass", LameCleanedGlassBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}