import java.util.Scanner;

public class TicTacToeWithLogic {
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
           .nextInt();

            if (board[x][y] == '-') {
                board[x][y] = isCircleTurn ? 'O' : 'X';
                if (checkWinner(board)) {
                    printBoard(board);
                    System.out.println((isCircleTurn ? "Circle" : "Cross") + " wins!");
                    return;
                }
                isCircleTurn = !isCircleTurn;
            } else {
                System.out.println("Cell already occupied! Try again.");
                round--;
            }

            printBoard(board);
        }
        System.out.println("It's a draw!");
    }

    private static boolean checkWinner(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') return true;
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') return true;
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') return true;
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') return true;
        return false;
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}