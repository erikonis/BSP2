
import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        // Create a 3x3 array that represents our tic tac toe board
        char[][] board = new char[3][3];
        // Initialize empty positions
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        // Create a Scanner
        Scanner scanner = new Scanner(System.in);

        char currentPlayer = 'o';
        int round;
        for (round = 1; round <= 9; round++) {
            System.out.println(round);
            showBoard(board);
            System.out.println("Current player is : " + currentPlayer);
            Boolean inputIsOk;
            int currentRow, currentColumn;
            do {
                inputIsOk = true;
                System.out.println("Give me a row :");
                currentRow = scanner.nextInt();
                if ((currentRow < 0) || (currentRow > 2)) {
                    inputIsOk = false;
                }
                System.out.println("Give me a column :");
                currentColumn = scanner.nextInt();
                if ((currentColumn < 0) || (currentColumn > 2)) {
                    inputIsOk = false;
                }
                if (inputIsOk) {
                    if (board[currentRow][currentColumn] != '-') {
                        inputIsOk = false;
                    }
                }
                if (!inputIsOk) {
                    System.out.println("Error...!!!\nselect different column!!");
                }
            } while (!inputIsOk);
            board[currentRow][currentColumn] = currentPlayer;
            char boardVerification = verifyBoard(board);
            if (boardVerification != '-') {
                showBoard(board);
                System.out.println("Game over... Player " + boardVerification + " has won!");
                round = 11;
            }
            if (currentPlayer == 'o') {
                currentPlayer = 'x';
            } else {
                currentPlayer = 'o';
            }
        }
        scanner.close();
        if (round == 10) {
            System.out.println("This game is draw!!");
        }
    }

    public static void showBoard(char[][] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(args[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static char verifyBoard(char[][] args) {
        /*
         * This function will return one of 3 possibilities : -->>Possibility 1: Player
         * o has won: this function will return the character o. -->>Possibility 2:
         * Player x has won!! this function will return the character x. -->>
         * Possibility 3: No player has won yet!! this function will return character -.
         */
        for (int i = 0; i < 3; i++) {
            int num_ORow = 0, num_XRow = 0;
            int num_OColumn = 0, num_XColumn = 0;
            for (int j = 0; j < 3; j++) {
                if (args[i][j] == 'o') {
                    num_ORow++;
                }
                if (args[j][i] == 'o') {
                    num_OColumn++;
                }
                if (args[j][i] == 'x') {
                    num_XColumn++;
                }
                if (args[i][j] == 'x') {
                    num_XRow++;
                }
            }
            if ((num_ORow == 3) || (num_OColumn == 3)) {
                return 'o';
            }
            if ((num_XRow == 3) || (num_XColumn == 3)) {
                return 'x';
            }
        }
        // checking diagonals
        int firstDiagonalO = 0, firstDiagonalX = 0;
        int secondDiagonalO = 0, secondDiagonalX = 0;
        for (int i = 0; i < 3; i++) {
            if (args[i][2 - i] == 'o') {
                secondDiagonalO++;
            }
            if (args[i][2 - i] == 'x') {
                secondDiagonalX++;
            }
            if (args[i][i] == 'o') {
                firstDiagonalO++;
            }
            if (args[i][i] == 'x') {
                firstDiagonalX++;
            }
        }
        if ((firstDiagonalO == 3) || (secondDiagonalO == 3)) {
            return 'o';
        }
        if ((firstDiagonalX == 3) || (secondDiagonalX == 3)) {
            return 'x';
        }
        return '-';
    }
}