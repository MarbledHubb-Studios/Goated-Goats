package com.marbledhubb.goated_goats;

import com.marbledhubb.goated_goats.world.item.ModItems;
import net.minecraft.world.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;

@Mod(GoatedGoats.MOD_ID)
public class GoatedGoats
{
    public static final String MOD_ID = "goated_goats";

    public GoatedGoats()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::onCreativeModeTab);

        ModItems.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    @SubscribeEvent
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

    private void addCreativeModeTabEntry(BuildCreativeModeTabContentsEvent event, RegistryObject<Item> item)
    {
        ItemStack itemStack = item.get().getDefaultInstance();
        event.getEntries().putBefore(Items.CHICKEN.getDefaultInstance(),itemStack,event.getEntries().get(Items.CHICKEN.getDefaultInstance()));
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
