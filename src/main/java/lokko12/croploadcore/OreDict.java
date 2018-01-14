package lokko12.croploadcore;

import biomesoplenty.api.content.BOPCBlocks;
import ic2.api.crops.CropCard;
import ic2.api.crops.Crops;
import mods.natura.common.NContent;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import tconstruct.world.TinkerWorld;

public class OreDict {
	private static boolean isregistered = false;
	
	public static ItemStack ISget(String name) {
	if (OreDictionary.getOres(name).size()!= 0)
	{
        return OreDictionary.getOres(name).get(OreDictionary.getOres(name).size()-1);
    }
	else 
		return null;
	}
	
	public static void BSget(String name, CropCard crop) {
		int anz = OreDictionary.getOres(name).size();
        ItemStack[] BaseSeeds = new ItemStack[anz];
        OreDictionary.getOres(name).toArray(BaseSeeds);
    	if (OreDictionary.getOres(name).size()!= 0)
    		for (int i=0; i < anz; i++)
            Crops.instance.registerBaseSeed(BaseSeeds[i],crop,1,1,1,1);
	}
	
	public static void register() {

		if (isregistered==false){
		//Grass
			OreDictionary.registerOre("cropGrass", new ItemStack(Item.getItemById(32),1,0));
			OreDictionary.registerOre("cropGrass", new ItemStack(Item.getItemById(31),1,2));
			OreDictionary.registerOre("cropGrass", new ItemStack(Item.getItemById(31),1,1));
			OreDictionary.registerOre("cropGrass", new ItemStack(Item.getItemById(175),1,2));
			OreDictionary.registerOre("cropGrass", new ItemStack(Item.getItemById(175),1,3));
		if (ModsLoaded.BoP)
		 {
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
		 }
		 
		if (ModsLoaded.TConstruct) {
			 OreDictionary.registerOre("cropGrass",new ItemStack(TinkerWorld.slimeGrass,1,0));
			 OreDictionary.registerOre("cropGrass",new ItemStack(TinkerWorld.slimeTallGrass,1,0));
	 	}
		 if (ModsLoaded.TC) {
			 OreDictionary.registerOre("cropGrass",thaumcraft.api.ItemApi.getBlock("blockTaintFibres",1));
		 }
		 
		 //Vines
		 	 OreDictionary.registerOre("cropVine",Item.getItemById(106));
		 	 OreDictionary.registerOre("cropVines",Item.getItemById(106));
		 
		 if (ModsLoaded.BoP)
		 {
			 OreDictionary.registerOre("cropVine",new ItemStack(BOPCBlocks.flowerVine,1,0));
			 OreDictionary.registerOre("cropFloweringVines",new ItemStack(BOPCBlocks.flowerVine,1,0));
		 	 OreDictionary.registerOre("cropVine",new ItemStack(BOPCBlocks.ivy,1,0));
		 	 OreDictionary.registerOre("cropIvy",new ItemStack(BOPCBlocks.ivy,1,0));
		 }
		
		 if (ModsLoaded.Natura) {
			 OreDictionary.registerOre("cropVine",new ItemStack(NContent.thornVines));
			 OreDictionary.registerOre("cropThornVines",new ItemStack(NContent.thornVines));
		 }
		 //Cacti
		 OreDictionary.registerOre("cropCacti", new ItemStack(Item.getItemById(81),1,0));
		 OreDictionary.registerOre("cropCactus", new ItemStack(Item.getItemById(81),1,0));
		 
		 if (ModsLoaded.Natura)
		 {
			 OreDictionary.registerOre("cropCacti",new ItemStack(NContent.saguaro));
		 	 OreDictionary.registerOre("cropSaguaro",new ItemStack(NContent.saguaro));
		 }
		
		 if (ModsLoaded.BoP)
		 {
			 OreDictionary.registerOre("cropCacti",new ItemStack(BOPCBlocks.plants,1,12));
			 OreDictionary.registerOre("cropSmallCactus",new ItemStack(BOPCBlocks.plants,1,12));
		 } 
		 
		 //berries
		 if (ModsLoaded.BoP)
			OreDictionary.registerOre("cropBerry", new ItemStack(biomesoplenty.api.content.BOPCItems.food,1,0));
		 	OreDictionary.registerOre("listAllberry", new ItemStack(biomesoplenty.api.content.BOPCItems.food,1,0));
		 if (ModsLoaded.Natura)
			OreDictionary.registerOre("cropSaguaroBerry", new ItemStack(NContent.seedFood,1,0));
		 	OreDictionary.registerOre("listAllberry", new ItemStack(NContent.seedFood,1,0));
		 	OreDictionary.registerOre("cropGooseberry",new ItemStack(NContent.berryItem,1,3));
		 	
		 //TC Stuff
		 	if (ModsLoaded.TC) {
		 	OreDictionary.registerOre("cropShimmerleaf",thaumcraft.api.ItemApi.getBlock("blockCustomPlant",2));
		 	OreDictionary.registerOre("cropCinderpearl",thaumcraft.api.ItemApi.getBlock("blockCustomPlant",3));
		 	}
		 	
		 //witchery Stuff
		 	if (ModsLoaded.witchery) {
		 	
		 	//herb
		 	OreDictionary.registerOre("listAllherb",new ItemStack(com.emoniph.witchery.Witchery.Items.SEEDS_GARLIC));
		 	OreDictionary.registerOre("listAllherb",new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,69));
		 	
		 	//Plants
		 	OreDictionary.registerOre("cropGlintWeed",new ItemStack(com.emoniph.witchery.Witchery.Blocks.GLINT_WEED));
			OreDictionary.registerOre("cropSpanishMoss",new ItemStack(com.emoniph.witchery.Witchery.Blocks.SPANISH_MOSS));
			OreDictionary.registerOre("cropEmberMoss",new ItemStack(com.emoniph.witchery.Witchery.Blocks.EMBER_MOSS));
			
			//Seeds
			OreDictionary.registerOre("seedWaterArtichoke", new ItemStack(com.emoniph.witchery.Witchery.Items.SEEDS_ARTICHOKE));
			OreDictionary.registerOre("seedWolfsBane", new ItemStack(com.emoniph.witchery.Witchery.Items.SEEDS_WOLFSBANE));
			OreDictionary.registerOre("seedMandrake", new ItemStack(com.emoniph.witchery.Witchery.Items.SEEDS_MANDRAKE));
			OreDictionary.registerOre("seedSnowbell", new ItemStack(com.emoniph.witchery.Witchery.Items.SEEDS_SNOWBELL));
			OreDictionary.registerOre("seedBelladonna", new ItemStack(com.emoniph.witchery.Witchery.Items.SEEDS_BELLADONNA));
			
			OreDictionary.registerOre("listAllseed", new ItemStack(com.emoniph.witchery.Witchery.Items.SEEDS_ARTICHOKE));
			OreDictionary.registerOre("listAllseed", new ItemStack(com.emoniph.witchery.Witchery.Items.SEEDS_WOLFSBANE));
			OreDictionary.registerOre("listAllseed", new ItemStack(com.emoniph.witchery.Witchery.Items.SEEDS_MANDRAKE));
			OreDictionary.registerOre("listAllseed", new ItemStack(com.emoniph.witchery.Witchery.Items.SEEDS_SNOWBELL));
			OreDictionary.registerOre("listAllseed", new ItemStack(com.emoniph.witchery.Witchery.Items.SEEDS_BELLADONNA));
			
			//items
			OreDictionary.registerOre("itemWaterArtichoke", new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,69));
			OreDictionary.registerOre("itemWolfsBane", new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,156));
			OreDictionary.registerOre("itemMandrake", new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,22));
			OreDictionary.registerOre("itemSnowbell", new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,78));
			OreDictionary.registerOre("itemBelladonna", new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,21));
			//OreDictionary.registerOre("itemGypsum",new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,17));
			
			//dusts
			//OreDictionary.registerOre("dustQuicklime",new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,16));
		 	}
		 isregistered=true;
		}
	}

}
