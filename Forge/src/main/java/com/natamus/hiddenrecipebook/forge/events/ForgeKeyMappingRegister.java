package com.natamus.hiddenrecipebook.forge.events;

import com.mojang.blaze3d.platform.InputConstants;
import com.natamus.hiddenrecipebook.data.Variables;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeKeyMappingRegister {
    @SubscribeEvent
	public static void registerKeyBinding(RegisterKeyMappingsEvent e) {
    	Variables.hotkey = new KeyMapping("hiddenrecipebook.key.togglebook", InputConstants.Type.KEYSYM, 258, "key.categories.misc");
    	e.register(Variables.hotkey);
    }
}