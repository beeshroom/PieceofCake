package bee.beeshroom.PieceofCake.items.tools;

import java.util.List;

import bee.beeshroom.PieceofCake.Main;
import bee.beeshroom.PieceofCake.init.ModItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ToolSword extends ItemSword 
{


	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.pieceofcaketab);
		
		ModItems.ITEMS.add(this);
		
	}
	
	/* @Override
	public void registerModels() 
	{
	Main.proxy.registerItemRenderer(this,0,"inventory");
		
	} */
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) 
    {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add("unimplemented");
    }

	
}
