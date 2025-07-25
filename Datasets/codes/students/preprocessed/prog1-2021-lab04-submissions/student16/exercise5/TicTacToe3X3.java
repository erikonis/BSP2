import java.util.Arrays;

import java.util.Scanner;

public class TicTacToe3X3 {public static void main(String[] args) {
    char[][] board = new char [3][3];

    char circle = 'O';
    char cross = 'X';
    int i = 0;
    int x = 0;
    int y = 0;
    Scanner scanner = new Scanner(System.in);
    
    //1st part of the program that shows 3 different game fields states
    board [0][0] = circle;
    board [2][2] = cross;
    System.out.println(Arrays.deepToString(board)
        .replace("],","\n").replace(",","\t| ")
        .replaceAll("[\\[\\]]", " "));

    board [0][0] = ' ';
    board [2][2] = ' ';

    //2nd part of the program with the game logic that runs for 9 rounds
    while(i < 10){
        System.out.print("It's circle player turn, enter x axis (0->2):");
        x = scanner.nextInt();
        System.out.print("Please enter y axis (0->2):");
        y = scanner.nextInt();
        board [y][x] = circle;
        System.out.println(Arrays.deepToString(board)
        .replace("],","\n").replace(",","\t| ")
        .replaceAll("[\\[\\]]", " "));
        if(check(board)==true){
            System.out.println("The game is over.");
            break;
        }
        ++i;
        if(i==9){
            System.out.println("The game is over.");
            break;
        }
        System.out.print("It's cross player turn, enter x axis (0->2):");
        x = scanner.nextInt();
        System.out.print("Please enter y axis (0->2):");
        y = scanner.nextInt();
        board [y][x] = cross;
        System.out.println(Arrays.deepToString(board)
        .replace("],","\n").replace(",","\t| ")
        .replaceAll("[\\[\\]]", " "));
        if(check(board)==true){
            System.out.println("The game is over.");
            break;
        }
        ++i;
    }
    scanner.close();

    //3rd part of the program that checks each rounds whether a player has won already
}
   private static boolean check(char [][] board){
       //Horizontal Wins
        if(board[0][0] == 'X'&& board[0][1] == 'X' && board [0][2] == 'X' ){
            System.out.println("Player cross wins !");
            return true;
        }
        if(board[0][0] == 'O'&& board[0][1] == 'O' && board [0][2] == 'O' ){
            System.out.println("Player circle wins !");
            return true;
        }
        if(board[1][0] == 'X'&& board[1][1] == 'X' && board [1][2] == 'X' ){
            System.out.println("Player cross wins !");
            return true;
        }
        if(board[1][0] == 'O'&& board[1][1] == 'O' && board [1][2] == 'O' ){
            System.out.println("Player circle wins !");
            return true;
        }
        if(board[2][0] == 'X'&& board[2][1] == 'X' && board [2][2] == 'X' ){
            System.out.println("Player cross wins !");
            return true;
        }
        if(board[2][0] == 'O'&& board[2][1] == 'O' && board [2][2] == 'O' ) {
            System.out.println("Player circle wins !");
            return true;
        }

        //Vertical Wins

        if(board[0][0] == 'X'&& board[1][0] == 'X' && board [2][0] == 'X' ){
            System.out.println("Player cross wins !");
            return true;
        }
        if(board[0][0] == 'O'&& board[1][0] == 'O' && board [2][0] == 'O' ){
            System.out.println("Player circle wins");
            return true;
        }

        if(board[0][1] == 'X'&& board[1][1] == 'X' && board [2][1] == 'X' ){
            System.out.println("Player cross wins !");
            return true;
        }
        if(board[0][1] == 'O'&& board[1][1] == 'O' && board [2][1] == 'O' ){
            System.out.println("Player circle wins !");
            return true;
        }

        if(board[0][2] == 'X'&& board[1][2] == 'X' && board [2][2] == 'X' ){
            System.out.println("Player cross wins !");
            return true;
        }
        if(board[0][2] == 'O'&& board[1][2] == 'O' && board [2][2] == 'O' ){
            System.out.println("Player circle wins !");
            return true;
        }

        //Diagonal Wins
        if(board[0][0] == 'X'&& board[1][1] == 'X' && board [2][2] == 'X' ){
            System.out.println("Player cross wins !");
            return true;
        }
        if(board[0][0] == 'O'&& board[1][1] == 'O' && board [2][2] == 'O' ){
            System.out.println("Player circle wins !");
            return true;
        }

        if(board[2][0] == 'X'&& board[1][1] == 'X' && board [0][2] == 'X' ){
            System.out.println("Player cross wins !");
            return true;
        }
        if(board[2][0] == 'O'&& board[1][1] == 'O' && board [0][2] == 'O' ){
            System.out.println("Player circle wins !");
            return true;
        }


return false;}

    
}
