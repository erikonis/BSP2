import java.time.LocalDateTime;

public abstract class Action {
    protected final Character user;
    protected final LocalDateTime timestamp;

    public Action(Character user) {
        this.user = Objects.requireNonNull(user, "Action user cannot be null");
        this.timestamp = LocalDateTime.now();
    }

    public abstract boolean execute();

    public Character getUser() {
        return user;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}