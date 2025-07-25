import java.util.Random;

public class LiveEvaInterpreter implements EvaAlgebra<EvaUnit, Pilot> {
    private static final Random random = new Random();
    private final PilotAlgebra<Pilot> pilotAlgebra;

    public LiveEvaInterpreter(PilotAlgebra<Pilot> pilotAlgebra) {
        this.pilotAlgebra = pilotAlgebra;
    }

    @Override
    public EvaUnit createUnit(int unitNumber, Pilot pilot, int syncLevel) {
        return new EvaUnit(unitNumber, pilot, syncLevel);
    }

    @Override
    public void start(EvaUnit unit) {
        if (!pilotAlgebra.canOperate(unit.getPilot())) {
            System.out.printf("%s cannot pilot Unit-%d (mental breakdown)%n",
                            pilotAlgebra.getName(unit.getPilot()), unit.getUnitNumber());
            return;
        }

        pilotAlgebra.onStartAttempt(unit.getPilot());
        int stability = 100 - Math.abs(unit.getSyncLevel() - pilotAlgebra.getEffectiveCompatibility(unit.getPilot()));
        int roll = random.nextInt(101);

        if (roll <= stability) {
            unit.setActive(true);
            System.out.printf("Unit-%d activated! %s synchronized successfully.%n",
                            unit.getUnitNumber(), pilotAlgebra.getName(unit.getPilot()));
        } else {
            System.out.printf("Unit-%d failed to start! Synchronization unstable.%n", unit.getUnitNumber());
        }
    }

    @Override
    public void maneuver(EvaUnit unit, Obstacle obstacle) {
        if (!unit.isActive()) {
            System.out.printf("Unit-%d must be activated first!%n", unit.getUnitNumber());
            return;
        }

        if (!pilotAlgebra.canOperate(unit.getPilot())) {
            System.out.printf("%s cannot maneuver Unit-%d (mental breakdown)%n",
                            pilotAlgebra.getName(unit.getPilot()), unit.getUnitNumber());
            return;
        }

        int roll = pilotAlgebra.rollManeuver(unit.getPilot(), obstacle);
        boolean success = roll >= 50;

        System.out.printf("Unit-%d attempting maneuver against %s...%n",
                        unit.getUnitNumber(), obstacle.getDescription());
        System.out.printf("%s rolled %d %s%n",
                        pilotAlgebra.getName(unit.getPilot()), roll,
                        success ? "(Success!)" : "(Failed)");
    }

    @Override
    public void shutdown(EvaUnit unit) {
        unit.setActive(false);
        System.out.printf("Unit-%d shutting down...%n", unit.getUnitNumber());
    }

    @Override
    public boolean isActive(EvaUnit unit) {
        return unit.isActive();
    }
}