package com.github.bartimaeusnek.croploadcore.oredict;

import cpw.mods.fml.common.Loader;

public interface OreDictRegistrator extends Runnable {

    String getModWhichRegisters();

    default void register() {
        if (Loader.isModLoaded(getModWhichRegisters()))
            run();
    }

}
