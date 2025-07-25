import java.util.Scanner;

public class TicTacToe3X3 {
    // Game constants
    private static final int SIZE = 3;
    private static final char EMPTY = '-';
    private static final char CIRCLE = 'O';
    private static final char CROSS = 'X';

    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = CIRCLE;
    private static boolean gameWon = false;
    private static int movesMade = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeBoard();

        System.out.println("Tic Tac Toe - 3x3");
        System.out.println("Player 1: " + CIRCLE + " | Player 2: " + CROSS);
        System.out.println("Enter moves as row[0-2] column[0-2] (e.g., 1 2)");

        while (movesMade < 9 && !gameWon) {
            printBoard();
            promptMove(scanner);
        }

        printFinalResult();
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
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void promptMove(Scanner scanner) {
        System.out.print("Player " + currentPlayer + " move: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        if (isValidMove(row, col)) {
            makeMove(row, col);
            if (checkWin(row, col)) {
                gameWon = true;
            } else {
                switchPlayer();
            }
        } else {
            System.out.println("Invalid move! Try again.");
        }
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE &&
               col >= 0 && col < SIZE &&
               board[row][col] == EMPTY;
    }

    private static void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
        movesMade++;
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == CIRCLE) ? CROSS : CIRCLE;
    }

    private static boolean checkWin(int row, int col) {
        // Check row
        if (board[row][0] == currentPlayer &&
            board[row][1] == currentPlayer &&
            board[row][2] == currentPlayer) {
            return true;
        }

        // Check column
        if (board[0][col] == currentPlayer &&
            board[1][col] == currentPlayer &&
            board[2][col] == currentPlayer) {
            return true;
        }

        // Check diagonals
        if (row == col && board[0][0] == currentPlayer &&
                          board[1][1] == currentPlayer &&
                          board[2][2] == currentPlayer) {
            return true;
        }

        if (row + col == 2 && board[0][2] == currentPlayer &&
                             board[1][1] == currentPlayer &&
                             board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    private static void printFinalResult() {
        printBoard();
        if (gameWon) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("Game ended in a draw!");
        }
    }
}