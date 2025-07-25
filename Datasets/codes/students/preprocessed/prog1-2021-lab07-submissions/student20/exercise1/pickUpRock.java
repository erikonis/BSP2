public class pickUpRock extends Action {

    public pickUpRock(Maze maze) {
        super(maze);
    }

    @Override
    public void Consumption() {
        maze.setLife(maze.getLife()-150);
    }

    @Override
    public void moves() {
        if (maze.getMaze()[maze.getRow() - 1][maze.getColumn() - 1].equals("roc  ") && maze.getLife() >= 150) {
            Consumption();
            System.out.println("You successfully picked up a rock!");
            maze.setActionNumber(maze.getActionNumber()+1);
        } else if (maze.getMaze()[maze.getRow() - 1][maze.getColumn() - 1].equals("roc  ") && maze.getLife() < 150) {
            System.out.println("As you lack energy, you failed to pick up the rock and it fell down a cliff D:.");
        }
    }
}
