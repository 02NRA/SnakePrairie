
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thenewworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thenewworld.block.RuinedEnchantingTableBlock;
import net.mcreator.thenewworld.block.AstralSandBlock;
import net.mcreator.thenewworld.TheNewWorldMod;

public class TheNewWorldModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheNewWorldMod.MODID);
	public static final RegistryObject<Block> RUINED_ENCHANTING_TABLE = REGISTRY.register("ruined_enchanting_table", () -> new RuinedEnchantingTableBlock());
	public static final RegistryObject<Block> ASTRAL_SAND = REGISTRY.register("astral_sand", () -> new AstralSandBlock());
}
