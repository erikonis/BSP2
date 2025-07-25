import java.util.Date;

public class Jump implements Action {
    private Character user;

    public Jump(Character user) {
        this.user = user;
    }

    @Override
    public void execute() {
        Logger.getInstance().log(new Date(), user.getName() + " performed a Jump.");
    }

    @Override
    public Character getUser() {
        return user;
    }
}