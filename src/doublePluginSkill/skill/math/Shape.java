package doublePluginSkill.skill.math;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.util.Vector;

public class Shape {
	public List<Vector> circle(Location center, double start, double maxDegree, double xSize, double zSize, double height) {
		List<Vector> result = new ArrayList<>();
		for (double degree = start; degree < maxDegree; degree++) {
		    double radians = Math.toRadians(degree);
		    double x = Math.cos(radians) * xSize;
		    double z = Math.sin(radians) * zSize;
		    result.add(new Vector(x, height, z));
		}
		
		return result;
	}
	
	public List<Vector> circle(Location center, double start, double maxDegree, double size, double height) {
		return this.circle(center, start, maxDegree, size, size, height);
	}
	
	public List<Vector> circle(Location center, double start, double maxDegree, double size) {
		return this.circle(center, start, maxDegree, size, size, 0);
	}
}
