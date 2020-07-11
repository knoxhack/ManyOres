package com.knoxhack.moreores.util;

import com.knoxhack.moreores.MoreOres;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig;

public class Config {
	   private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	    public static final General GENERAL = new General(BUILDER);
	    public static final Ores ORES = new Ores(BUILDER);
	    public static final ForgeConfigSpec spec = BUILDER.build();

	    public static class General {
	        public final ForgeConfigSpec.ConfigValue<Boolean> DisabledMod;

	        
	        public General(ForgeConfigSpec.Builder builder) {
	            builder.push("Disable Mod");
	            DisabledMod = builder
	                    .comment("Disables the Mod")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("DisabledMod", false);

	            builder.pop();
	        }
	    }
	    public static class Ores {
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnderOreEnabled;
	        public final ForgeConfigSpec.ConfigValue<Boolean> FlintOreEnabled;
	        public final ForgeConfigSpec.ConfigValue<Boolean> GlowstoneOreEnabled;
	        public final ForgeConfigSpec.ConfigValue<Boolean> GunpowderOreEnabled;
	        
	        
	        public final ForgeConfigSpec.ConfigValue<Integer> EnderOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> EnderOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> EnderOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> EnderOreMaximum;

	        public final ForgeConfigSpec.ConfigValue<Integer> FlintOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> FlintOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> FlintOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> FlintOreMaximum;
	        
	        public final ForgeConfigSpec.ConfigValue<Integer> GlowstoneOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> GlowstoneOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> GlowstoneOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> GlowstoneOreMaximum;
	        
	        public final ForgeConfigSpec.ConfigValue<Integer> GunpowderOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> GunpowderOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> GunpowderOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> GunpowderOreMaximum;
	        
	        public Ores(ForgeConfigSpec.Builder builder) {
	            builder.push("Ender Ore");
	            EnderOreEnabled = builder
	                    .comment("Enables/Disables the Ender Ore block [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnderOreEnabled", true);
	            
	            EnderOreCount = builder
	                    .comment("Changes the amount of Ender Ore on each vein")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("EnderOreCount", 20, 0, 100);     
	            
	            EnderOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Ender Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("EnderOreBottonOffSet", 5, 0, 100); 
	            
	            EnderOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Ender ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("EnderOreTopOffSet", 0, 0, 100); 
	            
	            EnderOreMaximum = builder
	                    .comment("Changes the highest Y level that the Ender Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("EnderOreMaximum", 25, 0, 100); 
	            builder.pop();

	            builder.push("Flint Ore");
	            FlintOreEnabled = builder
	                    .comment("Enables/Disables the Flint Ore block [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("FlintOreEnabled", true);
	            
	            FlintOreCount = builder
	                    .comment("Changes the amount of Flint Ore on each vein")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("FlintOreCount", 20, 0, 100);     
	            
	            FlintOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Flint Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("FlintOreBottonOffSet", 5, 0, 100); 
	            
	            FlintOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Flint ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("FlintOreTopOffSet", 0, 0, 100); 
	            
	            FlintOreMaximum = builder
	                    .comment("Changes the highest Y level that the Flint Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("FlintOreMaximum", 25, 0, 100); 
	            builder.pop();

	            builder.push("Glowstone Ore");
	            GlowstoneOreEnabled = builder
	                    .comment("Enables/Disables the Glowstone Ore block [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("GlowstoneOreEnabled", true);
	            
	            GlowstoneOreCount = builder
	                    .comment("Changes the amount of Glowstone Ore on each vein")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("GlowstoneOreCount", 20, 0, 100);     
	            
	            GlowstoneOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Glowstone Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("GlowstoneOreBottonOffSet", 5, 0, 100); 
	            
	            GlowstoneOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Glowstone ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("GlowstoneOreTopOffSet", 0, 0, 100); 
	            
	            GlowstoneOreMaximum = builder
	                    .comment("Changes the highest Y level that the Glowstone Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("GlowstoneOreMaximum", 25, 0, 100); 
	            builder.pop();

	            builder.push("Gunpowder ore");
	            GunpowderOreEnabled = builder
	                    .comment("Enables/Disables the Gunpowder Ore block [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("GunpowderOreEnabled", true);
	            
	            GunpowderOreCount = builder
	                    .comment("Changes the amount of Gunpowder Ore on each vein")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("GunpowderOreCount", 20, 0, 100);     
	            
	            GunpowderOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Gunpowder Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("GunpowderOreBottonOffSet", 5, 0, 100); 
	            
	            GunpowderOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Gunpowder ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("GunpowderOreTopOffSet", 0, 0, 100); 
	            
	            GunpowderOreMaximum = builder
	                    .comment("Changes the highest Y level that the Gunpowder Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("GunpowderOreMaximum", 25, 0, 100); 
	            
	            builder.pop();
	        }
	    }
	    
	    @SubscribeEvent
	    public static void onLoad(final ModConfig.Loading event) {
	    	
	    }
	    
	    @SubscribeEvent
	    public static void onFileChange(final ModConfig.Reloading event) {
	    	
	    }
	}
