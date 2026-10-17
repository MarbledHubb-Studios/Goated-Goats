package com.marbledhubb.goated_goats.world.item;

import com.marbledhubb.goated_goats.GoatedGoats;
import com.marbledhubb.goated_goats.world.food.ModFoods;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GoatedGoats.MOD_ID);


    public static final DeferredItem<Item> CHEVON = ITEMS.register("chevon", () -> new Item(new Item.Properties().food(ModFoods.CHEVON)));
    public static final DeferredItem<Item> COOKED_CHEVON = ITEMS.register("cooked_chevon", () -> new Item(new Item.Properties().food(ModFoods.COOKED_CHEVON)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
