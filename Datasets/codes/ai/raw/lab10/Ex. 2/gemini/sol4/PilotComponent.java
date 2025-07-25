public interface PilotComponent {
    boolean onStart(EvaUnit<?> unit, Pilot pilot, int stability, int roll);
    boolean onManeuver(EvaUnit<?> unit, Pilot pilot, Obstacle obstacle);
}