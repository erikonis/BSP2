public class JumpAction implements Action {
    private final Character user;

    public JumpAction(Character user) {
        this.user = user;
    }

    @Override
    public boolean execute() {
        Logger.getInstance().log(user.getName() + " jumped.", true);
        return true;
    }
}