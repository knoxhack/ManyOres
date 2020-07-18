package com.knoxhack.manyores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MelonOre extends Block {

	public MelonOre() {
		super(Properties.create(Material.IRON)
		.sound(SoundType.METAL)
		.hardnessAndResistance(2.0f)
		
		);
	}

}
