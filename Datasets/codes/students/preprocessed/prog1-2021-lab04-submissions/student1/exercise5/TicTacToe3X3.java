import java.util.Scanner;


public class TicTacToe3X3 {
  public static void main(String[] args) {
      String [] board = {"_","_","_","_","_","_","_","_","_"};
      int turn = 0;
      boolean gameEnded = false;

      do{
    showBoard(board);
    String counter = turn %2==0? "X" : "O";
    player(counter, board);

    gameEnded = whoWins(board);
    if(gameEnded = whoWins(board)) {
        System.out.println("Player " +counter + " has won!");
        gameEnded = true;
        showBoard(board);
    }
    turn++;
    
      }
      while(!gameEnded);
  }
   static void showBoard(String [] board) {
      System.out.println( board[0]+ " | " + board [1]+ " | "+board[2]);
      System.out.println( board[3]+ " | " + board [4]+ " | "+board[5]);
      System.out.println( board[6]+ " | " + board [7]+ " | "+board[8]);
      
  }
  static void player (String counter, String[] board){
      Scanner scanner = new Scanner(System.in);
      System.out.println("What is your move player " +counter+ " (chose a box between 0-8)?: ");
      int position = scanner.nextInt();
      board[position] = counter;
      scanner.close(); 
  } 
  public static boolean whoWins(String board[]){
      //rows
      if(board[0].equals(board[1]) && board[0].equals(board[2]) && !board[0].equals("_")){
          return true;
      }else if(board[3].equals(board[4]) && board[3].equals(board[5]) && !board[3].equals("_")){
         return true;
      }else if(board[6].equals(board[7]) && board[6].equals(board[8]) && !board[6].equals("_")){
        return true;
        //columns
     }else if(board[0].equals(board[3]) && board[0].equals(board[6]) && !board[0].equals("_")){
        return true;
     }else if(board[1].equals(board[4]) && board[1].equals(board[7]) && !board[1].equals("_")){
        return true;
     }else if(board[2].equals(board[5]) && board[2].equals(board[8]) && !board[2].equals("_")){
        return true;
        //diagonals
     }else if(board[0].equals(board[4]) && board[0].equals(board[8]) && !board[0].equals("_")){
        return true;
     }else if(board[2].equals(board[4]) && board[2].equals(board[6]) && !board[2].equals("_")){
        return true;
     }
      return false;
    
      
    
  }

}