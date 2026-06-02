package com.example;

import net.fabricmc.api.ClientModInitializer;

public class AstroClientClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        AstroClient.LOGGER.info("Astro Client Client Loaded!");
    }
}
