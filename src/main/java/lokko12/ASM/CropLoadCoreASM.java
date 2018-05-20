package lokko12.ASM;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import lokko12.croploadcore.CropLoadCore;

public class CropLoadCoreASM extends DummyModContainer {
	public CropLoadCoreASM() {
	super(new ModMetadata());
	ModMetadata metadata = getMetadata();
	metadata.modId = CropLoadCore.MODID+"ASM";
	metadata.name = CropStickTransformer_plugin.NAME;
	metadata.version = "0.0.1";
	metadata.authorList.add("bartimaeusnek");
	}
	
	@Override
	public boolean registerBus(com.google.common.eventbus.EventBus bus, LoadController controller) {
		bus.register(this);
		return true;
	}
}
