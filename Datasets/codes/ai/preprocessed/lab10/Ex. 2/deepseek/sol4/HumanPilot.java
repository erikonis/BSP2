import evangelion.obstacles.Obstacle;

public class HumanPilot extends Pilot {
    private int sanity;

    public HumanPilot(String name, int compatibility) {
        super(name, compatibility);
        this.sanity = 100;
    }

    public int getSanity() { return sanity; }

    public void reduceSanity(int amount) {
        sanity = Math.max(0, sanity - amount);
    }

    @Override
    public int rollForManeuver(Obstacle obstacle) {
        if (sanity == 0) return 0;

        int roll = random.nextInt(101);
        reduceSanity(obstacle.getMentalToll());
        return roll + 20; // Human pilots get +20 bonus
    }

    @Override
    public String toString() {
        return "(Human) " + super.toString() + " (" + sanity + " sanity)";
    }
}