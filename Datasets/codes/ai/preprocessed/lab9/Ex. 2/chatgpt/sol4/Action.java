public abstract class Action {
    protected final Character user;

    public Action(Character user) {
        if (user == null) throw new IllegalArgumentException("User cannot be null");
        this.user = user;
    }

    public abstract void execute();
}