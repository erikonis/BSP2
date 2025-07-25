import java.time.Instant;
import java.util.concurrent.ThreadLocalRandom;

public class EvaCommandHandler {
    private final EventStore eventStore;

    public EvaCommandHandler(EventStore eventStore) {
        this.eventStore = eventStore;
    }

    public void handle(CreateUnitCommand command) {
        eventStore.publish(new UnitCreatedEvent(
            command.unitId(),
            command.unitNumber(),
            command.pilotName(),
            command.pilotType(),
            command.syncLevel(),
            Instant.now()
        ));
    }

    public void handle(ActivateUnitCommand command) {
        EvaState state = eventStore.getCurrentState(command.unitId());

        if (!state.pilot().canOperate()) {
            eventStore.publish(new UnitActivatedEvent(
                command.unitId(),
                false,
                0,
                0,
                Instant.now()
            ));
            return;
        }

        state.pilot().onStartAttempt();
        int stability = 100 - Math.abs(state.syncLevel() - state.pilot().getCompatibility());
        int roll = ThreadLocalRandom.current().nextInt(101);
        boolean success = roll <= stability;

        eventStore.publish(new PilotSanityChangedEvent(
            command.unitId(),
            -5,
            state.pilot().getSanity(),
            Instant.now()
        ));

        eventStore.publish(new UnitActivatedEvent(
            command.unitId(),
            success,
            stability,
            roll,
            Instant.now()
        ));
    }

    public void handle(ManeuverCommand command) {
        EvaState state = eventStore.getCurrentState(command.unitId());

        if (!state.isActive()) {
            eventStore.publish(new ManeuverAttemptedEvent(
                command.unitId(),
                command.obstacleType().toString(),
                false,
                0,
                0,
                Instant.now()
            ));
            return;
        }

        if (!state.pilot().canOperate()) {
            eventStore.publish(new ManeuverAttemptedEvent(
                command.unitId(),
                command.obstacleType().toString(),
                false,
                0,
                0,
                Instant.now()
            ));
            return;
        }

        int mentalToll = command.obstacleType() == ObstacleType.ANGEL ?
            ThreadLocalRandom.current().nextInt(101) : 0;

        int roll = state.pilot().rollManeuver(
            command.obstacleType() == ObstacleType.ANGEL ?
                new AngelObstacle(mentalToll) : new ObjectObstacle()
        );

        boolean success = roll >= 50;

        if (state.pilot() instanceof HumanPilot) {
            eventStore.publish(new PilotSanityChangedEvent(
                command.unitId(),
                -mentalToll,
                state.pilot().getSanity() - mentalToll,
                Instant.now()
            ));
        }

        eventStore.publish(new ManeuverAttemptedEvent(
            command.unitId(),
            command.obstacleType().toString(),
            success,
            roll,
            mentalToll,
            Instant.now()
        ));
    }

    public void handle(ShutdownCommand command) {
        EvaState state = eventStore.getCurrentState(command.unitId());

        if (state.isActive()) {
            eventStore.publish(new UnitShutdownEvent(
                command.unitId(),
                Instant.now()
            ));
        }
    }

    public void handle(EvaCommand command) {
        switch (command) {
            case CreateUnitCommand c -> handle(c);
            case ActivateUnitCommand c -> handle(c);
            case ManeuverCommand c -> handle(c);
            case ShutdownCommand c -> handle(c);
            default -> throw new IllegalArgumentException("Unknown command type");
        }
    }
}