/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.go_with_the_flow.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.go_with_the_flow.item.QuicksandItem;
import net.mcreator.go_with_the_flow.item.OilItem;
import net.mcreator.go_with_the_flow.GoWithTheFlowMod;

@EventBusSubscriber
public class GoWithTheFlowModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(GoWithTheFlowMod.MODID);
	public static final DeferredItem<Item> QUICKSAND_BUCKET;
	public static final DeferredItem<Item> OIL_BUCKET;
	public static final DeferredItem<Item> OIL_SHALE;
	static {
		QUICKSAND_BUCKET = REGISTRY.register("quicksand_bucket", QuicksandItem::new);
		OIL_BUCKET = REGISTRY.register("oil_bucket", OilItem::new);
		OIL_SHALE = block(GoWithTheFlowModBlocks.OIL_SHALE);
	}

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), QUICKSAND_BUCKET.get());
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), OIL_BUCKET.get());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}