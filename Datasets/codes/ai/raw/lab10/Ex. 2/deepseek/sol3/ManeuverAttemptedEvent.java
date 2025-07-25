public record ManeuverAttemptedEvent(
    String unitId,
    String obstacleType,
    boolean success,
    int roll,
    int mentalToll,
    Instant timestamp
) implements EvaEvent {}