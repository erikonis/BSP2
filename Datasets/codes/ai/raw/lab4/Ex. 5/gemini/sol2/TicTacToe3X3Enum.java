package ex5;

import java.util.Scanner;

public class TicTacToe3X3Enum {

    enum Cell {
        EMPTY, CROSS, CIRCLE
    }

    public static void main(Stringargs) {
        Cellboard = new Cell[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Cell.EMPTY;
            }
        }

        // ... (rest of the logic similar to TicTacToe3X3.java, using Cell enum)
    }

    // ... (other methods - printBoard and checkWin - adapted to use Cell enum)
}