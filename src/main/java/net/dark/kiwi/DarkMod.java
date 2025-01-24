package net.dark.kiwi;
//note hi test
import net.dark.kiwi.block.ModBlocks;
import net.dark.kiwi.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DarkMod implements ModInitializer {
	public static final String MOD_ID = "dark-mod";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


	}
}