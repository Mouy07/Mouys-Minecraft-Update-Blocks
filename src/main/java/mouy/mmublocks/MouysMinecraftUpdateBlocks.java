package mouy.mmublocks;

import net.fabricmc.api.ModInitializer;
import mouy.mmublocks.block.*;
import mouy.mmublocks.item.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MouysMinecraftUpdateBlocks implements ModInitializer {

	public static final String MOD_ID = "mmublocks";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("mmublocks");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Put a registerBlock call for each block here.
		MouysMinecraftUpdateBlocks.LOGGER.info("Registering blocks for " + MouysMinecraftUpdateBlocks.MOD_ID);
		AndesiteBricks.registerBlock();
		PolishedCalcite.registerBlock();
		CalciteBricks.registerBlock();
		DioriteBricks.registerBlock();
		GraniteBricks.registerBlock();
		PolishedMud.registerBlock();
		BlueNetherBricks.registerBlock();

		// Final version shouldn't contain any items that aren't blocks.
		MouysMinecraftUpdateBlocks.LOGGER.info("Registering items for " + MouysMinecraftUpdateBlocks.MOD_ID);
		RedNetherBrick.registerItem();
		BlueNetherBrick.registerItem();
		WarpedWart.registerItem();
	}
}