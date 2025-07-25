package src.lu.uni.programming1.lab9.exercise2;

public abstract class Actions implements Log{
    Character user;

    public Actions(Character user) {
        this.user = user;
    }

    public abstract void execute();

    @Override
    public void Logs() {
        // TODO Auto-generated method stub
        
    }
}
