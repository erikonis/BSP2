import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        initializeBoard(board);

        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'O';

        for (int round = 0; round < 9; round++) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + ", enter your move (row column):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                if (checkWin(board, currentPlayer)) {
                    printBoard(board);
                    System.out.println("Player " + currentPlayer + " wins!");
                    return;
                }
                currentPlayer = (currentPlayer == 'O') ? 'X' : 'O';
            } else {
                System.out.println("Invalid move! Try again.");
                round--;
            }
        }

        printBoard(board);
        System.out.println("It's a draw!");
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean checkWin(char[][] board, char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }
}