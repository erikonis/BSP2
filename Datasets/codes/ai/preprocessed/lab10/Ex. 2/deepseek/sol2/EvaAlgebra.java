public interface EvaAlgebra<E, P> {
    E createUnit(int unitNumber, P pilot, int syncLevel);
    void start(E unit);
    void maneuver(E unit, Obstacle obstacle);
    void shutdown(E unit);
    boolean isActive(E unit);
}