package lu.uni.programming1.lab4.exercise5;

import java.util.Scanner;

public class TicTacToe3X3 {
    // Field States
    private static char EMPTY = '-';
    private static char CROSS = 'x';
    private static char CIRCLE = 'o';

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        int count = 0;
        int row, col;
        boolean winner = false;

        // Start board as empty
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }

        // Game is started
        while (!winner && (count != 9)) {

            // Check which player is making a move
            if (count % 2 == 0) {
                // Player 1 makes a move
                System.out.print("Player 1 (Circle) -> Enter a row (0,1,2): ");
                row = scanner.nextInt();
                System.out.print("Player 1 (Circle) -> Enter a col (0,1,2): ");
                col = scanner.nextInt();

                // Check if values are inside of interval [0;2]
                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    while (row < 0 || row > 2 || col < 0 || col > 2) {
                        System.out.println("Incorrect values! Enter new values");
                        System.out.print("Player 1 (Circle) -> Enter a row (0,1,2): ");
                        row = scanner.nextInt();
                        System.out.print("Player 1 (Circle) -> Enter a col (0,1,2): ");
                        col = scanner.nextInt();
                    }
                }

                // Check if position is already taken
                if (board[row][col] != EMPTY) {
                    while (board[row][col] != EMPTY) {
                        System.out.println("Position used! Enter new values");
                        System.out.print("Player 1 (Circle) -> Enter a row (0,1,2): ");
                        row = scanner.nextInt();
                        System.out.print("Player 1 (Circle) -> Enter a col (0,1,2): ");
                        col = scanner.nextInt();
                    }
                }
                board[row][col] = CIRCLE;

            } else {

                // Player 2 makes a move
                System.out.print("Player 2 (Cross) -> Enter a row (0,1,2): ");
                row = scanner.nextInt();
                System.out.print("Player 2 (Cross) -> Enter a col (0,1,2): ");
                col = scanner.nextInt();

                // Check if values are inside of interval [0;2]
                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    while (row < 0 || row > 2 || col < 0 || col > 2) {
                        System.out.println("Incorrect values! Enter new values");
                        System.out.print("Player 1 (Circle) -> Enter a row (0,1,2): ");
                        row = scanner.nextInt();
                        System.out.print("Player 1 (Circle) -> Enter a col (0,1,2): ");
                        col = scanner.nextInt();
                    }
                }

                // Check if position is already taken
                if (board[row][col] != EMPTY) {
                    while (board[row][col] != EMPTY) {
                        System.out.println("Position used! Enter new values");
                        System.out.print("Player 2 (Cross) -> Enter a row (0,1,2): ");
                        row = scanner.nextInt();
                        System.out.print("Player 2 (Cross) -> Enter a col (0,1,2): ");
                        col = scanner.nextInt();
                    }
                }
                board[row][col] = CROSS;
            }

            // Print board into terminal
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }

            // Switch player
            count++;

            // Check for winner
            if (count >= 5) {
                // Row win
                for (int i = 0; i < 3; i++) {
                    if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                        if (board[i][0] == CIRCLE) {
                            System.out.println("Player 1 wins");
                        } else {
                            System.out.println("Player 2 wins");
                        }
                        winner = true;
                    }
                }
                // Column win
                for (int i = 0; i < 3; i++) {
                    if (board[0][i] == board[1][i] && board[2][i] == board[1][i]) {
                        if (board[0][i] == CIRCLE) {
                            System.out.println("Player 1 wins");
                        } else {
                            System.out.println("Player 2 wins");
                        }
                        winner = true;
                    }
                }
                // Diagonal win top-lefy -> bottom-right
                if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
                    if (board[0][0] == CIRCLE) {
                        System.out.println("Player 1 wins");
                    } else {
                        System.out.println("Player 2 wins");
                    }
                    winner = true;
                }
                // Diagonal win top-right -> bottom-left
                if (board[2][0] == board[1][1] && board[0][2] == board[1][1]) {
                    if (board[2][0] == CIRCLE) {
                        System.out.println("Player 1 wins");
                    } else {
                        System.out.println("Player 2 wins");
                    }
                    winner = true;
                }
            }

            
        }

        // Game ends in draw
        if (count == 9 && !winner) {
            System.out.println("No winner - Game over");
        }

        scanner.close();
    }
}
