package pieceofcake;

import net.minecraft.item.Food;

public class FoodRegistry
{
    public static final Food CAKE_SLICE = (new Food.Builder()).nutrition(2).saturationMod(0.4F).build();
}