
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.go_with_the_flow.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.go_with_the_flow.block.QuicksandBlock;
import net.mcreator.go_with_the_flow.block.OilBlock;
import net.mcreator.go_with_the_flow.GoWithTheFlowMod;

public class GoWithTheFlowModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GoWithTheFlowMod.MODID);
	public static final RegistryObject<Block> QUICKSAND = REGISTRY.register("quicksand", () -> new QuicksandBlock());
	public static final RegistryObject<Block> OIL = REGISTRY.register("oil", () -> new OilBlock());
}
