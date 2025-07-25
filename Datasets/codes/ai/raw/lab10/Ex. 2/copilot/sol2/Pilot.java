public interface Pilot {
    String getName();
    int getCompatibility();
    void adjustCompatibility();
    void performAction(EvaUnit<?> evaUnit, Obstacle obstacle);
}