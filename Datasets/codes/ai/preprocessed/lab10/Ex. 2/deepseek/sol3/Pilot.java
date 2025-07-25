public interface Pilot {
    String getName();
    int getCompatibility();
    int getSanity();
    boolean canOperate();
    void onStartAttempt();
    int rollManeuver(Obstacle obstacle);
}