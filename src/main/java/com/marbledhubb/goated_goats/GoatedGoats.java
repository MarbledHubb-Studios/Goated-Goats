package com.marbledhubb.goated_goats;

import com.marbledhubb.goated_goats.world.item.ModItems;
import net.minecraft.world.item.*;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(GoatedGoats.MOD_ID)
public class GoatedGoats {
    public static final String MOD_ID = "goated_goats";

    public GoatedGoats(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::onCreativeModeTab);

        ModItems.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    public void onCreativeModeTab(BuildCreativeModeTabContentsEvent event)
    {
        {
            if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS)
            {
                addCreativeModeTabEntry(event, ModItems.CHEVON);
                addCreativeModeTabEntry(event, ModItems.COOKED_CHEVON);
            }
        }
    }

    private void addCreativeModeTabEntry(BuildCreativeModeTabContentsEvent event, DeferredItem<Item> item)
    {
        ItemStack itemStack = item.asItem().getDefaultInstance();
        event.insertBefore(Items.CHICKEN.getDefaultInstance(), itemStack,CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
