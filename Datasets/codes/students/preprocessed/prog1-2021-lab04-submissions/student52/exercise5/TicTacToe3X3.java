import java.util.Scanner;

public class TicTacToe3X3 {
    static Scanner scanner = new Scanner(System.in);

    // using 0 for empty, 1 for circle , and 2 for cross
    static int[][] field = new int[3][3];

    public static int inp_line() {
        System.out.print("Value for row:");
        int x = scanner.nextInt();
        while (x > 3 || x < 1) {
            System.out.print("Row impossible! Input another value:");
            x = scanner.nextInt();
        }
        return x;
    }

    public static int inp_col() {
        System.out.print("Value for column:");
        int y = scanner.nextInt();
        while (y > 3 || y < 1) {
            System.out.print("Column impossible! Input another value:");
            y = scanner.nextInt();
        }
        return y;
    }

    public static void GameState() {
        System.out.println("The gamestate now is: \n");
        for (int i = 0; i <= 2; i++) {
            System.out.print(" ");
            for (int j = 0; j <= 2; j++) {
                char ch = switch (field[i][j]) {
                case 1 -> 'O';
                case 2 -> 'X';
                default -> {
                    yield ' ';
                }
                };

                System.out.print(ch);
                if (j < 2)
                    System.out.print(" | ");
            }
            if (i < 2)
                System.out.print("\n" + "--  --  --" + "\n");
            else
                System.out.print("\n");
        }
    }

    public static boolean lineWin() {
        for (int i = 0; i <= 2; i++)
            if (field[i][0] != 0)
                if (field[i][0] == field[i][1])
                    if (field[i][0] == field[i][2])
                        return true;
        return false;
    }

    public static boolean columnWin() {
        for (int i = 0; i <= 2; i++)
            if (field[0][i] != 0)
                if (field[0][i] == field[1][i])
                    if (field[0][i] == field[2][i])
                        return true;
        return false;
    }

    public static boolean diag1Win() {
        if (field[0][0] != 0)
            if (field[0][0] == field[1][1])
                if (field[0][0] == field[2][2])
                    return true;
        return false;
    }

    public static boolean diag2Win() {
        if (field[0][2] != 0)
            if (field[0][2] == field[1][1])
                if (field[0][2] == field[2][0])
                    return true;
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

    public static void human_move1() {
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

    public static void human_move2() {
        int x, y;

        x = inp_line();
        y = inp_col();

        while (field[x - 1][y - 1] != 0) {
            System.out.println("Place already taken! Choose another one:");
            x = inp_line();
            y = inp_col();
        }
        field[x - 1][y - 1] = 2;

    }

    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++)
            for (int j = 0; j <= 2; j++)
                field[i][j] = 0;

        for (int k = 1; k <= 9; k++) {
            if (k % 2 == 1)
                human_move1();
            else
                human_move2();

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
