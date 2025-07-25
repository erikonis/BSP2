public class JumpAction implements Action {
    private final Character user;

    public JumpAction(Character user) {
        this.user = user;
    }

    @Override
    public boolean execute() {
        Logger.getInstance().logAction("Jump", user, null, true);
        return true;
    }
}