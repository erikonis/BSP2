public class JumpAction implements Action {
    private final Character user;

    public JumpAction(Character user) {
        this.user = user;
    }

    @Override
    public void execute() {
        GameLogger.getInstance().logAction(this, true, "Jumped");
    }

    @Override
    public Character getUser() {
        return user;
    }

    @Override
    public String getDescription() {
        return user.getName() + " jumps";
    }
}