public record UnitShutdownEvent(
    String unitId,
    Instant timestamp
) implements EvaEvent {}