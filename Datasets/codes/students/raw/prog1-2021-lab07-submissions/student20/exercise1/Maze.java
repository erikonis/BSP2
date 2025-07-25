import java.util.Random;
import java.util.Scanner;

public class Maze {
    protected String maze[][];
    protected Scanner scanner;
    protected int row, column, actionNumber;
    protected int life;
    protected boolean end;

    public Maze(String[][] maze, Scanner scanner, int row, int column, int actionNumber, boolean end, int life) {
        this.maze = maze;
        this.scanner = scanner;
        this.row = row;
        this.column = column;
        this.actionNumber = actionNumber;
        this.end = end;
        this.life = life;
    }

    public int getActionNumber() {
        return actionNumber;
    }

    public void setActionNumber(int actionNumber) {
        this.actionNumber = actionNumber;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getRow() {
        return row;
    }

    public String[][] getMaze() {
        return maze;
    }

    public void setMaze(String[][] maze) {
        this.maze = maze;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void createMaze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = ".    ";
            }
        }
    }

    public void createMazeObjects() {
        Random random = new Random();
        int rockRow, rockColumn;
        rockRow = random.nextInt(5);
        rockColumn = random.nextInt(5);
        while ((rockRow == 0 && rockColumn == 3) || (rockRow == 4 && rockColumn == 1)) {
            rockRow = random.nextInt(5);
            rockColumn = random.nextInt(5);
        }

        int alienRow, alienColumn;
        alienRow = random.nextInt(5);
        alienColumn = random.nextInt(5);
        while ((alienRow == 0 && alienColumn == 3) || (alienRow == 4 && alienColumn == 1)
                || (alienRow == rockRow && alienColumn == rockRow)) {
            alienRow = random.nextInt(5);
            alienColumn = random.nextInt(5);
        }

        maze[4][1] = "end  ";
        maze[rockRow][rockColumn] = "roc  ";
        maze[alienRow][alienColumn] = "ali  ";

        String announcement = "Click on 's' to enter the maze. Know that this maze doesn't have walls :p";
        char answer = ' ';
        while (answer != 's') {
            System.out.println(announcement);
            answer = scanner.nextLine().charAt(0);
        }
        maze[row - 1][column - 1] = "rob  ";
    }

    public void showMaze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    public void showLife() {
        System.out.println("\nBattery life: " + life);
    }
}
