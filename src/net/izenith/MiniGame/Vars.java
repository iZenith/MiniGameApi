package net.izenith.MiniGame;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

import net.izenith.Player.GPlayerHandler;

public class Vars {

	static List<Listener> listeners;
	
	public static void init(Main plugin){
		listeners = new ArrayList<Listener>();
		listeners.add(new GPlayerHandler());
		
		for(Listener listener : listeners){
			Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
		}
	}
	
}
