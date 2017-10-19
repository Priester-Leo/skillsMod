package com.jundree.skills.proxy;

import com.jundree.skills.EventHandlerCommon;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {

	}

	public void init(FMLInitializationEvent e) {
		MinecraftForge.EVENT_BUS.register(new EventHandlerCommon());
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
	
}
