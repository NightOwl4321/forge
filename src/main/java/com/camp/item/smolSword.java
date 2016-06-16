package com.camp.item;

import com.camp.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class smolSword extends ItemSword{

	public smolSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
		this.setTextureName(Strings.MODID + ":" + "waffle_sword");
		this.setCreativeTab(CreativeTabs.tabCombat);
		
	}

}
