
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.go_with_the_flow.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.go_with_the_flow.item.QuicksandItem;
import net.mcreator.go_with_the_flow.item.OilItem;
import net.mcreator.go_with_the_flow.GoWithTheFlowMod;

public class GoWithTheFlowModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GoWithTheFlowMod.MODID);
	public static final RegistryObject<Item> QUICKSAND_BUCKET = REGISTRY.register("quicksand_bucket", () -> new QuicksandItem());
	public static final RegistryObject<Item> OIL_BUCKET = REGISTRY.register("oil_bucket", () -> new OilItem());
	public static final RegistryObject<Item> OIL_SHALE = block(GoWithTheFlowModBlocks.OIL_SHALE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
