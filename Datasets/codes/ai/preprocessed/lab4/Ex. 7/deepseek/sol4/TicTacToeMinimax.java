import java.util.Scanner;

public class TicTacToeMinimax {
    private static char[][] board;
    private static int rows, cols, winLength;
    private static Scanner scanner = new Scanner(System.in);
    private static final char HUMAN = 'O';
    private static final char AI = 'X';
    private static final char EMPTY = ' ';

    public static void main(String[] args) {
        initializeGame();
        char currentPlayer = HUMAN; // Human starts first

        while (true) {
            printBoard();

            if (currentPlayer == HUMAN) {
                humanMove();
            } else {
                System.out.println("AI is thinking...");
                aiMinimaxMove();
            }

            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println(currentPlayer == HUMAN ? "You win!" : "AI wins!");
                break;
            }

            if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            currentPlayer = (currentPlayer == HUMAN) ? AI : HUMAN;
        }
    }

    private static void initializeGame() {
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        cols = scanner.nextInt();
        System.out.print("Enter winning line length: ");
        winLength = scanner.nextInt();

        board = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void printBoard() {
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + board[i][j] + " ");
                if (j < cols - 1) System.out.print("|");
            }
            System.out.println();
            if (i < rows - 1) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("---");
                    if (j < cols - 1) System.out.print("+");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void humanMove() {
        int row, col;
        do {
            System.out.print("Enter row (1-" + rows + ") and column (1-" + cols + "): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
        } while (row < 0 || row >= rows || col < 0 || col >= cols || board[row][col] != EMPTY);
        board[row][col] = HUMAN;
    }

    private static void aiMinimaxMove() {
        int[] bestMove = findBestMove();
        board[bestMove[0]][bestMove[1]] = AI;
    }

    private static int[] findBestMove() {
        int bestScore = Integer.MIN_VALUE;
        int[] bestMove = new int[]{-1, -1};

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == EMPTY) {
                    board[i][j] = AI;
                    int score = minimax(0, false);
                    board[i][j] = EMPTY;

                    if (score > bestScore) {
                        bestScore = score;
                        bestMove[0] = i;
                        bestMove[1] = j;
                    }
                }
            }
        }
        return bestMove;
    }

    private static int minimax(int depth, boolean isMaximizing) {
        if (checkWin(AI)) return 10 - depth;
        if (checkWin(HUMAN)) return depth - 10;
        if (isBoardFull()) return 0;

        if (isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (board[i][j] == EMPTY) {
                        board[i][j] = AI;
                        int score = minimax(depth + 1, false);
                        board[i][j] = EMPTY;
                        bestScore = Math.max(score, bestScore);
                    }
                }
            }
            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (board[i][j] == EMPTY) {
                        board[i][j] = HUMAN;
                        int score = minimax(depth + 1, true);
                        board[i][j] = EMPTY;
                        bestScore = Math.min(score, bestScore);
                    }
                }
            }
            return bestScore;
        }
    }

    private static boolean checkWin(char player) {
        // Check rows
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols - winLength; j++) {
                boolean win = true;
                for (int k = 0; k < winLength; k++) {
                    if (board[i][j + k] != player) {
                        win = false;
                        break;
                    }
                }
                if (win) return true;
            }
        }

        // Check columns
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i <= rows - winLength; i++) {
                boolean win = true;
                for (int k = 0; k < winLength; k++) {
                    if (board[i + k][j] != player) {
                        win = false;
                        break;
                    }
                }
                if (win) return true;
            }
        }

        // Check diagonals
        for (int i = 0; i <= rows - winLength; i++) {
            for (int j = 0; j <= cols - winLength; j++) {
                boolean win = true;
                for (int k = 0; k < winLength; k++) {
                    if (board[i + k][j + k] != player) {
                        win = false;
                        break;
                    }
                }
                if (win) return true;

                win = true;
                for (int k = 0; k < winLength; k++) {
                    if (board[i + k][j + winLength - 1 - k] != player) {
                        win = false;
                        break;
                    }
                }
                if (win) return true;
            }
        }

        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}