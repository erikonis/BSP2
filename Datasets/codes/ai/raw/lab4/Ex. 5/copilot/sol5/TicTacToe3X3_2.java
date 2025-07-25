import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        initializeBoard(board);
        printBoard(board);

        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'O'; // Circle starts

        for (int round = 0; round < 9; round++) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board[row][col] == '-') {
                board[row][col] = currentPlayer;
                printBoard(board);
                currentPlayer = (currentPlayer == 'O') ? 'X' : 'O'; // Switch player
            } else {
                System.out.println("This cell is already occupied. Try again.");
                round--; // Retry the same round
            }
        }
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
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
}
