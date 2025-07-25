import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];

        // Initialize board with empty spaces
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';

        char player = 'O'; // Circle starts
        int turns = 0;

        while (true) {
            printBoard(board);
            System.out.println("Player " + player + "'s turn. Enter row and column (0-2):");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (!isValidMove(board, row, col)) {
                System.out.println("Invalid move, try again.");
                continue;
            }

            board[row][col] = player;
            turns++;

            if (hasWon(board, player)) {
                printBoard(board);
                System.out.println("Player " + player + " wins!");
                break;
            }

            if (turns == 9) {
                printBoard(board);
                System.out.println("It's a draw!");
                break;
            }

            player = (player == 'O') ? 'X' : 'O'; // Switch player
        }

        scanner.close();
    }

    static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    static boolean hasWon(char[][] b, char p) {
        // Rows and columns
        for (int i = 0; i < 3; i++) {
            if ((b[i][0] == p && b[i][1] == p && b[i][2] == p) ||
                (b[0][i] == p && b[1][i] == p && b[2][i] == p))
                return true;
        }
        // Diagonals
        return (b[0][0] == p && b[1][1] == p && b[2][2] == p) ||
               (b[0][2] == p && b[1][1] == p && b[2][0] == p);
    }

    static void printBoard(char[][] b) {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
        System.out.println();
    }
}
