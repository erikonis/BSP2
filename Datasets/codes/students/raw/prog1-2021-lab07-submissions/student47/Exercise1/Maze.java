package Exercise1;

import java.util.Scanner;

public class Maze {

        static protected Position[][] maze = new Position[5][5];

        Maze() {
                for (int i = 0; i < 5; i++)
                        for (int j = 0; j < 5; j++)
                                maze[i][j] = new Position(i, j);
                for (int j = 0; j < 5; j++) {
                        maze[0][j].setU(false);
                        maze[4][j].setD(false);
                        maze[j][0].setL(false);
                        maze[j][4].setR(false);
                }

        }

        // 1 up 2 down 3 right 4 left
        public void addWall(int x, int y, int dir) {
                switch (dir) {
                case 1:
                        maze[x][y].setU(false);
                        break;
                case 2:
                        maze[x][y].setD(false);
                        break;
                case 3:
                        maze[x][y].setR(false);
                        break;
                case 4:
                        maze[x][y].setL(false);
                        break;
                default:
                        break;
                }
        }

        public void delWall(int x, int y, int dir) {
                switch (dir) {
                case 1:
                        maze[x][y].setU(true);
                        break;
                case 2:
                        maze[x][y].setD(true);
                        break;
                case 3:
                        maze[x][y].setR(true);
                        break;
                case 4:
                        maze[x][y].setL(true);
                        break;
                default:
                        break;
                }
        }

        public void showMaze() {
                System.out.println("Position atm: ");
                for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                                if (maze[i][j].isU() == false)
                                        System.out.print("----");
                                else
                                        System.out.print("    ");
                                System.out.print(" ");
                        }

                        System.out.print("\n");
                        for (int j = 0; j < 5; j++) {
                                if (maze[i][j].isL() == false)
                                        System.out.print("|");
                                else
                                        System.out.print(" ");
                                showC(maze[i][j].c);
                                if (maze[i][j].isR() == false)
                                        System.out.print("|");
                                else
                                        System.out.print(" ");
                        }
                        System.out.print("\n");
                }
                for (int i = 0; i < 5; i++) {
                        if (maze[4][i].isD() == false)
                                System.out.print("----");
                        else
                                System.out.print("    ");
                        System.out.print(" ");
                }
                System.out.println("");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Press enter to continue:");
                String ok = scanner.nextLine();

        }

        public Position getPos(int x, int y) {
                return maze[x][y];

        }

        public void setC(int x, int y, int c) {
                maze[x][y].setC(c);

        }

        public void showC(int c) {
                switch (c) {
                case 1:
                        System.out.print(" R ");
                        break;
                case 2:
                        System.out.print(" A ");
                        break;
                case 3:
                        System.out.print(" S ");
                        break;
                default:
                        System.out.print("   ");
                }
        }

}