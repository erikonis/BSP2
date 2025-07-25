import java.util.Date;

public class Event {
    private Date date;
    private Character user;
    private String action;
    private Character target;
    private boolean success;

    public Event(Character user, String action, Character target, boolean success) {
        this.date = new Date();
        this.user = user;
        this.action = action;
        this.target = target;
        this.success = success;
    }

    public Date getDate() {
        return date;
    }

    public Character getUser() {
        return user;
    }

    public String getAction() {
        return action;
    }

    public Character getTarget() {
        return target;
    }

    public boolean isSuccess() {
        return success;
    }
}