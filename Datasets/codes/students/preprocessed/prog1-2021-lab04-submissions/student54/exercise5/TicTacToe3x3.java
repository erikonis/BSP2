import java.util.Scanner;

public class TicTacToe3x3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

        boardPrintout(gameBoard);

        for (int i = 1; i <= 9; i++) {// specify amount of rounds
            System.out.println("Please input p1 for player 1 or p2 for player 2");
            String player = input.next();
            System.out.println("Please enter the row number. You may choose between 0,2,4.");
            int x = input.nextInt();
            System.out.println("Please enter the column number. You may choose between 0,2,4.");
            int y = input.nextInt();


            if (x != 0 && x != 2 && x != 4 && y != 0 && y != 2 && y != 4) {
                System.out.println("Value not recognisable. Please start over.");

            } else {
                piecePosition(gameBoard, player, x, y); // position of piece on game board
                boardPrintout(gameBoard); // print gameboard

                if (winningConditions(gameBoard) == 'X') {
                    System.out.println("Congrats " + player + " has won!"); // terminate if player 1 has won
                    break;
                } else if (winningConditions(gameBoard) == 'O') {
                    System.out.println("Congrats " + player + " has won!"); // terminate if player 2 has won
                    break;

                }
                
            }

        }
        input.close();
    }

    public static void boardPrintout(char[][] gameBoard) {// iterate through rows inside the gameboard then for each place inside row to create the gameboard
        for (char[] row : gameBoard) {
            for (char character : row) {
                System.out.print(character); 
            }
            System.out.println();
        }
    }

    public static void piecePosition(char[][] gameBoard, String player, int x, int y) {// position of game pieces
        char symbol = ' ';

        if (player.equals("p1")) {
            symbol = 'O';
        } else if (player.equals("p2")) { 
            symbol = 'X';
        }
        gameBoard[x][y] = symbol;
    }

    public static char winningConditions(char[][] gameBoard) {

        for (int i = 0; i <= 4; i += 2) { // winning conditions for row
            if (gameBoard[i][0] == gameBoard[i][2] && gameBoard[i][2] == gameBoard[i][4] && gameBoard[i][0] != ' ') {
                return gameBoard[i][0];
            }
        }
        for (int j = 0; j <= 4; j += 2) {// winning conditions for column
            if (gameBoard[0][j] == gameBoard[2][j] && gameBoard[2][j] == gameBoard[4][j] && gameBoard[0][j] != ' ') {
                return gameBoard[0][j];
            }
        }
        if (gameBoard[0][0] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[4][4] && gameBoard[0][0] != ' ') { // winning coditions for top left to bottom right                                                                                                                 
            return gameBoard[0][0];
        }
        if (gameBoard[0][4] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[4][0] && gameBoard[0][4] != ' ') { // winning conditions for top right to bottom left
                                                                           
            return gameBoard[0][4];
        }
        return ' '; // nobody has won yet return blank space
    }
}