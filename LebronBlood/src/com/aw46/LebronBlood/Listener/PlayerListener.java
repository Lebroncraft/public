package com.aw46.LebronBlood.Listener;

import java.util.Random;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

import com.aw46.LebronBlood.Main;

public class PlayerListener implements Listener
{
	Main main;
	Random r = new Random();
	
	public PlayerListener(Main main)
	{
		this.main = main;
	}
	
	@EventHandler
	public void onPlayerHitPlayer(EntityDamageByEntityEvent event)
	{
		Entity victim = event.getEntity();
		
		if (victim instanceof Player)
		{
			Player vic = (Player) victim;
			Location loc = vic.getLocation();

				int bloodChance = r.nextInt(6);
				
				// Debug message
				// Bukkit.getServer().broadcastMessage(Main.prefix + "Chance value: " + bloodChance);
				
				if (bloodChance == 1) // 1:6 chance
				{
					World world = vic.getWorld();
					world.playEffect(loc, Effect.STEP_SOUND, Material.REDSTONE_BLOCK);
				}
		}
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event)
	{	
		Player p = event.getEntity();
		Location loc = p.getLocation();
		World world = p.getWorld();

		for (int i=0; i < 2; i++)
		{
			world.playEffect(loc, Effect.STEP_SOUND, Material.REDSTONE_BLOCK);
		}
		
	}
}
