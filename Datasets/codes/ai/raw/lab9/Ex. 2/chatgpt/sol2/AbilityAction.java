public class AbilityAction implements Action {
    protected final Character user;
    protected final String name;

    public AbilityAction(Character user, String name) {
        this.user = user;
        this.name = name;
    }

    @Override
    public boolean execute() {
        Logger.getInstance().log(user.getName() + " used ability: " + name, true);
        return true;
    }
}