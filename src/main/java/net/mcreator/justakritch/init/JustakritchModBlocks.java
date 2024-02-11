
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justakritch.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.justakritch.block.QuicksandBlock;
import net.mcreator.justakritch.block.OilBlock;
import net.mcreator.justakritch.block.CleanedGlassBlock;
import net.mcreator.justakritch.JustakritchMod;

public class JustakritchModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JustakritchMod.MODID);
	public static final RegistryObject<Block> QUICKSAND = REGISTRY.register("quicksand", () -> new QuicksandBlock());
	public static final RegistryObject<Block> OIL = REGISTRY.register("oil", () -> new OilBlock());
	public static final RegistryObject<Block> CLEANED_GLASS = REGISTRY.register("cleaned_glass", () -> new CleanedGlassBlock());
}
