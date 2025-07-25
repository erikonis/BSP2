public class JumpAction implements Action {
    private Character user;

    public JumpAction(Character user) {
        if (user == null) {
            throw new IllegalArgumentException("Action user cannot be null.");
        }
        this.user = user;
    }

    @Override
    public Character getUser() {
        return user;
    }

    @Override
    public boolean execute() {
        EventManager.getInstance().publishEvent(new ActionExecutedEvent(this, true, null));
        System.out.println(user.getName() + " jumps!");
        return true;
    }

    @Override
    public String getDescription() {
        return "Jump";
    }

    @Override
    public Target getTarget() {
        return null;
    }
}