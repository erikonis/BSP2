public class EvaLauncher {
    public static void main(String[] args) {
        HumanPilot shinji = new HumanPilot("Shinji", 80);
        DummyPilot dummy = new DummyPilot("Dummy", 70);

        EvaUnit unit01 = new EvaUnit(1, shinji, 75);
        EvaUnit unit02 = new EvaUnit(2, dummy, 60);

        unit01.start();
        unit02.start();

        Obstacle objectObstacle = new ObjectObstacle();
        Obstacle angelObstacle = new AngelObstacle();

        unit01.maneuver(objectObstacle);
        unit01.maneuver(angelObstacle);

        unit02.maneuver(objectObstacle);
        unit02.maneuver(angelObstacle);
    }
}