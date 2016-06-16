package com.camp.item;

import java.util.ArrayList;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemRegistry {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static ItemSword s = new smolSword(ToolMaterial.EMERALD);
	static ArrayList<Item> itemList;
	public static void initializeItem(){
		itemList = ItemMaker.itemListMaker();
	}
	
	public static void registerItem(){
		for(Item each : itemList)
		GameRegistry.registerItem(each, each.getUnlocalizedName());
		GameRegistry.registerItem(s, s.getUnlocalizedName());
	}
}
