public abstract class Action {
    protected Character user;

    public Action(Character user) {
        this.user = user;
    }

    public abstract void execute();
}