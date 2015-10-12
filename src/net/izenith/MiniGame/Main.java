package net.izenith.MiniGame;

import org.bukkit.plugin.java.JavaPlugin;

import net.izenith.Player.GPlayerHandler;

public class Main extends JavaPlugin {

	public void onEnable(){
		GPlayerHandler.init();
		Vars.init(this);
	}
	
	public void onDisable(){
		
	}
	
}
