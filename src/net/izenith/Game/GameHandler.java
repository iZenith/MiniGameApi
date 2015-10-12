package net.izenith.Game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;

public class GameHandler {
	
	static GameHandler gameHandler;
	
	List<Game> games;
	
	HashMap<Player,Game> queue;
	
	public GameHandler(){
		games = new ArrayList<Game>();
		queue = new HashMap<Player,Game>();
	}
	
	public static GameHandler getInstance(){
		if(gameHandler == null) gameHandler = new GameHandler();
		return gameHandler;
	}
	
}
