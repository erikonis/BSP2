public class HumanPilot extends Pilot {
    private int sanity; // Sanity level, starts at 100

    public HumanPilot(String name, int compatibility) {
        super(name, compatibility);
        this.sanity = 100; // Human sanity always starts at 100
    }

    public int getSanity() {
        return sanity;
    }

    public void decreaseSanity(int amount) {
        sanity = Math.max(0, sanity - amount); // Decrease sanity but never below 0
    }
}