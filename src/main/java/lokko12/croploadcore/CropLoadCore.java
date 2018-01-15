package lokko12.croploadcore;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;

@Mod(
		modid = "croploadcore", name = "CropLoadCore", version = "0.0.1",
		dependencies = "after:IC2; after:Mantle; after:Natura; after:TConstruct; after:BiomesOPlenty; after:Thaumcraft; after:ExtraTrees; after:witchery, after:gregtech"
		)


public class CropLoadCore {

	@Instance(value = "CropLoadCore")
	public static CropLoadCore instance;
	
}
