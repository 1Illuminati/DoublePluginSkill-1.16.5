package doublePluginSkill;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import doublePluginSkill.command.MainCommand;
import doublePluginSkill.event.MainEvent;

public class DoublePluginSkill extends JavaPlugin {
	public static boolean reload;
	private static Plugin plugin;
	public static final String pluginName = "DoublePluginSkill-1.16.5";
	
	
	@Override
	public void onEnable() {
		registerCommand();
		registerEvent();
		plugin = Bukkit.getPluginManager().getPlugin(pluginName);

		sendLog("§3-----------------------------");
		sendLog(""); 
		sendLog("");
		sendLog("§3" + pluginName + " 플러그인 적용완료");
		sendLog("");
		sendLog("");
		sendLog("§3-----------------------------");
		reload = false;
	}
	
	@Override
	public void onDisable() {
		reload = true;
		sendLog("§3-----------------------------");
		sendLog(""); 
		sendLog("");
		sendLog("§3" + pluginName + " 플러그인 적용해제");
		sendLog("");
		sendLog("");
		sendLog("§3-----------------------------");
	}
	
	public static void sendLog(String log) {
		Bukkit.getConsoleSender().sendMessage("[" + pluginName + "] " + log);
	}
	
	public void registerEvent() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new MainEvent(), this);
	}
	
	public void setCommand(String commandName, MainCommand command) {
		this.getCommand(commandName).setExecutor(command);
	}
	public void registerCommand() {
		this.setCommand("skill", new MainCommand());
	}

	public static Plugin getPlugin() {
		return plugin;
	}
}
