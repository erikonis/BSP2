public interface Pilot {
    boolean canStart();
    void afterStart();
    boolean tryDodge(Obstacle obs);
    int getCompatibility();
}