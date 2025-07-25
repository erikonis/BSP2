public class HumanPilot extends Pilot {
    private int sanity;

    public HumanPilot(String name, int compatibility) {
        super(name, compatibility);
        this.sanity = 100;
    }

    public int getSanity() {
        return sanity;
    }

    public void reduceSanity(int amount) {
        this.sanity = Math.max(0, this.sanity - amount);
    }

    public boolean canAct() {
        return sanity > 0;
    }
}