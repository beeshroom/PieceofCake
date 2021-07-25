package pieceofcake;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class CakeSliceItem extends Item
{
    public CakeSliceItem(Item.Properties properties)
    {
        super(properties);
    }

    public int getUseDuration(ItemStack p_77626_1_)
    {
        return 1;
    }
}
