public final class JumpAction extends Action {
    public JumpAction(Character actor, ActionEventListener listener) {
        super(actor, listener);
    }

    @Override
    public void execute() {
        notifyExecution(true, "Performed a jump");
    }
}