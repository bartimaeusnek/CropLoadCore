package com.github.bartimaeusnek.ASM;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.versioning.ArtifactVersion;
import cpw.mods.fml.common.versioning.DefaultArtifactVersion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CropLoadCoreASM extends DummyModContainer {
    public static final Logger cppASMlogger = LogManager.getLogger(CropStickTransformer_plugin.NAME);

    public CropLoadCoreASM() {
        super(new ModMetadata());
        ModMetadata metadata = getMetadata();
        metadata.modId = "CropLoadCoreASM";
        metadata.name = CropStickTransformer_plugin.NAME;
        metadata.version = "0.0.1";
        metadata.authorList.add("bartimaeusnek");
        metadata.dependants = getDependants();
    }

    @Override
    public List<ArtifactVersion> getDependants() {
        List<ArtifactVersion> ret = new ArrayList<ArtifactVersion>();
        ret.add(new DefaultArtifactVersion("IC2", true));
        ret.add(new DefaultArtifactVersion("berriespp", true));
        return ret;
    }

    @Override
    public boolean registerBus(com.google.common.eventbus.EventBus bus, LoadController controller) {
        bus.register(this);
        return true;
    }
}
