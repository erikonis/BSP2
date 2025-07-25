import java.util.*;

public class TicTacToeNXM {
    static char[][] board;
    static int rows, cols, winCount;
    static boolean vsAI;
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        setup();

        boolean turnO = true;
        int moveCount = 0;

        while (true) {
            printBoard();
            if (turnO || !vsAI) {
                System.out.print("Player " + (turnO ? "O" : "X") + " move (row col): ");
                int r = sc.nextInt(), c = sc.nextInt();
                if (!valid(r, c)) {
                    System.out.println("Invalid move.");
                    continue;
                }
                board[r][c] = turnO ? 'O' : 'X';
                if (won(r, c)) {
                    printBoard();
                    System.out.println("Player " + (turnO ? 'O' : 'X') + " wins!");
                    break;
                }
            } else {
                int[] move = aiMove();
                board[move[0]][move[1]] = 'X';
                System.out.println("AI (X) -> " + move[0] + " " + move[1]);
                if (won(move[0], move[1])) {
                    printBoard();
                    System.out.println("AI (Player X) wins!");
                    break;
                }
            }

            moveCount++;
            if (moveCount == rows * cols) {
                printBoard();
                System.out.println("Draw!");
                break;
            }
            turnO = !turnO;
        }
    }

    static void setup() {
        System.out.print("Enter board size (rows cols): ");
        rows = sc.nextInt(); cols = sc.nextInt();
        System.out.print("Enter win condition (how many in a row): ");
        winCount = sc.nextInt();
        System.out.print("Play against AI? (yes/no): ");
        vsAI = sc.next().equalsIgnoreCase("yes");

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
        char sym = board[r][c];
        return check(r, c, 0, 1, sym) || check(r, c, 1, 0, sym) || check(r, c, 1, 1, sym) || check(r, c, 1, -1, sym);
    }

    static boolean check(int r, int c, int dr, int dc, char sym) {
        int count = 1;
        for (int i = 1; i < winCount; i++) {
            int nr = r + dr * i, nc = c + dc * i;
            if (nr < 0 || nc < 0 || nr >= rows || nc >= cols || board[nr][nc] != sym) break;
            count++;
        }
        for (int i = 1; i < winCount; i++) {
            int nr = r - dr * i, nc = c - dc * i;
            if (nr < 0 || nc < 0 || nr >= rows || nc >= cols || board[nr][nc] != sym) break;
            count++;
        }
        return count >= winCount;
    }

    static int[] aiMove() {
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                if (valid(r, c)) {
                    board[r][c] = 'X';
                    if (won(r, c)) return new int[]{r, c};
                    board[r][c] = '-';
                }

        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                if (valid(r, c)) {
                    board[r][c] = 'O';
                    if (won(r, c)) {
                        board[r][c] = 'X';
                        return new int[]{r, c};
                    }
                    board[r][c] = '-';
                }

        int r, c;
        do {
            r = rand.nextInt(rows);
            c = rand.nextInt(cols);
        } while (!valid(r, c));
        return new int[]{r, c};
    }
}
