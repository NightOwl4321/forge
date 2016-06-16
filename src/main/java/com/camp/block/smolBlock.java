package com.camp.block;
import com.camp.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;

public class smolBlock extends Block{
	protected smolBlock(ToolMaterial toolMaterial) {
		super(toolMaterial);
		// TODO Auto-generated constructor stub
		this.setBlockTextureName(Strings.MODID + ":" + "WaffleBlock");
		this.setBlockName("Waffle");
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	

}
