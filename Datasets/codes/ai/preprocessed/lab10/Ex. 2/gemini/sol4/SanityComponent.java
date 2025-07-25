public class SanityComponent implements PilotComponent {
    private int sanity;

    public SanityComponent(int initialSanity) {
        this.sanity = initialSanity;
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

    @Override
    public boolean onStart(EvaUnit<?> unit, Pilot pilot, int stability, int roll) {
        if (!canAct()) {
            System.out.println("Pilot " + pilot.getName() + " has 0 sanity and cannot start.");
            return false;
        }
        reduceSanity(5);
        System.out.println("Pilot " + pilot.getName() + "'s sanity reduced to " + getSanity());
        return true; // Sanity component influences, but doesn't determine start success here
    }

    @Override
    public boolean onManeuver(EvaUnit<?> unit, Pilot pilot, Obstacle obstacle) {
        if (!canAct()) {
            System.out.println("Pilot " + pilot.getName() + " has 0 sanity and cannot maneuver.");
            return false;
        }
        reduceSanity(obstacle.getMentalToll());
        System.out.println("Pilot " + pilot.getName() + "'s sanity reduced by " + obstacle.getMentalToll() + " to " + getSanity());
        return true; // Sanity component influences, but doesn't determine maneuver success here
    }
}