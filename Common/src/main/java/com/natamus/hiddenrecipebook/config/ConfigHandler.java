package com.natamus.hiddenrecipebook.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.hiddenrecipebook.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry public static boolean shouldHideRecipeBook = true;
	@Entry public static boolean allowRecipeBookToggleHotkey = true;
	@Entry public static boolean showMessageOnRecipeBookToggle = false;

	public static void initConfig() {
		configMetaData.put("shouldHideRecipeBook", Arrays.asList(
			"If the recipe book should be hidden by default on first launch of the client."
		));
		configMetaData.put("allowRecipeBookToggleHotkey", Arrays.asList(
			"If the recipe book visibility can be toggled with the hotkey."
		));
		configMetaData.put("showMessageOnRecipeBookToggle", Arrays.asList(
			"If a message should be sent whenever the recipe book is shown/hidden."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}