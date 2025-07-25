package lu.uni.programming1.lab4.exercise5;

import java.util.Scanner;

public class TicTacToe3X3 {
    public static void emptyField(String[][] field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = ".";
                System.out.printf("%s ", field[i][j]);
            }
            System.out.println();
        }
    }

    public static void round(String[][] field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void play(String[][] field, int i, int j, int counter) {
        field[i][j] = counter % 2 == 0 ? "o" : "x";
    }

    public static void input(String[][] field, Scanner scanner, int counter) {
        int a, b;
        do {
            System.out.print("Please enter the row position (1-3): ");
            a = Math.max(1, Math.min(3, scanner.nextShort())) - 1;
            System.out.print("Please enter the column position (1-3): ");
            b = Math.max(1, Math.min(3, scanner.nextShort())) - 1;
        } while (field[a][b].equals("o") || field[a][b].equals("x"));
        play(field, a, b, counter);
    }
    public static char checkWinner(String[][] field){
        String row, col, dia1, dia2 = "";
        char winner = 'l';
        for (int i = 0, p = 2; i < 3; i++, p--) {
            row = "";
            col = "";
            dia1 = "";
            dia2 += field[i][p];
            for (int j = 0; j < 3; j++) {
                row += field[i][j];
                col += field[j][i];
                dia1 += field[j][j];
                if (j == 2 && (row.equals("ooo")|| row.equals("xxx"))) {
                    winner = row.charAt(0);
                } else if (j == 2 && (col.equals("ooo")|| col.equals("xxx"))) {
                    winner = col.charAt(0);
                } else if (j == 2 && (dia1.equals("ooo")|| dia1.equals("xxx"))){
                    winner = dia1.charAt(0);
                } else if (j == 2 && (dia2.equals("ooo")|| dia2.equals("xxx"))){
                    winner = dia2.charAt(0);
                }
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Field[][];
        int c = 0;
        Field = new String[3][3];
        // show empty field
        emptyField(Field);
        System.out.println("\nPlayer 'o' starts the game before player 'x' !");

        // ask player input and play 9 rounds
        for (int i = 0; i < 9; i++) {
            input(Field, scanner, c);
            ++c;
            round(Field);
            if (checkWinner(Field) != 'l') {
                System.out.printf("Player %c has won the game.", checkWinner(Field));
                i = 9;
            }
        }
        scanner.close();
    }
}
