package lu.uni.programming1.lab4.ex5;
import java.util.*;
public class tictactoe {
	static String[] field;
	static String turn;
	
	static String seeWinner()
	{
		for (int a = 0; a < 8; a++) {
			String line = null;

			switch (a) {
			case 0:
				line = field[0] + field[1] + field[2];
				break;
			case 1:
				line = field[3] + field[4] + field[5];
				break;
			case 2:
				line = field[6] + field[7] + field[8];
				break;
			case 3:
				line = field[0] + field[3] + field[6];
				break;
			case 4:
				line = field[1] + field[4] + field[7];
				break;
			case 5:
				line = field[2] + field[5] + field[8];
				break;
			case 6:
				line = field[0] + field[4] + field[8];
				break;
			case 7:
				line = field[2] + field[4] + field[6];
				break;
			}
			//For X winner
			if (line.equals("XXX")) {
				return "X";
			}
			
			// For O winner
			else if (line.equals("OOO")) {
				return "O";
			}
		}
		
		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(field).contains(
					String.valueOf(a + 1))) {
				break;
			}
			else if (a == 8) {
				return "draw";
			}
		}

	// To enter the X Or O at the exact place on board.
		System.out.println(
			turn + "'s turn; enter a slot number to place "
			+ turn + " in:");
		return null;
	}
	
	// To print out the board.
	
	static void printBoard()
	{
		System.out.println("|---|---|---|");
		System.out.println("| " + field[0] + " | "
						+ field[1] + " | " + field[2]
						+ " |");
		System.out.println("|-----------|");
		System.out.println("| " + field[3] + " | "
						+ field[4] + " | " + field[5]
						+ " |");
		System.out.println("|-----------|");
		System.out.println("| " + field[6] + " | "
						+ field[7] + " | " + field[8]
						+ " |");
		System.out.println("|---|---|---|");
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		field = new String[9];
		turn = "X";
		String winner = null;

		for (int a = 0; a < 9; a++) {
			field[a] = String.valueOf(a + 1);
		}

		System.out.println("Welcome to 3x3 Tic Tac Toe.");
		printBoard();

		System.out.println(
			"X will play first. Enter a slot number to place X in:");

		while (winner == null) {
			int numInput;
			
		// numInput will take input from user like from 1 to 9.If it is not in range from 1 to 9.
		// then it will show you an error "Invalid input."
			try {
				numInput = in.nextInt();
				if (!(numInput > 0 && numInput <= 9)) {
					System.out.println(
						"Invalid input; re-enter slot number:");
					continue;
				}
			}
			catch (InputMismatchException e) {
				System.out.println(
					"Invalid input; re-enter slot number:");
				continue;
			}
			// This game has two player x and O. Here is the logic to decide the turn.
			if (field[numInput - 1].equals(
					String.valueOf(numInput))) {
				field[numInput - 1] = turn;

				if (turn.equals("X")) {
					turn = "O";
				}
				else {
					turn = "X";
				}

				printBoard();
				winner = seeWinner();
			}
			else {
				System.out.println(
					"Slot already taken; re-enter slot number:");
			}
		}
        in.close();
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println(
				"It's a draw! Thanks for playing.");
		}
		
        else {
			System.out.println(
				"Congratulations! " + winner
				+ "'s have won! Thanks for playing.");
		}
	}

}
