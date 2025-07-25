import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Example of creating Human and Dummy pilots and Eva Units
        EvaUnit<HumanPilot> humanEva = new EvaUnit<>(1, new HumanPilot("Shinji", 85), 80);
        EvaUnit<DummyPilot> dummyEva = new EvaUnit<>(2, new DummyPilot("Dummy Pilot", 50), 70);

        // Test the Eva Units
        humanEva.start(); // Should succeed
        dummyEva.start(); // Should succeed, but with dummy pilot behavior

        // Maneuvering obstacles
        Obstacle objectObstacle = new ObjectObstacle();
        Obstacle angelObstacle = new AngelObstacle(30);

        humanEva.maneuver(objectObstacle);
        humanEva.maneuver(angelObstacle);

        dummyEva.maneuver(objectObstacle);
    }
}