package bee.beeshroom.PieceofCake.tabs;

import bee.beeshroom.PieceofCake.init.ModBlocks;
import bee.beeshroom.PieceofCake.init.ModItems;
import bee.beeshroom.PieceofCake.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PieceofCakeTab extends CreativeTabs
{
	public PieceofCakeTab(String label) {super("pieceofcake");}
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.CAKE_SLICE);}

	}

	
