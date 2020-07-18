package com.knoxhack.manyores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FishOre extends Block {

	public FishOre() {
		super(Properties.create(Material.IRON)
		.sound(SoundType.METAL)
		.hardnessAndResistance(2.0f)
		
		);
	}

}
