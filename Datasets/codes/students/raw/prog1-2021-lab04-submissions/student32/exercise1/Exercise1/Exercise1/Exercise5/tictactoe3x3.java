package lu.uni.programming1.lab4.exercise1.Exercise1.Exercise1.Exercise5;

import java.util.Scanner;
public class tictactoe3x3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //allocate a multidimentional array
        char[][] board = new char[3][3];
        //generates an empty board with empty spaces as "|"
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
            board[i][j] = '|';
            }
        }
        //initialise turns
        boolean player1 = true;
    
        boolean End = false;
        while(!End) {
            //prints out the board with the new input
            System.out.println("Board is:");
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    System.out.print(board[i][j]);
                }
            System.out.println();
            }
            //player1
            if(player1) {
                System.out.println("player1's Turn (o):");
            }
            //player2
            else {
                System.out.println("player2's Turn (x):");
            }
            //initialise the symbol for each player
            char c = '|';
            if(player1) {
                c = 'o';
            } 
            else {
                c = 'x';
            }
            int row = 0;
            int col = 0;
    
            //takes input as coordinates
            while(true) {
                System.out.print("Enter a row number (0, 1, or 2): ");
                row = in.nextInt();
                System.out.print("Enter a column number (0, 1, or 2): ");
                col = in.nextInt();
    
                if(row < 0 || col < 0 || row > 2 || col > 2) {
                System.out.println("This position is off the bounds of the board! Try again.");
                } 
                else if(board[row][col] != '|') {
                System.out.println("Someone has already made a move at this position! Try again.");
                } 
                else {
                break;
                }
            }
            //replaces "|" with respective sign
            board[row][col] = c;
            //win output considering a players turn
            if(Win(board) == 'o') {
                System.out.println("player1 has won!");
                End = true;
            } 
            else if(Win(board) == 'x') {
                System.out.println("player2 has won!");
                End = true;
            } 
            //if board is full and no winner
            else {
                if(Full(board)) {
                System.out.println("It's a tie!");
                End = true;
                } 
            //changes turns
            else {
                player1 = !player1;
            }
        }
        //prints board at the end of every turn
        System.out.println("Board is:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
        System.out.println();
        }
    }
} 
    //method the manages win conditions
    public static char Win(char[][] board) {
        //horizontals
        for(int i = 0; i < 3; i++) {
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];
            }
        }
        //verticals
        for(int j = 0; j < 3; j++) {
            if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                return board[0][j];
            }
        }
        //diagonals
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
            }
        if(board[2][0] == board[1][1] && board[1][1] ==  board[0][2] && board[2][0] != '-') {
            return board[2][0];
        }
        return ' ';
    }
    
    //if the is an empty space the board is not full
    //else it returns it as full
    public static boolean Full(char[][] board) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i][j] == '|') {
                return false;
                }
            }
        }
    return true;
    }
}



