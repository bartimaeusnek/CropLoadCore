package com.github.bartimaeusnek.croploadcore;

import net.minecraft.block.Block;

public class BlockGetterTC {

    public static Block getBlock_asBlock(String itemString, int meta) {
        return Block.getBlockFromItem(thaumcraft.api.ItemApi.getBlock(itemString, meta).getItem());
    }

    public static Block getItem_asBlock(String itemString, int meta) {
        return Block.getBlockFromItem(thaumcraft.api.ItemApi.getItem(itemString, meta).getItem());
    }

}
