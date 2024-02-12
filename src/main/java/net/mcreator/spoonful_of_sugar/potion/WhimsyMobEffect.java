
package net.mcreator.spoonful_of_sugar.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class WhimsyMobEffect extends MobEffect {
	public WhimsyMobEffect() {
		super(MobEffectCategory.NEUTRAL, -65343);
	}

	@Override
	public String getDescriptionId() {
		return "effect.spoonful_of_sugar.whimsy";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
