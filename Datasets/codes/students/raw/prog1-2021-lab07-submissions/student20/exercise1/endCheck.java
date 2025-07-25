public class endCheck extends Action{

    public endCheck(Maze maze) {
        super(maze);
    }

    @Override
    public void Consumption() {}

    @Override
    public void moves() {
        if (maze.getMaze()[maze.getRow() - 1][maze.getColumn() - 1].equals("end  ")) {
            maze.setEnd(true);
        }
    }
}
