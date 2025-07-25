import java.util.*;

public class TicTacToeNXM {
    static char[][] board;
    static int rows, cols, winCount;
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        init();
        boolean playerTurn = true;
        int moveCount = 0;

        while (true) {
            printBoard();
            if (playerTurn) {
                System.out.print("Player O move (row col): ");
                int r = sc.nextInt(), c = sc.nextInt();
                if (valid(r, c)) {
                    board[r][c] = 'O';
                    if (won(r, c)) { printBoard(); System.out.println("Player O wins!"); break; }
                    playerTurn = false;
                    moveCount++;
                } else System.out.println("Invalid move.");
            } else {
                int[] move = aiMove();
                board[move[0]][move[1]] = 'X';
                System.out.println("AI (X) -> " + move[0] + " " + move[1]);
                if (won(move[0], move[1])) { printBoard(); System.out.println("AI (Player X) wins!"); break; }
                playerTurn = true;
                moveCount++;
            }

            if (moveCount == rows * cols) {
                printBoard();
                System.out.println("Draw!");
                break;
            }
        }
    }

    static void init() {
        System.out.print("Board size (rows cols): ");
        rows = sc.nextInt(); cols = sc.nextInt();
        System.out.print("Win count: ");
        winCount = sc.nextInt();
        board = new char[rows][cols];
        for (int i = 0; i < rows; i++) Arrays.fill(board[i], '-');
    }

    static void printBoard() {
        for (char[] row : board) {
            for (char c : row) System.out.print(c + "\t");
            System.out.println();
        }
        System.out.println();
    }

    static boolean valid(int r, int c) {
        return r >= 0 && r < rows && c >= 0 && c < cols && board[r][c] == '-';
    }

    static boolean won(int r, int c) {
        char s = board[r][c];
        return dir(r, c, 0, 1, s) || dir(r, c, 1, 0, s) || dir(r, c, 1, 1, s) || dir(r, c, 1, -1, s);
    }

    static boolean dir(int r, int c, int dr, int dc, char s) {
        int count = 1;
        for (int i = 1; i < winCount; i++) {
            int nr = r + dr * i, nc = c + dc * i;
            if (in(nr, nc) && board[nr][nc] == s) count++; else break;
        }
        for (int i = 1; i < winCount; i++) {
            int nr = r - dr * i, nc = c - dc * i;
            if (in(nr, nc) && board[nr][nc] == s) count++; else break;
        }
        return count >= winCount;
    }

    static boolean in(int r, int c) {
        return r >= 0 && r < rows && c >= 0 && c < cols;
    }

    static int[] aiMove() {
        // Win if possible
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                if (valid(r, c)) {
                    board[r][c] = 'X';
                    if (won(r, c)) return new int[]{r, c};
                    board[r][c] = '-';
                }

        // Block opponent
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols