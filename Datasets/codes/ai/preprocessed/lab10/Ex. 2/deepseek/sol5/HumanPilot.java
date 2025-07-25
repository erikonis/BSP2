import evangelion.obstacles.Obstacle;

public class HumanPilot extends Pilot {
    private int sanity;
    private boolean berserk;

    public HumanPilot(String name, int compatibility) {
        super(name, compatibility);
        this.sanity = 100;
        this.berserk = false;
    }

    @Override
    public int calculateManeuverRoll(Obstacle obstacle) {
        if (sanity == 0) return 0;
        if (berserk) return 100; // Automatic success in berserk mode

        int roll = (int)(Math.random() * 101);
        return roll + 20; // Human bonus
    }

    @Override
    public void onEvaStart() {
        sanity = Math.max(0, sanity - 5);
        if (sanity <= 30 && !berserk) {
            berserk = true;
            System.out.println(name + " has entered BERSERK mode!");
        }
    }

    @Override
    public void onManeuver(Obstacle obstacle) {
        sanity = Math.max(0, sanity - obstacle.getMentalToll());
    }

    public int getSanity() { return sanity; }
    public boolean isBerserk() { return berserk; }
}