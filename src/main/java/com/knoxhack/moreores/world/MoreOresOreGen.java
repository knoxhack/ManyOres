package com.knoxhack.moreores.world;

import com.knoxhack.moreores.blocks.ModBlocks;
import com.knoxhack.moreores.util.Config;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class MoreOresOreGen {

	public static void generateEnderOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigEnderOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.EnderOreCount.get(), Config.ORES.EnderOreBottonOffSet.get(), 
								Config.ORES.EnderOreTopOffSet.get(), Config.ORES.GlowstoneOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.ENDER_ORE.getDefaultState(), Config.ORES.EnderOreVeinSize.get()))
						.withPlacement(customConfigEnderOre));
	
		}
		
	}
	
	public static void generateFlintOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigFlintOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.FlintOreCount.get(), Config.ORES.FlintOreBottonOffSet.get(), 
								Config.ORES.FlintOreTopOffSet.get(), Config.ORES.FlintOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.FLINT_ORE.getDefaultState(), Config.ORES.FlintOreVeinSize.get()))
						.withPlacement(customConfigFlintOre));
				
		}
		
	}
	
	public static void generateGlowstoneOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigGlowstoneOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.GlowstoneOreCount.get(), Config.ORES.GlowstoneOreBottonOffSet.get(), 
								Config.ORES.GlowstoneOreTopOffSet.get(), Config.ORES.GlowstoneOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.GLOWSTONE_ORE.getDefaultState(), Config.ORES.GlowstoneOreVeinSize.get()))
						.withPlacement(customConfigGlowstoneOre));
				
		}
		
	}
	
	public static void generateGunpowderOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigGunpowderOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.GunpowderOreCount.get(), Config.ORES.GunpowderOreBottonOffSet.get(), 
								Config.ORES.GunpowderOreTopOffSet.get(), Config.ORES.GunpowderOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.GUNPOWDER_ORE.getDefaultState(), Config.ORES.GunpowderOreVeinSize.get()))
						.withPlacement(customConfigGunpowderOre));
				
		}
		
	}
	
	public static void generateBeefOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigBeefOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.BeefOreCount.get(), Config.ORES.BeefOreBottonOffSet.get(), 
								Config.ORES.BeefOreTopOffSet.get(), Config.ORES.BeefOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.BEEF_ORE.getDefaultState(), Config.ORES.BeefOreVeinSize.get()))
						.withPlacement(customConfigBeefOre));
	
		}
		
	}
	
	public static void generateBlazeOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigBlazeOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.BlazeOreCount.get(), Config.ORES.BlazeOreBottonOffSet.get(), 
								Config.ORES.BlazeOreTopOffSet.get(), Config.ORES.BlazeOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.BLAZE_ORE.getDefaultState(), Config.ORES.BlazeOreVeinSize.get()))
						.withPlacement(customConfigBlazeOre));
	
		}
		
	}
	
	public static void generateBoneOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigBoneOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.BoneOreCount.get(), Config.ORES.BoneOreBottonOffSet.get(), 
								Config.ORES.BoneOreTopOffSet.get(), Config.ORES.BoneOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.BONE_ORE.getDefaultState(), Config.ORES.BoneOreVeinSize.get()))
						.withPlacement(customConfigBoneOre));
	
		}
		
	}
	
	public static void generateCarrotOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigCarrotOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.CarrotOreCount.get(), Config.ORES.CarrotOreBottonOffSet.get(), 
								Config.ORES.CarrotOreTopOffSet.get(), Config.ORES.CarrotOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.CARROT_ORE.getDefaultState(), Config.ORES.CarrotOreVeinSize.get()))
						.withPlacement(customConfigCarrotOre));
	
		}
		
	}
	
	public static void generateChickenOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigChickenOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.ChickenOreCount.get(), Config.ORES.ChickenOreBottonOffSet.get(), 
								Config.ORES.ChickenOreTopOffSet.get(), Config.ORES.ChickenOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.CHICKEN_ORE.getDefaultState(), Config.ORES.ChickenOreVeinSize.get()))
						.withPlacement(customConfigChickenOre));
	
		}
		
	}
	
	public static void generateFeatherOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigFeatherOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.FeatherOreCount.get(), Config.ORES.FeatherOreBottonOffSet.get(), 
								Config.ORES.FeatherOreTopOffSet.get(), Config.ORES.FeatherOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.FEATHER_ORE.getDefaultState(), Config.ORES.FeatherOreVeinSize.get()))
						.withPlacement(customConfigFeatherOre));
	
		}
		
	}
	
	public static void generateFishOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigFishOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.FishOreCount.get(), Config.ORES.FishOreBottonOffSet.get(), 
								Config.ORES.FishOreTopOffSet.get(), Config.ORES.FishOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.FISH_ORE.getDefaultState(), Config.ORES.FishOreVeinSize.get()))
						.withPlacement(customConfigFishOre));
	
		}
		
	}
	
	public static void generateMagmaOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigMagmaOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.MagmaOreCount.get(), Config.ORES.MagmaOreBottonOffSet.get(), 
								Config.ORES.MagmaOreTopOffSet.get(), Config.ORES.MagmaOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.MAGMA_ORE.getDefaultState(), Config.ORES.MagmaOreVeinSize.get()))
						.withPlacement(customConfigMagmaOre));
	
		}
		
	}
	
	public static void generateMelonOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigMelonOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.MelonOreCount.get(), Config.ORES.MelonOreBottonOffSet.get(), 
								Config.ORES.MelonOreTopOffSet.get(), Config.ORES.MelonOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.MELON_ORE.getDefaultState(), Config.ORES.MelonOreVeinSize.get()))
						.withPlacement(customConfigMelonOre));
	
		}
		
	}
	
	public static void generatePorckchopOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigEnderOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.PorckchopOreCount.get(), Config.ORES.PorckchopOreBottonOffSet.get(), 
								Config.ORES.PorckchopOreTopOffSet.get(), Config.ORES.PorckchopOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.PORKCHOP_ORE.getDefaultState(), Config.ORES.PorckchopOreVeinSize.get()))
						.withPlacement(customConfigEnderOre));
	
		}
		
	}
	
	public static void generatePotatoOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigEnderOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.PotatoOreCount.get(), Config.ORES.PotatoOreBottonOffSet.get(), 
								Config.ORES.PotatoOreTopOffSet.get(), Config.ORES.PotatoOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.POTATO_ORE.getDefaultState(), Config.ORES.PotatoOreVeinSize.get()))
						.withPlacement(customConfigEnderOre));
	
		}
		
	}
	
	public static void generatePrismarineOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigEnderOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.PrismarineOreCount.get(), Config.ORES.PrismarineOreBottonOffSet.get(), 
								Config.ORES.PrismarineOreTopOffSet.get(), Config.ORES.PrismarineOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.PRISMARINE_ORE.getDefaultState(), Config.ORES.PrismarineOreVeinSize.get()))
						.withPlacement(customConfigEnderOre));
	
		}
		
	}
	
	public static void generateRottenOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigEnderOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.RottenOreCount.get(), Config.ORES.RottenOreBottonOffSet.get(), 
								Config.ORES.RottenOreTopOffSet.get(), Config.ORES.RottenOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.ROTTEN_ORE.getDefaultState(), Config.ORES.RottenOreVeinSize.get()))
						.withPlacement(customConfigEnderOre));
	
		}
		
	}
	
	public static void generateSlimeOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
		
				ConfiguredPlacement<CountRangeConfig> customConfigEnderOre = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(
								Config.ORES.SlimeOreCount.get(), Config.ORES.SlimeOreBottonOffSet.get(), 
								Config.ORES.SlimeOreTopOffSet.get(), Config.ORES.SlimeOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.SLIME_ORE.getDefaultState(), Config.ORES.SlimeOreVeinSize.get()))
						.withPlacement(customConfigEnderOre));
	
		}
		
	}
	
	
	
}
			
			

	
			
 
			
		
	
	

