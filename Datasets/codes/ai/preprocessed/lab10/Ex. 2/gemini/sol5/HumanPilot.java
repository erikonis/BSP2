public class HumanPilot extends Pilot implements SanityManagement {
    private int sanity;

    public HumanPilot(String name, int compatibility) {
        super(name, compatibility);
        this.sanity = 100;
    }

    @Override
    public int getSanity() {
        return sanity;
    }

    @Override
    public void reduceSanity(int amount) {
        this.sanity = Math.max(0, this.sanity - amount);
    }

    @Override
    public boolean canAct() {
        return sanity > 0;
    }

    @Override
    public PilotType getType() {
        return PilotType.HUMAN;
    }
}