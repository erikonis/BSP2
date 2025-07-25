import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Effect {
    String log(Character source, Character target);
    LocalDateTime getTimestamp();
}