package net.mcreator.go_with_the_flow.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.go_with_the_flow.init.GoWithTheFlowModFluids;

public class OilItem extends BucketItem {
	public OilItem() {
		super(GoWithTheFlowModFluids.OIL.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}