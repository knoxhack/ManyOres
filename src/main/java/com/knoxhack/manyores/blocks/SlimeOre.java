package com.knoxhack.manyores.blocks;

import java.util.Random;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.MathHelper;

public class SlimeOre extends OreBlock {

	public SlimeOre() {
		super(Properties.create(Material.IRON)
		.sound(SoundType.METAL)
		.hardnessAndResistance(2.0f)
		
		);
	}
	
	public int getExperience(Random rand) {
		return MathHelper.nextInt(rand, 2, 7);

	 }

}
