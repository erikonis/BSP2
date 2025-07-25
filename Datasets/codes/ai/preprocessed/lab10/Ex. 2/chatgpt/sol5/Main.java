public class Main {
    public static void main(String[] args) {
        EvaUnit unit01 = new EvaUnit(1, 50);
        unit01.start();

        unit01.assignPilot(new HumanPilot("Shinji", 50));
        unit01.start();
        unit01.maneuver(new ObjectObstacle());
        unit01.maneuver(new AngelObstacle(25));
        unit01.maneuver(new AngelObstacle(25));
        unit01.maneuver(new AngelObstacle(25));
        unit01.maneuver(new AngelObstacle(25));

        EvaUnit unit02 = new EvaUnit(2, 78);
        unit02.assignPilot(new DummyPilot("Dummy", 87));
        unit02.start();
        unit02.maneuver(new ObjectObstacle());
        unit02.maneuver(new AngelObstacle(25));

        EvaUnit unit03 = new EvaUnit(3, 100);
        unit03.assignPilot(new HumanPilot("Asuka", 5));
        unit03.start();
    }
}