package Exercise1;

//for no maze, see Exercise1simple ty

public class Test {
        static int i;

        public static void main(String[] args) {

                int actions[] = { 4, 4, 4, 1, 7, 1, 1, 5, 3, 3, 1, 4 };
                Maze maze = new Maze();
                mazeBuild(maze);
                Robot r1 = new Robot("Sara", maze);
                Controller c1 = new Controller(r1);
                maze.showMaze();

                for (i = 0; i < actions.length; i++) {

                        {
                                action(c1, actions[i]);
                                maze.showMaze();

                                if ((i + 1) % 10 == 0)
                                        c1.printSet();
                        }
                }
                c1.printSet();
                c1.exit();

        }

        // public static void printInstructions()
        // {System.out.println("Choose an action for the robot to execute:");
        // System.out.println("1 for moving forward");
        // System.out.println("2 for moving back");
        // System.out.println("3 for moving right");
        // System.out.println("4 for moving left");
        // System.out.println("5 for taking a high quality pic");
        // System.out.println("6 for taking a low quality pic");
        // System.out.println("7 for picking up a rock");

        // }

        public static void action(Action c1, int opt) {
                switch (opt) {
                case 1:
                        c1.goForward();
                        break;
                case 2:
                        c1.goBack();
                        break;
                case 3:
                        c1.goRight();
                        break;
                case 4:
                        c1.goLeft();
                        break;
                case 5:
                        c1.takePicHigh();
                        break;
                case 6:
                        c1.takePicLow();
                        break;
                case 7:
                        c1.pickRock();
                        break;
                default:
                        i--;
                        System.out.println("Impossible action!");
                        break;

                }
        }

        public static void mazeBuild(Maze maze) {
                maze.addWall(0, 3, 3);
                maze.addWall(1, 2, 1);
                maze.addWall(1, 1, 1);
                maze.addWall(1, 3, 1);
                maze.addWall(1, 0, 3);
                maze.addWall(2, 2, 1);
                maze.addWall(2, 3, 1);
                maze.addWall(2, 4, 1);
                maze.addWall(3, 1, 1);
                maze.addWall(3, 2, 1);
                maze.addWall(3, 2, 3);
                maze.addWall(4, 2, 3);
                maze.addWall(1, 4, 3);
                maze.addWall(4, 0, 3);
                maze.addWall(3, 4, 1);
                maze.addWall(4, 1, 1);
                maze.addWall(4, 3, 3);
                maze.delWall(0, 3, 1);
                maze.delWall(4, 1, 2);
                maze.setC(0, 3, 1);
                maze.setC(1, 0, 3);
                maze.setC(4, 0, 2);

        }
}
