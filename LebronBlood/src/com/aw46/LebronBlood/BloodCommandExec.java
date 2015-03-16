package com.aw46.LebronBlood;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BloodCommandExec implements CommandExecutor 
{
	Main main;
	
	public BloodCommandExec(Main main)
	{
		this.main = main;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (sender instanceof Player)
		{
			Player p = (Player)sender;
			
			if (label.equalsIgnoreCase("blood"))
			{
				p.sendMessage(Main.prefix + "Blood Plugin for LebronCraft. Version: " + main.getDescription().getVersion());	
				return true;
			}
		}
		
		return false;
	}

}
