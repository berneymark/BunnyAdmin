package com.berneymark.bunnyadmin;

import org.bukkit.plugin.java.JavaPlugin;

public final class BunnyAdmin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Bunny Admin starting up.");
        System.out.println("Created by TheKingOEmeralds");
    }

    @Override
    public void onDisable() {
        System.out.println("Bunny Admin shutting down.");
    }
}
