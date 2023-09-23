package dev.zestyblaze.deckedout;

import dev.zestyblaze.deckedout.registry.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeckedOut implements ModInitializer {
	public static final String MOD_ID = "deckedout";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static ResourceLocation id(String name) {
		return new ResourceLocation(MOD_ID, name);
	}

	@Override
	public void onInitialize() {
		BlockRegistry.register();
		ItemRegistry.register();
		EntityRegistry.register();
		CriteriaRegistry.register();
		StatsRegistry.register();
	}
}