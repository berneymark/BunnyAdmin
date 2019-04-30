package com.berneymark.bunnyadmin.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnUserJoin implements Listener {
    @EventHandler
    public void onUserJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        e.setJoinMessage("Welcome back to the server, " + p.getDisplayName() + "!");
    }
}
