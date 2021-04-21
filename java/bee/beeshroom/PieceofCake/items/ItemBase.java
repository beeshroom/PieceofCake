package bee.beeshroom.PieceofCake.items;

import bee.beeshroom.PieceofCake.Main;
import bee.beeshroom.PieceofCake.init.ModItems;
import net.minecraft.item.Item;

public class ItemBase extends Item  {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.pieceofcaketab);
		
		ModItems.ITEMS.add(this);
		
	}
	
	/*@Override
	public void registerModels() 
	{
	Main.proxy.registerItemRenderer(this,0,"inventory");
		
	} */

}
