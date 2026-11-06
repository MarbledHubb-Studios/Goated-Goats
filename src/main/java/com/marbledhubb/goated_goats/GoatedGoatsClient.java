package com.marbledhubb.goated_goats;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = GoatedGoats.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = GoatedGoats.MOD_ID, value = Dist.CLIENT)
public class GoatedGoatsClient {
    public GoatedGoatsClient(ModContainer container) {

    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {

    }
}
