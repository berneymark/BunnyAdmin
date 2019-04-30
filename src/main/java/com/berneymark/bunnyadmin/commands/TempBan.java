package com.berneymark.bunnyadmin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TempBan implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (args.length == 0)
                p.sendMessage("You need to enter a target.");
            else if (args.length == 1) {
                String targetUser = args[0];
            } else p.sendMessage("Only one argument is required.");
        } else {
            if (args.length == 0)
                System.out.println("You need to enter a target.");
            else if (args.length == 1) {
                String targetUser = args[0];
            } else System.out.println("Only one argument is required.");
        }



        return false;
    }
}
