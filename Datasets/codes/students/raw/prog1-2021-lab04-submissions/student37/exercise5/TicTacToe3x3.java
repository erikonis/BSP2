package lu.uni.programming1.lab4.exercise5;
import java.util.Scanner;


public class TicTacToe3x3 {

    private static void seeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                 System.out.print( board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static void play (char player, char[][] board ){
        int row_, col_;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player " + player + " make your movement, which ROW (0, 1 or 2)?");
        row_= scanner.nextInt();
        System.out.println("Player " + player + " make your movement, which COLUMN (0, 1 or 2)?");
        col_= scanner.nextInt();
        board[row_][col_] = player;
        
    }

    private static int check_winner(char [][] board){

        if  ((board[0][0] == board [0][1] && board[0][0] == board [0][2]) ||
            (board[0][0] == board [1][1] && board[0][0] == board [2][2]) ||
            (board[0][0] == board [1][0] && board[0][0] == board [2][0]) ||
            (board[2][0] == board [2][1] && board[2][0] == board [2][2]) ||
            (board[2][0] == board [1][1] && board[2][0] == board [0][2]) ||
            (board[0][2] == board [1][2] && board[0][2] == board [2][2]) ||
            (board[0][1] == board [1][1] && board[0][1] == board [2][1]) ||
            (board[1][0] == board [1][1] && board[1][0] == board [1][2])){
            
                return 1;
            
        }
        return 0;
    }

                  

    
    public static void main(String[] args) {
        
        
        //initializaiton 2 dimensional array for tic tac toe board
        int size_tik = 3;
        char[][] board = new char[size_tik][size_tik];
        char value = '0';
        for (int row = 0; row < size_tik; row++){
            for (int col = 0; col < size_tik; col++){
                board[row][col] = value; 
                value ++; 
            }
        }

        // Start the game
        for (int turn = 0; turn < 9; turn++){
            play('o', board);
            seeBoard(board);
            int result = check_winner(board);
            if (result == 1){
                System.out.println("Player O is the WINNER!!");
                break;
            }
            if(result == 0){
                System.out.println("No one wins yet"); 
            }
            play('x', board);
            result = check_winner(board);
            seeBoard(board);
            if (result == 1){
                System.out.println("Player X is the WINNER!!");
                break;
            } 
            if(result == 0){
                System.out.println("No one wins yet"); 
            }
              
        }
        

    }
    
}



