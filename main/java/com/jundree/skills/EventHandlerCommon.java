package com.jundree.skills;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.StatBase;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandlerCommon {
	
	@SubscribeEvent (priority = EventPriority.HIGH)
	public void onBreakBlock(BreakEvent event){
		System.out.println("Trying to break");
		EntityPlayer player = event.getPlayer();
		IBlockState block = event.getState();
	}
	
}
