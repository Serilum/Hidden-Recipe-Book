package com.natamus.hiddenrecipebook;

import com.natamus.collective.check.ShouldLoadCheck;
import com.natamus.hiddenrecipebook.data.Variables;
import com.natamus.hiddenrecipebook.events.BookGUIEvent;
import com.natamus.hiddenrecipebook.util.Reference;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;

public class ModFabricClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() { 
		if (!ShouldLoadCheck.shouldLoad(Reference.MOD_ID)) {
			return;
		}

		registerEvents();
	}
	
	private void registerEvents() {
		ModCommon.registerHotkeys();

		ScreenEvents.AFTER_INIT.register((Minecraft client, Screen screen, int scaledWidth, int scaledHeight) -> {
			BookGUIEvent.onGUIScreen(client, screen, scaledWidth, scaledHeight);

			if (screen != null) {
				String guiname = screen.getTitle().getString().toLowerCase();
				if (guiname.equalsIgnoreCase("crafting") || guiname.equalsIgnoreCase("furnace")) {
					ScreenKeyboardEvents.afterKeyPress(screen).register((Screen eventScreen, int key, int scancode, int modifiers) -> {
						if (Variables.hotkey.matches(key, scancode)) {
							BookGUIEvent.onHotkeyPress();
						}
					});
				}
			}
		});
	}
}
