package doublePluginSkill.skill.particle;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.Particle.DustOptions;

public class RedStoneParticle {
	public void spawnRedstoneParticle(Location loc, DustOptions dustOptions) {
        loc.getWorld().spawnParticle(Particle.REDSTONE, loc, 0, dustOptions);
    }

    public void spawnRedstoneParticle(Location loc, Color color, int size) {
        spawnRedstoneParticle(loc, new DustOptions(color, size));
    }

    public void spawnRedstoneParticle(Location loc, Color color) {
        spawnRedstoneParticle(loc, new DustOptions(color, 1));
    }

    public void spawnRedstoneParticle(World world, double x, double y, double z, DustOptions dustOptions) {
        spawnRedstoneParticle(new Location(world, x, y, z), dustOptions);
    }

    public void spawnRedstoneParticle(World world, double x, double y, double z, Color color, int size) {
        spawnRedstoneParticle(new Location(world, x, y, z), new DustOptions(color, size));
    }

    public void spawnRedstoneParticle(World world, double x, double y, double z, Color color) {
        spawnRedstoneParticle(new Location(world, x, y, z), new DustOptions(color, 1));
    }

    public void spawnRedstoneParticle(String world, double x, double y, double z, DustOptions dustOptions) {
        spawnRedstoneParticle(new Location(Bukkit.getWorld(world), x, y, z), dustOptions);
    }

    public void spawnRedstoneParticle(String world, double x, double y, double z, Color color, int size) {
        spawnRedstoneParticle(new Location(Bukkit.getWorld(world), x, y, z), new DustOptions(color, size));
    }

    public void spawnRedstoneParticle(String world, double x, double y, double z, Color color) {
        spawnRedstoneParticle(new Location(Bukkit.getWorld(world), x, y, z), new DustOptions(color, 1));
    }
}
