public class Maze {
    // initialise&define maze
    private int[][] maze = { { 0, 0, 0, -1, 0 }, { 2, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 3, 0, 0, 1, 1 },
            { 1, 4, 0, 1, 1 } };

    // start values ->for the position
    public int getStartX() {
        return 3;
    }

    public int getStartY() {
        return -1;
    }

    public int getSize() {
        return maze.length;
    }

    // check if there is a wall
    public boolean checkIfValid(int x, int y) {
        boolean test = true;
        // because y signifies the row and x signifies the column
        if (x < maze.length && y < maze.length) {
            if (maze[y][x] == 1) {
                test = false;
            }
        } else {
            // Position of the finish flag
            if (x == 1 && y == 6) {
                test = true;
            }
        }
        return test;
    }

    public boolean checkForRock(int x, int y) {
        boolean test = true;
        if (maze[x][y] == 2) {
            test = false;
        }
        return test;
    }
}
