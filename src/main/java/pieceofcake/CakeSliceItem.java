package pieceofcake;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CakeSliceItem extends Item
{
    public CakeSliceItem(Item.Properties p_i225737_1_)
    {
        super(p_i225737_1_);
    }

    public int getUseDuration(ItemStack p_77626_1_)
    {
        return 1;
    }
}
