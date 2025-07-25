import java.time.LocalDateTime;

public record HealEffect(int amount, Character target) implements Effect {
    @Override
    public String log(Character source, Character target) {
        return "[" + formattedTimestamp() + "] HEAL: " + source.getName() + " healed " + target.getName() + " for " + amount + " health.";
    }

    @Override
    public LocalDateTime getTimestamp() {
        return LocalDateTime.now();
    }

    private String formattedTimestamp() {
        return getTimestamp().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}