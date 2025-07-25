import java.util.*;

public class TicTacToeNXM {
    static char[][] board;
    static int rows, cols, winCount;
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.print("Enter board size (rows cols): ");
        rows = sc.nextInt();
        cols = sc.nextInt();
        System.out.print("Enter win length: ");
        winCount = sc.nextInt();

        board = new char[rows][cols];
        for (int i = 0; i < rows; i++) Arrays.fill(board[i], '-');

        boolean circleTurn = true;
        int moves = 0;

        while (true) {
            printBoard();
            if (circleTurn) {
                System.out.print("Player O, enter row and column: ");
                int r = sc.nextInt(), c = sc.nextInt();
                if (isValid(r, c)) {
                    board[r][c] = 'O';
                    moves++;
                    if (checkWin(r, c)) {
                        printBoard();
                        System.out.println("Player O wins!");
                        break;
                    }
                    circleTurn = false;
                } else {
                    System.out.println("Invalid move.");
                }
            } else {
                int r, c;
                do {
                    r = rand.nextInt(rows);
                    c = rand.nextInt(cols);
                } while (!isValid(r, c));
                board[r][c] = 'X';
                System.out.println("AI (X) played: " + r + " " + c);
                moves++;
                if (checkWin(r, c)) {
                    printBoard();
                    System.out.println("AI (Player X) wins!");
                    break;
                }
                circleTurn = true;
            }

            if (moves == rows * cols) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }
        }
    }

    static void printBoard() {
        for (char[] row : board) {
            for (char cell : row) System.out.print(cell + "\t");
            System.out.println();
        }
        System.out.println();
    }

    static boolean isValid(int r, int c) {
        return r >= 0 && r < rows && c >= 0 && c < cols && board[r][c] == '-';
    }

    static boolean checkWin(int r, int c) {
        char symbol = board[r][c];
        return checkDir(r, c, 0, 1, symbol) ||  // Horizontal
               checkDir(r, c, 1, 0, symbol) ||  // Vertical
               checkDir(r, c, 1, 1, symbol) ||  // Diagonal \
               checkDir(r, c, 1, -1, symbol);   // Diagonal /
    }

    static boolean checkDir(int r, int c, int dr, int dc, char sym) {
        int count = 1;
        for (int i = 1; i < winCount; i++) {
            int nr = r + dr * i, nc = c + dc * i;
            if (inBounds(nr, nc) && board[nr][nc] == sym) count++;
            else break;
        }
        for (int i = 1; i < winCount; i++) {
            int nr = r - dr * i, nc = c - dc * i;
            if (inBounds(nr, nc) && board[nr][nc] == sym) count++;
            else break;
        }
        return count >= winCount;
    }

    static boolean inBounds(int r, int c) {
        return r >= 0 && r < rows && c >= 0 && c < cols;
    }
}
