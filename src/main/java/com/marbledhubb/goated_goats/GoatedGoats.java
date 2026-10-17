package com.marbledhubb.goated_goats;

import com.marbledhubb.goated_goats.world.item.ModItems;
import net.minecraft.world.item.*;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredItem;

@Mod(GoatedGoats.MOD_ID)
public class GoatedGoats
{
    public static final String MOD_ID = "goated_goats";

    public GoatedGoats(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::onCreativeModeTab);

        ModItems.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

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
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
