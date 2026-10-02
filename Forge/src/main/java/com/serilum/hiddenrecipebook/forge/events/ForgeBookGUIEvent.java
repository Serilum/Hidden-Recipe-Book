package com.serilum.hiddenrecipebook.forge.events;

import com.serilum.hiddenrecipebook.data.Variables;
import com.serilum.hiddenrecipebook.events.BookGUIEvent;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeBookGUIEvent {
	@SubscribeEvent
	public static void onGUIScreen(ScreenEvent.Init.Post e) {
		BookGUIEvent.onGUIScreen(Variables.mc, e.getScreen(), 0, 0);
	}

	@SubscribeEvent
	public static void onKey(ScreenEvent.KeyPressed e) {
		if (e.getKeyCode() == Variables.hotkey.getKey().getValue()) {
			BookGUIEvent.onHotkeyPress();
		}
	}
}
