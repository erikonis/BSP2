public class JumpAction extends Action {

    public JumpAction(Character user) {
        super(user);
    }

    @Override
    public void execute() {
        Logger.getInstance().log(user.getName() + " jumps into the air.");
    }
}