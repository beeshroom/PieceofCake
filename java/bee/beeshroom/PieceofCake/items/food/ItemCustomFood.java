package bee.beeshroom.PieceofCake.items.food;

import bee.beeshroom.PieceofCake.Main;
import bee.beeshroom.PieceofCake.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemCustomFood extends ItemFood
{
	public ItemCustomFood(String name, int amount, float saturation, boolean iswolffood)
	{
		super(amount, saturation, iswolffood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.pieceofcaketab);
		
		ModItems.ITEMS.add(this);
		
	
		
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 3; 
	} 
	
	/*@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	} */
}
