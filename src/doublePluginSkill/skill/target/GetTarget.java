package doublePluginSkill.skill.target;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

public class GetTarget {
	public List<LivingEntity> getTarget(Location loc, double distance) {
        List<Entity> entities = loc.getWorld().getEntities();
        List<LivingEntity> returnValues = new ArrayList<>(1);
        for(Entity entity : entities) {
            if(entity instanceof LivingEntity) {
            	double entityDistance = entity.getLocation().distance(loc);
                if(entityDistance <= distance && entityDistance >= 0) {
                	if(!entity.isDead())
                		 returnValues.add((LivingEntity) entity);
                }
            }
        }
        return returnValues;
    } 
}
