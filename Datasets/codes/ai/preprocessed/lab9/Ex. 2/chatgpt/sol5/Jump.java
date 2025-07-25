public class Jump implements Action {
    private final Character user;

    public Jump(Character user) {
        this.user = user;
    }

    @Override
    public void execute() {
        Logger.getInstance().logAction("Jump", user, null, true);
    }
}