package com.knoxhack.moreores.util;

import com.knoxhack.moreores.blocks.BeefOre;
import com.knoxhack.moreores.blocks.BlazeOre;
import com.knoxhack.moreores.blocks.BoneOre;
import com.knoxhack.moreores.blocks.CarrotOre;
import com.knoxhack.moreores.blocks.ChickenOre;
import com.knoxhack.moreores.blocks.EnderOre;
import com.knoxhack.moreores.blocks.FeatherOre;
import com.knoxhack.moreores.blocks.FishOre;
import com.knoxhack.moreores.blocks.FlintOre;
import com.knoxhack.moreores.blocks.GlowstoneOre;
import com.knoxhack.moreores.blocks.GunpowderOre;
import com.knoxhack.moreores.blocks.MagmaOre;
import com.knoxhack.moreores.blocks.MelonOre;
import com.knoxhack.moreores.blocks.PorckchopOre;
import com.knoxhack.moreores.blocks.PotatoOre;
import com.knoxhack.moreores.blocks.PrismarineOre;
import com.knoxhack.moreores.blocks.RottenOre;
import com.knoxhack.moreores.blocks.SlimeOre;
import com.knoxhack.moreores.world.MoreOresOreGen;
import com.knoxhack.moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.ModLoadingContext;
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
	
	public static void oreGen() {
		if (Config.ORES.EnabledEnderOre.get().booleanValue() == true) {
        MoreOresOreGen.generateEnderOre();
		    }
		if (Config.ORES.EnabledFlintOre.get().booleanValue() == true) {
        MoreOresOreGen.generateFlintOre();
		    }
		if (Config.ORES.EnabledGlowstoneOre.get().booleanValue() == true) {
        MoreOresOreGen.generateGlowstoneOre();
		    }
		if (Config.ORES.EnabledGunpowderOre.get().booleanValue() == true) {
        MoreOresOreGen.generateGunpowderOre();
		    }
		if (Config.ORES.EnabledBeefOre.get().booleanValue() == true) {
	        MoreOresOreGen.generateBeefOre();
			}
		if (Config.ORES.EnabledBlazeOre.get().booleanValue() == true) {
	        MoreOresOreGen.generateBlazeOre();
			}
		if (Config.ORES.EnabledBoneOre.get().booleanValue() == true) {
	        MoreOresOreGen.generateBoneOre();
			}
		if (Config.ORES.EnabledCarrotOre.get().booleanValue() == true) {
	        MoreOresOreGen.generateCarrotOre();
			}
		if (Config.ORES.EnabledChickenOre.get().booleanValue() == true) {
	        MoreOresOreGen.generateChickenOre();
			}
		if (Config.ORES.EnabledFeatherOre.get().booleanValue() == true) {
	        MoreOresOreGen.generateFeatherOre();
			}
		if (Config.ORES.EnabledFishOre.get().booleanValue() == true) {
	        MoreOresOreGen.generateFishOre();
			}
		if (Config.ORES.EnabledMagmaOre.get().booleanValue() == true) {
	        MoreOresOreGen.generateMagmaOre();
			}
		if (Config.ORES.EnabledMelonOre.get().booleanValue() == true) {
	        MoreOresOreGen.generateMelonOre();
			}
		if (Config.ORES.EnabledPorckchopOre.get().booleanValue() == true) {
	        MoreOresOreGen.generatePorckchopOre();
			}
		if (Config.ORES.EnabledPotatoOre.get().booleanValue() == true) {
	        MoreOresOreGen.generatePotatoOre();
			}
		if (Config.ORES.EnabledPrismarineOre.get().booleanValue() == true) {
	        MoreOresOreGen.generatePrismarineOre();
			}
		if (Config.ORES.EnabledRottenOre.get().booleanValue() == true) {
	        MoreOresOreGen.generateRottenOre();
			}
		if (Config.ORES.EnabledSlimeOre.get().booleanValue() == true) {
	        MoreOresOreGen.generateSlimeOre();
			}
	}
	
	public static void loadConfig() {
		ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, Config.spec);
	}
	
	public static final RegistryObject<EnderOre> ENDER_ORE = BLOCKS.register ("ender_ore", EnderOre::new);
    public static final RegistryObject<Item> ENDERORE_ITEM = ITEMS.register("ender_ore", ()
    		-> new BlockItem(ENDER_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
	public static final RegistryObject<FlintOre> FLINT_ORE = BLOCKS.register("flint_ore", FlintOre::new);
    public static final RegistryObject<Item> FLINT_ORE_ITEM = ITEMS.register("flint_ore", ()
    		-> new BlockItem(FLINT_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
	public static final RegistryObject<GlowstoneOre> GLOWSTONE_ORE = BLOCKS.register("glowstone_ore", GlowstoneOre::new);
    public static final RegistryObject<Item> GLOWSTONE_ORE_ITEM = ITEMS.register("glowstone_ore", ()
    		-> new BlockItem(GLOWSTONE_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
	public static final RegistryObject<GunpowderOre> GUNPOWDER_ORE = BLOCKS.register("gunpowder_ore", GunpowderOre::new);
    public static final RegistryObject<Item> GUNPOWDER_ORE_ITEM = ITEMS.register("gunpowder_ore", ()
    		-> new BlockItem(GUNPOWDER_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
    
	public static final RegistryObject<BeefOre> BEEF_ORE = BLOCKS.register ("beef_ore", BeefOre::new);
    public static final RegistryObject<Item> BEEF_ORE_ITEM = ITEMS.register("beef_ore", ()
    		-> new BlockItem(BEEF_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
	public static final RegistryObject<BlazeOre> BLAZE_ORE = BLOCKS.register ("blaze_ore", BlazeOre::new);
    public static final RegistryObject<Item> BLAZE_ORE_ITEM = ITEMS.register("blaze_ore", ()
    		-> new BlockItem(BLAZE_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
	public static final RegistryObject<BoneOre> BONE_ORE = BLOCKS.register ("bone_ore", BoneOre::new);
    public static final RegistryObject<Item> BONE_ORE_ITEM = ITEMS.register("bone_ore", ()
    		-> new BlockItem(BONE_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
	public static final RegistryObject<CarrotOre> CARROT_ORE = BLOCKS.register ("carrot_ore", CarrotOre::new);
    public static final RegistryObject<Item> CARROT_ORE_ITEM = ITEMS.register("carrot_ore", ()
    		-> new BlockItem(CARROT_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
    
	public static final RegistryObject<ChickenOre> CHICKEN_ORE = BLOCKS.register ("chicken_ore", ChickenOre::new);
    public static final RegistryObject<Item> CHICKEN_ORE_ITEM = ITEMS.register("chicken_ore", ()
    		-> new BlockItem(CHICKEN_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
	public static final RegistryObject<FeatherOre> FEATHER_ORE = BLOCKS.register ("feather_ore", FeatherOre::new);
    public static final RegistryObject<Item> FEATHER_ORE_ITEM = ITEMS.register("feather_ore", ()
    		-> new BlockItem(FEATHER_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
	public static final RegistryObject<FishOre> FISH_ORE = BLOCKS.register ("fish_ore", FishOre::new);
    public static final RegistryObject<Item> FISH_ORE_ITEM = ITEMS.register("fish_ore", ()
    		-> new BlockItem(FISH_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
	public static final RegistryObject<MagmaOre> MAGMA_ORE = BLOCKS.register ("magma_ore", MagmaOre::new);
    public static final RegistryObject<Item> MAGMA_ORE_ITEM = ITEMS.register("magma_ore", ()
    		-> new BlockItem(MAGMA_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
    
	public static final RegistryObject<MelonOre> MELON_ORE = BLOCKS.register ("melon_ore", MelonOre::new);
    public static final RegistryObject<Item> MELON_ORE_ITEM = ITEMS.register("melon_ore", ()
    		-> new BlockItem(MELON_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
	public static final RegistryObject<PorckchopOre> PORKCHOP_ORE = BLOCKS.register ("porkchop_ore", PorckchopOre::new);
    public static final RegistryObject<Item> PORKCHOP_ORE_ITEM = ITEMS.register("porkchop_ore", ()
    		-> new BlockItem(PORKCHOP_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
	public static final RegistryObject<PotatoOre> POTATO_ORE = BLOCKS.register ("potato_ore", PotatoOre::new);
    public static final RegistryObject<Item> POTATO_ORE_ITEM = ITEMS.register("potato_ore", ()
    		-> new BlockItem(POTATO_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
	public static final RegistryObject<PrismarineOre> PRISMARINE_ORE = BLOCKS.register ("prismarine_ore", PrismarineOre::new);
    public static final RegistryObject<Item> PRISMARINE_ORE_ITEM = ITEMS.register("prismarine_ore", ()
    		-> new BlockItem(PRISMARINE_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
    
	public static final RegistryObject<RottenOre> ROTTEN_ORE = BLOCKS.register ("rotten_ore", RottenOre::new);
    public static final RegistryObject<Item> ROTTEN_ORE_ITEM = ITEMS.register("rotten_ore", ()
    		-> new BlockItem(ROTTEN_ORE.get(), new Item.Properties().group(MoreOres.TAB)));
    
	public static final RegistryObject<SlimeOre> SLIME_ORE = BLOCKS.register ("slime_ore", SlimeOre::new);
    public static final RegistryObject<Item> SLIME_ORE_ITEM = ITEMS.register("slime_ore", ()
    		-> new BlockItem(SLIME_ORE.get(), new Item.Properties().group(MoreOres.TAB)));

    //public static final RegistryObject<Item> TEMP_ITEM = ITEMS.register("tempitem", TestItem::new);

	

}
