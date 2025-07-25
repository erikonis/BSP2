public class JumpAction implements Action {
    private Character user;

    public JumpAction(Character user) {
        this.user = user;
    }

    @Override
    public String getName() {
        return "Jump";
    }

    @Override
    public Character getUser() {
        return user;
    }

    @Override
    public boolean execute() {
        Logger.getInstance().logEvent(user.getName() + " jumps.");
        return true;
    }
}