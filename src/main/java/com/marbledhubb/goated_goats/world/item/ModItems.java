package com.marbledhubb.goated_goats.world.item;

import com.marbledhubb.goated_goats.GoatedGoats;
import com.marbledhubb.goated_goats.world.food.ModFoods;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
    DeferredRegister.create(ForgeRegistries.ITEMS, GoatedGoats.MOD_ID);

    public static final RegistryObject<Item> CHEVON = ITEMS.register("chevon", () -> new Item(new Item.Properties().food(ModFoods.CHEVON)));
    public static final RegistryObject<Item> COOKED_CHEVON = ITEMS.register("cooked_chevon", () -> new Item(new Item.Properties().food(ModFoods.COOKED_CHEVON)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
