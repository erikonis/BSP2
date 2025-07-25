import java.util.Scanner;

public class TicTacToe3x3 {

	public static void boardprint(byte[][] symbol){

		//print colored numbers
		System.out.print("\u001B[32m    1   2   3\u001B[37m");

		//print each row and line with numbers
		for (byte j = 0; j < 3; j++){
			
			System.out.print("\n  -------------\n\u001B[32m" + (j+1) + "\u001B[37m |");
			for (byte i = 0; i < 3; i++){
				System.out.print(" " + ((symbol[j][i]==1)? "x": (symbol[j][i]==2)? "o": " ") + " |");
			}
		}
		//print final line
		System.out.print("\n  -------------\n");
	}

	public static boolean checkwin(byte[][] symbol){
		//check horisontal & vertical
		for (byte i = 0; i < 3; i++) {
			if (symbol[i][0] == symbol[i][1] && symbol[i][1] == symbol[i][2] && symbol[i][0] != 0) {
				return true;
			} else if (symbol[0][i] == symbol[1][i] && symbol[1][i] == symbol[2][i] && symbol[0][i] != 0) {
				return true;
			}
		}
		//diagonals
		if (symbol[0][0] == symbol[1][1] && symbol[1][1] == symbol[2][2] && symbol[0][0] != 0){
			return true;
		} else if (symbol[0][2] == symbol[1][1] && symbol[1][1] == symbol[2][0] && symbol[0][2] != 0){
			return true;
		}
		return false;
	}

	public static boolean checkfree(byte[][] symbol){
		//are there ampty spaces left on the board
		for (byte i=0; i<3; i++){
			for (byte j=0; j<3; j++){
				if (symbol[j][i]==0){
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		byte[][] symbol = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
		boolean victory = false;
		boolean freespace = true;
		Scanner scanner = new Scanner(System.in);
		byte playerturn = 1;
		while (!victory && freespace){
			boardprint(symbol);
			
			//input for position
			System.out.println("where do you want to play player " + playerturn);
			System.out.println("horizontal");
			byte posx = scanner.nextByte();
			System.out.println("vertical");
			byte posy = scanner.nextByte();

			if (symbol[posx-1][posy-1]!=0){
				System.out.println("illegal move, winning player: " + ((playerturn==1)? "2":"1"));
				System.exit(0);
			}
			symbol[posx-1][posy-1] = playerturn;

			victory=checkwin(symbol);
			if (victory) {
				boardprint(symbol);
				System.out.println("yay, player " + playerturn + " won");
			}
			freespace=checkfree(symbol);
			if (!freespace) {
				boardprint(symbol);
				System.out.println("game end");
			}
			
			//switch playerturn
			if (playerturn==1) {
				playerturn = 2;
			} else {
				playerturn = 1;
			}
			//boardprint(symbol);
		}
		
		scanner.close();
	}
}
