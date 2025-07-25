package exercise1;

public class Maze {

    private Cell[][] cells = new Cell[5][5];

    public void creatCells() {
        cells[0][0] = new Cell("blocked", "blocked", "open", "open", "none");
        cells[0][1] = new Cell("blocked", "open", "open", "blocked", "none");
        cells[0][2] = new Cell("blocked", "open", "open", "blocked", "none");
        cells[0][3] = new Cell("blocked", "open", "blocked", "blocked", "none");
        cells[0][4] = new Cell("blocked", "blocked", "blocked", "open", "none");
        cells[1][0] = new Cell("open", "blocked", "blocked", "open", "rock");
        cells[1][1] = new Cell("blocked", "open", "open", "open", "none");
        cells[1][2] = new Cell("blocked", "open", "open", "blocked", "none");
        cells[1][3] = new Cell("blocked", "open", "open", "blocked", "none");
        cells[1][4] = new Cell("open", "open", "blocked", "blocked", "none");
        cells[2][0] = new Cell("open", "blocked", "open", "open", "none");
        cells[2][1] = new Cell("open", "open", "open", "open", "none");
        cells[2][2] = new Cell("blocked", "open", "open", "blocked", "none");
        cells[2][3] = new Cell("blocked", "open", "open", "open", "none");
        cells[2][4] = new Cell("blocked", "open", "blocked", "blocked", "none");
        cells[3][0] = new Cell("open", "blocked", "open", "open", "photo");
        cells[3][1] = new Cell("blocked", "open", "open", "blocked", "none");
        cells[3][2] = new Cell("blocked", "open", "blocked", "open", "none");
        cells[3][3] = new Cell("open", "blocked", "open", "open", "none");
        cells[3][4] = new Cell("blocked", "open", "blocked", "open", "none");
        cells[4][0] = new Cell("open", "blocked", "blocked", "blocked", "alien");
        cells[4][1] = new Cell("blocked", "blocked", "open", "blocked", "none");
        cells[4][2] = new Cell("open", "open", "blocked", "blocked", "none");
        cells[4][3] = new Cell("open", "blocked", "blocked", "blocked", "none");
        cells[4][4] = new Cell("open", "blocked", "blocked", "blocked", "none");
    }

    public void printMap() {
        System.out.println("        START   ");
        System.out.println("##########  ####");
        System.out.println("#           #  #");
        System.out.println("#           #  #");
        System.out.println("#  ##########  #");
        System.out.println("#  #           #");
        System.out.println("#  #           #");
        System.out.println("#R #  ##########");
        System.out.println("#              #");
        System.out.println("#              #");
        System.out.println("#  #######  ####");
        System.out.println("#        #     #");
        System.out.println("#P       #     #");
        System.out.println("#  ###   #     #");
        System.out.println("#  #     #  #  #");
        System.out.println("#A #     #  #  #");
        System.out.println("####  ##########");
        System.out.println("    END         ");
        System.out.println("\nLeft: ←; Right: →; Up: ↑; Down: ↓; R: rock; P: photo; A: Alien");
    }

}
