package com.serilum.hiddenrecipebook.neoforge.events;

import com.serilum.hiddenrecipebook.data.Variables;
import com.serilum.hiddenrecipebook.events.BookGUIEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ScreenEvent;

public class NeoForgeBookGUIEvent {
	@SubscribeEvent
	public static void onGUIScreen(ScreenEvent.Init.Post e) {
		BookGUIEvent.onGUIScreen(Variables.mc, e.getScreen(), 0, 0);
	}

	@SubscribeEvent
	public static void onKey(ScreenEvent.KeyPressed.Pre e) {
		if (e.getKey() == Variables.hotkey.getKey().getValue()) {
			BookGUIEvent.onHotkeyPress();
		}
	}
}
