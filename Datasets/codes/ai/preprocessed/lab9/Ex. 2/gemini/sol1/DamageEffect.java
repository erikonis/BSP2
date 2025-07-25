import java.time.LocalDateTime;

public record DamageEffect(int amount, Character target) implements Effect {
    @Override
    public String log(Character source, Character target) {
        return "[" + formattedTimestamp() + "] DAMAGE: " + source.getName() + " dealt " + amount + " damage to " + target.getName() + ".";
    }

    @Override
    public LocalDateTime getTimestamp() {
        return LocalDateTime.now();
    }

    private String formattedTimestamp() {
        return getTimestamp().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}