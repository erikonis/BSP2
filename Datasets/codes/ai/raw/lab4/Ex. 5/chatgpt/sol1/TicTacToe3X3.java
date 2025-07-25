// TicTacToe3X3.java
import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        int turns = 0;
        boolean gameOver = false;

        // Initialize the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        // Game loop
        while (!gameOver && turns < 9) {
            printBoard(board);
            char currentPlayer = turns % 2 == 0 ? 'O' : 'X';
            System.out.println("Player " + currentPlayer + "'s turn");
            System.out.print("Enter row (0-2): ");
            int row = sc.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = sc.nextInt();

            // Check if the spot is empty
            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                turns++;
                if (checkWin(board, currentPlayer)) {
                    printBoard(board);
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameOver = true;
                }
            } else {
                System.out.println("The spot is already taken. Try again.");
            }
        }

        if (!gameOver) {
            printBoard(board);
            System.out.println("It's a draw!");
        }
    }

    // Function to print the board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }

    // Function to check if a player has won
    public static boolean checkWin(char[][] board, char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) || // row
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) { // column
                return true;
            }
        }
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) || // diagonal
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) { // other diagonal
            return true;
        }
        return false;
    }
}
