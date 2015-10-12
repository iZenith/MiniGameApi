package net.izenith.Player;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class GPlayerHandler implements Listener{

	private static HashMap<Player,GPlayer> players;
	
	public static void init(){
		players = new HashMap<Player,GPlayer>();
		for(Player player : Bukkit.getOnlinePlayers()){
			addPlayer(player);
		}
	}
	
	public static void addPlayer(Player player){
		players.put(player, new GPlayer(player));
	}
	
	public static void removePlayer(Player player){
		players.remove(player);
	}
	
	public static GPlayer getPlayer(Player player){
		return players.get(player);
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		addPlayer(e.getPlayer());
	}
	
	@EventHandler
	public void onLeave(PlayerQuitEvent e){
		removePlayer(e.getPlayer());
	}
	
}
