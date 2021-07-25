package pieceofcake;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PieceOfCake.MOD_ID);

    public static final RegistryObject<CakeSliceItem> cake_slice = ITEMS.register("cake_slice", () -> new CakeSliceItem((new Item.Properties()).tab(CreativeModeTab.TAB_FOOD).food(FoodRegistry.CAKE_SLICE)));
}
