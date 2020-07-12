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
	                    .comment("Enables/Disables the mod [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("DisabledMod", false);

	            builder.pop();
	        }
	    }
	    public static class Ores {
	    	
	    	public final ForgeConfigSpec.ConfigValue<Boolean> EnabledEnderOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> EnderOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> EnderOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> EnderOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> EnderOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> EnderOreVeinSize;


	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledFlintOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> FlintOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> FlintOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> FlintOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> FlintOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> FlintOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledGlowstoneOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> GlowstoneOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> GlowstoneOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> GlowstoneOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> GlowstoneOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> GlowstoneOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledGunpowderOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> GunpowderOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> GunpowderOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> GunpowderOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> GunpowderOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> GunpowderOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledBeefOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> BeefOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> BeefOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> BeefOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> BeefOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> BeefOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledBlazeOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> BlazeOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> BlazeOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> BlazeOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> BlazeOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> BlazeOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledBoneOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> BoneOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> BoneOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> BoneOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> BoneOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> BoneOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledCarrotOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> CarrotOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> CarrotOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> CarrotOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> CarrotOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> CarrotOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledChickenOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> ChickenOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> ChickenOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> ChickenOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> ChickenOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> ChickenOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledFeatherOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> FeatherOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> FeatherOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> FeatherOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> FeatherOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> FeatherOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledFishOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> FishOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> FishOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> FishOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> FishOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> FishOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledMagmaOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> MagmaOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> MagmaOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> MagmaOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> MagmaOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> MagmaOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledMelonOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> MelonOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> MelonOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> MelonOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> MelonOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> MelonOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledPorckchopOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> PorckchopOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> PorckchopOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> PorckchopOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> PorckchopOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> PorckchopOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledPotatoOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> PotatoOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> PotatoOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> PotatoOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> PotatoOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> PotatoOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledPrismarineOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> PrismarineOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> PrismarineOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> PrismarineOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> PrismarineOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> PrismarineOreVeinSize;

	        
	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledRottenOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> RottenOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> RottenOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> RottenOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> RottenOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> RottenOreVeinSize;

	        
	        public final ForgeConfigSpec.ConfigValue<Boolean> EnabledSlimeOre;
	        public final ForgeConfigSpec.ConfigValue<Integer> SlimeOreCount;
	        public final ForgeConfigSpec.ConfigValue<Integer> SlimeOreBottonOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> SlimeOreTopOffSet;
	        public final ForgeConfigSpec.ConfigValue<Integer> SlimeOreMaximum;
	        public final ForgeConfigSpec.ConfigValue<Integer> SlimeOreVeinSize;

	        
	        public Ores(ForgeConfigSpec.Builder builder) {
	        	
	            builder.push("Ender Ore");
	            EnabledEnderOre = builder
	                    .comment("Enables/Disables the Ender Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config")
	                    .define("EnabledEnderOre", true);

	            EnderOreVeinSize = builder
	                    .comment("Changes the amount of Ender Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("EnderOreVienSize", 4, 0, 50);     
	            
	            EnderOreCount = builder
	                    .comment("Changes how common the Ender Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("EnderOreCount", 3, 0, 100); 
	            
	            EnderOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Ender Ore can spawn")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("EnderOreBottonOffSet", 5, 0, 100); 
	            
	            EnderOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Ender ore")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("EnderOreTopOffSet", 0, 0, 100); 
	            
	            EnderOreMaximum = builder
	                    .comment("Changes the highest Y level that the Ender Ore can spawn")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("EnderOreMaximum", 15, 0, 200); 
	            builder.pop();

	            builder.push("Flint Ore");
	            EnabledFlintOre = builder
	                    .comment("Enables/Disables the Flint Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledFlintOre", true);
	            
	            FlintOreVeinSize = builder
	                    .comment("Changes the amount of Flint Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("FlintOreVienSize", 8, 0, 50); 
	            
	            FlintOreCount = builder
	                    .comment("Changes how common the Flint Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("FlintOreCount", 10, 0, 100);     
	            
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
	                    .defineInRange("FlintOreMaximum", 75, 0, 200); 
	            builder.pop();

	            builder.push("Glowstone Ore");
	            EnabledGlowstoneOre = builder
	                    .comment("Enables/Disables the Ender Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledGlowstoneOre", true);
	            
	            GlowstoneOreVeinSize = builder
	                    .comment("Changes the amount of Glowstone Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("GlowstoneOreVienSize", 4, 0, 50); 

	            GlowstoneOreCount = builder
	                    .comment("Changes how common the Glowstone Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("GlowstoneOreCount", 3, 0, 100);     
	            
	            GlowstoneOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Glowstone Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("GlowstoneOreBottonOffSet", 1, 0, 100); 
	            
	            GlowstoneOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Glowstone ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("GlowstoneOreTopOffSet", 0, 0, 100); 
	            
	            GlowstoneOreMaximum = builder
	                    .comment("Changes the highest Y level that the Glowstone Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("GlowstoneOreMaximum", 10, 0, 200); 
	            builder.pop();

	            builder.push("Gunpowder ore");
	            EnabledGunpowderOre = builder
	                    .comment("Enables/Disables the Ender Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledGunpowderOre", true);
	            
	           GunpowderOreVeinSize = builder
	                    .comment("Changes the amount of Gunpowder Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("GunpowderOreVienSize", 4, 0, 50); 
	            
	            GunpowderOreCount = builder
	                    .comment("Changes how common the Gunpowder Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("GunpowderOreCount", 3, 0, 100);     
	            
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
	                    .defineInRange("GunpowderOreMaximum", 15, 0, 200); 
	            
	            builder.pop();
	            
	            builder.push("Beef Ore");
	            EnabledBeefOre = builder
	                    .comment("Enables/Disables the Beef Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledBeefOre", false);
	            
	            BeefOreVeinSize = builder
	                    .comment("Changes the amount of Beef Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("BeefOreVienSize", 6, 0, 50); 

	            BeefOreCount = builder
	                    .comment("Changes how common the Beef Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("BeefOreCount", 10, 0, 100);     
	            
	            BeefOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Beef Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("BeefOreBottonOffSet", 5, 0, 100); 
	            
	            BeefOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Beef ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("BeefOreTopOffSet", 0, 0, 100); 
	            
	            BeefOreMaximum = builder
	                    .comment("Changes the highest Y level that the Beef Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("BeefOreMaximum", 75, 0, 200); 
	            builder.pop();
	            
	            builder.push("Blaze Ore");
	            EnabledBlazeOre = builder
	                    .comment("Enables/Disables the Blaze Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledBlazeOre", true);
	            
	            BlazeOreVeinSize = builder
	                    .comment("Changes the amount of Blaze Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("BlazeOreVienSize", 4, 0, 50); 

	            BlazeOreCount = builder
	                    .comment("Changes how common the Blaze Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("BlazeOreCount", 3, 0, 100);     
	            
	            BlazeOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Blaze Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("BlazeOreBottonOffSet", 1, 0, 100); 
	            
	            BlazeOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Blaze ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("BlazeOreTopOffSet", 0, 0, 100); 
	            
	            BlazeOreMaximum = builder
	                    .comment("Changes the highest Y level that the Blaze Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("BlazeOreMaximum", 10, 0, 200); 
	            builder.pop();
	            
	            builder.push("Bone Ore");
	            EnabledBoneOre = builder
	                    .comment("Enables/Disables the Bone Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledBoneOre", true);
	            
	            BoneOreVeinSize = builder
	                    .comment("Changes the amount of Bone Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("BoneOreVienSize", 8, 0, 50); 

	            BoneOreCount = builder
	                    .comment("Changes how common the Bone Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("BoneOreCount", 10, 0, 100);     
	            
	            BoneOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Bone Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("BoneOreBottonOffSet", 5, 0, 100); 
	            
	            BoneOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Bone ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("BoneOreTopOffSet", 0, 0, 100); 
	            
	            BoneOreMaximum = builder
	                    .comment("Changes the highest Y level that the Bone Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("BoneOreMaximum", 75, 0, 200); 
	            builder.pop();
	            
	            builder.push("Carrot Ore");
	            EnabledCarrotOre = builder
	                    .comment("Enables/Disables the Carrot Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledCarrotOre", false);
	            
	            CarrotOreVeinSize = builder
	                    .comment("Changes the amount of Carrot Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("CarrotOreVienSize", 6, 0, 50); 

	            CarrotOreCount = builder
	                    .comment("Changes how common the Carrot Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("CarrotOreCount", 10, 0, 100);     
	            
	            CarrotOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Carrot Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("CarrotOreBottonOffSet", 5, 0, 100); 
	            
	            CarrotOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Carrot ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("CarrotOreTopOffSet", 0, 0, 100); 
	            
	            CarrotOreMaximum = builder
	                    .comment("Changes the highest Y level that the Carrot Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("CarrotOreMaximum", 75, 0, 200); 
	            builder.pop();
	            
	            builder.push("Chicken Ore");
	            EnabledChickenOre = builder
	                    .comment("Enables/Disables the Chicken Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledChickenOre", false);
	            
	            ChickenOreVeinSize = builder
	                    .comment("Changes the amount of Chicken Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("ChickenOreVienSize", 6, 0, 50); 

	            ChickenOreCount = builder
	                    .comment("Changes how common the Chicken Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("ChickenOreCount", 10, 0, 100);     
	            
	            ChickenOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Chicken Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("ChickenOreBottonOffSet", 5, 0, 100); 
	            
	            ChickenOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Chicken ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("ChickenOreTopOffSet", 0, 0, 100); 
	            
	            ChickenOreMaximum = builder
	                    .comment("Changes the highest Y level that the Chicken Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("ChickenOreMaximum", 75, 0, 200); 
	            builder.pop();
	            
	            builder.push("Feather Ore");
	            EnabledFeatherOre = builder
	                    .comment("Enables/Disables the Feather Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledFeatherOre", false);
	            
	            FeatherOreVeinSize = builder
	                    .comment("Changes the amount of Feather Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("FeatherOreVienSize", 8, 0, 50); 

	            FeatherOreCount = builder
	                    .comment("Changes how common the Feather Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("FeatherOreCount", 10, 0, 100);     
	            
	            FeatherOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Feather Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("FeatherOreBottonOffSet", 5, 0, 100); 
	            
	            FeatherOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Feather ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("FeatherOreTopOffSet", 0, 0, 100); 
	            
	            FeatherOreMaximum = builder
	                    .comment("Changes the highest Y level that the Feather Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("FeatherOreMaximum", 75, 0, 200); 
	            builder.pop();
	            
	            builder.push("Fish Ore");
	            EnabledFishOre = builder
	                    .comment("Enables/Disables the Fish Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledFishOre", false);
	            
	            FishOreVeinSize = builder
	                    .comment("Changes the amount of Fish Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("FishOreVienSize", 6, 0, 50); 

	            FishOreCount = builder
	                    .comment("Changes how common the Fish Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("FishOreCount", 10, 0, 100);     
	            
	            FishOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Fish Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("FishOreBottonOffSet", 5, 0, 100); 
	            
	            FishOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Fish ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("FishOreTopOffSet", 0, 0, 100); 
	            
	            FishOreMaximum = builder
	                    .comment("Changes the highest Y level that the Fish Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("FishOreMaximum", 75, 0, 200); 
	            builder.pop();
	            
	            builder.push("Magma Ore");
	            EnabledMagmaOre = builder
	                    .comment("Enables/Disables the Magma Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledMagmaOre", true);
	            
	            MagmaOreVeinSize = builder
	                    .comment("Changes the amount of Magma Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("MagmaOreVienSize", 4, 0, 50); 

	            MagmaOreCount = builder
	                    .comment("Changes how common the Magma Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("MagmaOreCount", 3, 0, 100);     
	            
	            MagmaOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Magma Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("MagmaOreBottonOffSet", 1, 0, 100); 
	            
	            MagmaOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Magma ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("MagmaOreTopOffSet", 0, 0, 100); 
	            
	            MagmaOreMaximum = builder
	                    .comment("Changes the highest Y level that the Magma Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("MagmaOreMaximum", 10, 0, 200); 
	            builder.pop();
	            
	            builder.push("Melon Ore");
	            EnabledMelonOre = builder
	                    .comment("Enables/Disables the Melon Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledMelonOre", false);
	            
	            MelonOreVeinSize = builder
	                    .comment("Changes the amount of Melon Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("MelonOreVienSize", 6, 0, 50); 

	            MelonOreCount = builder
	                    .comment("Changes how common the Melon Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("MelonOreCount", 10, 0, 100);     
	            
	            MelonOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Melon Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("MelonOreBottonOffSet", 5, 0, 100); 
	            
	            MelonOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Melon ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("MelonOreTopOffSet", 0, 0, 100); 
	            
	            MelonOreMaximum = builder
	                    .comment("Changes the highest Y level that the Melon Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("MelonOreMaximum", 75, 0, 200); 
	            builder.pop();
	            
	            builder.push("Porckchop Ore");
	            EnabledPorckchopOre = builder
	                    .comment("Enables/Disables the Porckchop Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledPorckchopOre", false);
	            
	            PorckchopOreVeinSize = builder
	                    .comment("Changes the amount of Porckchop Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("PorckchopOreVienSize", 6, 0, 50); 

	            PorckchopOreCount = builder
	                    .comment("Changes how common the Porckchop Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("PorckchopOreCount", 10, 0, 100);     
	            
	            PorckchopOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Porckchop Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("PorckchopOreBottonOffSet", 5, 0, 100); 
	            
	            PorckchopOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Porckchop ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("PorckchopOreTopOffSet", 0, 0, 100); 
	            
	            PorckchopOreMaximum = builder
	                    .comment("Changes the highest Y level that the Porckchop Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("PorckchopOreMaximum", 75, 0, 200); 
	            builder.pop();
	            
	            builder.push("Potato Ore");
	            EnabledPotatoOre = builder
	                    .comment("Enables/Disables the Potato Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledPotatoOre", false);
	            
	            PotatoOreVeinSize = builder
	                    .comment("Changes the amount of Potato Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("PotatoOreVienSize", 6, 0, 50); 

	            PotatoOreCount = builder
	                    .comment("Changes how common the Potato Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("PotatoOreCount", 10, 0, 100);     
	            
	            PotatoOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Potato Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("PotatoOreBottonOffSet", 5, 0, 100); 
	            
	            PotatoOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Potato ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("PotatoOreTopOffSet", 0, 0, 100); 
	            
	            PotatoOreMaximum = builder
	                    .comment("Changes the highest Y level that the Potato Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("PotatoOreMaximum", 75, 0, 200); 
	            builder.pop();
	            
	            builder.push("Prismarine Ore");
	            EnabledPrismarineOre = builder
	                    .comment("Enables/Disables the Prismarine Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledPrismarineOre", true);
	            
	            PrismarineOreVeinSize = builder
	                    .comment("Changes the amount of Prismarine Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("PrismarineOreVienSize", 4, 0, 50); 

	            PrismarineOreCount = builder
	                    .comment("Changes how common the Prismarine Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("PrismarineOreCount", 3, 0, 100);     
	            
	            PrismarineOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Prismarine Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("PrismarineOreBottonOffSet", 5, 0, 100); 
	            
	            PrismarineOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Prismarine ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("PrismarineOreTopOffSet", 0, 0, 100); 
	            
	            PrismarineOreMaximum = builder
	                    .comment("Changes the highest Y level that the Prismarine Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("PrismarineOreMaximum", 15, 0, 200); 
	            builder.pop();
	            
	            builder.push("Rotten Ore");
	            EnabledRottenOre = builder
	                    .comment("Enables/Disables the Rotten Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledRottenOre", true);
	            
	            RottenOreVeinSize = builder
	                    .comment("Changes the amount of Rotten Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("RottenOreVienSize", 8, 0, 50); 

	            RottenOreCount = builder
	                    .comment("Changes how common the Rotten Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("RottenOreCount", 10, 0, 100);     
	            
	            RottenOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Rotten Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("RottenOreBottonOffSet", 5, 0, 100); 
	            
	            RottenOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Rotten ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("RottenOreTopOffSet", 0, 0, 100); 
	            
	            RottenOreMaximum = builder
	                    .comment("Changes the highest Y level that the Rotten Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("RottenOreMaximum", 75, 0, 200); 
	            builder.pop();
	            
	            builder.push("Slime Ore");
	            EnabledSlimeOre = builder
	                    .comment("Enables/Disables the Slime Ore block from generating in the world [false/true|default:true]")
	                    .translation(MoreOres.MODID + ".config.")
	                    .define("EnabledSlimeOre", true);
	            
	            SlimeOreVeinSize = builder
	                    .comment("Changes the amount of Slime Ore on each vein")
	                    .translation(MoreOres.MODID + ".config")
	                    .defineInRange("SlimeOreVienSize", 4, 0, 50); 

	            SlimeOreCount = builder
	                    .comment("Changes how common the Slime Ore block will generate in the world")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("SlimeOreCount", 3, 0, 100);     
	            
	            SlimeOreBottonOffSet = builder
	                    .comment("Changes the lowest Y level that the Slime Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("SlimeOreBottonOffSet", 5, 0, 100); 
	            
	            SlimeOreTopOffSet = builder
	                    .comment("Changes the Top Off Set block for Slime ore")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("SlimeOreTopOffSet", 0, 0, 100); 
	            
	            SlimeOreMaximum = builder
	                    .comment("Changes the highest Y level that the Slime Ore can spawn")
	                    .translation(MoreOres.MODID + ".config.")
	                    .defineInRange("SlimeOreMaximum", 75, 0, 200); 
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
