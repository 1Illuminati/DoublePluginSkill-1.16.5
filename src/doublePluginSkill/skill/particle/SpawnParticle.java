package doublePluginSkill.skill.particle;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;

public class SpawnParticle {
	public void spawnParticle(Particle particle, String world, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ, double speed) {
		spawnParticle(particle, new Location(Bukkit.getWorld(world), x, y ,z), count, offsetX, offsetY, offsetZ, speed);
	}
	
	public void spawnParticle(Particle particle, String world, double x, double y, double z) {
		spawnParticle(particle, new Location(Bukkit.getWorld(world), x, y ,z), 1, 0, 0, 0, 0);
	}
	
	public void spawnParticle(Particle particle, String world, double x, double y, double z, int count) {
		spawnParticle(particle, new Location(Bukkit.getWorld(world), x, y ,z), count, 0, 0, 0, 0);
	}
	
	public void spawnParticle(Particle particle, String world, double x, double y, double z, double speed) {
		spawnParticle(particle, new Location(Bukkit.getWorld(world), x, y ,z), 0, 0, 0, 0, speed);
	}
	
	public void spawnParticle(Particle particle, String world, double x, double y, double z, int count, double speed) {
		spawnParticle(particle, new Location(Bukkit.getWorld(world), x, y ,z), count, 0, 0, 0, speed);
	}
	
	public void spawnParticle(Particle particle, String world, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ) {
		spawnParticle(particle, new Location(Bukkit.getWorld(world), x, y ,z), count, offsetX, offsetY, offsetZ, 0);
	}
	
	public void spawnParticle(Particle particle, String world, double x, double y, double z, double offsetX, double offsetY, double offsetZ) {
		spawnParticle(particle, new Location(Bukkit.getWorld(world), x, y ,z), 0, offsetX, offsetY, offsetZ, 0);
	}
	
	public void spawnParticle(Particle particle, String world, double x, double y, double z, double offsetX, double offsetY, double offsetZ, double speed) {
		spawnParticle(particle, new Location(Bukkit.getWorld(world), x, y ,z), 0, offsetX, offsetY, offsetZ, speed);
	}

	public void spawnParticle(Particle particle, World world, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ, double speed) {
		spawnParticle(particle, new Location(world, x, y ,z), count, offsetX, offsetY, offsetZ, speed);
	}
	
	public void spawnParticle(Particle particle, World world, double x, double y, double z) {
		spawnParticle(particle, new Location(world, x, y ,z), 1, 0, 0, 0, 0);
	}
	
	public void spawnParticle(Particle particle, World world, double x, double y, double z, int count) {
		spawnParticle(particle, new Location(world, x, y ,z), count, 0, 0, 0, 0);
	}
	
	public void spawnParticle(Particle particle, World world, double x, double y, double z, double speed) {
		spawnParticle(particle, new Location(world, x, y ,z), 0, 0, 0, 0, speed);
	}
	
	public void spawnParticle(Particle particle, World world, double x, double y, double z, int count, double speed) {
		spawnParticle(particle, new Location(world, x, y ,z), count, 0, 0, 0, speed);
	}
	
	public void spawnParticle(Particle particle, World world, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ) {
		spawnParticle(particle, new Location(world, x, y ,z), count, offsetX, offsetY, offsetZ, 0);
	}
	
	public void spawnParticle(Particle particle, World world, double x, double y, double z, double offsetX, double offsetY, double offsetZ) {
		spawnParticle(particle, new Location(world, x, y ,z), 0, offsetX, offsetY, offsetZ, 0);
	}
	
	public void spawnParticle(Particle particle, World world, double x, double y, double z, double offsetX, double offsetY, double offsetZ, double speed) {
		spawnParticle(particle, new Location(world, x, y ,z), 0, offsetX, offsetY, offsetZ, speed);
	}

	public void spawnParticle(Particle particle, Location loc, int count, double offsetX, double offsetY, double offsetZ, double speed) {
		loc.getWorld().spawnParticle(particle, loc, count, offsetX, offsetY, offsetZ, speed);
	}
	
	public void spawnParticle(Particle particle, Location loc) {
		spawnParticle(particle, loc, 1, 0, 0, 0, 0);
	}
	
	public void spawnParticle(Particle particle, Location loc, int count) {
		spawnParticle(particle, loc, count, 0, 0, 0, 0);
	}
	
	public void spawnParticle(Particle particle, Location loc, double speed) {
		spawnParticle(particle, loc, 0, 0, 0, 0, speed);
	}
	
	public void spawnParticle(Particle particle, Location loc, int count, double speed) {
		spawnParticle(particle, loc, count, 0, 0, 0, speed);
	}
	
	public void spawnParticle(Particle particle, Location loc, int count, double offsetX, double offsetY, double offsetZ) {
		spawnParticle(particle, loc, count, offsetX, offsetY, offsetZ, 0);
	}
	
	public void spawnParticle(Particle particle, Location loc, double offsetX, double offsetY, double offsetZ) {
		spawnParticle(particle, loc, 0, offsetX, offsetY, offsetZ, 0);
	}
	
	public void spawnParticle(Particle particle, Location loc, double offsetX, double offsetY, double offsetZ, double speed) {
		spawnParticle(particle, loc, 0, offsetX, offsetY, offsetZ, speed);
	}
}
