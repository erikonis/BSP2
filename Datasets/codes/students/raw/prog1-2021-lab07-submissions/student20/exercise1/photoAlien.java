public class photoAlien extends Action {


    public photoAlien(Maze maze) {
        super(maze);
    }

    @Override
    public void Consumption() {
        maze.setLife(maze.getLife()-60);
    }

    public void lowResConsumption() {
        maze.setLife(maze.getLife()-40);
    }

    @Override
    public void moves() {
        if (maze.getMaze()[maze.getRow() - 1][maze.getColumn() - 1].equals("ali  ")) {
            if (maze.getLife() >= 60) {
                System.out.println("Choose the resolution: '1'(High-resolution) or '2'(Low-resolution)");
                int phototype = Math.min(2, Math.max(1, maze.getScanner().nextInt()));
                if (phototype == 1) {
                    Consumption();
                    System.out.println("You took a high-resolution photo.");
                    maze.setActionNumber(maze.getActionNumber()+1);
                } else {
                    lowResConsumption();
                    System.out.println("You took a low-resolution photo.");
                    maze.setActionNumber(maze.getActionNumber()+1);
                }
            } else if (maze.getLife() >= 40) {
                System.out.println("You want to take a low-resolution photo ? Type 'yes' if you do.");
                String phototype = maze.getScanner().nextLine();
                if (phototype.equals("yes")) {
                    lowResConsumption();
                    System.out.println("You took a low-resolution photo.");
                    maze.setActionNumber(maze.getActionNumber()+1);
                }
            }
        } else if (maze.getMaze()[maze.getRow() - 1][maze.getColumn() - 1].equals("ali  ") && maze.getLife() < 40) {
            System.out.println("As you lack energy, you failed to take a photo in time and the alien escaped D:.");
        }
    }
}
