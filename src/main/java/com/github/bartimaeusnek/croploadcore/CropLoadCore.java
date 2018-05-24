package com.github.bartimaeusnek.croploadcore;

import java.io.File;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;

import com.github.bartimaeusnek.ASM.CropStickTransformer_plugin;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.Loader;
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

@Mod(
		modid = CropLoadCore.MODID, name = CropLoadCore.MODNAME, version = CropLoadCore.VERSION,
		dependencies = "after:Ztones; after:GalacticraftCore; after:GalacticraftPlanets; after:IC2; after:Mantle; after:Natura; after:TConstruct; after:BiomesOPlenty; after:Thaumcraft; after:ExtraTrees; after:witchery; after:gregtech; after:dreamcraft"
		)


public class CropLoadCore {
	
	public static final String MODID = "croploadcore";
	public static final String MODNAME = "CropLoadCore";
	public static final String VERSION = "@version@";
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
