import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class HumanPilot extends Pilot {
    private int sanity;
    private final Random random = new Random();

    public HumanPilot(String name, int compatibility) {
        super(name, compatibility,
              (unit, roll) -> {
                  HumanPilot hp = (HumanPilot) unit.getPilot();
                  if (!hp.canAct()) return false;
                  hp.reduceSanity(5);
                  System.out.println("Human Pilot " + hp.getName() + "'s sanity reduced to " + hp.getSanity());
                  return roll <= Math.abs(unit.getSynchronizationLevel() - hp.getCompatibility());
              },
              (unit, obstacle) -> {
                  HumanPilot hp = (HumanPilot) unit.getPilot();
                  if (!hp.canAct()) return false;
                  int pilotRoll = new Random().nextInt(101);
                  System.out.println("Human Pilot " + hp.getName() + " rolls " + pilotRoll + " for maneuver.");
                  int effectiveRoll = hp.canAct() ? pilotRoll + 20 : 0;
                  hp.reduceSanity(obstacle.getMentalToll());
                  System.out.println("Human Pilot " + hp.getName() + "'s sanity reduced by " + obstacle.getMentalToll() + " to " + hp.getSanity() + ". Effective Roll: " + effectiveRoll);
                  return effectiveRoll >= 50;
              },
              amount -> ((HumanPilot) HumanPilot.this).sanity = Math.max(0, ((HumanPilot) HumanPilot.this).sanity - amount),
              () -> ((HumanPilot) HumanPilot.this).sanity,
              () -> ((HumanPilot) HumanPilot.this).sanity > 0);
        this.sanity = 100;
    }

    // Provide direct access for sanity in this class
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