
package net.mcreator.go_with_the_flow.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.go_with_the_flow.init.GoWithTheFlowModItems;
import net.mcreator.go_with_the_flow.init.GoWithTheFlowModFluids;
import net.mcreator.go_with_the_flow.init.GoWithTheFlowModFluidTypes;
import net.mcreator.go_with_the_flow.init.GoWithTheFlowModBlocks;

public abstract class OilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> GoWithTheFlowModFluidTypes.OIL_TYPE.get(), () -> GoWithTheFlowModFluids.OIL.get(), () -> GoWithTheFlowModFluids.FLOWING_OIL.get())
			.explosionResistance(50f).tickRate(10).bucket(() -> GoWithTheFlowModItems.OIL_BUCKET.get()).block(() -> (LiquidBlock) GoWithTheFlowModBlocks.OIL.get());

	private OilFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.SQUID_INK;
	}

	public static class Source extends OilFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends OilFluid {
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
