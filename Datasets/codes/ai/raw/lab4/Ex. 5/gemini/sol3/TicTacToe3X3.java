import java.util.Scanner;

public class TicTacToe3X3 {

    private static final int SIZE = 3;
    private static final char EMPTY = ' ';
    private static final char CROSS = 'X';
    private static final char CIRCLE = 'O';
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = CIRCLE;
    private static int moves = 0;

    public static void main(String[] args) {
        initializeBoard();
        Scanner scanner = new Scanner(System.in);

        while (moves < SIZE * SIZE) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row [1-" + SIZE + "] column [1-" + SIZE + "]):");
            int row = -1;
            int col = -1;

            // Get valid input
            while (true) {
                if (scanner.hasNextInt()) {
                    row = scanner.nextInt() - 1;
                }
                if (scanner.hasNextInt()) {
                    col = scanner.nextInt() - 1;
                }
                scanner.nextLine(); // Consume the newline

                if (row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == EMPTY) {
                    break;
                } else {
                    System.out.println("Invalid move. Please enter row and column again (e.g., 1 2):");
                }
            }

            // Place the mark
            board[row][col] = currentPlayer;
            moves++;

            // Check for win
            if (checkWin(row, col)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            // Switch player
            currentPlayer = (currentPlayer == CIRCLE) ? CROSS : CIRCLE;
        }

        // Check for draw if no winner
        if (moves == SIZE * SIZE) {
            printBoard();
            System.out.println("It's a draw!");
        }

        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static boolean checkWin(int row, int col) {
        char player = board[row][col];

        // Check row
        if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
            return true;
        }

        // Check column
        if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
            return true;
        }

        // Check diagonals
        if ((row == col) && (board[0][0] == player && board[1][1] == player && board[2][2] == player)) {
            return true;
        }
        if ((row + col == SIZE - 1) && (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }
}