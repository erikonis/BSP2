package lu.uni.programming1.lab4.exercise5;
import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome! We will now play a game of Tic Tac Toe! Player1 (circle) starts:");
        boolean gameEnd = false;
        char[][] tBoard = new char [3][3];
        boolean playerC = true;
        int t = 0; //turn

        for (int i = 0; i < 3; i++){
            for (int j = 0; j<3; j++){
                tBoard[i][j] = '-';
            }
        }

while (!gameEnd){
          
        printtBoard(tBoard);
        int y = 0; //vertical
        int x = 0; //horizontal
        t++;
        char c = '-';

			if(playerC) {
				c = 'O';
			} else {
				c = 'X';
			}

        while (true){
                
                System.out.println("Turn: " + t);
                String p = (playerC)? "Player 1" : "Player 2";
                System.out.println(p + ", please where you want to place your sign");
                
                System.out.println("Please choose a coordinate(x) to enter your sign (1,2,3): ");
                x = sc.nextInt();
                x = x - 1;
                System.out.println("Please choose a coordinate(y)) to enter your sign (1,2,3): ");
                y = sc.nextInt();
                y = y -1;
                

                if(x < 0 || y < 0 || x > 2 || y > 2) {
					System.out.println("Invalid Postition. Please try again:  ");
				
				} else if(tBoard[y][x] != '-') {
					System.out.println("This position is already filled, please try again: ");
				
				} else {
                    

					break;
            }          
                   
        }
        tBoard[y][x] = c;
        if(playerWon(tBoard) == "O") {
            System.out.println("Player 1 has won!");
            gameEnd = true;
        } else if(playerWon(tBoard) == "X") {
            System.out.println("Player 2 has won!");
            gameEnd = true;
        } else {
            

             if (t == 9 && playerWon(tBoard)== null) {
                System.out.println("It's a draw!");
                gameEnd = true;
            }
            else {playerC = !playerC;
            }
        } 
    } 


    printtBoard(tBoard);
   sc.close();

}
public static void printtBoard(char[][] tBoard){
    System.out.println();
    for (char[] row : tBoard){
        for (char c : row){
            System.out.print(c + "\t");
        }
        System.out.println();
        }
        System.out.println();
    }


public static String playerWon(char[][] board) {

        for (int a = 0; a < 8; a++) {
            String line = null;
  
            switch (a) {
            case 0:
                line = String.valueOf(board[0][0]) + String.valueOf(board[0][1]) + String.valueOf(board[0][2]);
               
                break;
            case 1: line = String.valueOf(board[1][0]) + String.valueOf(board[1][1]) + String.valueOf(board[1][2]);
                break;
            case 2: line = String.valueOf(board[2][0]) + String.valueOf(board[2][1]) + String.valueOf(board[2][2]);
                break;
            case 3: line = String.valueOf(board[0][0]) + String.valueOf(board[1][0]) + String.valueOf(board[2][0]);
                break;
            case 4: line = String.valueOf(board[1][0]) + String.valueOf(board[1][1]) + String.valueOf(board[1][2]);
                break;
            case 5: line = String.valueOf(board[2][0]) + String.valueOf(board[2][1]) + String.valueOf(board[2][2]);
                break;
            case 6: line = String.valueOf(board[0][0]) + String.valueOf(board[1][1]) + String.valueOf(board[2][2]);
                break;
            case 7: line = String.valueOf(board[0][2]) + String.valueOf(board[1][1]) + String.valueOf(board[2][0]);
                break;
            }
            if (line.equals("XXX")) {
                return "X";
            }
              
            else if (line.equals("OOO")) {
                return "O";
            }
        }
        return null;

    }

}


