import java.util.Random;

public class RuleEngine {
    private static final Random random = new Random();

    public static boolean canStart(EvaUnit<?> unit, Pilot pilot, int stability, int roll) {
        if (pilot == null) return false;

        if (pilot instanceof HumanPilot) {
            HumanPilot hp = (HumanPilot) pilot;
            if (!hp.canAct()) {
                System.out.println("Human Pilot " + hp.getName() + " has 0 sanity and cannot start.");
                return false;
            }
            hp.reduceSanity(5);
            System.out.println("Human Pilot " + hp.getName() + "'s sanity reduced to " + hp.getSanity());
        }

        // Base Rule: Roll <= Stability
        return roll <= stability;
    }

    public static boolean canManeuver(EvaUnit<?> unit, Pilot pilot, Obstacle obstacle) {
        if (pilot == null) return false;

        int pilotRoll = random.nextInt(101);
        System.out.println("Pilot " + pilot.getName() + " rolls " + pilotRoll + " for maneuver.");

        if (pilot instanceof HumanPilot) {
            HumanPilot hp = (HumanPilot) pilot;
            if (!hp.canAct()) {
                System.out.println("Human Pilot " + hp.getName() + " has 0 sanity and cannot maneuver.");
                return false;
            }
            int effectiveRoll = hp.canAct() ? pilotRoll + 20 : 0;
            hp.reduceSanity(obstacle.getMentalToll());
            System.out.println("Human Pilot " + hp.getName() + "'s sanity reduced by " + obstacle.getMentalToll() + " to " + hp.getSanity() + ". Effective Roll: " + effectiveRoll);
            return effectiveRoll >= 50;
        } else {
            return pilotRoll >= 50;
        }
    }
}