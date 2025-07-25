public package exercise5;

import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        Scanner scanner = new Scanner(System.in);
        boolean isCircleTurn = true;

        for (int round = 0; round < 9; round++) {
            System.out.println("Enter X and Y coordinates (0-2) for " + (isCircleTurn ? "Circle" : "Cross") + ":");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (board[x][y] == '-') {
                board[x][y] = isCircleTurn ? 'O' : 'X';
                isCircleTurn = !isCircleTurn;
            } else {
                System.out.println("Cell already occupied! Try again.");
                round--;
            }

            printBoard(board);
        }
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
} {

}