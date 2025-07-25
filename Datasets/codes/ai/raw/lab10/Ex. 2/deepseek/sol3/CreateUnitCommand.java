public record CreateUnitCommand(
    String unitId,
    int unitNumber,
    String pilotName,
    PilotType pilotType,
    int syncLevel
) implements EvaCommand {}