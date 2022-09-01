package doublePluginSkill.skill.math;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.util.Vector;

public class Line {
	public List<Vector> line(Vector dir, double range, double frequency) {
		List<Vector> result = new ArrayList<>();
		
		for(double i = 0; i < range; i+=frequency) {
			Vector vec = dir.clone().multiply(i);
			result.add(vec);
		}
		
		return result;
	}
}
