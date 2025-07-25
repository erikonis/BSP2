public abstract class Action {
    protected Maze maze;

    public Action(Maze maze) {
        this.maze = maze;
    }

    public abstract void Consumption();

    public abstract void moves();
}
