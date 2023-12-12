package com.natamus.hiddenrecipebook.forge.events;

import com.mojang.blaze3d.platform.InputConstants;
import com.natamus.hiddenrecipebook.data.Variables;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ForgeKeyMappingRegister {
    public static void initClient(final FMLClientSetupEvent event) {
    	Variables.hotkey = new KeyMapping("hiddenrecipebook.key.togglebook", InputConstants.Type.KEYSYM, 258, "key.categories.misc");
    	ClientRegistry.registerKeyBinding(Variables.hotkey);
    }
}