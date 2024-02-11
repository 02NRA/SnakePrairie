
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justakritch.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.justakritch.fluid.types.QuicksandFluidType;
import net.mcreator.justakritch.fluid.types.OilFluidType;
import net.mcreator.justakritch.JustakritchMod;

public class JustakritchModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, JustakritchMod.MODID);
	public static final RegistryObject<FluidType> QUICKSAND_TYPE = REGISTRY.register("quicksand", () -> new QuicksandFluidType());
	public static final RegistryObject<FluidType> OIL_TYPE = REGISTRY.register("oil", () -> new OilFluidType());
}
