import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Create 3x3 board: ' ' = empty, 'O' = circle, 'X' = cross
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';

        char currentPlayer = 'O'; // Circle starts
        int moveCount = 0;
        boolean gameWon = false;

        while (moveCount < 9 && !gameWon) {
            printBoard(board);

            System.out.println("Player " + (currentPlayer == 'O' ? "Circle (O)" : "Cross (X)") + ", enter your move (row and column 0-2):");

            int x, y;
            while (true) {
                System.out.print("Row: ");
                x = scanner.nextInt();
                System.out.print("Column: ");
                y = scanner.nextInt();

                if (x >= 0 && x < 3 && y >= 0 && y < 3 && board[x][y] == ' ') {
                    break;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            board[x][y] = currentPlayer;
            moveCount++;

            if (checkWinner(board, currentPlayer)) {
                printBoard(board);
                System.out.println("Player " + (currentPlayer == 'O' ? "Circle (O)" : "Cross (X)") + " wins!");
                gameWon = true;
            } else {
                currentPlayer = (currentPlayer == 'O') ? 'X' : 'O'; // Switch player
            }
        }

        if (!gameWon) {
            printBoard(board);
            System.out.println("Game ended in a draw!");
        }

        scanner.close();
    }

    // Display the game board
    public static void printBoard(char[][] board) {
        System.out.println("\nCurrent board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Check if the current player has won
    public static boolean checkWinner(char[][] board, char player) {
        // Rows, Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player &&
                 board[i][1] == player &&
                 board[i][2] == player) ||
                (board[0][i] == player &&
                 board[1][i] == player &&
                 board[2][i] == player)) {
                return true;
            }
        }

        // Diagonals
        if ((board[0][0] == player &&
             board[1][1] == player &&
             board[2][2] == player) ||
            (board[0][2] == player &&
             board[1][1] == player &&
             board[2][0] == player)) {
            return true;
        }

        return false;
    }
}