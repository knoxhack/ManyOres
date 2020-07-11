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
								Config.ORES.EnderOreTopOffSet.get(), Config.ORES.EnderOreMaximum.get()));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.ENDER_ORE.getDefaultState(), 10))
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
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.FLINT_ORE.getDefaultState(), 10))
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
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.GLOWSTONE_ORE.getDefaultState(), 10))
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
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.GUNPOWDER_ORE.getDefaultState(), 10))
						.withPlacement(customConfigGunpowderOre));
				
		}
		
	}
}
			
			

	
			
 
			
		
	
	

