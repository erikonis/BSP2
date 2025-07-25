import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class GameEvent {
    private LocalDateTime timestamp;

    public GameEvent() {
        this.timestamp = LocalDateTime.now();
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String formattedTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return timestamp.format(formatter);
    }

    public abstract String getLogMessage();
}