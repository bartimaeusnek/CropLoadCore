package lokko12.ASM;

import cpw.mods.fml.common.registry.GameRegistry;
import ic2.core.crop.BlockCrop;
import ic2.core.crop.TileEntityCrop;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class CropStickTransformerReplaceMethod {

	public static boolean patchedcanPlaceBlockAt(World world, int x, int y, int z) {
		return world.getBlock(x, y-1, z).canSustainPlant(world, x, y, z, ForgeDirection.UP, new ItemSeedFood(4, 0.6F, Blocks.carrots, Blocks.farmland));
	}
	
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
}
