package lu.uni.programming1.lab4.exercise5;


import java.util.*;


public class TicTacToe3x3 {
static String[] gameBoard;
    static String turn;
    
    
    // CheckWinner method will 
    // decide the combination 
    // of three box given below.
    static String verifyWin()
    {
        for (int a = 0; a < 8; a++) {
            String line = null;
  
            switch (a) {
            case 0:
                line = gameBoard[0] + gameBoard[1] + gameBoard[2];
                break;
            case 1:
                line = gameBoard[3] + gameBoard[4] + gameBoard[5];
                break;
            case 2:
                line = gameBoard[6] + gameBoard[7] + gameBoard[8];
                break;
            case 3:
                line = gameBoard[0] + gameBoard[3] + gameBoard[6];
                break;
            case 4:
                line = gameBoard[1] + gameBoard[4] + gameBoard[7];
                break;
            case 5:
                line = gameBoard[2] + gameBoard[5] + gameBoard[8];
                break;
            case 6:
                line = gameBoard[0] + gameBoard[4] + gameBoard[8];
                break;
            case 7:
                line = gameBoard[2] + gameBoard[4] + gameBoard[6];
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
            if (Arrays.asList(gameBoard).contains(
                    String.valueOf(a + 1))) {
                break;
            }
            else if (a == 8) {
                return "draw";
            }
        }
  
       // To enter the X Or O at the exact place on gameBoard.
        System.out.println(
            turn + "'s turn; enter a slot number to place "
            + turn + " in:");
        return null;
    }
      
    // To print out the gameBoard.
    /* |---|---|---|
       | 1 | 2 | 3 |
       |-----------|
       | 4 | 5 | 6 |
       |-----------|
       | 7 | 8 | 9 |
       |---|---|---|*/
    
    static void displayBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + gameBoard[0] + " | "
                           + gameBoard[1] + " | " + gameBoard[2]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + gameBoard[3] + " | "
                           + gameBoard[4] + " | " + gameBoard[5]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + gameBoard[6] + " | "
                           + gameBoard[7] + " | " + gameBoard[8]
                           + " |");
        System.out.println("|---|---|---|");
    }
  
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        gameBoard = new String[9];
        turn = "X";
        String winner = null;
  
        for (int a = 0; a < 9; a++) {
            gameBoard[a] = String.valueOf(a + 1);
        }
  
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        displayBoard();
  
        System.out.println(
            "X will play first. Enter a slot number to place X in:");
  
        while (winner == null) {
            int numInput;
            
           // Exception handling.
           // numInput will take input from user like from 1 to 9.
           // If it is not in range from 1 to 9.
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
              
            // This game has two player x and O.
            // Here is the logic to decide the turn.
            if (gameBoard[numInput - 1].equals(
                    String.valueOf(numInput))) {
                gameBoard[numInput - 1] = turn;
  
                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }
  
                displayBoard();
                winner = verifyWin();
            }
            else {
                System.out.println(
                    "Slot already taken; re-enter slot number:");
            }
        }
        
        // If no one win or lose from both player x and O.
        // then here is the logic to print "draw".
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                "It's a draw! Thanks for playing.");
        }
        
        // For winner -to display Congratulations! message.
        else {
            System.out.println(
                "Congratulations! " + winner
                + "'s have won! Thanks for playing.");
        }
    }
    
}
