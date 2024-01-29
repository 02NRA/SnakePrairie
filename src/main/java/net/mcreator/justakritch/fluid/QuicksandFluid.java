
package net.mcreator.justakritch.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.justakritch.init.JustakritchModItems;
import net.mcreator.justakritch.init.JustakritchModFluids;
import net.mcreator.justakritch.init.JustakritchModFluidTypes;
import net.mcreator.justakritch.init.JustakritchModBlocks;

public abstract class QuicksandFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> JustakritchModFluidTypes.QUICKSAND_TYPE.get(), () -> JustakritchModFluids.QUICKSAND.get(), () -> JustakritchModFluids.FLOWING_QUICKSAND.get())
			.explosionResistance(100f).tickRate(20).bucket(() -> JustakritchModItems.QUICKSAND_BUCKET.get()).block(() -> (LiquidBlock) JustakritchModBlocks.QUICKSAND.get());

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
