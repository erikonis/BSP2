import java.util.Scanner;

public class TicTacToe3X3 {

    public static void displayGame(char[][] game) {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(game[row][column]);
            }
            System.out.println();
        }
    }

    public static boolean checkVictory(char[][] game) {

        for (int row = 0; row < 3; row++) {
            if (game[row][0] == game[row][1] && game[row][1] == game[row][2] && game[row][0] != '.') {
                return true;
            }
        }

        for (int column = 0; column < 3; column++) {
            if (game[0][column] == game[1][column] && game[1][column] == game[2][column] && game[0][column] != '.') {
                return true;
            }
        }

        if (game[0][0] == game[1][1] && game[1][1] == game[2][2] && game[0][0] != '.') {
            return true;
        }
        if (game[2][0] == game[1][1] && game[1][1] == game[0][2] && game[2][0] != '.') {
            return true;
        }

        return false;

    }

    public static boolean isFull(char[][] game) {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (game[row][column] == '.') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] game = new char[3][3];

        // initialize
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                game[row][column] = '.';
            }
        }

        boolean playing = true;
        boolean player1 = true;

        // game begin
        while (playing) {

            displayGame(game);

            char playerSign;
            if (player1) {
                playerSign = 'x';
            } else {
                playerSign = 'o';
            }

            int rowValue = 0;
            int columnValue = 0;

            int whileInt = 1;

            while (whileInt == 1) {

                System.out.print("Enter a row (0, 1, 2): ");
                rowValue = scanner.nextInt();

                System.out.print("Enter a column (0, 1, 2): ");
                columnValue = scanner.nextInt();

                // check if value is in the game limit
                if (rowValue < 0 || rowValue > 2 || columnValue < 0 || columnValue > 2) {
                    System.out.println("Please enter a valid value in the game.");
                } else if (game[rowValue][columnValue] != '.') {
                    System.out.println("This position is already played");
                } else {
                    break;
                }

            }

            game[rowValue][columnValue] = playerSign;

            // check if a player has won
            if (checkVictory(game)) {
                if (player1) {
                    System.out.println("Player x has won");
                } else {
                    System.out.println("player o has won");
                }
                playing = false;
            } else {
                if (isFull(game)) {
                    System.out.println("No one won!");
                    playing = false;
                } else {
                    player1 = !player1;
                }
            }

        }

        displayGame(game);

        scanner.close();

    }
}
