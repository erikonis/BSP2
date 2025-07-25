import java.time.LocalDateTime;

public abstract class Action {
    protected Character user;

    public Action(Character user) {
        this.user = user;
    }

    public abstract void execute();
    public abstract String description();
}
