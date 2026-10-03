/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.go_with_the_flow.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.go_with_the_flow.fluid.QuicksandFluid;
import net.mcreator.go_with_the_flow.fluid.OilFluid;
import net.mcreator.go_with_the_flow.GoWithTheFlowMod;

public class GoWithTheFlowModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, GoWithTheFlowMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> QUICKSAND = REGISTRY.register("quicksand", QuicksandFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_QUICKSAND = REGISTRY.register("flowing_quicksand", QuicksandFluid.Flowing::new);
	public static final DeferredHolder<Fluid, FlowingFluid> OIL = REGISTRY.register("oil", OilFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_OIL = REGISTRY.register("flowing_oil", OilFluid.Flowing::new);

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(QUICKSAND.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_QUICKSAND.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_OIL.get(), RenderType.translucent());
		}
	}
}