public record UnitActivatedEvent(
    String unitId,
    boolean success,
    int stabilityScore,
    int roll,
    Instant timestamp
) implements EvaEvent {}