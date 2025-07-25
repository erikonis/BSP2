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
        // HumanPilot compatibility remains stable
    }

    public int getSanity() {
        return sanity;
    }

    public void decreaseSanity(int amount) {
        sanity = Math.max(sanity - amount, 0);
    }
}