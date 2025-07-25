public final class GameEngine {
    private final Map<String, Character> characters = new HashMap<>();
    private final GameEventStore eventStore = GameEventStore.getInstance();

    public void registerCharacter(Character character) {
        characters.put(character.getName(), character);
    }

    public Optional<Character> getCharacter(String name) {
        return Optional.ofNullable(characters.get(name));
    }

    public void executeCommand(GameCommand command) {
        CommandResult result = command.execute();
        eventStore.recordEvent(command, result);

        // Update character states
        if (result.newTarget() != null) {
            characters.put(result.newTarget().getName(), result.newTarget());
        }
    }

    public void printEventLog() {
        eventStore.getEventLogs().forEach(System.out::println);
    }
}