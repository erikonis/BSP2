package lu.uni.programming1.lab4.exercise5;

import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        String[][] arrRowColumn = new String[4][4];
        int row;
        int column;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                arrRowColumn[i - 1][j - 1] = "?";
                if (i == 1) {
                    if (j == 1) {
                        System.out.print("Rows/ Columns" + "\t");
                    } else {
                        System.out.print("Column" + (j - 1) + "\t");
                    }
                } else {
                    if (j == 1) {
                        System.out.print("Row" + (i - 1) + "\t\t");
                    } else {
                        System.out.print(arrRowColumn[i - 1][j - 1] + "\t");
                    }
                }
            }
            System.out.println("");
        }

        int k;

        for (k = 1; k <= 9; k++) {
            if (k % 2 != 0) {
                System.out.println("Player circle, it's your turn.");

                System.out.println("Please select a row.");
                row = scanner.nextInt();

                System.out.println("Please select a column.");
                column = scanner.nextInt();

                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= 4; j++) {
                        if (i == 1) {
                            if (j == 1) {
                                System.out.print("Rows/ Columns" + "\t");
                            } else {
                                System.out.print("Column" + (j - 1) + "\t");
                            }
                        } else {
                            if (j == 1) {
                                System.out.print("Row" + (i - 1) + "\t\t");
                            } else {
                                if ((i - 1) == row) {
                                    if ((j - 1) == column) {
                                        arrRowColumn[row][column] = "O";
                                    }
                                }
                                System.out.print(arrRowColumn[i - 1][j - 1] + "\t");
                            }
                        }
                    }
                    System.out.println("");
                }
            } else {
                System.out.println("Player cross, it's your turn.");

                System.out.println("Please select a row.");
                row = scanner.nextInt();

                System.out.println("Please select a column.");
                column = scanner.nextInt();

                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= 4; j++) {
                        if (i == 1) {
                            if (j == 1) {
                                System.out.print("Rows/ Columns" + "\t");
                            } else {
                                System.out.print("Column" + (j - 1) + "\t");
                            }
                        } else {
                            if (j == 1) {
                                System.out.print("Row" + (i - 1) + "\t\t");
                            } else {
                                arrRowColumn[row][column] = "X";
                                if ((i - 1) == row) {
                                    if ((j - 1) == column) {
                                        arrRowColumn[row][column] = "X";
                                    }
                                }
                                System.out.print(arrRowColumn[i - 1][j - 1] + "\t");
                            }
                        }
                    }
                    System.out.println("");
                }
            }
            if (!arrRowColumn[1][1].equals("?") && arrRowColumn[1][1].equals(arrRowColumn[1][2])
                    && arrRowColumn[1][1].equals(arrRowColumn[1][3])
                    || !arrRowColumn[2][1].equals("?") && arrRowColumn[2][1].equals(arrRowColumn[2][2])
                            && arrRowColumn[2][1].equals(arrRowColumn[2][3])
                    || !arrRowColumn[3][1].equals("?") && arrRowColumn[3][1].equals(arrRowColumn[3][2])
                            && arrRowColumn[3][1].equals(arrRowColumn[3][3])
                    || !arrRowColumn[1][1].equals("?") && arrRowColumn[1][1].equals(arrRowColumn[2][1])
                            && arrRowColumn[1][1].equals(arrRowColumn[3][1])
                    || !arrRowColumn[1][2].equals("?") && arrRowColumn[1][2].equals(arrRowColumn[2][2])
                            && arrRowColumn[1][2].equals(arrRowColumn[3][2])
                    || !arrRowColumn[1][3].equals("?") && arrRowColumn[1][3].equals(arrRowColumn[2][3])
                            && arrRowColumn[1][1].equals(arrRowColumn[3][3])
                    || !arrRowColumn[1][1].equals("?") && arrRowColumn[1][1].equals(arrRowColumn[2][2])
                            && arrRowColumn[1][1].equals(arrRowColumn[3][3])
                    || !arrRowColumn[1][3].equals("?") && arrRowColumn[1][3].equals(arrRowColumn[2][2])
                            && arrRowColumn[1][3].equals(arrRowColumn[3][1])) {
                if (k % 2 != 0) {
                    System.out.println("Player circle is the winner!");
                } else {
                    System.out.println("Player cross is the winner!");
                }
                k = 22;
            }
        }

        if (k == 9) {
            System.out.println("There is no winner of this game.");
        }

        scanner.close();
    }
}
