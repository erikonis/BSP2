public class Jump extends Action {
    public Jump(Character user) {
        super(user);
    }

    @Override
    public void execute() {
        Logger.getInstance().logEvent(user.getName() + " performed a Jump.");
    }
}
