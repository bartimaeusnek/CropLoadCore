package com.github.bartimaeusnek.croploadcore;

import cpw.mods.fml.common.FMLLog;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class BlockGetterTC {
	
	public static Block getBlock_asBlock(String itemString, int meta) {
		return Block.getBlockFromItem(thaumcraft.api.ItemApi.getBlock(itemString, meta).getItem());
	}
	
	public static Block getItem_asBlock(String itemString, int meta) {
		return Block.getBlockFromItem(thaumcraft.api.ItemApi.getItem(itemString, meta).getItem());
	}
	
}
