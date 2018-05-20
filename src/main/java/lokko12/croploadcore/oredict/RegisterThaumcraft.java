package lokko12.croploadcore.oredict;


import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterThaumcraft {
	public static void register() {
		OreDictionary.registerOre("cropShimmerleaf",thaumcraft.api.ItemApi.getBlock("blockCustomPlant",2));
	 	OreDictionary.registerOre("cropCinderpearl",thaumcraft.api.ItemApi.getBlock("blockCustomPlant",3));
	 	OreDictionary.registerOre("cropGrass",thaumcraft.api.ItemApi.getBlock("blockTaintFibres",1));
	}
}
