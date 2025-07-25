import java.util.Scanner;

public class TicTacToe3X3 {

    private static final int BOARD_SIZE = 3;
    private static final char EMPTY_SLOT = ' ';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    private static char[][] gameBoard = new char[BOARD_SIZE][BOARD_SIZE];
    private static char currentPlayerMark = PLAYER_O; // 'O' starts
    private static int turnCount = 0;

    public static void main(String[] args) {
        initializeGameBoard();
        Scanner playerInput = new Scanner(System.in);

        while (turnCount < BOARD_SIZE * BOARD_SIZE) {
            displayBoard();
            currentPlayerMark = (currentPlayerMark == PLAYER_O) ? PLAYER_X : PLAYER_O;
            System.out.println("Player " + currentPlayerMark + ", enter your move (row [1-" + BOARD_SIZE + "] column [1-" + BOARD_SIZE + "]):");

            int rowChoice = -1;
            int colChoice = -1;

            // Get valid player input
            while (true) {
                if (playerInput.hasNextInt()) {
                    rowChoice = playerInput.nextInt() - 1;
                }
                if (playerInput.hasNextInt()) {
                    colChoice = playerInput.nextInt() - 1;
                }
                playerInput.nextLine(); // Consume newline

                if (rowChoice >= 0 && rowChoice < BOARD_SIZE && colChoice >= 0 && colChoice < BOARD_SIZE && gameBoard[rowChoice][colChoice] == EMPTY_SLOT) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter row and column again (e.g., 1 2):");
                }
            }

            // Place the player's mark
            gameBoard[rowChoice][colChoice] = currentPlayerMark;
            turnCount++;

            // Check if the current player has won
            if (checkGameWin(rowChoice, colChoice)) {
                displayBoard();
                System.out.println("Player " + currentPlayerMark + " has won!");
                break;
            }
        }

        // Check for a draw if the loop completes without a winner
        if (turnCount == BOARD_SIZE * BOARD_SIZE) {
            displayBoard();
            System.out.println("The game ends in a draw!");
        }

        playerInput.close();
    }

    private static void initializeGameBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                gameBoard[i][j] = EMPTY_SLOT;
            }
        }
    }

    private static void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(gameBoard[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static boolean checkGameWin(int lastRow, int lastCol) {
        char player = gameBoard[lastRow][lastCol];

        // Check row
        if (gameBoard[lastRow][0] == player && gameBoard[lastRow][1] == player && gameBoard[lastRow][2] == player) return true;

        // Check column
        if (gameBoard[0][lastCol] == player && gameBoard[1][lastCol] == player && gameBoard[2][lastCol] == player) return true;

        // Check diagonals
        if ((lastRow == lastCol) && (gameBoard[0][0] == player && gameBoard[1][1] == player && gameBoard[2][2] == player)) return true;
        if ((lastRow + lastCol == BOARD_SIZE - 1) && (gameBoard[0][2] == player && gameBoard[1][1] == player && gameBoard[2][0] == player)) return true;

        return false;
    }
}