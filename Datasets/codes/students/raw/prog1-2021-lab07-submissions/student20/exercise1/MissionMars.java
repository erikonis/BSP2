import java.util.Scanner;

public class MissionMars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int life = 3000;
        int row = 1, column = 4, actionNumber = 0;
        String labyrinth[][] = new String[5][5];
        boolean end = false;
        Maze maze = new Maze(labyrinth, scanner, row, column, actionNumber, end, life);
        maze.createMaze();
        maze.createMazeObjects();
        maze.showMaze();
        maze.showLife();

        Action up = new up(maze);
        Action down = new down(maze);
        Action left = new left(maze);
        Action right = new right(maze);

        while (!maze.isEnd()) {
            System.out.println("Do you want to go '1'(up) '2'(down) '3'(left) '4'(right) ?");
            short answer = scanner.nextShort();
            String loop = "Please choose a correct option (1-4): ";
            do {
                switch (answer) {
                case 1:
                    if (maze.getRow() == 1) {
                        System.out.println("You already reached the highest point.");
                        answer = 0;
                    } else {
                        up.moves();
                        loop = "";
                    }
                    break;
                case 2:
                    if (maze.getRow() == 5) {
                        System.out.println("You already reached the lowest point.");
                        answer = 0;
                    } else {
                        down.moves();
                        loop = "";
                    }
                    break;
                case 3:
                    if (maze.getColumn() == 1) {
                        System.out.println("You can't go further left.");
                        answer = 0;
                    } else {
                        left.moves();
                        loop = "";
                    }
                    break;
                case 4:
                    if (maze.getColumn() == 5) {
                        System.out.println("You can't go further right.");
                        answer = 0;
                    } else {
                        right.moves();
                        loop = "";
                    }
                    break;

                default:
                    System.out.print("Please choose a correct option (1-4): ");
                    answer = scanner.nextShort();
                    break;
                }
            } while (loop.equals("Please choose a correct option (1-4): "));

            if (maze.isEnd()) {
                System.out.println("You successfully came back to the station!");
                System.out.printf("Number of executed actions: %d\n",maze.getActionNumber());
            }
            if (maze.getLife() == 0) {
                System.out.println("You went out of fuel during your mission. You failed!");
                System.out.printf("Number of executed actions: %d\n",maze.getActionNumber());
                maze.setEnd(true);
            }

            maze.showMaze();
            maze.showLife();
        }
        scanner.close();
    }
}
