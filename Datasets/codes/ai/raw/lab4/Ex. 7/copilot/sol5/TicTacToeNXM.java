import java.util.Random;
import java.util.Scanner;

public class TicTacToeNXM {
    private static char[][] board;
    private static int rows, cols;
    private static int winLength;
    private static char currentPlayer = 'X';
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        cols = scanner.nextInt();
        System.out.print("Enter number of signs in a line needed to win: ");
        winLength = scanner.nextInt();

        board = new char[rows][cols];
        initializeBoard();

        while (true) {
            printBoard();
            if (currentPlayer == 'X') {
                playerMove(scanner);
            } else {
                aiMove();
            }
            if (checkWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            if (isBoardFull()) {
                printBoard();
                System.out.println("The game is a draw!");
                break;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void playerMove(Scanner scanner) {
        int row, col;
        while (true) {
            System.out.print("Enter row and column: ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (row >= 0 && row < rows && col >= 0 && col < cols && board[row][col] == '-') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private static void aiMove() {
        // Simple heuristic: prioritize center, then corners, then edges
        int[] move = findBestMove();
        board[move[0]][move[1]] = currentPlayer;
    }

    private static int[] findBestMove() {
        int[] center = {rows / 2, cols / 2};
        if (board[center[0]][center[1]] == '-') {
            return center;
        }

        int[][] corners = {{0, 0}, {0, cols - 1}, {rows - 1, 0}, {rows - 1, cols - 1}};
        for (int[] corner : corners) {
            if (board[corner[0]][corner[1]] == '-') {
                return corner;
            }
        }

        int[][] edges = new int[rows * cols][2];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == '-') {
                    edges[index++] = new int[]{i, j};
                }
            }
        }
        return edges[random.nextInt(index)];
    }

    private static boolean checkWin() {
        // Check rows, columns, and diagonals for a win
        // Implementation omitted for brevity
        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
