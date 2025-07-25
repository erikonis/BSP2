import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GameEngine {
    private List<Character> characters;
    private List<String> logs;
    private DateTimeFormatter formatter;

    public GameEngine(List<Character> initialCharacters) {
        this.characters = new ArrayList<>(initialCharacters);
        this.logs = new ArrayList<>();
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Game Engine initialized.");
    }

    public List<Character> getCharacters() {
        return List.copyOf(characters); // Return an immutable copy
    }

    public Character findCharacterByName(String name) {
        return characters.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public boolean executeCommand(Command command) {
        boolean success = command.execute(this);
        logCommandExecution(command, success);
        return success;
    }

    private void logCommandExecution(Command command, boolean success) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logEntry = "[" + timestamp + "] ACTION: " + command.getSource().getName() + " performed '" + command.getDescription() + "'";
        if (command.getTarget() != null) {
            logEntry += " on " + command.getTarget().getName();
        }
        logEntry += ". Success: " + success;
        logs.add(logEntry);
    }

    public void logKill(Character killer, Character victim) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logEntry = "[" + timestamp + "] KILL: " + killer.getName() + " killed " + victim.getName() + ".";
        logs.add(logEntry);
    }

    public void logSelfKill(Character character) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logEntry = "[" + timestamp + "] SELF-KILL: " + character.getName() + " killed themself.";
        logs.add(logEntry);
    }

    public void printLogs() {
        System.out.println("\n--- Game Event Logs ---");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}