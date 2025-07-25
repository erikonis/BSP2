import java.util.Random;

public class HumanPilot extends Pilot {
    private int sanity = 100;

    public HumanPilot(String name, int compatibility) {
        super(name, compatibility);
    }

    @Override
    public boolean canStart() {
        return sanity > 0;
    }

    @Override
    public void afterStart() {
        sanity -= 5;
    }

    @Override
    public boolean tryDodge(Obstacle obs) {
        if (sanity == 0) {
            System.out.println(this + " has lost their sanity.");
            return false;
        }

        sanity -= obs.getMentalToll();
        int roll = new Random().nextInt(101);
        roll += 20;
        return roll >= 50;
    }

    @Override
    public String toString() {
        return "(Human) " + name + " (" + compatibility + " compatibility) (" + sanity + " sanity)";
    }
}
