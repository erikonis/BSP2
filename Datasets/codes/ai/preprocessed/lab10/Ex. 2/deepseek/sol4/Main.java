import evangelion.pilots.*;
import evangelion.obstacles.*;
import evangelion.units.EvaUnit;

public class Main {
    public static void main(String[] args) {
        // Create Eva Units with different pilots
        EvaUnit<HumanPilot> unit01 = new EvaUnit<>(1, 50);
        EvaUnit<DummyPilot> unit02 = new EvaUnit<>(2, 78);
        EvaUnit<HumanPilot> unit03 = new EvaUnit<>(3, 100);

        // Test unit without pilot
        unit01.start();

        // Assign pilots
        unit01.assignPilot(new HumanPilot("Shinji", 50));
        unit02.assignPilot(new DummyPilot("Dummy", 87));
        unit03.assignPilot(new HumanPilot("Asuka", 5));

        // Start units
        unit01.start();
        unit02.start();
        unit03.start();

        // Create obstacles
        Obstacle object = new ObjectObstacle();
        Obstacle angel = new AngelObstacle(25);

        // Test maneuvers
        testManeuver(unit01, object);
        testManeuver(unit01, angel);
        testManeuver(unit01, angel);
        testManeuver(unit01, angel);
        testManeuver(unit01, angel);

        testManeuver(unit02, object);
        testManeuver(unit02, angel);

        testManeuver(unit03, object);
    }

    private static void testManeuver(EvaUnit<?> unit, Obstacle obstacle) {
        if (unit.maneuver(obstacle)) {
            System.out.printf("%s dodged %s%n", unit, obstacle);
        } else {
            System.out.printf("%s failed to dodge %s%n", unit, obstacle);
        }
    }
}