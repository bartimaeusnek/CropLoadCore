package lokko12.croploadcore;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;

public class ModsLoaded {
	public static boolean GT = false;
	public static boolean IC2 = false;
	public static boolean Natura = false;
	public static boolean TConstruct = false;
	public static boolean BoP = false;
	public static boolean TC = false;
	public static boolean witchery = false;
	
	public static void check_init(String name) {
		IC2 = Loader.isModLoaded("IC2");
		Natura = Loader.isModLoaded("Natura");
		TConstruct = Loader.isModLoaded("TConstruct");
		BoP=Loader.isModLoaded("BiomesOPlenty");
		TC=Loader.isModLoaded("Thaumcraft");
		witchery=Loader.isModLoaded("witchery");
		GT=Loader.isModLoaded("gregtech");
		
		if (ModsLoaded.IC2 == true)
			FMLLog.info("IC2 found! "+name+" will now load!");
		else 
			FMLLog.bigWarning("IC2 NOT INSTALLED! WTF? YOU NEED IT FOR CROPS! POWAOFCAPLSLOCK!",Loader.isModLoaded("IC2"));
		if (ModsLoaded.Natura == true) 
			FMLLog.info("Natura found! "+name+" will use their items!");
		else
			FMLLog.warning("Natura NOT found! "+name+" will NOT use their items!");
		
		if (ModsLoaded.TConstruct == true)
			FMLLog.info("Tinker's Construct found! "+name+" will use their items!");
		else
			FMLLog.warning("Tinker's Construct NOT found! "+name+" will NOT use their items!");
		
		if(ModsLoaded.BoP==true)
			FMLLog.info("Biomes O' Plenty found!"+name+" will use their items!");
		else
			FMLLog.warning("Biomes O' Plenty NOT found! "+name+" will NOT use their items!");
		if(ModsLoaded.TC==true)
			FMLLog.info("Thaumcraft found! "+name+" will use their items!");
		else
			FMLLog.warning("Thaumcraft NOT found! "+name+" will NOT use their items!");
		if(ModsLoaded.witchery==true)
			FMLLog.info("Witchery found! "+name+" will use their items!");
		else
			FMLLog.warning("Witchery NOT found! "+name+" will NOT use their items!");
		if(ModsLoaded.GT==true)
			FMLLog.info("Gregtech found! "+name+" will use their items!");
		else
			FMLLog.warning("Gregtech NOT found! "+name+" will NOT use their items!");
		
	}
	
}
