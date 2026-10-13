package net.mcreator.demiplanedomicile.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class MemoryOnDroppedItemEntityDestroyedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Track = 0;
		Track = Mth.nextInt(RandomSource.create(), 1, 19);
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.11")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.11")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.13")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.13")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.5")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.5")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.blocks")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.blocks")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.cat")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.cat")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.chirp")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.chirp")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.creator")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.creator")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.creator_music_box")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.creator_music_box")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.far")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.far")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.mall")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.mall")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.mellohi")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.mellohi")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.otherside")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.otherside")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.pigstep")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.pigstep")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.precipice")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.precipice")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.relic")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.relic")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.stal")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.stal")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.strad")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.strad")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.wait")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.wait")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
		if (Track == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.ward")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("music_disc.ward")), SoundSource.VOICE, (float) Mth.nextDouble(RandomSource.create(), 0.5, 2),
							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
				}
			}
		}
	}
}