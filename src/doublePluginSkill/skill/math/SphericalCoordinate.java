package doublePluginSkill.skill.math;

import org.bukkit.Location;
import org.bukkit.util.Vector;

public class SphericalCoordinate {
	public Vector getVec(double x, double y, double z, double pitch, double yaw) {
    	pitch = ((pitch + 90) * Math.PI) / 180D;
    	yaw = ((yaw + 90) * Math.PI) / 180D;
    	return new Vector(x * Math.sin(pitch) * Math.cos(yaw), y * Math.cos(pitch), z * Math.sin(pitch) * Math.sin(yaw));
    }
	
	public Vector getVec(Location start, Location end) {
        double pitch = ((start.getPitch() + 90) * Math.PI) / 180;
		double yaw  = ((start.getYaw() + 90)  * Math.PI) / 180;
		double x = end.getX() - start.getX();
		double y = end.getY() - start.getY();
		double z = end.getZ() - start.getZ();
		
		return new Vector(x * Math.sin(pitch) * Math.cos(yaw), y * Math.cos(pitch), z * Math.sin(pitch) * Math.sin(yaw));
    }
}
