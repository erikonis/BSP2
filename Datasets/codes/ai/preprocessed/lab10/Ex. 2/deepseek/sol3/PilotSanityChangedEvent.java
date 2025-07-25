public record PilotSanityChangedEvent(
    String unitId,
    int delta,
    int newSanity,
    Instant timestamp
) implements EvaEvent {}