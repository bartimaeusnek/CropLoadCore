package lokko12.croploadcore;

import java.io.File;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.MetadataCollection;
import cpw.mods.fml.common.MetadataCollection.ArtifactVersionAdapter;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventBus;
import cpw.mods.fml.common.versioning.ArtifactVersion;
import cpw.mods.fml.common.versioning.InvalidVersionSpecificationException;
import cpw.mods.fml.common.versioning.VersionRange;
import lokko12.ASM.CropStickTransformer_plugin;

@Mod(
		modid = CropLoadCore.MODID, name = CropLoadCore.MODNAME, version = CropLoadCore.VERSION,
		dependencies = "after:GalacticraftCore; after:GalacticraftPlanets; after:IC2; after:Mantle; after:Natura; after:TConstruct; after:BiomesOPlenty; after:Thaumcraft; after:ExtraTrees; after:witchery; after:gregtech; after:dreamcraft"
		)


public class CropLoadCore extends DummyModContainer {
	
	public static final String MODID = "croploadcore";
	public static final String MODNAME = "CropLoadCore";
	public static final String VERSION = "@version@";
	public static final org.apache.logging.log4j.Logger CLClogger = LogManager.getLogger("CropLoadCore");
	public static ModMetadata metadata = new ModMetadata();
	@Instance(value = "CropLoadCore")
	public static CropLoadCore instance;
	
	public CropLoadCore() {
		metadata.modId = CropLoadCore.MODID;
		metadata.name = CropLoadCore.MODNAME;
		metadata.version = CropLoadCore.VERSION;
		metadata.authorList.add("bartimaeusnek");
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preinit) {
	ModsLoaded.check_init("bartimaeusnek's mods");
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent init) {
	OreDict.register();
	}

	@Override
	public String getModId() {
		return MODID;
	}

	@Override
	public String getName() {
		return MODNAME;
	}

	@Override
	public String getVersion() {
		return VERSION;
	}


	@Override
	public ModMetadata getMetadata() {
		return metadata;
	}

	@Override
	public boolean registerBus(com.google.common.eventbus.EventBus bus, LoadController controller) {
		bus.register(this);
		return true;
	}

	@Override
	public boolean matches(Object mod) {
		return instance.equals(mod);
	}

	@Override
	public Object getMod() {
		return instance;
	}
}
