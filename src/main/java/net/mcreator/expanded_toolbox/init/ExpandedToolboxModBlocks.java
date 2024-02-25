
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.expanded_toolbox.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.expanded_toolbox.block.LameCleanedGlassBlock;
import net.mcreator.expanded_toolbox.block.CleanedGlassBlock;
import net.mcreator.expanded_toolbox.ExpandedToolboxMod;

public class ExpandedToolboxModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ExpandedToolboxMod.MODID);
	public static final RegistryObject<Block> CLEANED_GLASS = REGISTRY.register("cleaned_glass", () -> new CleanedGlassBlock());
	public static final RegistryObject<Block> LAME_CLEANED_GLASS = REGISTRY.register("lame_cleaned_glass", () -> new LameCleanedGlassBlock());
}
