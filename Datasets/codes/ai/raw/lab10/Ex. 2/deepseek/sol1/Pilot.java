public interface Pilot {
    String getName();
    int getCompatibility();
    int rollManeuver(Obstacle obstacle);
    void onStartAttempt();
    boolean canOperate();
}