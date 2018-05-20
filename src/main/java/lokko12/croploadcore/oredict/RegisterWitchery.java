package lokko12.croploadcore.oredict;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterWitchery {
	public static void register() {
 	//herb
 	OreDictionary.registerOre("listAllherb",new ItemStack(com.emoniph.witchery.Witchery.Items.SEEDS_GARLIC));
 	OreDictionary.registerOre("listAllveggie",new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,69));
 	
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
	//OreDictionary.registerOre("itemWaterArtichoke", new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,69));
	OreDictionary.registerOre("cropArtichoke", new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,69));
	OreDictionary.registerOre("itemWolfsBane", new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,156));
	OreDictionary.registerOre("itemMandrake", new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,22));
	OreDictionary.registerOre("itemSnowbell", new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,78));
	OreDictionary.registerOre("itemBelladonna", new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,21));
	//OreDictionary.registerOre("itemGypsum",new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,17));
	 
	//dusts
	//OreDictionary.registerOre("dustQuicklime",new ItemStack(com.emoniph.witchery.Witchery.Items.GENERIC,1,16));

	}
}