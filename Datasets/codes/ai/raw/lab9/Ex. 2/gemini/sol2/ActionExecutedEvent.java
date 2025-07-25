public class ActionExecutedEvent extends GameEvent {
    private Action action;
    private boolean success;
    private Character target;

    public ActionExecutedEvent(Action action, boolean success, Character target) {
        this.action = action;
        this.success = success;
        this.target = target;
    }

    public Action getAction() {
        return action;
    }

    public boolean isSuccess() {
        return success;
    }

    public Character getTarget() {
        return target;
    }

    @Override
    public String getLogMessage() {
        String log = "[" + formattedTimestamp() + "] ACTION: " + action.getUser().getName() + " used '" + action.getDescription() + "'";
        if (target != null) {
            log += " on " + target.getName();
        }
        log += ". Success: " + success;
        return log;
    }
}