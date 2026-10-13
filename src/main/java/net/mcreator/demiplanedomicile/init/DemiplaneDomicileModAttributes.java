/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.demiplanedomicile.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.demiplanedomicile.DemiplaneDomicileMod;

@EventBusSubscriber
public class DemiplaneDomicileModAttributes {
	public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(BuiltInRegistries.ATTRIBUTE, DemiplaneDomicileMod.MODID);
	public static final DeferredHolder<Attribute, Attribute> PREVIOUS_DIMENSION = REGISTRY.register("previous_dimension",
			() -> new RangedAttribute("attribute.demiplane_domicile.previous_dimension", 1d, 0d, 5d).setSyncable(true).setSentiment(Attribute.Sentiment.NEUTRAL));
	public static final DeferredHolder<Attribute, Attribute> PREVIOUS_X = REGISTRY.register("previous_x",
			() -> new RangedAttribute("attribute.demiplane_domicile.previous_x", 0d, 0d, 99999999999999990000000d).setSyncable(true).setSentiment(Attribute.Sentiment.NEUTRAL));
	public static final DeferredHolder<Attribute, Attribute> PREVIOUS_Y = REGISTRY.register("previous_y", () -> new RangedAttribute("attribute.demiplane_domicile.previous_y", 0d, 0d, 99999999999999990000000d).setSyncable(true));
	public static final DeferredHolder<Attribute, Attribute> PREVIOUS_Z = REGISTRY.register("previous_z", () -> new RangedAttribute("attribute.demiplane_domicile.previous_z", 0d, 0d, 99999999999999990000000d).setSyncable(true));

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.getTypes().forEach(entity -> event.add(entity, PREVIOUS_DIMENSION));
		event.getTypes().forEach(entity -> event.add(entity, PREVIOUS_X));
		event.getTypes().forEach(entity -> event.add(entity, PREVIOUS_Y));
		event.getTypes().forEach(entity -> event.add(entity, PREVIOUS_Z));
	}
}