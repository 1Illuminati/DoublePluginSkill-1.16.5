package doublePluginSkill.skill;

import java.util.Collection;
import java.util.List;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Particle.DustOptions;
import org.bukkit.World;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import doublePlugin.entity.player.NewPlayer;
import doublePluginSkill.skill.effect.Hide;
import doublePluginSkill.skill.math.BackFront;
import doublePluginSkill.skill.math.Line;
import doublePluginSkill.skill.math.Rotate;
import doublePluginSkill.skill.math.Shape;
import doublePluginSkill.skill.math.SphericalCoordinate;
import doublePluginSkill.skill.particle.RedStoneParticle;
import doublePluginSkill.skill.particle.SpawnParticle;
import doublePluginSkill.skill.target.GetTarget;

public class SkillParents {
	private final Hide hide = new Hide();
	private final BackFront backFront = new BackFront();
	private final Line line = new Line();
	private final Shape shape = new Shape();
	private final Rotate rotate = new Rotate();
	private final SphericalCoordinate sphericalCoordinate = new SphericalCoordinate();
	private final RedStoneParticle redStoneParticle = new RedStoneParticle();
	private final SpawnParticle spawnParticle = new SpawnParticle();
	private final GetTarget getTarget = new GetTarget();
	
	public List<Vector> circle(Location center, double start, double maxDegree, double xSize, double zSize, double height) {
		return shape.circle(center, start, maxDegree, xSize, zSize, height);
	}
	public List<Vector> circle(Location center, double start, double maxDegree, double size, double height) {
		return shape.circle(center, start, maxDegree, size, height);
	}
	public List<Vector> circle(Location center, double start, double maxDegree, double size) {
		return shape.circle(center, start, maxDegree, size);
	}
	public List<Vector> line(Vector dir, double range, double frequency) {
		return line.line(dir, range, frequency);
	}
	public List<LivingEntity> getTarget(Location loc, double distance) {
		return getTarget.getTarget(loc, distance);
	}
	public void hidePlayer(NewPlayer hidePlayer, Collection<? extends Player> cantSeePlayer) {
		hide.hidePlayer(hidePlayer, cantSeePlayer);
	}
	public void hidePlayer(NewPlayer hidePlayer) {
		hide.hidePlayer(hidePlayer);
	}
	public void showPlayer(NewPlayer showPlayer, Collection<? extends Player> canSeePlayer) {
		hide.showPlayer(showPlayer, canSeePlayer);
	}
	public void showPlayer(NewPlayer hidePlayer) {
		hide.showPlayer(hidePlayer);
	}
	public void seeHidePlayer(NewPlayer canSeePlayer, Collection<? extends Player> playerList) {
		hide.seeHidePlayer(canSeePlayer, playerList);
	}
	public void seeHidePlayer(NewPlayer canSeePlayer) {
		hide.seeHidePlayer(canSeePlayer);
	}
	public void iCantSeePlayer(NewPlayer blindPlayer, Collection<? extends Player> playerList) {
		hide.iCantSeePlayer(blindPlayer, playerList);
	}
	public void iCantSeePlayer(NewPlayer blindPlayer) {
		hide.iCantSeePlayer(blindPlayer);
	}
	public Location getFrontLocation(Location loc) {
		return backFront.getFrontLocation(loc);
	}
	public Location getBehindLocation(Location loc) {
		return backFront.getBehindLocation(loc);
	}
	public Vector rotate(Vector v, double xAng, double yAng, double zAng) {
		return rotate.rotate(v, xAng, yAng, zAng);
	}
	public Vector rotateX(Vector v, double angle) {
		return rotate.rotateX(v, angle);
	}
	public Vector rotateY(Vector v, double angle) {
		return rotate.rotateY(v, angle);
	}
	public Vector rotateZ(Vector v, double angle) {
		return rotate.rotateZ(v, angle);
	}
	public Vector getVec(double x, double y, double z, double pitch, double yaw) {
		return sphericalCoordinate.getVec(x, y, z, pitch, yaw);
	}
	public Vector getVec(Location start, Location end) {
		return sphericalCoordinate.getVec(start, end);
	}
	public void spawnRedstoneParticle(Location loc, DustOptions dustOptions) {
		redStoneParticle.spawnRedstoneParticle(loc, dustOptions);
	}
	public void spawnRedstoneParticle(Location loc, Color color, int size) {
		redStoneParticle.spawnRedstoneParticle(loc, color, size);
	}
	public void spawnRedstoneParticle(Location loc, Color color) {
		redStoneParticle.spawnRedstoneParticle(loc, color);
	}
	public void spawnRedstoneParticle(World world, double x, double y, double z, DustOptions dustOptions) {
		redStoneParticle.spawnRedstoneParticle(world, x, y, z, dustOptions);
	}
	public void spawnRedstoneParticle(World world, double x, double y, double z, Color color, int size) {
		redStoneParticle.spawnRedstoneParticle(world, x, y, z, color, size);
	}
	public void spawnRedstoneParticle(World world, double x, double y, double z, Color color) {
		redStoneParticle.spawnRedstoneParticle(world, x, y, z, color);
	}
	public void spawnRedstoneParticle(String world, double x, double y, double z, DustOptions dustOptions) {
		redStoneParticle.spawnRedstoneParticle(world, x, y, z, dustOptions);
	}
	public void spawnRedstoneParticle(String world, double x, double y, double z, Color color, int size) {
		redStoneParticle.spawnRedstoneParticle(world, x, y, z, color, size);
	}
	public void spawnRedstoneParticle(String world, double x, double y, double z, Color color) {
		redStoneParticle.spawnRedstoneParticle(world, x, y, z, color);
	}
	public void spawnParticle(Particle particle, String world, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ, double speed) {
		spawnParticle.spawnParticle(particle, world, x, y, z, count, offsetX, offsetY, offsetZ, speed);
	}
	public void spawnParticle(Particle particle, String world, double x, double y, double z) {
		spawnParticle.spawnParticle(particle, world, x, y, z);
	}
	public void spawnParticle(Particle particle, String world, double x, double y, double z, int count) {
		spawnParticle.spawnParticle(particle, world, x, y, z, count);
	}
	public void spawnParticle(Particle particle, String world, double x, double y, double z, double speed) {
		spawnParticle.spawnParticle(particle, world, x, y, z, speed);
	}
	public void spawnParticle(Particle particle, String world, double x, double y, double z, int count, double speed) {
		spawnParticle.spawnParticle(particle, world, x, y, z, count, speed);
	}
	public void spawnParticle(Particle particle, String world, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ) {
		spawnParticle.spawnParticle(particle, world, x, y, z, count, offsetX, offsetY, offsetZ);
	}
	public void spawnParticle(Particle particle, String world, double x, double y, double z, double offsetX,
			double offsetY, double offsetZ) {
		spawnParticle.spawnParticle(particle, world, x, y, z, offsetX, offsetY, offsetZ);
	}
	public void spawnParticle(Particle particle, String world, double x, double y, double z, double offsetX,
			double offsetY, double offsetZ, double speed) {
		spawnParticle.spawnParticle(particle, world, x, y, z, offsetX, offsetY, offsetZ, speed);
	}
	public void spawnParticle(Particle particle, World world, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ, double speed) {
		spawnParticle.spawnParticle(particle, world, x, y, z, count, offsetX, offsetY, offsetZ, speed);
	}
	public void spawnParticle(Particle particle, World world, double x, double y, double z) {
		spawnParticle.spawnParticle(particle, world, x, y, z);
	}
	public void spawnParticle(Particle particle, World world, double x, double y, double z, int count) {
		spawnParticle.spawnParticle(particle, world, x, y, z, count);
	}
	public void spawnParticle(Particle particle, World world, double x, double y, double z, double speed) {
		spawnParticle.spawnParticle(particle, world, x, y, z, speed);
	}
	public void spawnParticle(Particle particle, World world, double x, double y, double z, int count, double speed) {
		spawnParticle.spawnParticle(particle, world, x, y, z, count, speed);
	}
	public void spawnParticle(Particle particle, World world, double x, double y, double z, int count, double offsetX,
			double offsetY, double offsetZ) {
		spawnParticle.spawnParticle(particle, world, x, y, z, count, offsetX, offsetY, offsetZ);
	}
	public void spawnParticle(Particle particle, World world, double x, double y, double z, double offsetX,
			double offsetY, double offsetZ) {
		spawnParticle.spawnParticle(particle, world, x, y, z, offsetX, offsetY, offsetZ);
	}
	public void spawnParticle(Particle particle, World world, double x, double y, double z, double offsetX,
			double offsetY, double offsetZ, double speed) {
		spawnParticle.spawnParticle(particle, world, x, y, z, offsetX, offsetY, offsetZ, speed);
	}
	public void spawnParticle(Particle particle, Location loc, int count, double offsetX, double offsetY,
			double offsetZ, double speed) {
		spawnParticle.spawnParticle(particle, loc, count, offsetX, offsetY, offsetZ, speed);
	}
	public void spawnParticle(Particle particle, Location loc) {
		spawnParticle.spawnParticle(particle, loc);
	}
	public void spawnParticle(Particle particle, Location loc, int count) {
		spawnParticle.spawnParticle(particle, loc, count);
	}
	public void spawnParticle(Particle particle, Location loc, double speed) {
		spawnParticle.spawnParticle(particle, loc, speed);
	}
	public void spawnParticle(Particle particle, Location loc, int count, double speed) {
		spawnParticle.spawnParticle(particle, loc, count, speed);
	}
	public void spawnParticle(Particle particle, Location loc, int count, double offsetX, double offsetY,
			double offsetZ) {
		spawnParticle.spawnParticle(particle, loc, count, offsetX, offsetY, offsetZ);
	}
	public void spawnParticle(Particle particle, Location loc, double offsetX, double offsetY, double offsetZ) {
		spawnParticle.spawnParticle(particle, loc, offsetX, offsetY, offsetZ);
	}
	public void spawnParticle(Particle particle, Location loc, double offsetX, double offsetY, double offsetZ,
			double speed) {
		spawnParticle.spawnParticle(particle, loc, offsetX, offsetY, offsetZ, speed);
	}
}
