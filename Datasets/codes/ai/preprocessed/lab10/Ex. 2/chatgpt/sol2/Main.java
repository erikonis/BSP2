public class Main {
    public static void main(String[] args) {
        // Eva Unit 01 without pilot
        EvaUnit<HumanPilot> unit01 = new EvaUnit<>(1, 50);
        unit01.start();  // Should fail due to no pilot

        // Assign Human pilot Shinji to unit01
        HumanPilot shinji = new HumanPilot("Shinji", 50);
        unit01.assignPilot(shinji);
        unit01.start();

        // Maneuvers
        unit01.maneuver(new ObjectObstacle());
        unit01.maneuver(new AngelObstacle(25));
        unit01.maneuver(new AngelObstacle(25));
        unit01.maneuver(new AngelObstacle(25));
        unit01.maneuver(new AngelObstacle(25));

        // Eva Unit 02 with dummy pilot
        EvaUnit<DummyPilot> unit02 = new EvaUnit<>(2, 78);
        DummyPilot dummy = new DummyPilot("Dummy", 87);
        unit02.assignPilot(dummy);
        unit02.start();
        unit02.maneuver(new ObjectObstacle());
        unit02.maneuver(new AngelObstacle(25));

        // Eva Unit 03 with human pilot Asuka
        EvaUnit<HumanPilot> unit03 = new EvaUnit<>(3, 100);
        HumanPilot asuka = new HumanPilot("Asuka", 5);
        unit03.assignPilot(asuka);
        unit03.start();
    }
}