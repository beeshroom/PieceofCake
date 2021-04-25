package pieceofcake;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PieceOfCake.MOD_ID);

    public static final RegistryObject<CakeSliceItem> cake_slice = ITEMS.register("cake_slice", () -> new CakeSliceItem((new Item.Properties()).tab(ItemGroup.TAB_FOOD).food(FoodRegistry.CAKE_SLICE)));
}
