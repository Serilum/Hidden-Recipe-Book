package com.natamus.hiddenrecipebook;

import com.natamus.collective.services.Services;
import com.natamus.hiddenrecipebook.config.ConfigHandler;
import com.natamus.hiddenrecipebook.data.Variables;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		
	}

	public static void registerHotkeys() {
		Variables.hotkey = Services.REGISTERKEYMAPPING.registerKeyMapping("hiddenrecipebook.key.togglebook", 258, "key.categories.misc");
	}
}