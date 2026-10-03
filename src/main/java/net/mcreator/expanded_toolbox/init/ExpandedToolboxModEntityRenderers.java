/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.expanded_toolbox.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class ExpandedToolboxModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ExpandedToolboxModEntities.PEBBLE_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}