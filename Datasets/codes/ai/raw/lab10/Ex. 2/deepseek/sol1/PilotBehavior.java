public interface PilotBehavior {
    int calculateEffectiveCompatibility(int baseCompatibility);
    int performManeuverRoll(Obstacle obstacle);
    void onStartAttempt();
    boolean isOperational();
}