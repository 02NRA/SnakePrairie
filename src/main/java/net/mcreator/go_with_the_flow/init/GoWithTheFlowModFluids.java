
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.go_with_the_flow.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.go_with_the_flow.fluid.QuicksandFluid;
import net.mcreator.go_with_the_flow.fluid.OilFluid;
import net.mcreator.go_with_the_flow.GoWithTheFlowMod;

public class GoWithTheFlowModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, GoWithTheFlowMod.MODID);
	public static final RegistryObject<FlowingFluid> QUICKSAND = REGISTRY.register("quicksand", () -> new QuicksandFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_QUICKSAND = REGISTRY.register("flowing_quicksand", () -> new QuicksandFluid.Flowing());
	public static final RegistryObject<FlowingFluid> OIL = REGISTRY.register("oil", () -> new OilFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_OIL = REGISTRY.register("flowing_oil", () -> new OilFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(QUICKSAND.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_QUICKSAND.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_OIL.get(), RenderType.translucent());
		}
	}
}
