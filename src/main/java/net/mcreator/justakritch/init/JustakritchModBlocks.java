
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justakritch.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.justakritch.block.QuicksandBlock;
import net.mcreator.justakritch.JustakritchMod;

public class JustakritchModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JustakritchMod.MODID);
	public static final RegistryObject<Block> QUICKSAND = REGISTRY.register("quicksand", () -> new QuicksandBlock());
}
