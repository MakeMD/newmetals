package assets.newmetals.src;

import assets.newmetals.src.blocks.MercuryOreBlock;
import assets.newmetals.src.blocks.MercuryTearItem;
import assets.newmetals.src.blocks.PalladiumBlock;
import assets.newmetals.src.blocks.PalladiumIngotItem;
import assets.newmetals.src.blocks.PalladiumOreBlock;
import assets.newmetals.src.blocks.PlatinumBlock;
import assets.newmetals.src.blocks.PlatinumIngotItem;
import assets.newmetals.src.blocks.PlatinumOreBlock;
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
 public static Block zincoreblock, titanoreblock, titanblock, platinumoreblock, platinumblock, palladiumoreblock, palladiumblock;
 public static Block mercuryoreblock;
 public static Item zincingotitem, titaningotitem, platinumingotitem, palladiumingotitem, mercurytearitem;
	
       @EventHandler
    public void Load(FMLInitializationEvent event)
    {
    	   zincoreblock = new ZincOreBlock(1000).setUnlocalizedName("zincoreblock");
    	   zincingotitem = new ZincIngotItem(1001).setUnlocalizedName("zincingotitem");
    	   titanoreblock = new TitanOreBlock(1002).setUnlocalizedName("titanoreblock");
    	   titaningotitem = new TitanIngotItem(1003).setUnlocalizedName("titaningotitem");
    	   titanblock = new TitanBlock(1004).setUnlocalizedName("titanblock");
    	   platinumoreblock = new PlatinumOreBlock(1005).setUnlocalizedName("platinumoreblock");
    	   platinumblock = new PlatinumBlock(1006).setUnlocalizedName("platinumblock");
    	   platinumingotitem = new PlatinumIngotItem(1007).setUnlocalizedName("platinumingotitem");
    	   palladiumoreblock = new PalladiumOreBlock(1008).setUnlocalizedName("palladiumoreblock");
    	   palladiumblock = new PalladiumBlock(1009).setUnlocalizedName("palladiumblock");
    	   palladiumingotitem = new PalladiumIngotItem(1010).setUnlocalizedName("palladiumingotitem");
    	   mercuryoreblock = new MercuryOreBlock(1011).setUnlocalizedName("mercuryoreblock");
    	   mercurytearitem = new MercuryTearItem(1012).setUnlocalizedName("mercurytearitem");
    	   
    	   GameRegistry.registerBlock(platinumoreblock, "platinumoreblock");
    	   GameRegistry.registerBlock(platinumblock, "platinumblock");
    	   GameRegistry.registerItem(platinumingotitem, "paltinumingotitem");
    	   GameRegistry.registerBlock(zincoreblock, "zincoreblock");
    	   GameRegistry.registerItem(zincingotitem, "ziningotitem");
    	   GameRegistry.registerBlock(titanoreblock, "titanoreblock");
    	   GameRegistry.registerBlock(titanblock, "titanblock");
    	   GameRegistry.registerItem(titaningotitem, "titaningotitem");
    	   GameRegistry.registerBlock(palladiumoreblock, "palladiumoreblock");
           GameRegistry.registerBlock(palladiumblock, "palladiumblock");
           GameRegistry.registerItem(palladiumingotitem, "palladiumingotitem");
           GameRegistry.registerBlock(mercuryoreblock, "mercuryoreblock");
           GameRegistry.registerItem(mercurytearitem, "mercurytearitem");
           
           LanguageRegistry.instance().addNameForObject(zincoreblock, "en_US", "Zinc Ore");
           LanguageRegistry.instance().addNameForObject(zincingotitem, "en_US", "Zinc Ingot");
           LanguageRegistry.instance().addNameForObject(titanoreblock, "en_US", "Titan Ore");
           LanguageRegistry.instance().addNameForObject(titaningotitem, "en_US", "Titan Ingot");
           LanguageRegistry.instance().addNameForObject(titanblock, "en_US", "Titan Block");
           LanguageRegistry.instance().addNameForObject(platinumoreblock, "en_US", "Platinum Ore");
           LanguageRegistry.instance().addNameForObject(platinumblock, "en_US", "Platinum Block");
           LanguageRegistry.instance().addNameForObject(platinumingotitem, "en_US", "Platinum Ingot");
           LanguageRegistry.instance().addNameForObject(palladiumoreblock, "en_US", "Palladium Ore");
           LanguageRegistry.instance().addNameForObject(palladiumblock, "en_US", "Palladium Block");
           LanguageRegistry.instance().addNameForObject(palladiumingotitem, "en_US", "Palladium Ingot");
           LanguageRegistry.instance().addNameForObject(mercuryoreblock, "en_US", "Mercury Ore");
           LanguageRegistry.instance().addNameForObject(mercurytearitem, "en_US", "Mercury Tear");
           
           GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotGold, 4), new Object[] {Item.ingotGold, NewMetals.zincingotitem, NewMetals.zincingotitem});
           
           GameRegistry.addSmelting(NewMetals.zincoreblock.blockID, new ItemStack(NewMetals.zincingotitem, 1), 1.0F);
           GameRegistry.addRecipe(new ItemStack(NewMetals.titanblock, 1), new Object[]{"###", "###", "###", Character.valueOf('#'), NewMetals.titaningotitem});
           GameRegistry.addSmelting(NewMetals.titanoreblock.blockID, new ItemStack(NewMetals.titaningotitem, 1), 1.0F);
           GameRegistry.addSmelting(NewMetals.platinumoreblock.blockID, new ItemStack(NewMetals.platinumingotitem, 1), 1.0F);
           GameRegistry.addRecipe(new ItemStack(NewMetals.platinumblock, 1), new Object[]{"###","###","###", Character.valueOf('#'), NewMetals.platinumingotitem});
           GameRegistry.addRecipe(new ItemStack(NewMetals.palladiumblock, 1), new Object[]{"###","###","###", Character.valueOf('#'), NewMetals.palladiumingotitem});
           GameRegistry.addSmelting(NewMetals.palladiumoreblock.blockID, new ItemStack(NewMetals.palladiumingotitem,1), 1.0F);
           GameRegistry.addSmelting(NewMetals.mercuryoreblock.blockID, new ItemStack(NewMetals.mercurytearitem, 1), 1.0F);
           
    }
 
}