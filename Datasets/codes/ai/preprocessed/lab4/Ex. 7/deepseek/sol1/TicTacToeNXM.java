import java.util.Random;
import java.util.Scanner;

public class TicTacToeNXM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        System.out.print("Enter the number of signs in a line to win: ");
        int winLength = scanner.nextInt();

        char[][] board = new char[rows][cols];
        initializeBoard(board);

        char currentPlayer = 'O';
        Random random = new Random();

        while (true) {
            printBoard(board);

            if (currentPlayer == 'O') {
                System.out.println("Player O, enter your move (row column):");
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                if (isValidMove(board, row, col)) {
                    board[row][col] = 'O';
                    if (checkWin(board, 'O', winLength)) {
                        printBoard(board);
                        System.out.println("Player O wins!");
                        break;
                    }
                    currentPlayer = 'X';
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            } else {
                System.out.println("AI (X) is making a move...");
                int row, col;
                do {
                    row = random.nextInt(rows);
                    col = random.nextInt(cols);
                } while (!isValidMove(board, row, col));

                board[row][col] = 'X';
                if (checkWin(board, 'X', winLength)) {
                    printBoard(board);
                    System.out.println("AI (X) wins!");
                    break;
                }
                currentPlayer = 'O';
            }

            if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("It's a draw!");
                break;
            }
        }
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length && board[row][col] == ' ';
    }

    public static boolean checkWin(char[][] board, char player, int winLength) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (checkDirection(board, player, i, j, 1, 0, winLength) || // Horizontal
                    checkDirection(board, player, i, j, 0, 1, winLength) || // Vertical
                    checkDirection(board, player, i, j, 1, 1, winLength) || // Diagonal
                    checkDirection(board, player, i, j, 1, -1, winLength)) { // Anti-diagonal
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkDirection(char[][] board, char player, int row, int col, int rowDir, int colDir, int winLength) {
        int count = 0;
        while (row >= 0 && row < board.length && col >= 0 && col < board[0].length && board[row][col] == player) {
            count++;
            if (count >= winLength) {
                return true;
            }
            row += rowDir;
            col += colDir;
        }
        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}