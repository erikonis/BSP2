import java.util.*;

public class TicTacToe3X3 {
	public static void main(String[] args) {
		
		// 3x3 array for tic tac toe board
		char[][] board = new char[5][5];
		
		//Initialize the board empty positions as -
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
		switch(j){
		case 0:
 		board[i][j] = '-' ;
		break;
		case 2: 
 		board[i][j] = '-' ;
		break;
		case 4: 
 		board[i][j] = '-' ;
		break;
		case 1: 
 		board[i][j] = '+' ;
		break;
		case 3: 
 		board[i][j] = '+' ;
		break;
		case 5: 
 		board[i][j] = '+' ;
		break;
			}
		  }
		}
// Set two players
		Scanner in = new Scanner(System.in);
		String p1 = "Player1";
		String p2 = "Player2";

		//Create a  boolean to check the turn of player 1 or player 2 
		boolean player1 = true;

		//Create a gameEnded boolean and use it as the condition in the while loop
		boolean gameEnded = false;
		while(!gameEnded) {

			//Draw the board
			drawBoard(board);

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

			//Create row and col variables 
			int row = 0;
			int col = 0;

			//Break the while loop once the user enters a valid position
			while(true) {
				
				//Get the postion where the user wants to draw x or o
				System.out.print("Enter a row number (0, 1, or 2): ");
				row = in.nextInt();
				System.out.print("Enter a column number (0, 2, or 4): ");
				col = in.nextInt();

				//Check if the row 0,1,2 or col 0,2,4 are entered , COL 1 and 3 for line separator +
				if(!(row == 0 || row == 1 || row == 2 ||col == 0 || col == 2 || col == 4))
 				{
					System.out.println("This position is off the bounds of the board! Try again.");
				
				//Check if the position entered is empty (has a -) or not?
				} else if(board[row][col] != '-') {
					System.out.println("Someone has already made a move at this position! Try again.");
				
				//Otherwise, the position is valid so break out of the while loop
				} else {
					break;
				}
			
			}

			//Set the position on the board at row, col to c
			board[row][col] = c;

			//Check to see if either player has won
			if(playerHasWon(board) == 'x') {
				System.out.println(p1 + " has won!");
				gameEnded = true;
			} else if(playerHasWon(board) == 'o') {
				System.out.println(p2 + " has won!");
				gameEnded = true;
			} else {

				//If neither player has won, check to see if there has been a tie (if the board is full)
				if(boardIsFull(board)) {
					System.out.println("It's a tie!");
					gameEnded = true;
				} else {
					//If player1 is true, make it false, and vice versa; this way, the players alternate each turn
					player1 = !player1;
				}

			}

		}
		
		//Draw the board at the end of the game
		drawBoard(board);

  }

	//Function :- draw the tic tac toe board
	public static void drawBoard(char[][] board) {
		System.out.println("Board:");
		for(int i = 0; i < 5; i++) {
			//The inner for loop prints out each row of the board
			for(int j = 0; j < 5; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

	//Function :- to see if someone has won and return the winning char
	public static char playerHasWon(char[][] board) {
		
		//Check each row
		for(int i = 0; i < 3; i++) {
			if(board[i][0] == board[i][2] && board[i][2] == board[i][4] && board[i][0] != '-') {
				return board[i][0];
			}
		}

		//Check each column
		for(int j = 0; j < 5; j+=2) {
			if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
				return board[0][j];
			}
		}

		//Check the diagonals
		if(board[0][0] == board[1][2] && board[1][2] == board[2][4] && board[0][0] != '-') {
			return board[0][0];
		}
		if(board[2][0] == board[1][2] && board[1][2] ==  board[0][4] && board[2][0] != '-') {
			return board[2][0];
		}

		//Otherwise nobody has not won yet
		return ' ';

	}

	//Function :- to check if all of the positions on the board have been filled
	public static boolean boardIsFull(char[][] board) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}
}
