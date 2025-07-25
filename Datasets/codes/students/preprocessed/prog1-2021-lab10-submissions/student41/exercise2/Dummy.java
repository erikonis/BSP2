import java.util.Random;

public class Dummy extends Pilot {
    Random random = new Random();
    int reduction = random.nextInt(6);

    public Dummy(String name, int compatibility) {

        super(name, compatibility);
        super.setCompatibility(compatibility - reduction);
    }

    @Override
    public String toString() {
        return "(Dummy) " + super.toString();
    }

    public String classString() {
        return "dummy";

    }
}
