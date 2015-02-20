package assets.newmetals.src.blocks;

import java.util.Random;

import assets.newmetals.src.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ZincIngotItem extends Item
{
	public ZincIngotItem(int par1)
	{
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);

	}

	@Override
	public void registerIcons(IconRegister ir)
	{
		
		this.itemIcon = ir.registerIcon("newmetals:ZincIngotItem");
	}
}

