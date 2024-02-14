
package net.mcreator.go_with_the_flow.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.go_with_the_flow.init.GoWithTheFlowModItems;
import net.mcreator.go_with_the_flow.init.GoWithTheFlowModFluids;
import net.mcreator.go_with_the_flow.init.GoWithTheFlowModFluidTypes;
import net.mcreator.go_with_the_flow.init.GoWithTheFlowModBlocks;

public abstract class QuicksandFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> GoWithTheFlowModFluidTypes.QUICKSAND_TYPE.get(), () -> GoWithTheFlowModFluids.QUICKSAND.get(),
			() -> GoWithTheFlowModFluids.FLOWING_QUICKSAND.get()).explosionResistance(100f).tickRate(20).bucket(() -> GoWithTheFlowModItems.QUICKSAND_BUCKET.get()).block(() -> (LiquidBlock) GoWithTheFlowModBlocks.QUICKSAND.get());

	private QuicksandFluid() {
		super(PROPERTIES);
	}

	public static class Source extends QuicksandFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends QuicksandFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
