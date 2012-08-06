package me.joshcvb.fasttravel;

import org.spout.*;
import org.spout.vanilla.material.item.BlockItem;

public class Cuboid {
		  private Location p1;
		  private Location p2;
		  private Location spawn;
		  private String name;

		  public Cuboid(Location p1, Location p2, Location spawn, String name)
		  {
		    this.p1 = p1;
		    this.p2 = p2;
		    this.spawn = spawn;
		    this.name = name;
		  }

		  public String getName() {
		    return this.name;
		  }

		  public boolean isInCuboid(BlockItem b)
		  {
		    double maxx = Math.max(this.p1.getX(), this.p2.getX());
		    double maxy = Math.max(this.p1.getY(), this.p2.getY());
		    double maxz = Math.max(this.p1.getZ(), this.p2.getZ());
		    double minx = Math.min(this.p1.getX(), this.p2.getX());
		    double miny = Math.min(this.p1.getY(), this.p2.getY());
		    double minz = Math.min(this.p1.getZ(), this.p2.getZ());
		    if ((b.getX() > maxx) || (b.getX() < minx)) return false;
		    if ((b.getY() > maxy) || (b.getY() < miny)) return false;
		    return (b.getZ() <= maxz) && (b.getZ() >= minz);
		  }

		  public boolean isInCuboid(Location l)
		  {
		    double maxx = Math.max(this.p1.getX(), this.p2.getX());
		    double maxy = Math.max(this.p1.getY(), this.p2.getY());
		    double maxz = Math.max(this.p1.getZ(), this.p2.getZ());
		    double minx = Math.min(this.p1.getX(), this.p2.getX());
		    double miny = Math.min(this.p1.getY(), this.p2.getY());
		    double minz = Math.min(this.p1.getZ(), this.p2.getZ());
		    if ((l.getX() > maxx) || (l.getX() < minx)) return false;
		    if ((l.getY() > maxy) || (l.getY() < miny)) return false;
		    return (l.getZ() <= maxz) && (l.getZ() >= minz);
		  }

		  public Location getPoint1()
		  {
		    return this.p1;
		  }

		  public Location getPoint2() {
		    return this.p2;
		  }

		  public Location getSpawn() {
		    return this.spawn;
		  }

		  public void setSpawn(Location loc) {
		    this.spawn = loc;
		  }
		}
