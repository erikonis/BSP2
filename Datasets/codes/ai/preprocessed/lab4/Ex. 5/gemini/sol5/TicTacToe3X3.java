import java.util.Scanner;

public class TicTacToe3X3 {

    private static final int GRID_SIZE = 3;
    private static final char EMPTY_CELL = ' ';
    private static final char SYMBOL_X = 'X';
    private static final char SYMBOL_O = 'O';
    private static char[][] playArea = new char[GRID_SIZE][GRID_SIZE];
    private static char activePlayer = SYMBOL_O; // Player 'O' starts
    private static int moveCounter = 0;

    public static void main(String[] args) {
        initializePlayArea();
        Scanner inputReader = new Scanner(System.in);

        while (moveCounter < GRID_SIZE * GRID_SIZE) {
            renderBoard();
            activePlayer = (activePlayer == SYMBOL_O) ? SYMBOL_X : SYMBOL_O;
            System.out.println("Player " + activePlayer + ", enter your move (row [1-" + GRID_SIZE + "] column [1-" + GRID_SIZE + "]):");

            int selectedRow = -1;
            int selectedCol = -1;

            // Get valid move from the player
            while (true) {
                if (inputReader.hasNextInt()) {
                    selectedRow = inputReader.nextInt() - 1;
                }
                if (inputReader.hasNextInt()) {
                    selectedCol = inputReader.nextInt() - 1;
                }
                inputReader.nextLine(); // Consume the newline

                if (selectedRow >= 0 && selectedRow < GRID_SIZE && selectedCol >= 0 && selectedCol < GRID_SIZE && playArea[selectedRow][selectedCol] == EMPTY_CELL) {
                    break;
                } else {
                    System.out.println("Invalid move. Please input row and column again (e.g., 1 2):");
                }
            }

            // Place the player's symbol on the board
            playArea[selectedRow][selectedCol] = activePlayer;
            moveCounter++;

            // Check if the current player has won the game
            if (hasPlayerWon(selectedRow, selectedCol)) {
                renderBoard();
                System.out.println("Player " + activePlayer + " is the winner!");
                break;
            }
        }

        // If the loop finishes without a winner, it's a draw
        if (moveCounter == GRID_SIZE * GRID_SIZE) {
            renderBoard();
            System.out.println("The game has ended in a draw!");
        }

        inputReader.close();
    }

    private static void initializePlayArea() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                playArea[i][j] = EMPTY_CELL;
            }
        }
    }

    private static void renderBoard() {
        System.out.println("-------------");
        for (int i = 0; i < GRID_SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < GRID_SIZE; j++) {
                System.out.print(playArea[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static boolean hasPlayerWon(int lastRowPlayed, int lastColPlayed) {
        char playerSymbol = playArea[lastRowPlayed][lastColPlayed];

        // Check row
        if (playArea[lastRowPlayed][0] == playerSymbol && playArea[lastRowPlayed][1] == playerSymbol && playArea[lastRowPlayed][2] == playerSymbol) return true;

        // Check column
        if (playArea[0][lastColPlayed] == playerSymbol && playArea[1][lastColPlayed] == playerSymbol && playArea[2][lastColPlayed] == playerSymbol) return true;

        // Check diagonals
        if ((lastRowPlayed == lastColPlayed) && (playArea[0][0] == playerSymbol && playArea[1][1] == playerSymbol && playArea[2][2] == playerSymbol)) return true;
        if ((lastRowPlayed + lastColPlayed == GRID_SIZE - 1) && (playArea[0][2] == playerSymbol && playArea[1][1] == playerSymbol && playArea[2][0] == playerSymbol)) return true;

        return false;
    }
}