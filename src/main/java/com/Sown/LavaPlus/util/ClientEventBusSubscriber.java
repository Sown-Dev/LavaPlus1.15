package com.Sown.LavaPlus.util;

import com.Sown.LavaPlus.LavaPlus;
import com.Sown.LavaPlus.client.gui.WoodenCrateScreen;
import com.Sown.LavaPlus.init.ModContainerTypes;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = LavaPlus.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD, value= Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        ScreenManager.registerFactory(ModContainerTypes.WOODEN_CRATE.get(), WoodenCrateScreen::new);
    }

}
