package lokko12.croploadcore;

import org.apache.logging.log4j.LogManager;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
		modid = "croploadcore", name = "CropLoadCore", version = "@version@",
		dependencies = "after:GalacticraftCore; after:GalacticraftPlanets; after:IC2; after:Mantle; after:Natura; after:TConstruct; after:BiomesOPlenty; after:Thaumcraft; after:ExtraTrees; after:witchery; after:gregtech; after:dreamcraft"
		)


public class CropLoadCore {
	public static final org.apache.logging.log4j.Logger CLClogger = LogManager.getLogger("CropLoadCore");
	@Instance(value = "CropLoadCore")
	public static CropLoadCore instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preinit) {
	ModsLoaded.check_init("bartimaeusnek's mods");
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent init) {
	OreDict.register();
	}
}
