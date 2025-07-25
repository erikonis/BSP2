public class EvaLauncher {
    private final PilotAlgebra<Pilot> pilotAlgebra;
    private final EvaAlgebra<EvaUnit, Pilot> evaAlgebra;

    public EvaLauncher(PilotAlgebra<Pilot> pilotAlgebra,
                      EvaAlgebra<EvaUnit, Pilot> evaAlgebra) {
        this.pilotAlgebra = pilotAlgebra;
        this.evaAlgebra = evaAlgebra;
    }

    public void runSimulation() {
        // Create pilots
        Pilot shinji = pilotAlgebra.createHumanPilot("Shinji Ikari", 85, 100);
        Pilot dummy = pilotAlgebra.createDummyPilot("Dummy System", 70);

        // Create Eva units
        EvaUnit unit01 = evaAlgebra.createUnit(1, shinji, 80);
        EvaUnit unit02 = evaAlgebra.createUnit(2, dummy, 75);

        // Create obstacles
        Obstacle building = new ObjectObstacle();
        Obstacle angel = new AngelObstacle();

        System.out.println("===== HUMAN PILOT TEST =====");
        evaAlgebra.start(unit01);
        evaAlgebra.maneuver(unit01, building);
        evaAlgebra.maneuver(unit01, angel);
        evaAlgebra.shutdown(unit01);

        System.out.println("\n===== DUMMY SYSTEM TEST =====");
        evaAlgebra.start(unit02);
        evaAlgebra.maneuver(unit02, building);
        evaAlgebra.maneuver(unit02, angel);
        evaAlgebra.shutdown(unit02);
    }

    public static void main(String[] args) {
        PilotAlgebra<Pilot> pilotInterpreter = new LivePilotInterpreter();
        EvaAlgebra<EvaUnit, Pilot> evaInterpreter = new LiveEvaInterpreter(pilotInterpreter);

        new EvaLauncher(pilotInterpreter, evaInterpreter).runSimulation();
    }
}