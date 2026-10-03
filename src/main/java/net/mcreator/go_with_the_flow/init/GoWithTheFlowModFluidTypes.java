/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.go_with_the_flow.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.go_with_the_flow.fluid.types.QuicksandFluidType;
import net.mcreator.go_with_the_flow.fluid.types.OilFluidType;
import net.mcreator.go_with_the_flow.GoWithTheFlowMod;

public class GoWithTheFlowModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, GoWithTheFlowMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> QUICKSAND_TYPE = REGISTRY.register("quicksand", QuicksandFluidType::new);
	public static final DeferredHolder<FluidType, FluidType> OIL_TYPE = REGISTRY.register("oil", OilFluidType::new);
}