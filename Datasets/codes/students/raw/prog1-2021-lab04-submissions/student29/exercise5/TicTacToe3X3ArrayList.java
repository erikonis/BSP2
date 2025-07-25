package lu.uni.programming1.lab4.exercise5;

import java.util.ArrayList;
import java.util.Scanner;

//Please don't rate this programm, I just red "Array" in the lab sheet and thaugth I should use an ArrayList. I completely forgot that an simple "Array" exists; but I don't want to delete this programm

public class TicTacToe3X3ArrayList {
    public static void main(String[] args) {
        ArrayList alGameBoard = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int field = 1;
        int box = 0;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                alGameBoard.add(field);
                System.out.print(field + "\t");

                field++;
            }
            System.out.println();
            System.out.println();
        }

        int k;
        for (k = 0; k <= 8; k++) {

            int a = 0;

            if (k % 2 == 0) {

                System.out.println("Player circle, please place your mark on an empty field.");
                box = scanner.nextInt();

                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        if (alGameBoard.get(a).equals(box)) {
                            alGameBoard.set(a, "O");
                        }
                        System.out.print(alGameBoard.get(a) + "\t");
                        a++;
                    }
                    System.out.println();
                    System.out.println();
                }
            } else {

                System.out.println("Player cross, please place your mark on an empty field.");
                box = scanner.nextInt();

                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        if (alGameBoard.get(a).equals(box)) {
                            alGameBoard.set(a, "X");
                        }

                        System.out.print(alGameBoard.get(a) + "\t");
                        a++;
                    }
                    System.out.println();
                    System.out.println();
                }
            }
            if (alGameBoard.get(0).equals(alGameBoard.get(1)) && alGameBoard.get(0).equals(alGameBoard.get(2))
                    || alGameBoard.get(3).equals(alGameBoard.get(4)) && alGameBoard.get(3).equals(alGameBoard.get(5))
                    || alGameBoard.get(6).equals(alGameBoard.get(7)) && alGameBoard.get(6).equals(alGameBoard.get(8))
                    || alGameBoard.get(0).equals(alGameBoard.get(3)) && alGameBoard.get(0).equals(alGameBoard.get(6))
                    || alGameBoard.get(1).equals(alGameBoard.get(4)) && alGameBoard.get(1).equals(alGameBoard.get(7))
                    || alGameBoard.get(2).equals(alGameBoard.get(5)) && alGameBoard.get(2).equals(alGameBoard.get(8))
                    || alGameBoard.get(0).equals(alGameBoard.get(4)) && alGameBoard.get(0).equals(alGameBoard.get(8))
                    || alGameBoard.get(2).equals(alGameBoard.get(4)) && alGameBoard.get(2).equals(alGameBoard.get(6))) {
                if (k % 2 == 0) {
                    System.out.println("Player circle is the winner!");
                } else {
                    System.out.println("Player cross is the winner!");
                }
                k = 22;
            }
        }
        if (k == 8) {
            System.out.println("There is no winner of this game.");
        }

        scanner.close();

    }
}
