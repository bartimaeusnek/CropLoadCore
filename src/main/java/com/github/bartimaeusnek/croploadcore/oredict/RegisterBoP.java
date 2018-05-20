package com.github.bartimaeusnek.croploadcore.oredict;

import biomesoplenty.api.content.BOPCBlocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterBoP {
	public static void register() {
		
		    OreDictionary.registerOre("cropGrass",new ItemStack(BOPCBlocks.plants,1,0));
			OreDictionary.registerOre("cropGrass",new ItemStack(BOPCBlocks.plants,1,1));
			OreDictionary.registerOre("cropGrass",new ItemStack(BOPCBlocks.plants,1,2));
			OreDictionary.registerOre("cropGrass",new ItemStack(BOPCBlocks.plants,1,3));
			OreDictionary.registerOre("cropGrass",new ItemStack(BOPCBlocks.foliage,1,1));
			OreDictionary.registerOre("cropGrass",new ItemStack(BOPCBlocks.foliage,1,2));
			OreDictionary.registerOre("cropGrass",new ItemStack(BOPCBlocks.foliage,1,5));
			OreDictionary.registerOre("cropGrass",new ItemStack(BOPCBlocks.foliage,1,7));
			OreDictionary.registerOre("cropGrass",new ItemStack(BOPCBlocks.foliage,1,9));
			OreDictionary.registerOre("cropGrass",new ItemStack(BOPCBlocks.foliage,1,10));
			OreDictionary.registerOre("cropGrass",new ItemStack(BOPCBlocks.foliage,1,11));
			OreDictionary.registerOre("cropGrass",new ItemStack(BOPCBlocks.foliage,1,12));
			OreDictionary.registerOre("cropGrass",new ItemStack(BOPCBlocks.foliage,1,13)); 
			OreDictionary.registerOre("cropVine",new ItemStack(BOPCBlocks.flowerVine,1,0));
			OreDictionary.registerOre("cropFloweringVines",new ItemStack(BOPCBlocks.flowerVine,1,0));
		 	OreDictionary.registerOre("cropVine",new ItemStack(BOPCBlocks.ivy,1,0));
		 	OreDictionary.registerOre("cropIvy",new ItemStack(BOPCBlocks.ivy,1,0)); 
			OreDictionary.registerOre("cropCacti",new ItemStack(BOPCBlocks.plants,1,12));
			OreDictionary.registerOre("cropSmallCactus",new ItemStack(BOPCBlocks.plants,1,12));
			OreDictionary.registerOre("cropBerry", new ItemStack(biomesoplenty.api.content.BOPCItems.food,1,0));
			OreDictionary.registerOre("listAllberry", new ItemStack(biomesoplenty.api.content.BOPCItems.food,1,0));
			OreDictionary.registerOre("cropEyebulb",new ItemStack(BOPCBlocks.flowers,1,13));
			OreDictionary.registerOre("cropEyebulb",new ItemStack(BOPCBlocks.flowers,1,14));
			 
	}
	
}
