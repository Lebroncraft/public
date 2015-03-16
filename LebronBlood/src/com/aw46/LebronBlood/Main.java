package com.aw46.LebronBlood;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import com.aw46.LebronBlood.Listener.PlayerListener;

public class Main extends JavaPlugin
{
	public static String prefix = ChatColor.DARK_RED + "[" + ChatColor.RED + "Blood" + ChatColor.DARK_RED + "] " + ChatColor.RED;
	private String version = getDescription().getVersion();
	
	@Override
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
		
		getLogger().info("version " + version + " has been enabled.");

	}
		
	@Override
	public void onDisable()
	{
		getLogger().info("version " + version + " has been disabled.");
	}
	
	
	
}