package bee.beeshroom.PieceofCake.init;

import java.util.ArrayList;
import java.util.List;

import bee.beeshroom.PieceofCake.items.ItemBase;
//import bee.beeshroom.PieceofCake.items.cake_slice;
import bee.beeshroom.PieceofCake.items.food.ItemCustomFood;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	//public static final ToolMaterial MATERIAL_BONE = EnumHelper.addToolMaterial("material_bone", 1, 75, 4.0F, 1.9F, 15);
	
	
	//items
	//public static final Item OATS = new ItemBase("oats");

	
	
	
	//food 

	public static final Item CAKE_SLICE = new ItemCustomFood("cake_slice", 2, 0.4f, false);
/*	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 1;}*/
	
	//Tools
	//public static final ItemSword SKELETON_ARM = new ToolSword("skeleton_arm", MATERIAL_BONE);

}