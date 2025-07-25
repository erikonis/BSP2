public final class GameEventStore {
    private static final GameEventStore INSTANCE = new GameEventStore();
    private final List<GameEvent> events = new ArrayList<>();

    private GameEventStore() {}

    public static GameEventStore getInstance() {
        return INSTANCE;
    }

    public void recordEvent(GameCommand command, CommandResult result) {
        events.add(new GameEvent(
            command.getActor(),
            result.newTarget(),
            command.getClass().getSimpleName(),
            result.message(),
            result.success(),
            Instant.now()
        ));

        if (result.newTarget() != null && !result.newTarget().isAlive()) {
            events.add(new GameEvent(
                command.getActor(),
                result.newTarget(),
                "CharacterDeath",
                result.newTarget().getName() + " died",
                true,
                Instant.now()
            ));
        }
    }

    public List<String> getEventLogs() {
        return events.stream()
            .map(GameEvent::toString)
            .toList();
    }

    private record GameEvent(
        Character actor,
        Character target,
        String actionType,
        String message,
        boolean success,
        Instant timestamp
    ) {
        @Override
        public String toString() {
            return String.format("[%s] %s - %s%s",
                DateTimeFormatter.ISO_INSTANT.format(timestamp),
                actionType,
                message,
                success ? "" : " (FAILED)");
        }
    }
}