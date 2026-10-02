package com.serilum.hiddenrecipebook.forge.events;

import com.serilum.hiddenrecipebook.data.Variables;
import com.serilum.hiddenrecipebook.events.BookGUIEvent;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeBookGUIEvent {
	public static void registerEventsInBus() {
		BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeBookGUIEvent.class);
	}

	@SubscribeEvent
	public static void onGUIScreen(ScreenEvent.Init.Post e) {
		BookGUIEvent.onGUIScreen(Variables.mc, e.getScreen(), 0, 0);
	}

	@SubscribeEvent
	public static void onKey(ScreenEvent.KeyPressed.Pre e) {
		if (e.getKeyCode() == Variables.hotkey.getKey().getValue()) {
			BookGUIEvent.onHotkeyPress();
		}
	}
}
