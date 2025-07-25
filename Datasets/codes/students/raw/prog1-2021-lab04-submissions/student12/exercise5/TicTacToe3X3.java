package lu.uni.programming1.lab4.exercise5;

import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        boolean finished = false;
        boolean playercircle = true;

        int arr[][];
        int round = 1;
        String end = "Nobody has won the game";
        arr = new int[3][3];
        for (int row = 0; row < arr.length; ++row) {
            for (int column = 0; column < arr[row].length; column++) {
                switch (arr[row][column]) {
                case 1:
                    System.out.print("O" + " ");
                    break;
                case 2:
                    System.out.print("X" + " ");
                    break;
                default:
                    System.out.print("-" + " ");
                    break;
                }

            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);

        while (finished != true) {
            if (playercircle) {
                System.out.println("Round Number: " + round + ". You are player Circle!");
            } else {
                System.out.println("Round Number: " + round + ". You are player Square!");
            }
            System.out.println("Enter X coordinate: ");
            int x = scanner.nextInt() - 1;
            System.out.println("Enter Y coordinate: ");
            int y = scanner.nextInt() - 1;
            if (playercircle) {

                if (arr[x][y] == 0) {
                    arr[x][y] = 1;
                    round = round + 1;
                    playercircle = false;
                }

                for (int row = 0; row < arr.length; ++row) {
                    for (int column = 0; column < arr[row].length; column++) {
                        switch (arr[row][column]) {
                        case 1:
                            System.out.print("O" + " ");
                            break;
                        case 2:
                            System.out.print("X" + " ");
                            break;
                        default:
                            System.out.print("-" + " ");
                            break;
                        }

                    }
                    System.out.println();
                }

            } else {
                if (arr[x][y] == 0) {
                    arr[x][y] = 2;
                    round = round + 1;
                    playercircle = true;
                }

                for (int row = 0; row < arr.length; ++row) {
                    for (int column = 0; column < arr[row].length; column++) {
                        switch (arr[row][column]) {
                        case 1:
                            System.out.print("O" + " ");
                            break;
                        case 2:
                            System.out.print("X" + " ");
                            break;
                        default:
                            System.out.print("-" + " ");
                            break;
                        }

                    }
                    System.out.println();
                }
            }
            if (arr[0][0] == 1 && arr[0][1] == 1 & arr[0][2] == 1 || arr[1][0] == 1 && arr[1][1] == 1 && arr[1][2] == 1
                    || arr[2][0] == 1 && arr[2][1] == 1 && arr[2][2] == 1
                    || arr[0][0] == 1 && arr[1][1] == 1 && arr[2][2] == 1
                    || arr[0][2] == 1 && arr[1][1] == 1 && arr[2][0] == 1
                    || arr[0][0] == 1 && arr[1][0] == 1 & arr[2][0] == 1
                    || arr[0][1] == 1 && arr[1][1] == 1 & arr[2][1] == 1
                    || arr[0][2] == 1 && arr[1][2] == 1 & arr[2][2] == 1) {
                end = "The player Circle has won the game";
                finished = true;
            }
            if (arr[0][0] == 2 && arr[0][1] == 2 & arr[0][2] == 2 || arr[1][0] == 2 && arr[1][1] == 2 && arr[1][2] == 2
                    || arr[2][0] == 2 && arr[2][1] == 2 && arr[2][2] == 2
                    || arr[0][0] == 2 && arr[1][1] == 2 && arr[2][2] == 2
                    || arr[0][2] == 2 && arr[1][1] == 2 && arr[2][0] == 2
                    || arr[0][0] == 2 && arr[1][0] == 2 & arr[2][0] == 2
                    || arr[0][1] == 2 && arr[1][1] == 2 & arr[2][1] == 2
                    || arr[0][2] == 2 && arr[1][2] == 2 & arr[2][2] == 2) {
                end = "The player Sqaure has won the game";
                finished = true;
            }
            if (round == 10) {
                finished = true;
            }
        }
        System.out.println(end);

        scanner.close();

    }
}
