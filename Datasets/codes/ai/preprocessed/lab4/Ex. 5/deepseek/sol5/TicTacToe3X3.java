import java.util.Scanner;

public class TicTacToe3X3 {
    private static final int SIZE = 3;
    private static final char EMPTY = '-';
    private static final char CIRCLE = 'O';
    private static final char CROSS = 'X';

    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = CIRCLE;
    private static boolean gameOver = false;

    public static void main(String[] args) {
        initializeBoard();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tic Tac Toe Game");
        System.out.println("Player 1: " + CIRCLE + " | Player 2: " + CROSS);
        System.out.println("Enter moves as row[0-2] and column[0-2] separated by space");

        for (int round = 0; round < 9 && !gameOver; round++) {
            printBoard();
            processPlayerMove(scanner);
            checkGameStatus();
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

    private static void processPlayerMove(Scanner scanner) {
        boolean validMove = false;

        while (!validMove) {
            System.out.print("Player " + currentPlayer + " move (row column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                validMove = true;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE &&
               col >= 0 && col < SIZE &&
               board[row][col] == EMPTY;
    }

    private static void checkGameStatus() {
        if (checkWin()) {
            gameOver = true;
        } else {
            switchPlayer();
        }
    }

    private static boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;  // Row win
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;  // Column win
            }
        }

        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;  // Main diagonal win
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;  // Anti-diagonal win
        }

        return false;
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == CIRCLE) ? CROSS : CIRCLE;
    }

    private static void printFinalResult() {
        printBoard();
        if (gameOver) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("Game ended in a draw!");
        }
    }
}