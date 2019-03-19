package com.github.bartimaeusnek.croploadcore.oredict;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import tb.init.TBItems;

public class RegisterThaumicBases implements OreDictRegistrator {
    @Override
    public String getModWhichRegisters() {
        return "thaumicbases";
    }

    @Override
    public void run() {
        OreDictionary.registerOre("nuggetThauminite", new ItemStack(TBItems.resource,1,0));
    }
}
