public class Launcher {
    public static void main(String[] args) {
        try {
            // Human Pilot and Eva Unit
            HumanPilot shinji = new HumanPilot("Shinji Ikari", 75);
            EvaUnit<HumanPilot> eva01 = new EvaUnit<>(1, shinji);
            ObjectObstacle object1 = new ObjectObstacle("Large Boulder");
            AngelObstacle angel1 = new AngelObstacle("Sachiel", 60);

            System.out.println("--- Human Pilot and Eva Unit ---");
            eva01.start();
            eva01.maneuver(object1);
            eva01.maneuver(angel1);
            eva01.start(); // Try starting again after sanity loss
            eva01.maneuver(angel1); // Try maneuvering again with potentially lower sanity

            System.out.println("\n--- Dummy Pilot and Eva Unit ---");
            DummyPilot reiDummy = new DummyPilot("Dummy Rei", 80);
            EvaUnit<DummyPilot> eva00Dummy = new EvaUnit<>(0, reiDummy);
            AngelObstacle angel2 = new AngelObstacle("Ramiel");
            ObjectObstacle object2 = new ObjectObstacle("Fallen Debris");

            eva00Dummy.start();
            eva00Dummy.maneuver(angel2);
            eva00Dummy.maneuver(object2);
            eva00Dummy.start(); // Try starting again
            eva00Dummy.maneuver(angel2); // Try maneuvering again

            System.out.println("\n--- Human Pilot with Low Compatibility ---");
            HumanPilot asuka = new HumanPilot("Asuka Langley", 30);
            EvaUnit<HumanPilot> eva02 = new EvaUnit<>(2, asuka);
            AngelObstacle angel3 = new AngelObstacle("Zeruel", 90);

            eva02.start();
            eva02.maneuver(angel3);

            System.out.println("\n--- Eva Unit without Pilot ---");
            EvaUnit<HumanPilot> evaWithoutPilot = new EvaUnit<>(3, null);
            evaWithoutPilot.start();
            evaWithoutPilot.maneuver(object1);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}