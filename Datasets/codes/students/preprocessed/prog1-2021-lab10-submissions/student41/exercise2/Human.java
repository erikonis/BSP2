public class Human extends Pilot {
    protected int sanity;

    public Human(String name, int compatibility) {
        super(name, compatibility);
        sanity = 100;
    }

    public int getSanity() {
        return sanity;
    }

    public void setSanity(int sanity) {
        this.sanity = sanity;
    }

    @Override
    public String toString() {
        return "(Human) " + super.toString() + "(" + sanity + " sanity)";
    }

    public String classString() {
        return "human";

    }

}
