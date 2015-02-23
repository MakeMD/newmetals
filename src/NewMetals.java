package assets.newmetals.src;

import assets.newmetals.src.blocks.TitanBlock;
import assets.newmetals.src.blocks.TitanIngotItem;
import assets.newmetals.src.blocks.TitanOreBlock;
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
 public static Block zincoreblock, titanoreblock, titanblock;
 public static Item zincingotitem, titaningotitem;
	
       @EventHandler
    public void Load(FMLInitializationEvent event)
    {
    	   zincoreblock = new ZincOreBlock(1000).setUnlocalizedName("zincoreblock");
    	   zincingotitem = new ZincIngotItem(1001).setUnlocalizedName("zincingotitem");
    	   titanoreblock = new TitanOreBlock(1002).setUnlocalizedName("titanoreblock");
    	   titaningotitem = new TitanIngotItem(1003).setUnlocalizedName("titaningotitem");
    	   titanblock = new TitanBlock(1004).setUnlocalizedName("titanblock");
    	   GameRegistry.registerBlock(zincoreblock, "zincoreblock");
    	   GameRegistry.registerItem(zincingotitem, "ziningotitem");
    	   GameRegistry.registerBlock(titanoreblock, "titanoreblock");
    	   GameRegistry.registerBlock(titanblock, "titanblock");
    	   GameRegistry.registerItem(titaningotitem, "titaningotitem");
           LanguageRegistry.instance().addNameForObject(zincoreblock, "en_US", "Zinc Ore");
           LanguageRegistry.instance().addNameForObject(zincingotitem, "en_US", "Zinc Ingot");
           LanguageRegistry.instance().addNameForObject(titanoreblock, "en_US", "Titan Ore");
           LanguageRegistry.instance().addNameForObject(titaningotitem, "en_US", "Titan Ingot");
           LanguageRegistry.instance().addNameForObject(titanblock, "en_US", "Titan Block");
           
           GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotGold, 4), new Object[] {Item.ingotGold, NewMetals.zincingotitem, NewMetals.zincingotitem});
           GameRegistry.addSmelting(NewMetals.zincoreblock.blockID, new ItemStack(NewMetals.zincingotitem, 1), 1.0F);
           GameRegistry.addRecipe(new ItemStack(NewMetals.titanblock, 1), new Object[]{"###", "###", "###", Character.valueOf('#'), NewMetals.titaningotitem});
          GameRegistry.addSmelting(NewMetals.titanoreblock.blockID, new ItemStack(NewMetals.titaningotitem, 1), 1.0F);
    }
 
}