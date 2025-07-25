import java.util.Random;

public class EvaUnit<T extends Pilot> {
    private int unit, synclv;
    private T pilot;
    private boolean status;

    public EvaUnit(int unit, int synclv) {
        this.unit = unit;
        this.synclv = Math.max(0, Math.min(100, synclv));
        ;
        status = false;
    }

    public boolean start() {
        if (pilot == null) {
            System.err.println(this + " can't start: no pilot present.");
            return false;
        }
        int stablity = 100 - Math.abs(synclv - pilot.getCompatibility());
        Random random = new Random();
        if (pilot instanceof Human) {
            pilot.setSanity(pilot.getSanity() - 5);
            if (pilot.getSanity() == 0)
                System.out.println(pilot + "has lost their sanity.(F)");
        }

        int startch = random.nextInt(101);
        if (startch <= stablity) {
            System.out.println("Start sequence for " + this + ": Started");
            return true;
        } else {
            System.out.println("Start sequence for " + this + ": Failed");
            return false;
        }
    }

    public boolean dodge(Obstacle ob) {
        if (!status) {
            System.err.println(this + " failed to dodge" + ob + ".(It hasn't started so of course it cannot dodge..)");
            return false;
        }
        Random random = new Random();
        int dodgechance = random.nextInt(101);

        if (pilot instanceof Human) {
            if (pilot.getSanity() == 0) {
                System.err.println(this + " failed to dodge" + ob + "(He is kinda insane)");
                return false;
            } else {
                dodgechance += 20;
                pilot.setSanity(pilot.getSanity() - ob.getMental_toll());
                if (pilot.getSanity() <= 0) {
                    pilot.setSanity(0);
                    System.out.println(pilot + "has lost their sanity.(F)");
                }

            }

        }

        if (dodgechance >= 50) {
            System.out.println(this + " dodged " + ob);
            return true;
        } else {
            System.err.println(this + " failed to dodge" + ob + "(Unlucky..)");
            return false;

        }
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getSynclv() {
        return synclv;
    }

    public void setSynclv(int synclv) {
        this.synclv = synclv;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(T pilot) {
        System.out.println(this + " is now piloted by " + pilot);
        this.pilot = pilot;

    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String zero = "";
        if (unit < 10)
            zero = "0";
        return "EvaUnit-" + zero + unit + "(" + synclv + " sync)";
    }

}
