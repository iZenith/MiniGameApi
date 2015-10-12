package net.izenith.Game;

public enum GameState {

	RUNNING(false),
	WAITING(true),
	STARTING(true),
	DISABLED(false);
	
	private boolean canJoin;
	
	private GameState(boolean canJoin){
		this.canJoin = canJoin;
	}
	
	public boolean canJoin(){
		return canJoin;
	}
	
}
