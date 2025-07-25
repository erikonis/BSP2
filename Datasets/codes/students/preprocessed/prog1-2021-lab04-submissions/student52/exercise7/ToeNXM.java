import java.util.Random;
import java.util.Scanner;

public class ToeNXM {
    static Scanner scanner = new Scanner(System.in);

    static int N;
    static int M;
    static int W;

    // using 0 for empty, 1 for circle , and 2 for cross
    static int[][] field;

    public static int inp_line() {
        System.out.print("Value for row:");
        int x = scanner.nextInt();
        while (x > N || x < 1) {
            System.out.print("Row impossible! Input another value:");
            x = scanner.nextInt();
        }
        return x;
    }

    public static int inp_col() {
        System.out.print("Value for column:");
        int y = scanner.nextInt();
        while (y > M || y < 1) {
            System.out.print("Column impossible! Input another value:");
            y = scanner.nextInt();
        }
        return y;
    }

    public static void GameState() {
        System.out.println("The gamestate now is: \n");

        for (int i = 0; i < N; i++) {
            System.out.print(" ");
            for (int j = 0; j < M; j++) {
                char ch = switch (field[i][j]) {
                case 1 -> 'O';
                case 2 -> 'X';
                default -> {
                    yield ' ';
                }
                };

                System.out.print(ch);
                if (j < M - 1)
                    System.out.print(" | ");
            }
            if (i < N - 1) {
                System.out.print("\n");
                for (int tz = 0; tz < M; tz++)
                    System.out.print("--  ");
                System.out.print("\n");
            } else
                System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static boolean lineWin() {
        boolean win = false;
        for (int i = 0; i < N; i++)
            for (int rw = 0; rw <= M - W; rw++) {
                if (field[i][rw] != 0) {
                    win = true;
                    for (int ri = rw + 1; ri < rw + W; ri++)
                        if (field[i][ri] != field[i][rw]) {
                            win = false;
                            break;
                        }
                    if (win)
                        return win;
                }

            }
        return false;

    }

    public static boolean lineCheck() {
        boolean win = false;
        for (int i = 0; i < N; i++)
            for (int rw = 0; rw <= M - W + 1; rw++) {
                if (field[i][rw] != 0) {
                    win = true;
                    for (int ri = rw + 1; ri < rw + W - 1; ri++)
                        if (field[i][ri] != field[i][rw]) {
                            win = false;
                            break;
                        }
                    if (win)
                        if (rw > 0) {
                            if (field[i][rw - 1] == 0) {
                                field[i][rw - 1] = 2;
                                return true;
                            }
                        } else if (field[i][rw + W - 1] == 0) {
                            field[i][rw + W - 1] = 2;
                            return true;
                        }
                }

            }
        return false;

    }

    public static boolean columnWin() {
        boolean win = false;
        for (int j = 0; j < M; j++)
            for (int cl = 0; cl <= N - W; cl++) {
                if (field[cl][j] != 0) {
                    win = true;
                    for (int ci = cl + 1; ci < cl + W; ci++)
                        if (field[ci][j] != field[cl][j]) {
                            win = false;
                            break;
                        }
                }
                if (win)
                    return win;

            }
        return false;
    }

    public static boolean columnCheck() {
        boolean win = false;
        for (int j = 0; j < M; j++)
            for (int cl = 0; cl <= N - W + 1; cl++) {
                if (field[cl][j] != 0) {
                    win = true;
                    for (int ci = cl + 1; ci < cl + W - 1; ci++)
                        if (field[ci][j] != field[cl][j]) {
                            win = false;
                            break;
                        }
                }

                if (win)
                    if (cl > 0) {
                        if (field[cl - 1][j] == 0) {
                            field[cl - 1][j] = 2;
                            return true;
                        }
                    } else if (field[cl + W - 1][j] == 0) {
                        field[cl + W - 1][j] = 2;
                        return true;
                    }

            }
        return false;
    }

    public static boolean diag1Win() {
        boolean win = false;
        for (int i = 0; i <= N - W; i++)
            for (int j = 0; j <= M - W; j++)
                if (field[i][j] != 0) {
                    win = true;
                    for (int a = 1; a < W; a++)
                        if (field[i + a][j + a] != field[i][j]) {
                            win = false;
                            break;
                        }
                    if (win)
                        return win;
                }
        return false;
    }

    public static boolean diag1Check() {
        boolean win = false;
        for (int i = 0; i <= N - W + 1; i++)
            for (int j = 0; j <= M - W + 1; j++)
                if (field[i][j] != 0) {
                    win = true;
                    for (int a = 1; a < W - 1; a++)
                        if (field[i + a][j + a] != field[i][j]) {
                            win = false;
                            break;
                        }
                    if (win)
                        if (i > 0) {
                            if (field[i - 1][j - 1] == 0) {
                                field[i - 1][j - 1] = 2;
                                return true;
                            }
                        } else if (field[W - 1][W - 1] == 0) {
                            field[W - 1][W - 1] = 2;
                            return true;
                        }
                }
        return false;
    }

    public static boolean diag2Win() {
        boolean win = false;
        for (int i = 0; i <= N - W; i++)
            for (int j = M - 1; j >= W - 1; j--)
                if (field[i][j] != 0) {
                    win = true;
                    for (int a = 1; a < W; a++)
                        if (field[i + a][j - a] != field[i][j]) {
                            win = false;
                            break;
                        }
                    if (win)
                        return win;
                }
        return false;
    }

    public static boolean diag2Check() {
        boolean win = false;
        for (int i = 0; i <= N - W + 1; i++)
            for (int j = M - 1; j >= W - 2; j--)
                if (field[i][j] != 0) {
                    win = true;
                    for (int a = 1; a < W - 1; a++)
                        if (field[i + a][j - a] != field[i][j]) {
                            win = false;
                            break;
                        }
                    if (win)
                        if (i > 0) {
                            if (field[i - 1][j + 1] == 0) {
                                field[i - 1][j + 1] = 2;
                                return true;
                            }
                        } else if (field[W - 1][M - W] == 0) {
                            field[W - 1][M - W] = 2;
                            return true;
                        }
                }
        return false;
    }

    public static boolean WIN() {
        if (columnWin())
            return true;
        else if (lineWin())
            return true;
        else if (diag1Win())
            return true;
        else if (diag2Win())
            return true;
        return false;
    }

    public static void human_move() {
        int x, y;

        x = inp_line();
        y = inp_col();

        while (field[x - 1][y - 1] != 0) {
            System.out.println("Place already taken! Choose another one:");
            x = inp_line();
            y = inp_col();
        }
        field[x - 1][y - 1] = 1;

    }

    public static void AI_check() {
        if (!lineCheck())
            if (!columnCheck())
                if (!diag1Check())
                    if (!diag2Check())
                        AI_move();
    }

    public static void AI_move() {
        Random rn = new Random();
        int x = rn.nextInt(N) + 1;
        int y = rn.nextInt(M) + 1;
        while (field[x - 1][y - 1] != 0) {
            x = rn.nextInt(N) + 1;
            y = rn.nextInt(M) + 1;
        }
        field[x - 1][y - 1] = 2;
    }

    public static void main(String[] args) {

        System.out.print("N=");
        N = scanner.nextInt();
        System.out.print("M=");
        M = scanner.nextInt();
        W = Math.min(N, M);

        field = new int[N][M];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                field[i][j] = 0;

        for (int k = 1; k <= N * M; k++) {
            if (k % 2 == 1)
                human_move();
            else
                AI_check();

            GameState();

            if (WIN()) {
                if (k % 2 == 1)
                    System.out.println("Circle wins!");
                else
                    System.out.println("Cross wins!");
                System.out.println("GG! <3");
                break;
            }
        }

        scanner.close();
    }
}