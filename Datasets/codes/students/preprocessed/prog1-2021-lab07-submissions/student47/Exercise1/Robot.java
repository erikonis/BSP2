public class Robot {
    private String name;
    protected int bLife = 3000, actions;
    protected Maze maze;
    protected Position pos;

    public Robot(String name, Maze maze) {
        this.maze = maze;
        this.name = name;
        pos = maze.getPos(0, 3);
    }

    public int getPosx() {
        return pos.getX();
    }

    public int getPosy() {
        return pos.getY();
    }

    public String getName() {
        return name;
    }

    public int getbLife() {
        return bLife;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

}
