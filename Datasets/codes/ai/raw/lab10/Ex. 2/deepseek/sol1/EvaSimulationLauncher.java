public class EvaSimulationLauncher {
    public static void main(String[] args) {
        // Create pilot behaviors
        HumanPilotBehavior shinjiBehavior = new HumanPilotBehavior();
        DummyPilotBehavior dummyBehavior = new DummyPilotBehavior();
        
        // Create pilots
        Pilot shinji = new ConcretePilot("Shinji Ikari", 85, shinjiBehavior);
        Pilot dummy = new ConcretePilot("Dummy System", 70, dummyBehavior);
        
        // Create Eva units
        EvaUnit unit01 = new EvaUnit(1, shinji, 80);
        EvaUnit unit02 = new EvaUnit(2, dummy, 75);
        
        // Create obstacles
        Obstacle building = new ObjectObstacle();
        Obstacle angel = new AngelObstacle();
        
        System.out.println("===== HUMAN PILOT TEST =====");
        unit01.start();
        unit01.maneuver(building);
        unit01.maneuver(angel);
        unit01.shutdown();
        
        System.out.println("\n===== DUMMY SYSTEM TEST =====");
        unit02.start();
        unit02.maneuver(building);
        unit02.maneuver(angel);
        unit02.shutdown();
        
        System.out.println("\n===== MENTAL BREAKDOWN TEST =====");
        HumanPilotBehavior reiBehavior = new HumanPilotBehavior();
        reiBehavior.sanity = 3; // Force low sanity
        Pilot rei = new ConcretePilot("Rei Ayanami", 90, reiBehavior);
        EvaUnit unit00 = new EvaUnit(0, rei, 85);
        
        unit00.start(); // Will reduce sanity to 0
        unit00.maneuver(angel); // Should fail
    }
}