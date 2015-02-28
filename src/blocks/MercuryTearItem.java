package assets.newmetals.src.blocks;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MercuryTearItem extends Item
{
	public MercuryTearItem(int par1)
	{
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);

	}

	@Override
	public void registerIcons(IconRegister ir)
	{
		
		this.itemIcon = ir.registerIcon("newmetals:MercuryTearItem");
	}
}