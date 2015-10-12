package net.izenith.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.izenith.Player.GPlayer;

public class Game {

	private List<GPlayer> players;
	private GameState state;
	
	public Game() {
		players = new ArrayList<GPlayer>();
		state = GameState.DISABLED;
	}

	public void addPlayer(GPlayer player){
		players.add(player);
	}
	
	public void removePlayer(GPlayer player){
		players.remove(player);
	}
	
	public List<GPlayer> getPlayers(){
		List<GPlayer> playersRet = new ArrayList<GPlayer>();
		Collections.copy(playersRet, players);
		return playersRet;
	}
	
	public GameState getState(){
		return state;
	}
	
	public void setState(GameState state){
		this.state = state;
	}
	
}
