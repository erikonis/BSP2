public class JumpAction extends Action {
    public JumpAction(Character user) {
        super(user);
    }

    @Override
    public void execute() {
        Logger.getInstance().logAction(user, this, true, null);
    }

    @Override
    public String description() {
        return user.getName() + " jumps.";
    }
}
