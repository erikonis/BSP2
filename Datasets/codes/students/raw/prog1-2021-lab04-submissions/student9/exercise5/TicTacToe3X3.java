package lu.uni.programming1.lab4.exercise5;

import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        char[][] panel = new char[4][4];
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                panel[i][j] = '-';
            }
        }
        Scanner scanner = new Scanner(System.in);
        String p1 = "x";
        String p2 = "o";
        boolean player1 = true;
        boolean gameEnded = false;
        while (!gameEnded) {
            drawpanel(panel);

            if (player1) {
                System.out.println("It is " + p1 + "'s Turn :");
            } else {
                System.out.println("It is " + p2 + "'s Turn :");
            }
            char c = '-';
            if (player1) {
                c = 'x';
            } else {
                c = 'o';
            }
            int row = 1;
            int column = 1;
            while (true) {
                System.out.print("Enter a row number (1, 2, 3): ");
                row = scanner.nextInt();
                System.out.print("Enter a columnumn number (1, 2, 3): ");
                column = scanner.nextInt();
                if (row < 1 || column < 1 || row > 3 || column > 3) {
                    System.out.println("Choose number 1, 2, 3");
                } else if (panel[row][column] != '-') {
                    System.out.println("Choose another spot it is already taken");
                } else {
                    break;
                }
            }
            panel[row][column] = c;

            if (playerHasWon(panel) == 'x') {
                System.out.println(p1 + " has won!");
                gameEnded = true;
            } else if (playerHasWon(panel) == 'o') {
                System.out.println(p2 + " has won!");
                gameEnded = true;
            } else {
                if (panelIsFull(panel)) {
                    System.out.println("It's a tie!");
                    gameEnded = true;
                } else {
                    player1 = !player1;
                }
            }
        }
        drawpanel(panel);
        scanner.close();
    }

    public static void drawpanel(char[][] panel) {
        System.out.println("panel:");
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.print(panel[i][j]);
            }
            System.out.println();
        }
    }

    public static char playerHasWon(char[][] panel) {
        for (int i = 1; i < 4; i++) {
            if (panel[i][1] == panel[i][2] && panel[i][2] == panel[i][3] && panel[i][1] != '-') {
                return panel[i][1];
            }
        }
        for (int j = 1; j < 4; j++) {
            if (panel[1][j] == panel[2][j] && panel[2][j] == panel[3][j] && panel[1][j] != '-') {
                return panel[1][j];
            }
        }
        if (panel[1][1] == panel[2][2] && panel[2][2] == panel[3][3] && panel[1][1] != '-') {
            return panel[1][1];
        }
        if (panel[3][1] == panel[2][2] && panel[2][2] == panel[1][3] && panel[3][1] != '-') {
            return panel[3][1];
        }
        return ' ';
    }

    public static boolean panelIsFull(char[][] panel) {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (panel[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}