package doublePluginSkill.skill.math;

import org.bukkit.Location;

public class BackFront {
	public Location getFrontLocation(Location loc) {
        float ang = loc.getYaw() + 90;

        if (ang < 0) ang += 360;

        double newX = Math.cos(Math.toRadians(ang));
        double newZ = Math.sin(Math.toRadians(ang));
        return new Location(loc.getWorld(), loc.getX() + newX, loc.getY() + 1, loc.getZ() + newZ, loc.getYaw(), loc.getPitch());
    }
	
	public Location getBehindLocation(Location loc) {
        float ang = loc.getYaw() + 90;

        if (ang < 0) ang += 360;

        double newX = Math.cos(Math.toRadians(ang));
        double newZ = Math.sin(Math.toRadians(ang));

        return new Location(loc.getWorld(), loc.getX() - newX, loc.getY(), loc.getZ() - newZ, loc.getYaw(), loc.getPitch());
    }
}
