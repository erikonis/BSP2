package evangelion.pilots;

import evangelion.obstacles.Obstacle;

public class ChildPilot extends Pilot {
    private int traumaLevel;
    
    public ChildPilot(String name, int compatibility) {
        super(name, compatibility);
        this.traumaLevel = 0;
    }
    
    @Override
    public int calculateManeuverRoll(Obstacle obstacle) {
        int baseRoll = (int)(Math.random() * 101);
        return baseRoll + (50 - traumaLevel); // Trauma affects performance
    }
    
    @Override
    public void onEvaStart() {
        traumaLevel += 5;
    }
    
    @Override
    public void onManeuver(Obstacle obstacle) {
        traumaLevel += obstacle.getMentalToll() / 2;
    }
    
    public int getTraumaLevel() { return traumaLevel; }
}