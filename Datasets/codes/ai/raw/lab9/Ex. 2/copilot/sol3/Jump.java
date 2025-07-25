import java.util.Date;

public class Jump implements Action {
    private Character user;

    public Jump(Character user) {
        this.user = user;
    }

    @Override
    public void execute() {
        EventManager.getInstance().notify(new Event(user, "Jump", null, true));
    }

    @Override
    public Character getUser() {
        return user;
    }
}
