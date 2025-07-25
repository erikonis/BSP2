package lu.uni.programming1.lab4.exercise5;

import java.util.Scanner;

public class SpaghettiTicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String array[][], winnerRow = "", winnerRow2 = "", winnerColumn = "", winnerColumn2 = "", winnerDiagonal = "", winnerDiagonal2 = "";
        String winner2Diagonal = "", winner2Diagonal2 = "", gameover = "\n";
        int inputx, inputy, counter = 0;
        array = new String[3][3];
        
        //print gaming field
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ".";
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nPlayer X starts the game before player O !");

        // now we're gaming -> 2 loops -> choose row + column position
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                do {
                    System.out.print("\nPlease enter which row you want to fill (0-2): ");
                    inputx = Math.max(0, Math.min(2, scanner.nextInt()));
                    System.out.print("Please enter which column you want to fill (0-2): ");
                    inputy = Math.max(0, Math.min(2, scanner.nextInt()));
                } while (array[inputx][inputy].equals(".") == false);

                //finalise player's choice
                array[inputx][inputy] = (counter % 2 == 0) ? "o" : "x";
                ++counter;

                //show the play result
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array.length; l++) {
                        System.out.print(array[k][l] + " ");
                    }
                    System.out.println();
                }

                // check for aligned rows/columns/diagonals and who is winner
                for (int x = 0; x < 3; x++) {
                    winnerRow = array[x][0].equals(array[x][1]) && array[x][0].equals(array[x][2])
                            && array[x][0].equals(".") == false && array[x][0].equals("x") ? "x" : "loser";
                    winnerRow2 = array[x][0].equals(array[x][1]) && array[x][0].equals(array[x][2])
                            && array[x][0].equals(".") == false && array[x][0].equals("o") ? "o" : "loser";
                    winnerColumn = array[0][x].equals(array[1][x]) && array[0][x].equals(array[2][x])
                            && array[0][x].equals(".") == false && array[0][x].equals("x") ? "x" : "loser";
                    winnerColumn2 = array[0][x].equals(array[1][x]) && array[0][x].equals(array[2][x])
                            && array[0][x].equals(".") == false && array[0][x].equals("o") ? "o" : "loser";
                    winnerDiagonal = array[0][0].equals(array[1][1]) && array[0][0].equals(array[2][2])
                            && array[0][0].equals(".") == false && array[0][0].equals("x") ? "x" : "loser";
                    winnerDiagonal2 = array[0][0].equals(array[1][1]) && array[0][0].equals(array[2][2])
                            && array[0][0].equals(".") == false && array[0][0].equals("o") ? "o" : "loser";
                    winner2Diagonal = array[0][2].equals(array[1][1]) && array[0][2].equals(array[2][0])
                            && array[0][2].equals(".") == false && array[0][2].equals("x") ? "x" : "loser";
                    winner2Diagonal2 = array[0][2].equals(array[1][1]) && array[0][2].equals(array[2][0])
                            && array[0][2].equals(".") == false && array[0][2].equals("o") ? "o" : "loser";
                    if (winnerRow.equals("x")) {
                        gameover = winnerRow;
                        x = 3;
                    } else if (winnerRow2.equals("o")) {
                        gameover = winnerRow2;
                        x = 3;
                    } else if (winnerColumn.equals("x")) {
                        gameover = winnerColumn;
                        x = 3;
                    } else if (winnerColumn2.equals("o")) {
                        gameover = winnerColumn2;
                        x = 3;
                    } else if (winnerDiagonal.equals("x")) {
                        gameover = winnerDiagonal;
                        x = 3;
                    } else if (winnerDiagonal2.equals("o")) {
                        gameover = winnerDiagonal2;
                        x = 3;
                    } else if (winner2Diagonal.equals("x")) {
                        gameover = winner2Diagonal;
                        x = 3;
                    } else if (winner2Diagonal2.equals("o")) {
                        gameover = winner2Diagonal2;
                        x = 3;
                    } else {
                        gameover = "loser";
                    }
                }

                // print if winner
                if (gameover.equals("loser") == false) {
                    System.out.printf("\nThe player %s has won the game.\n", gameover);
                    i = 9;
                    j = 9;
                }

                // reset if no winner
                winnerRow = "";
                winnerRow2 = "";
                winnerColumn = "";
                winnerColumn2 = "";
                winnerDiagonal = "";
                winnerDiagonal2 = "";
                winner2Diagonal = "";
                winner2Diagonal2 = "";
                gameover = "";
            }
            System.out.println();
        }

        scanner.close();

    }
}
