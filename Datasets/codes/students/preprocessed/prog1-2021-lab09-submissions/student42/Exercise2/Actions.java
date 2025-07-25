public abstract class Actions {
    protected Character user;

    public Actions(Character user) {
        this.user = user;
    }

    public abstract void execute();

    
}
