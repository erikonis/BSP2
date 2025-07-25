import java.util.Scanner;

public class TicTacToe3X3 {

    public static void main(Stringargs) {
        charboard = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        char currentPlayer = 'O';
        boolean gameWon = false;
        int rounds = 0;

        Scanner scanner = new Scanner(System.in);

        while (rounds < 9 && !gameWon) {
            System.out.println("Current board:");
            printBoard(board);

            System.out.print("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                rounds++;

                gameWon = checkWin(board, currentPlayer);

                currentPlayer = (currentPlayer == 'O') ? 'X' : 'O';
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        System.out.println("Final board:");
        printBoard(board);

        if (gameWon) {
            System.out.println("Player " + (currentPlayer == 'O' ? 'X' : 'O') + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    static void printBoard(charboard) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static boolean checkWin(charboard, char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }
}