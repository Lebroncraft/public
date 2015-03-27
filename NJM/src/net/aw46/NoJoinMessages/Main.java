package net.aw46.NoJoinMessages;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{
	@Override
	public void onEnable()
	{
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable()
	{
	}
	
	@EventHandler (priority = EventPriority.HIGHEST, ignoreCancelled=false)
	public void onJoin(PlayerJoinEvent event)
	{
		event.setJoinMessage(null);
	}
	
	@EventHandler (priority = EventPriority.HIGHEST, ignoreCancelled=false)
	public void onLeave(PlayerQuitEvent event)
	{
		event.setQuitMessage(null);
	}

}
