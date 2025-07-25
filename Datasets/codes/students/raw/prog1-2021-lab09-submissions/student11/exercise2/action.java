package lu.uni.programming1.lab9.exercise2;

public abstract class action {

    protected character player;

    public action(character player) {
        this.player = player;
    }

    public character getPlayer() {
        return player;
    }

    public abstract void execute(log log);
    
}
