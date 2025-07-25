import evangelion.pilots.*;
import evangelion.obstacles.*;
import evangelion.units.*;
import evangelion.contracts.*;

public class Main {
    public static void main(String[] args) {
        // Create Eva units
        EvaUnit<HumanPilot> unit01 = new ProductionEva<>(1, 50);
        EvaUnit<DummyPilot> unit02 = new ProductionEva<>(2, 75);
        EvaUnit<ChildPilot> unit00 = new ProductionEva<>(0, 90);

        // Create pilots
        HumanPilot shinji = new HumanPilot("Shinji", 50);
        DummyPilot dummy = new DummyPilot("DummySystem", 80);
        ChildPilot rei = new ChildPilot("Rei", 95);

        // Assign pilots
        unit01.assignPilot(shinji);
        unit02.assignPilot(dummy);
        unit00.assignPilot(rei);

        // Start units
        unit01.start();
        unit02.start();
        unit00.start();

        // Create obstacles
        Obstacle building = new ObjectObstacle();
        Obstacle sachiel = new AngelObstacle(30);

        // Test maneuvers
        testManeuver(unit01, building);
        testManeuver(unit01, sachiel);
        testManeuver(unit02, sachiel);
        testManeuver(unit00, sachiel);
    }

    private static void testManeuver(Maneuverable unit, Obstacle obstacle) {
        System.out.println("\n--- Testing maneuver ---");
        System.out.println("Unit: " + unit);
        System.out.println("Obstacle: " + obstacle);

        if (unit.maneuver(obstacle)) {
            System.out.println(">> Successful maneuver!");
        } else {
            System.out.println(">> Maneuver failed!");
        }
    }
}