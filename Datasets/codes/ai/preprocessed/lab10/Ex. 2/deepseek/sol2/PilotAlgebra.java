public interface PilotAlgebra<P> {
    P createHumanPilot(String name, int compatibility, int sanity);
    P createDummyPilot(String name, int compatibility);
    String getName(P pilot);
    int getEffectiveCompatibility(P pilot);
    int rollManeuver(P pilot, Obstacle obstacle);
    void onStartAttempt(P pilot);
    boolean canOperate(P pilot);
}