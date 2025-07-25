import java.util.Scanner;

public class TicTacToe3X3 {

    public static void main(String[] args) {

	//Create a 3x3 array that represents our tic tac toe game field
	char[][] gameField = new char[4][4];
		
	//Initialize our game field with dashes (empty positions)
	for(int x = 1; x < 4; x++) {
		for(int y = 1; y < 4; y++) {
			gameField[x][y] = '-';
		}
	}

	//Create a Scanner and initialize the players
	Scanner scanner = new Scanner(System.in);
	String p1 = "Player 1";
	String p2 = "Player 2";

	//Create a player1 boolean that is true if it is player 1's turn and false if it is player 2's turn
	boolean player1 = true;

	//Create a gameEnded boolean and use it as the condition in the while loop
	boolean gameEnded = false;
	while(!gameEnded) {

	//Draw the game field
	drawGameField(gameField);

	//Print whose turn it is
	if(player1) {
		System.out.println(p1 + "'s Turn (x):");
	} else {
		System.out.println(p2 + "'s Turn (o):");
	}

	//Create a char variable that stores either 'x' or 'o' based on what player's turn it is
	char c = '-';
	if(player1) {
		c = 'x';
	} else {
		c = 'o';
	}

	//Create row and col variables which represent indexes that correspond to a placement on our game field
	int row = 1;
	int col = 1;

	//Only break out of the while loop once the user enters a valid placement
	while(true) {
				
	//Ask the user on what placement they want to place their x or o
	System.out.print("Enter a row number (1, 2, or 3): ");
	row = scanner.nextInt();
	System.out.print("Enter a column number (1, 2, or 3): ");
	col = scanner.nextInt();

	//Check if the row and col are 1, 2, or 3
	if(row < 1 || col < 1 || row > 3 || col > 3) {
		System.out.println("This placement is invalid! Try again.");
				
	//Check if the placement on the game field the user entered is empty (has a -) or not
	} else if(gameField[row][col] != '-') {
		System.out.println("This placement has already been taken! Try again.");
				
	//Otherwise, the placement is valid so break out of the while loop
	} else {
		break;
	}
			
    }

	//Set the placement on the game field at row, col to c
	gameField[row][col] = c;

	//Check to see if either player has won
	if(playerHasWon(gameField) == 'x') {
		System.out.println(p1 + " has won!");
		gameEnded = true;
	} else if(playerHasWon(gameField) == 'o') {
		System.out.println(p2 + " has won!");
		gameEnded = true;
	} else {

	//If neither player has won, check to see if there has been a tie (if the game field is full)
	if(gameFieldIsFull(gameField)) {
		System.out.println("It's a tie!");
		gameEnded = true;
	} else {			
    //If player1 is true, make it false, and vice versa; this way, the players alternate each turn
	    player1 = !player1;
	}

	}

	}
	scanner.close();

	//Draw the game field at the end of the game
	drawGameField(gameField);

    }

	//Make a function to draw the tic tac toe game field
	public static void drawGameField(char[][] gameField) {
		System.out.println("Game field:");
		for(int x = 1; x < 4; x++) {
			//The inner for loop prints out each row of the game field
			for(int y = 1; y < 4; y++) {
				System.out.print(gameField[x][y]);
			}
			//This print statement makes a new line so that each row is on a separate line
			System.out.println();
		}
	}

	//Make a function to see if someone has won and return the winning char
	public static char playerHasWon(char[][] gameField) {
		
		//Check each row
		for(int x = 1; x < 4; x++) {
			if(gameField[x][1] == gameField[x][2] && gameField[x][2] == gameField[x][3] && gameField[x][1] != '-') {
				return gameField[x][1];
			}
		}

		//Check each column
		for(int y = 1; y < 4; y++) {
			if(gameField[1][y] == gameField[2][y] && gameField[2][y] == gameField[3][y] && gameField[1][y] != '-') {
				return gameField[1][y];
			}
		}

		//Check the diagonals
		if(gameField[1][1] == gameField[2][2] && gameField[2][2] == gameField[3][3] && gameField[1][1] != '-') {
			return gameField[1][1];
		}
		if(gameField[3][1] == gameField[2][2] && gameField[2][2] ==  gameField[1][3] && gameField[3][1] != '-') {
			return gameField[3][1];
		}

		//Otherwise nobody has not won yet
		return ' ';

	}

	//Make a function to check if all of the placements on the game field have been filled
	public static boolean gameFieldIsFull(char[][] gameField) {
		for(int x = 1; x < 4; x++) {
			for(int y = 1; y < 4; y++) {
				if(gameField[x][y] == '-') {
					return false;
				}
			}
		}
		return true;
    }
}