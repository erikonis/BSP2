public class Main {
    public static void main(String[] args) {
        EvaUnit unit1 = new EvaUnit(1, 50);
        unit1.start();

        HumanPilot shinji = new HumanPilot("Shinji", 50);
        unit1.setPilot(shinji);
        unit1.start();
        unit1.maneuver(new ObjectObstacle());
        unit1.maneuver(new AngelObstacle(25));
        unit1.maneuver(new AngelObstacle(25));
        unit1.maneuver(new AngelObstacle(25));
        unit1.maneuver(new AngelObstacle(25));

        EvaUnit unit2 = new EvaUnit(2, 78);
        DummyPilot dummy = new DummyPilot("Dummy", 87);
        unit2.setPilot(dummy);
        unit2.start();
        unit2.maneuver(new ObjectObstacle());
        unit2.maneuver(new AngelObstacle(25));

        EvaUnit unit3 = new EvaUnit(3, 100);
        HumanPilot asuka = new HumanPilot("Asuka", 5);
        unit3.setPilot(asuka);
        unit3.start();
    }
}
