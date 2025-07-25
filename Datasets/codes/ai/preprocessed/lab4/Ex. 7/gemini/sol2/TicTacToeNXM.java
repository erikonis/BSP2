import java.util.Random;
import java.util.Scanner;

public class TicTacToeNXM {

    private char[][] board;
    private int rows;
    private int cols;
    private int winCondition;
    private char currentPlayer;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public TicTacToeNXM(int rows, int cols, int winCondition) {
        this.rows = rows;
        this.cols = cols;
        this.winCondition = winCondition;
        this.board = new char[rows][cols];
        this.currentPlayer = 'X';
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < rows; i++) {
            System.out.print("| ");
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols && board[row][col] == ' ';
    }

    private boolean makeMove(int row, int col) {
        if (isValidMove(row, col)) {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    private boolean checkWin(int row, int col) {
        char player = board[row][col];
        int count;

        // Check row
        count = 0;
        for (int j = 0; j < cols; j++) {
            if (board[row][j] == player) count++;
            else count = 0;
            if (count == winCondition) return true;
        }

        // Check column
        count = 0;
        for (int i = 0; i < rows; i++) {
            if (board[i][col] == player) count++;
            else count = 0;
            if (count == winCondition) return true;
        }

        // Check diagonal (top-left to bottom-right)
        count = 0;
        for (int i = -Math.min(row, col); i < Math.min(rows - row, cols - col); i++) {
            if (row + i >= 0 && row + i < rows && col + i >= 0 && col + i < cols && board[row + i][col + i] == player) count++;
            else count = 0;
            if (count == winCondition) return true;
        }

        // Check anti-diagonal (top-right to bottom-left)
        count = 0;
        for (int i = -Math.min(row, cols - 1 - col); i < Math.min(rows - row, col + 1); i++) {
            if (row + i >= 0 && row + i < rows && col - i >= 0 && col - i < cols && board[row + i][col - i] == player) count++;
            else count = 0;
            if (count == winCondition) return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public void playGame() {
        System.out.println("Welcome to Tic Tac Toe " + rows + "x" + cols + "!");
        printBoard();

        while (true) {
            int row, col;

            if (currentPlayer == 'X') {
                System.out.println("Player X's turn. Enter row and column (e.g., 0 1):");
                row = scanner.nextInt();
                col = scanner.nextInt();
            } else {
                System.out.println("AI (O)'s turn.");
                // Random AI move
                int attempts = 0;
                do {
                    row = random.nextInt(rows);
                    col = random.nextInt(cols);
                    attempts++;
                    if (attempts > rows * cols * 2) { // Avoid infinite loop in a full board
                        System.out.println("AI couldn't find a move. It's a draw by default.");
                        return;
                    }
                } while (!isValidMove(row, col));
                System.out.println("AI (O) chose row: " + row + ", col: " + col);
            }

            if (makeMove(row, col)) {
                printBoard();
                if (checkWin(row, col)) {
                    System.out.println(currentPlayer == 'X' ? "Player X wins!" : "AI (O) wins!");
                    break;
                }
                if (isBoardFull()) {
                    System.out.println("It's a draw!");
                    break;
                }
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows for the board:");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns for the board:");
        int cols = input.nextInt();
        System.out.println("Enter the number of signs in a line to win:");
        int winCondition = input.nextInt();

        new TicTacToeNXM(rows, cols, winCondition).playGame();
        input.close();
    }
}