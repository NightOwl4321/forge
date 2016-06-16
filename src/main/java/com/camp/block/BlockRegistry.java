package com.camp.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegistry {
	//paste your code:
	
	
	
	
	
	public static void mainRegistry() {
		initializeBlock();
		registerBlock();
	}
	public static smolBlock b;
	
	public static ArrayList<Block> blockList;
	
	public static void initializeBlock(){
	 b = new smolBlock(EnumHelper.addToolMaterial(null, 100000, 1000000, 100000, 10000000, 10000000));

		blockList = BlockMaker.blockListMaker();
	}
		
	public static void registerBlock(){
		for(Block each : blockList){
		GameRegistry.registerBlock(each, each.getUnlocalizedName());
		}
		GameRegistry.registerBlock(b, b.getUnlocalizedName());
		}	
	
}
