package com.knoxhack.moreores.setup;

import com.knoxhack.moreores.blocks.EnderOre;
import com.knoxhack.moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistrationHandler {

	private static final String MODID = MoreOres.MODID;
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

	public static void init() {
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

	}
	
	public static final RegistryObject<EnderOre> ENDERORE = BLOCKS.register("ender_ore", EnderOre::new);
    public static final RegistryObject<Item> ENDERORE_ITEM = ITEMS.register("ender_ore", () -> new BlockItem(ENDERORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
    
    
    
    
    
    
    
    
    
    
    
    //public static final RegistryObject<Item> TEMP_ITEM = ITEMS.register("tempitem", TestItem::new);

	

}
