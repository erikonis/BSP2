package lu.uni.programming1.lab9.Exercise2;

public abstract class Actions {
    protected Character user;

    public Actions(Character user) {
        this.user = user;
    }

    public abstract void execute();

    
}
