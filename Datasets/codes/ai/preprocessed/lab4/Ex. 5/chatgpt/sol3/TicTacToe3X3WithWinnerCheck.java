import java.util.Scanner;

public class TicTacToe3X3WithWinnerCheck {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'O';
        int moves = 0;

        while (moves < 9) {
            System.out.println("Player " + currentPlayer + ", enter row (0, 1, 2): ");
            int row = scanner.nextInt();
            System.out.println("Player " + currentPlayer + ", enter column (0, 1, 2): ");
            int col = scanner.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                moves++;
            } else {
                System.out.println("This cell is already occupied, try again.");
                continue;
            }

            // Print board
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + "\t");
                }
                System.out.println();
            }

            if (checkWinner(board, currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            currentPlayer = (currentPlayer == 'O') ? 'X' : 'O';
        }

        if (moves == 9) {
            System.out.println("It's a draw!");
        }
    }

    public static boolean checkWinner(char[][] board, char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;
    }
}