/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.demiplanedomicile.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.demiplanedomicile.block.entity.SanctumAnimaeBlockEntity;
import net.mcreator.demiplanedomicile.DemiplaneDomicileMod;

@EventBusSubscriber
public class DemiplaneDomicileModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, DemiplaneDomicileMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SanctumAnimaeBlockEntity>> SANCTUM_ANIMAE = register("sanctum_animae", DemiplaneDomicileModBlocks.SANCTUM_ANIMAE, SanctumAnimaeBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SANCTUM_ANIMAE.get(), SidedInvWrapper::new);
	}
}