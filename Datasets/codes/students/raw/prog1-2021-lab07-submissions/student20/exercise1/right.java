public class right extends Action {

    public right(Maze maze) {
        super(maze);
    }

    @Override
    public void Consumption(){
        maze.setLife(maze.getLife()-10);
    }

    @Override
    public void moves() {
        maze.getMaze()[maze.getRow() - 1][maze.getColumn() - 1] = ".    ";
        maze.setColumn(maze.getColumn()+1);
        System.out.println("Rob went to the right.");
        Consumption();
        check();
        maze.getMaze()[maze.getRow() - 1][maze.getColumn() - 1] = "rob  ";
        maze.setActionNumber(maze.getActionNumber()+1);
    }

    public void check() {
        pickUpRock pickUpRock = new pickUpRock(maze);
        photoAlien photoAlien = new photoAlien(maze);
        endCheck endCheck = new endCheck(maze);
        pickUpRock.moves();
        photoAlien.moves();
        endCheck.moves();
    }
}
