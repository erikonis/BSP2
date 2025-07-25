import java.time.Instant;

public abstract class Action {
    protected final Character actor;
    protected final Instant timestamp;
    protected ActionEventListener listener;

    public Action(Character actor, ActionEventListener listener) {
        this.actor = Objects.requireNonNull(actor, "Actor cannot be null");
        this.listener = listener;
        this.timestamp = Instant.now();
    }

    public abstract void execute();

    public void setListener(ActionEventListener listener) {
        this.listener = listener;
    }

    protected void notifyExecution(boolean success, String details) {
        if (listener != null) {
            listener.onActionExecuted(this, success, details);
        }
    }
}