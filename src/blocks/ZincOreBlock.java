package assets.newmetals.src.blocks;

import java.util.Random;

import assets.newmetals.src.ModInfo;
import assets.newmetals.src.NewMetals;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ZincOreBlock extends Block
{
	public ZincOreBlock(int par1)
	{
		super(par1, Material.iron);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(1.0F);
		this.setStepSound(soundMetalFootstep);
	}

	@Override
	public void registerIcons(IconRegister ir)
	{
		
		this.blockIcon = ir.registerIcon("newmetals:ZincOreBlock");
	}
	 @Override
	    public int idDropped(int par1, Random par2Random, int par3)
	    {
	     return NewMetals.zincingotitem.itemID;   
		 //return Item.diamond.itemID;
	    }
}
