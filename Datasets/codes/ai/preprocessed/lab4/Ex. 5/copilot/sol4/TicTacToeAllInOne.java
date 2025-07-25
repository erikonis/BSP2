import java.util.Scanner;

public class TicTacToeAllInOne {
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
                if (checkWinner(board, x, y)) {
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

    private static boolean checkWinner(char[][] board, int x, int y) {
        char player = board[x][y];
        return (board[x][0] == player && board[x][1] == player && board[x][2] == player) ||
               (board[0][y] == player && board[1][y] == player && board[2][y] == player) ||
               (x == y && board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (x + y == 2 && board[0][2] == player && board[1][1] == player && board[2][0] == player);
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