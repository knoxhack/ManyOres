package com.knoxhack.moreores.util;

import org.apache.commons.lang3.tuple.Pair;

import com.knoxhack.moreores.MoreOres;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.config.ModConfig;

@EventBusSubscriber(modid = MoreOres.MODID, bus = EventBusSubscriber.Bus.MOD)
public class Config {
	public static final ClientConfig CLIENT;
	public static final ForgeConfigSpec CLIENT_SPEC;
	static {
		final Pair<ClientConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ClientConfig::new);
		CLIENT_SPEC = specPair.getRight();
		CLIENT = specPair.getLeft();
	}

	public static boolean ender_ore;
	public static boolean flint_ore;

	public static int anInt;

	@SubscribeEvent
	public static void onModConfigEvent(final ModConfig.ModConfigEvent configEvent) {
		if (configEvent.getConfig().getSpec() == Config.CLIENT_SPEC) {
			bakeConfig();
		}
	}

	public static void bakeConfig() {
		ender_ore = CLIENT.ender_ore.get();
		ender_ore = CLIENT.flint_ore.get();

		anInt = CLIENT.anInt.get();
	}

	public static class ClientConfig {
		public final BooleanValue ender_ore;
		public final BooleanValue flint_ore;

		public final IntValue anInt;

		public ClientConfig(ForgeConfigSpec.Builder builder) {
			ender_ore = builder
					.comment("Enables Ender Ore Generation")
					.translation(MoreOres.MODID + ".config." + "ender_ore")
					.define("Enable Ender Ore", false);
			
			flint_ore = builder
					.comment("Enables Ender Ore Generation")
					.translation(MoreOres.MODID + ".config." + "flint_ore")
					.define("Enable Ender Ore", false);
			
			
			
			
			builder.push("ender_ore_");
			anInt = builder
					.comment("anInt usage description")
					.translation(MoreOres.MODID + ".config." + "anInt")
					.defineInRange("anInt", 10, 0, 100);
			builder.pop();
		}

	}

}
