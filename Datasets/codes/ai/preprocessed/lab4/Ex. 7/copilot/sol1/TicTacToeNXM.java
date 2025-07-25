import java.util.Scanner;

public class TicTacToeNXM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows (N):");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns (M):");
        int cols = scanner.nextInt();

        char[][] board = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '-';
            }
        }

        boolean isCircleTurn = true;
        int totalMoves = rows * cols;

        for (int round = 0; round < totalMoves; round++) {
            System.out.println("Enter X and Y coordinates (0-" + (rows - 1) + ") for " + (isCircleTurn ? "Circle" : "Cross") + ":");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (board[x][y] == '-') {
                board[x][y] = isCircleTurn ? 'O' : 'X';
                if (checkWinner(board, x, y)) {
                    printBoard(board);
                    System.out.println((isCircleTurn ? "Circle" : "Cross") + " wins!");
                    return;
                }
                isCircleTurn = !isCircleTurn;
            } else {
                System.out.println("Cell already occupied! Try again.");
               --;
            }

            printBoard(board);
        }
        System.out.println("It's a draw!");
    }

    private static boolean checkWinner(char[][] board, int x, int y) {
        char player = board[x][y];
        int rows = board.length;
        int cols = board[0].length;

        // Check row
        boolean win = true;
        for (int j = 0; j < cols; j++) {
            if (board[x][j] != player) {
                win = false;
                break;
            }
        }
        if (win) return true;

        // Check column
        win = true;
        for (int i = 0; i < rows; i++) {
            if (board[i][y] != player) {
                win = false;
                break;
            }
        }
        if (win) return true;

        // Check diagonal
        if (x == y) {
            win = true;
            for (int i = 0; i < rows; i++) {
                if (board[i][i] != player) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // Check anti-diagonal
        if (x + y == rows - 1) {
            win = true;
            for (int i = 0; i < rows; i++) {
                if (board[i][rows - 1 - i] != player) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        return false;
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}