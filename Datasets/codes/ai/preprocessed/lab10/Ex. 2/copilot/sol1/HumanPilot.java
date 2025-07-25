public class HumanPilot extends Pilot {
    private int sanity;

    public HumanPilot(String name, int compatibility) {
        super(name, compatibility);
        this.sanity = 100;
    }

    public int getSanity() {
        return sanity;
    }

    public void decreaseSanity(int amount) {
        sanity = Math.max(sanity - amount, 0);
    }

    @Override
    public void adjustCompatibility() {
        // No adjustment needed for HumanPilot
    }

    @Override
    public String toString() {
        return super.toString() + " (Sanity: " + sanity + ")";
    }
}