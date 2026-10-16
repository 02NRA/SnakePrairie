/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.demiplanedomicile.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class DemiplaneDomicileModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DemiplaneDomicileModEntities.BAUBLE_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}