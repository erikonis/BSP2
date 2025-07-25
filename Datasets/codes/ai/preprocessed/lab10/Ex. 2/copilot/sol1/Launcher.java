import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EvaUnit<HumanPilot> evaUnit01 = new EvaUnit<>(1, 80);
        EvaUnit<DummyPilot> evaUnit02 = new EvaUnit<>(2, 70);

        HumanPilot shinji = new HumanPilot("Shinji", 85);
        DummyPilot dummy = new DummyPilot("Dummy", 75);

        evaUnit01.setPilot(shinji);
        evaUnit02.setPilot(dummy);

        System.out.println("Starting Eva Units...");
        evaUnit01.start();
        evaUnit02.start();

        Obstacle objectObstacle = new ObjectObstacle();
        Obstacle angelObstacle = new AngelObstacle(30);

        System.out.println("Maneuvering Eva Units...");
        evaUnit01.maneuver(objectObstacle);
        evaUnit01.maneuver(angelObstacle);
        evaUnit02.maneuver(objectObstacle);
        evaUnit02.maneuver(angelObstacle);

        scanner.close();
    }
}