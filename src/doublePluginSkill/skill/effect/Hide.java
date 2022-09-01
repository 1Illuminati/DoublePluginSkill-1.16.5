package doublePluginSkill.skill.effect;

import java.util.Collection;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import doublePlugin.entity.player.NewPlayer;
import doublePluginSkill.DoublePluginSkill;

public class Hide {
	/**
     * 플레이어를 다른플레이어로 부터 숨긴다
     * @param hidePlayer 
     * @param cantSeePlayer
     */
    public void hidePlayer(NewPlayer hidePlayer, Collection<? extends Player> cantSeePlayer) {
        for(Player player : cantSeePlayer) {
        	player.hidePlayer(DoublePluginSkill.getPlugin(), hidePlayer.getPlayer());
        }
    }

    public void hidePlayer(NewPlayer hidePlayer) {
        hidePlayer(hidePlayer, Bukkit.getOnlinePlayers());
    }

    /**
     * 숨겨진 플레이어를 다른 플레이어로부터 보이게 한다
     * @param showPlayer
     * @param canSeePlayer
     */
    public void showPlayer(NewPlayer showPlayer, Collection<? extends Player> canSeePlayer) {
        for(Player player : canSeePlayer) {
            player.showPlayer(DoublePluginSkill.getPlugin(), showPlayer.getPlayer());
        }
    }
    
    public void showPlayer(NewPlayer hidePlayer) {
    	showPlayer(hidePlayer, Bukkit.getOnlinePlayers());
    }
    
    public void seeHidePlayer(NewPlayer canSeePlayer, Collection<? extends Player> playerList) {
    	for(Player player : playerList) {
    		canSeePlayer.showPlayer(DoublePluginSkill.getPlugin(), player);
    	}
    }
    
    public void seeHidePlayer(NewPlayer canSeePlayer) {
    	seeHidePlayer(canSeePlayer, Bukkit.getOnlinePlayers());
    }
    
    public void iCantSeePlayer(NewPlayer blindPlayer, Collection<? extends Player> playerList) {
    	for(Player player : playerList) {
    		blindPlayer.hidePlayer(player);
    	}
    }
    
    public void iCantSeePlayer(NewPlayer blindPlayer) {
    	iCantSeePlayer(blindPlayer, Bukkit.getOnlinePlayers());
    }
}
