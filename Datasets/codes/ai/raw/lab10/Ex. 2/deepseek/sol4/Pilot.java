package evangelion.pilots;

import evangelion.obstacles.Obstacle;
import java.util.Random;

public abstract class Pilot {
    protected String name;
    protected int compatibility;
    protected Random random = new Random();

    public Pilot(String name, int compatibility) {
        this.name = name;
        this.compatibility = Math.max(0, Math.min(100, compatibility));
    }

    public String getName() { return name; }
    public int getCompatibility() { return compatibility; }

    public abstract int rollForManeuver(Obstacle obstacle);
    
    @Override
    public String toString() {
        return name + " (" + compatibility + " compatibility)";
    }
}