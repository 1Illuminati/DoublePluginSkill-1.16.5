package doublePluginSkill.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import doublePlugin.entity.player.NewPlayer;
import doublePluginSkill.skill.Skill;

public class MainCommand implements CommandExecutor {
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
		if(!(commandSender instanceof Player)) {
			return true;
		}
		NewPlayer sender = NewPlayer.getNewPlayer((Player) commandSender);
		
		switch(command.getName()) {
			case "skill" :
				if(args.length <= 0) {
					break;
				} 
				
				if(args[0].equals("list")) {
					for(Skill skill : Skill.getSkills())                             {
						sender.sendMessage(skill.getName());
					}
				}
				
				if(!Skill.containSkill(args[0])) {
					break;
				}
				
				Skill.getSkill(args[0]).useSkill(sender);
				
            break;
		}
		return true;
	}
}
