package lokko12.ASM;

import java.util.Map;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import lokko12.croploadcore.CropLoadCore;

@IFMLLoadingPlugin.MCVersion("1.7.10")
@IFMLLoadingPlugin.TransformerExclusions({"lokko12.ASM"})
@IFMLLoadingPlugin.Name(CropStickTransformer_plugin.NAME)
public class CropStickTransformer_plugin implements IFMLLoadingPlugin {

	public static final String NAME = "CroploadCore ASM Core";
	@Override
	public String[] getASMTransformerClass() {
		return new String[]{CropStickTransformer.class.getName()};
	}

	@Override
	public String getModContainerClass() {
		return CropLoadCore.class.getName();
	}

	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}

}
