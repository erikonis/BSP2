package evangelion.pilots;

import evangelion.obstacles.Obstacle;

public abstract class Pilot {
    protected String name;
    protected int compatibility;
    
    public Pilot(String name, int compatibility) {
        this.name = name;
        this.compatibility = Math.max(0, Math.min(100, compatibility));
    }
    
    public abstract int calculateManeuverRoll(Obstacle obstacle);
    public abstract void onEvaStart();
    public abstract void onManeuver(Obstacle obstacle);
    
    public String getName() { return name; }
    public int getCompatibility() { return compatibility; }
}