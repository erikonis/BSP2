public record UnitCreatedEvent(
    String unitId,
    int unitNumber,
    String pilotName,
    PilotType pilotType,
    int syncLevel,
    Instant timestamp
) implements EvaEvent {}