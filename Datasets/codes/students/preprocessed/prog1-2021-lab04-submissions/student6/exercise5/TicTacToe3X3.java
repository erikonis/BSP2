import java.util.*;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        String[][] boardGame = new String[3][3];

        // Initialize board Game
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardGame[i][j] = "\t" + "-";
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play a Tic Tac Toe game: ");
        // If player1 is false, player2 plays
        boolean player1 = true;

        // Create a game Ended boolean
        boolean gameEnded = false;
        while (!gameEnded) {

            // Draw the board Game
            drawBoardGame(boardGame);
            int row = 0;
            int col = 0;

            // Who moves
            if (player1) {
                System.out.println("Player O plays:");
            } else {
                System.out.println("Player X plays:");
            }

            // Create a variable that stores 'X' or 'O'
            String c = "\t" + "-";
            if (player1) {
                c = "\t" + "O";
            } else {
                c = "\t" + "X";
            }

            // Only break out while loop once the user enters a valid position
            while (true) {
                // Ask row and col from users
                System.out.print("Type a row number (0, 1, or 2):");
                row = scanner.nextInt();
                System.out.print("Type a column number (0, 1, or 2):");
                col = scanner.nextInt();

                // Check row and col are 0, 1, or 2
                if (row < 0 || col < 0 || row > 2 || col > 2) {
                    System.out.println("This position is not on the board Game! try again.");

                    // Position on the board Game which user entered is empty or not

                } else if (boardGame[row][col] != "\t" + "-") {
                    System.out.println("Somebody's made a move at this position! try again.");

                    // Else, the position is valid so break out of the while loop
                } else {
                    break;
                }
            }
            // Set position on the board Game at row, col to c
            boardGame[row][col] = c;

            // Check to see if either player has won
            if (whichPlayerWon(boardGame) == "\t" + "O") {
                System.out.println("Player O won!");
                gameEnded = true;
            } else if (whichPlayerWon(boardGame) == "\t" + "X") {
                System.out.println("Player X won!");
                gameEnded = true;
            } else {

                // It's a draw!
                if (isBoardGameFull(boardGame)) {
                    System.out.println("It's a Draw!");
                    gameEnded = true;
                } else {
                    // If it's not player1 it's player2
                    player1 = !player1;
                }
            }
        }
        // Draw the board Game when it's finished
        drawBoardGame(boardGame);
        scanner.close();
    }

    // Draw the tic tac toe board Game
    public static void drawBoardGame(String[][] boardGame) {
        System.out.println("Board Game: ");
        for (int i = 0; i < 3; i++) {
            // The inner for loop prints out each row of the board Game
            for (int j = 0; j < 3; j++) {
                System.out.print(boardGame[i][j]);

            }
            // New line, so each row
            System.out.println();
        }
    }

    // Are all position on board filled
    public static boolean isBoardGameFull(String[][] boardGame) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (boardGame[i][j] == "\t" + "-") {
                    return false;
                }
            }
        }
        return true;
    }

    // Someone's won and return the winning board
    public static String whichPlayerWon(String[][] boardGame) {

        // Check each row
        for (int i = 0; i < 3; i++) {
            if (boardGame[i][0] == boardGame[i][1] && boardGame[i][1] == boardGame[i][2]
                    && boardGame[i][0] != "\t" + "-") {
                return boardGame[i][0];
            }
        }
        // Check each column
        for (int j = 0; j < 3; j++) {
            if (boardGame[0][j] == boardGame[1][j] && boardGame[1][j] == boardGame[2][j]
                    && boardGame[0][j] != "\t" + "-") {
                return boardGame[0][j];
            }
        }
        // Check the diagonals
        if (boardGame[0][0] == boardGame[1][1] && boardGame[1][1] == boardGame[2][2] && boardGame[0][0] != "-") {
            return boardGame[0][0];
        }
        if (boardGame[2][0] == boardGame[1][1] && boardGame[1][1] == boardGame[0][2] && boardGame[2][0] != "-") {
            return boardGame[2][0];
        }
        // Nobody's won yet
        return null;
    }

}
