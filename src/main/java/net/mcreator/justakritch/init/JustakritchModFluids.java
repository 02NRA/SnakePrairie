
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justakritch.init;

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

import net.mcreator.justakritch.fluid.QuicksandFluid;
import net.mcreator.justakritch.JustakritchMod;

public class JustakritchModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, JustakritchMod.MODID);
	public static final RegistryObject<FlowingFluid> QUICKSAND = REGISTRY.register("quicksand", () -> new QuicksandFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_QUICKSAND = REGISTRY.register("flowing_quicksand", () -> new QuicksandFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(QUICKSAND.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_QUICKSAND.get(), RenderType.translucent());
		}
	}
}
