
public class JumpAction extends Action {
    public JumpAction(Character user) {
        super(user);
    }

    @Override
    public boolean execute() {
        GameLogger.getInstance().logAction(this, true, "Jumped");
        return true;
    }
}