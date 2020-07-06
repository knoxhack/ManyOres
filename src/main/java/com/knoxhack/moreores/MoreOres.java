package com.knoxhack.moreores;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.knoxhack.moreores.setup.RegistrationHandler;

@Mod("moreores")
public class MoreOres
{
    private static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "moreores";

    public MoreOres() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        RegistrationHandler.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM PREINIT");
    }

	private void doClientStuff(final FMLClientSetupEvent event) {
		
    }
	
	public static final ItemGroup TAB = new ItemGroup(MoreOres.MODID) {
		
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RegistrationHandler.ENDERORE.get());
		}
	};
	
}