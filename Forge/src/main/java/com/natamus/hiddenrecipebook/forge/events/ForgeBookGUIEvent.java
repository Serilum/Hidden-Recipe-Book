package com.natamus.hiddenrecipebook.forge.events;

import com.natamus.hiddenrecipebook.data.Variables;
import com.natamus.hiddenrecipebook.events.BookGUIEvent;
import net.minecraftforge.api.distmarker.Dist;
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
