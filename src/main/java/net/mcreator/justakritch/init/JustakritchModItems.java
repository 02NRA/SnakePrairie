
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.justakritch.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.justakritch.item.ToastedSkeweredMarshmallowItem;
import net.mcreator.justakritch.item.SmoreItem;
import net.mcreator.justakritch.item.SlingShotItem;
import net.mcreator.justakritch.item.SkeweredMarshmallowItem;
import net.mcreator.justakritch.item.ShivItem;
import net.mcreator.justakritch.item.QuicksandItem;
import net.mcreator.justakritch.item.PotionOfGlowItem;
import net.mcreator.justakritch.item.PebbleItem;
import net.mcreator.justakritch.item.CookedEggItem;
import net.mcreator.justakritch.JustakritchMod;

public class JustakritchModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JustakritchMod.MODID);
	public static final RegistryObject<Item> QUICKSAND_BUCKET = REGISTRY.register("quicksand_bucket", () -> new QuicksandItem());
	public static final RegistryObject<Item> SHIV = REGISTRY.register("shiv", () -> new ShivItem());
	public static final RegistryObject<Item> POTION_OF_GLOW = REGISTRY.register("potion_of_glow", () -> new PotionOfGlowItem());
	public static final RegistryObject<Item> COOKED_EGG = REGISTRY.register("cooked_egg", () -> new CookedEggItem());
	public static final RegistryObject<Item> PEBBLE = REGISTRY.register("pebble", () -> new PebbleItem());
	public static final RegistryObject<Item> SLING_SHOT = REGISTRY.register("sling_shot", () -> new SlingShotItem());
	public static final RegistryObject<Item> SKEWERED_MARSHMALLOW = REGISTRY.register("skewered_marshmallow", () -> new SkeweredMarshmallowItem());
	public static final RegistryObject<Item> TOASTED_SKEWERED_MARSHMALLOW = REGISTRY.register("toasted_skewered_marshmallow", () -> new ToastedSkeweredMarshmallowItem());
	public static final RegistryObject<Item> SMORE = REGISTRY.register("smore", () -> new SmoreItem());
}
