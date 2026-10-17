package net.marblednull.marbledschevon.init;

import net.marblednull.marbledschevon.MarbledsChevon;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MarbledsChevon.MODID);

    public static final DeferredItem<Item> RAW_CHEVON = ITEMS.registerItem("raw_chevon", Item::new, new Item.Properties().food(ModFoods.RAW_CHEVON));
    public static final DeferredItem<Item> COOKED_CHEVON = ITEMS.registerItem("cooked_chevon", Item::new, new Item.Properties().food(ModFoods.COOKED_CHEVON));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
