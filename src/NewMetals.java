package assets.newmetals.src;

import assets.newmetals.src.blocks.ZincIngotItem;
import assets.newmetals.src.blocks.ZincOreBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="newmetals", name=ModInfo.NAME, version=ModInfo.VERSION)

public class NewMetals {
 public static Block zincoreblock;
 public static Item zincingotitem;
	
       @EventHandler
    public void Load(FMLInitializationEvent event)
    {
    	   zincoreblock = new ZincOreBlock(1000).setUnlocalizedName("zincoreblock");
    	   zincingotitem = new ZincIngotItem(1001).setUnlocalizedName("zincingotitem");
    	   GameRegistry.registerBlock(zincoreblock, "zincoreblock");
    	   GameRegistry.registerItem(zincingotitem, "ziningotitem");
           LanguageRegistry.instance().addNameForObject(zincoreblock, "en_US", "Zinc Ore");
           LanguageRegistry.instance().addNameForObject(zincingotitem, "en_US", "Zinc Ingot");
           
           GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotGold, 4), new Object[] {Item.ingotGold, NewMetals.zincingotitem, NewMetals.zincingotitem});
           GameRegistry.addSmelting(NewMetals.zincoreblock.blockID, new ItemStack(NewMetals.zincingotitem, 1), 1.0F);
           }
 
}