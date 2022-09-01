package doublePluginSkill.skill;

import java.util.Collection;
import java.util.HashMap;

import doublePlugin.entity.player.NewPlayer;

public abstract class Skill extends SkillParents {
    private static final HashMap<String, Skill> skillMap = new HashMap<>();
    
    public static Skill getSkill(String name) {
    	return skillMap.get(name);
    }
    
    public static boolean containSkill(String name) {
    	return skillMap.containsKey(name);
    }
    
    public static Collection<Skill> getSkills() {
    	return skillMap.values();
    }
    
    public Skill() {
    	if(getName().equals("list")) {
    		throw new IllegalArgumentException();
    	}
    	  
        skillMap.put(getName(), this);
    }
    public void useSkill(NewPlayer player) {
        if(!player.checkCoolTime(getName())) {
        	lessCoolEvent(player);
            return;
        }

        player.setCoolTimeSecond(getName(), getCoolTime());
        skill(player);
    }

    protected abstract void skill(NewPlayer player);

    public abstract void lessCoolEvent(NewPlayer player);
    
    public abstract double getCoolTime();
    
    public abstract String getName();

}
