public class HumanPilot implements Pilot {
    private String name;
    private int compatibility;
    private int sanity;

    public HumanPilot(String name, int compatibility) {
        this.name = name;
        this.compatibility = compatibility;
        this.sanity = 100;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCompatibility() {
        return compatibility;
    }

    @Override
    public void adjustCompatibility() {
        // No adjustment needed for HumanPilot
    }

    public int getSanity() {
        return sanity;
    }

    public void decreaseSanity(int amount) {
        sanity = Math.max(sanity - amount, 0);
    }

    @Override
    public void performAction(EvaUnit<?> evaUnit, Obstacle obstacle) {
        if (sanity == 0) {
            System.out.println(name + " cannot perform action due to zero sanity.");
            return;
        }
        int roll = new Random().nextInt(101) + 20;
        decreaseSanity(obstacle.getMentalToll());
        if (roll >= 50) {
            System.out.println(name + " successfully maneuvered the obstacle.");
        } else {
            System.out.println(name + " failed to maneuver the obstacle.");
        }
    }

    @Override
    public String toString() {
        return name + " (Compatibility: " + compatibility + ", Sanity: " + sanity + ")";
    }
}