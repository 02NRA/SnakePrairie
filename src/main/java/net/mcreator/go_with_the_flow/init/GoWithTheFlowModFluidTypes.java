
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.go_with_the_flow.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.go_with_the_flow.fluid.types.QuicksandFluidType;
import net.mcreator.go_with_the_flow.fluid.types.OilFluidType;
import net.mcreator.go_with_the_flow.GoWithTheFlowMod;

public class GoWithTheFlowModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, GoWithTheFlowMod.MODID);
	public static final RegistryObject<FluidType> QUICKSAND_TYPE = REGISTRY.register("quicksand", () -> new QuicksandFluidType());
	public static final RegistryObject<FluidType> OIL_TYPE = REGISTRY.register("oil", () -> new OilFluidType());
}
