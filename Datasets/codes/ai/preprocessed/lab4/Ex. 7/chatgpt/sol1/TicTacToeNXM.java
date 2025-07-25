import java.util.Random;
import java.util.Scanner;

public class TicTacToeNXM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Get board dimensions and win length
        System.out.print("Enter number of rows (N): ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns (M): ");
        int cols = scanner.nextInt();
        System.out.print("Enter number of signs in a row needed to win: ");
        int winLength = scanner.nextInt();

        char[][] board = new char[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                board[i][j] = ' ';

        int turns = 0;
        int totalMoves = rows * cols;
        boolean isHumanTurn = true;

        while (true) {
            printBoard(board);
            if (isHumanTurn) {
                System.out.println("Your turn (O). Enter row and column:");
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                if (!isValidMove(board, row, col)) {
                    System.out.println("Invalid move, try again.");
                    continue;
                }
                board[row][col] = 'O';
            } else {
                System.out.println("AI's turn (X):");
                int row, col;
                do {
                    row = random.nextInt(rows);
                    col = random.nextInt(cols);
                } while (!isValidMove(board, row, col));
                board[row][col] = 'X';
                System.out.println("AI played at: " + row + " " + col);
            }

            turns++;
            char currentPlayer = isHumanTurn ? 'O' : 'X';
            if (hasWon(board, currentPlayer, winLength)) {
                printBoard(board);
                System.out.println((isHumanTurn ? "You" : "AI") + " win!");
                break;
            }

            if (turns == totalMoves) {
                printBoard(board);
                System.out.println("It's a draw!");
                break;
            }

            isHumanTurn = !isHumanTurn;
        }

        scanner.close();
    }

    static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 &&
               col < board[0].length && board[row][col] == ' ';
    }

    static void printBoard(char[][] board) {
        System.out.println("\nCurrent board:");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell == ' ' ? "." : cell);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean hasWon(char[][] board, char player, int winLength) {
        int rows = board.length;
        int cols = board[0].length;

        // Check all directions from every cell
        int[][] directions = {{0, 1}, {1, 0}, {1, 1}, {1, -1}};
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] != player) continue;
                for (int[] dir : directions) {
                    int count = 0, x = r, y = c;
                    while (x >= 0 && x < rows && y >= 0 && y < cols &&
                           board[x][y] == player) {
                        count++;
                        if (count == winLength) return true;
                        x += dir[0];
                        y += dir[1];
                    }
                }
            }
        }
        return false;
    }
}