package com.github.bartimaeusnek.ASM;

import cpw.mods.fml.common.registry.GameRegistry;
import ic2.core.IC2;
import ic2.core.Ic2Items;
import ic2.core.crop.IC2Crops;
import ic2.core.crop.TileEntityCrop;
import ic2.core.util.StackUtil;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class CropStickTransformerReplaceMethod {

	//CropBlock to be placeable on any soil
	public static boolean patchedcanPlaceBlockAt(World world, int x, int y, int z) {
		return world.getBlock(x, y-1, z).canSustainPlant(world, x, y, z, ForgeDirection.UP, new ItemSeedFood(4, 0.6F, Blocks.carrots, Blocks.farmland));
	}
	//Patching CropBlock to not pop off when neighbours change and not placed on farmland, but on any other soil -_-'
    public static void patchedonNeighborBlockChange(World world, int x, int y, int z, Block neighbor) {
        if (!patchedcanPlaceBlockAt(world,x, y, z)){
            world.setBlockToAir(x, y, z);
            GameRegistry.findBlock("IC2", "blockCrop").dropBlockAsItem(world, x, y, z, 0, 0);
        } else {
            TileEntity te = world.getTileEntity(x, y, z);
            if (te == null && !(te instanceof TileEntityCrop)) {
                return;
            }
            ((TileEntityCrop) te).onNeighbourChange();
        }
    }
    
    //for WeedingTrowel to accept custom Weeds 
    public static boolean patchedonItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
        if (!IC2.platform.isSimulating()) {
            return false;
        }
        TileEntity te = world.getTileEntity(x, y, z);
        if (te instanceof TileEntityCrop) {
            TileEntityCrop crop = (TileEntityCrop)te;
            if (crop.getCrop() != null && crop.getCrop().tier() < 1) {
                StackUtil.dropAsEntity(world, x, y, z, new ItemStack(Ic2Items.weed.getItem(), crop.size));
                crop.reset();
                return true;
            }
            if (crop.weedlevel > 0) {
                StackUtil.dropAsEntity(world, x, y, z, new ItemStack(Ic2Items.weed.getItem(), crop.weedlevel));
                crop.weedlevel = 0;
                crop.updateState();
                return true;
            }
        }
        return false;
    }
}
