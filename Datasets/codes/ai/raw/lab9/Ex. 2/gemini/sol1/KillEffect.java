import java.time.LocalDateTime;

public record KillEffect(Character killer, Character victim) implements Effect {
    @Override
    public String log(Character source, Character target) {
        return "[" + formattedTimestamp() + "] KILL: " + killer.getName() + " killed " + victim.getName() + ".";
    }

    @Override
    public LocalDateTime getTimestamp() {
        return LocalDateTime.now();
    }

    private String formattedTimestamp() {
        return getTimestamp().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}