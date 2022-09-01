package doublePluginSkill.skill.math;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.util.Vector;

public class Rotate {
	private static List<Double> sinXZ;
    private static List<Double> cosXZ;
    private static List<Double> sinY;
    private static List<Double> cosY;

    static {
        sinXZ = new ArrayList<>();
        cosXZ = new ArrayList<>();
        sinY = new ArrayList<>();
        cosY = new ArrayList<>();

        for(double i = 0.1; i <= 360; i+=0.1) {
            sinXZ.add(Math.sin(Math.toRadians(i)));  
            cosXZ.add(Math.cos(Math.toRadians(i)));
            sinY.add(Math.sin(Math.toRadians(-i)));
            cosY.add(Math.cos(Math.toRadians(-i)));
        }
    }

    public Vector rotate(Vector v, double xAng, double yAng, double zAng) {
        v = this.rotateX(v, xAng);
        v = this.rotateY(v, yAng);
        return this.rotateZ(v, zAng);
    }

    public Vector rotateX(Vector v, double angle) {
        return this.rotateAroundAxisX(v, cosXZ.get((int) angle * 10), sinXZ.get((int) angle * 10));
    }

    public Vector rotateY(Vector v, double angle) {
        return this.rotateAroundAxisY(v, cosY.get((int) angle * 10), sinY.get((int) angle * 10));
    }

    public Vector rotateZ(Vector v, double angle) {
        return this.rotateAroundAxisZ(v, cosXZ.get((int) angle * 10), sinXZ.get((int) angle * 10));
    }

    private Vector rotateAroundAxisX(Vector v, double cos, double sin) {
        double y = v.getY() * cos - v.getZ() * sin;
        double z = v.getY() * sin + v.getZ() * cos;
        return v.setY(y).setZ(z);
    }

    private Vector rotateAroundAxisY(Vector v, double cos, double sin) {
        double x = v.getX() * cos + v.getZ() * sin;
        double z = v.getX() * -sin + v.getZ() * cos;
        return v.setX(x).setZ(z);
    }

    private Vector rotateAroundAxisZ(Vector v, double cos, double sin) {
        double x = v.getX() * cos - v.getY() * sin;
        double y = v.getX() * sin + v.getY() * cos;
        return v.setX(x).setY(y);
    }
}
