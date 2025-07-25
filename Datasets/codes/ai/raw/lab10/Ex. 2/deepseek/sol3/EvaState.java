public record EvaState(
    String unitId,
    int unitNumber,
    Pilot pilot,
    int syncLevel,
    boolean isActive,
    List<Obstacle> encounteredObstacles
) {
    public static EvaState initialState() {
        return new EvaState(null, 0, null, 0, false, List.of());
    }

    public EvaState apply(UnitCreatedEvent event) {
        Pilot pilot = switch(event.pilotType()) {
            case HUMAN -> new HumanPilot(event.pilotName(), 80, 100);
            case DUMMY -> new DummyPilot(event.pilotName(), 70);
        };

        return new EvaState(
            event.unitId(),
            event.unitNumber(),
            pilot,
            event.syncLevel(),
            false,
            List.of()
        );
    }

    public EvaState apply(UnitActivatedEvent event) {
        return new EvaState(
            unitId,
            unitNumber,
            pilot,
            syncLevel,
            event.success(),
            encounteredObstacles
        );
    }

    public EvaState apply(ManeuverAttemptedEvent event) {
        Obstacle obstacle = switch(event.obstacleType()) {
            case "ANGEL" -> new AngelObstacle(event.mentalToll());
            default -> new ObjectObstacle();
        };

        List<Obstacle> newObstacles = new ArrayList<>(encounteredObstacles);
        newObstacles.add(obstacle);

        // Update pilot state if human
        Pilot updatedPilot = pilot;
        if (pilot instanceof HumanPilot humanPilot) {
            updatedPilot = new HumanPilot(
                humanPilot.getName(),
                humanPilot.getBaseCompatibility(),
                humanPilot.getSanity() - event.mentalToll()
            );
        }

        return new EvaState(
            unitId,
            unitNumber,
            updatedPilot,
            syncLevel,
            isActive,
            Collections.unmodifiableList(newObstacles)
        );
    }

    public EvaState apply(UnitShutdownEvent event) {
        return new EvaState(
            unitId,
            unitNumber,
            pilot,
            syncLevel,
            false,
            encounteredObstacles
        );
    }

    public EvaState apply(PilotSanityChangedEvent event) {
        if (!(pilot instanceof HumanPilot)) {
            return this; // No change for dummy pilots
        }

        HumanPilot humanPilot = (HumanPilot) pilot;
        Pilot updatedPilot = new HumanPilot(
            humanPilot.getName(),
            humanPilot.getBaseCompatibility(),
            event.newSanity()
        );

        return new EvaState(
            unitId,
            unitNumber,
            updatedPilot,
            syncLevel,
            isActive,
            encounteredObstacles
        );
    }

    public EvaState apply(EvaEvent event) {
        return switch (event) {
            case UnitCreatedEvent e -> apply(e);
            case UnitActivatedEvent e -> apply(e);
            case ManeuverAttemptedEvent e -> apply(e);
            case UnitShutdownEvent e -> apply(e);
            case PilotSanityChangedEvent e -> apply(e);
            default -> this; // Ignore unknown events
        };
    }
}