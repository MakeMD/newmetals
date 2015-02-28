package assets.newmetals.src.blocks;

import java.util.Random;

import assets.newmetals.src.NewMetals;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class PalladiumBlock extends Block
{
	public PalladiumBlock(int par1)
	{
	super (par1, Material.iron);
	this.setCreativeTab(CreativeTabs.tabBlock);
	this.setHardness(1.0F);
	this.setStepSound(soundMetalFootstep);
	}
@Override
		public void registerIcons(IconRegister ir)
		{
			this.blockIcon = ir.registerIcon("newmetals:PalladiumBlock");
		}
@Override
			public int idDropped(int par1, Random par2Random, int par3)
			{
				return NewMetals.palladiumingotitem.itemID;   
				//return Item.diamond.itemID;
			}
	public int quantityDropped(Random par1Random)
	{
	return 9;
	}
	
}
