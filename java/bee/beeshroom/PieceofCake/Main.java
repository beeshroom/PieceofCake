package bee.beeshroom.PieceofCake;

import bee.beeshroom.PieceofCake.tabs.PieceofCakeTab;
import bee.beeshroom.PieceofCake.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	
	@Instance
	public static Main instance;
	
	public static final CreativeTabs pieceofcaketab = new PieceofCakeTab("pieceofcaketab");
	
	/*@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy; */
	{
	
	}
	
/*@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
	}
			@EventHandler
			public static void init(FMLInitializationEvent event)
			{
				//MinecraftForge.EVENT_BUS.register(new LootHandler());
	
			}
			@EventHandler
			public static void Postinit(FMLPostInitializationEvent event)
			{
			
			}
			*/
}
