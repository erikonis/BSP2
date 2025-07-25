import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public final class GameEngine {
    private final Map<String, Character> characters = new HashMap<>();
    private final GameLogger logger = GameLogger.getInstance();

    public GameEngine registerCharacter(Character character) {
        characters.put(character.name(), character);
        return this;
    }

    public Optional<Character> getCharacter(String name) {
        return Optional.ofNullable(characters.get(name));
    }

    public GameEngine execute(GameAction action) {
        ActionOutcome outcome = action.execute();
        logger.log(action, outcome);

        if (outcome instanceof ActionOutcome.Success success) {
            if (success.modifiedTarget() != null) {
                characters.put(success.modifiedTarget().name(), success.modifiedTarget());
            }
        }

        return this;
    }

    public void printLogs() {
        logger.getFormattedLogs().forEach(System.out::println);
    }
}