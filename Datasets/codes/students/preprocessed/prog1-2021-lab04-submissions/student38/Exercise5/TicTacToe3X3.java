import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe3x3 {
    public static char[][] arr = new char[3][3];
    public static char x = 'X';
    public static char o = 'O';
    public static char blank = ' ';
    public static int choice;
    public static char 
    board1 = blank, board2 = blank, board3 = blank, board4 = blank, board5 = blank, board6 = blank, board7 = blank, board8 = blank, board9 = blank;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LoadArr(arr);
        AskUser();
    }

    private static int AskUser() {
            InitializeGrid();
            System.out.println("Please choose the pos :");
            choice = sc.nextInt();
            choiceG();
        return choice;
    }

    private static void InitializeGrid() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board1 + " | "
                        + board2 + " | " + board3
                        + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board4 + " | "
                        + board5 + " | " + board6
                        + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board7 + " | "
                        + board8 + " | " + board9
                        + " |");
        System.out.println("|---|---|---|");
    }

    private static void LoadArr(char[][]arr){
        board1 = arr[0][0];   
        board2 = arr[0][1];   
        board3 = arr[0][2];
        board4 = arr[1][0];
        board5 = arr[1][1];  
        board6 = arr[1][2];
        board7 = arr[2][0];
        board8 = arr[2][1];
        board9 = arr[2][2];
    }

    private static void choiceG() {
        if(choice == 1){
            if(board1 == x || board1 == o){
                System.out.println("Invalid move !");
                AskUser();
            }
            else{
                board1 = x;
                opponent();
                AskUser();
            }
        }
        if(choice == 2){
            if(board2 == x || board2 == o){
                System.out.println("Invalid move !");
                AskUser();
            }
            else{
                board2 = x;
                opponent();
                AskUser();
            }
        }
        if(choice == 3){
            if(board3 == x || board3 == o){
                System.out.println("Invalid move !");
                AskUser();
            }
            else{
                board3 = x;
                opponent();
                AskUser();
            }
        }   
        if(choice == 4){
            if(board4 == x || board4 == o){
                System.out.println("Invalid move !");
                AskUser();
            }
            else{
                board4 = x;
                opponent();
                AskUser();
            }
        }
        if(choice == 5){
            if(board5 == x || board5 == o){
                System.out.println("Invalid move !");
                AskUser();
            }
            else{
                board5 = x;
                opponent();
                AskUser();
            }
        }
        if(choice == 6){
            if(board6 == x || board6 == o){
                System.out.println("Invalid move !");
                AskUser();
            }
            else{
                board6 = x;
                opponent();
                AskUser();
            }
        }
        if(choice == 7){
            if(board7 == x || board7 == o){
                System.out.println("Invalid move !");
                AskUser();
            }
            else{
                board7 = x;
                opponent();
                AskUser();
            }
        }
        if(choice == 8){
            if(board8 == x || board8 == o){
                System.out.println("Invalid move !");
                AskUser();
            }
            else{
                board8 = x;
                opponent();
                AskUser();
            }
        }
        if(choice == 9){
            if(board9 == x || board9 == o){
                System.out.println("Invalid move !");
                AskUser();
            }
            else{
                board9 = x;
                opponent();
                AskUser();
            }
        }
    }
    private static void opponent(){
        System.out.println("Please enter a pos for the opponent :");
        Scanner scop = new Scanner(System.in);
        int opchoice = scop.nextInt();
        CheckGrid();
        if(opchoice == 1){
            if(board1 == x || board1 == o){
                opponent();
            }
            else{
                board1 = o;
            }
        }
        if(opchoice == 2){
            if(board2 == x || board2 == o){
                opponent();
            }
            else{
                board2 = o;
            }
        }
        if(opchoice == 3){
            if(board3 == x || board3 == o){
                opponent();
            }
            else{
                board3 = o;
            }
        }   
        if(opchoice == 4){
            if(board4 == x || board4 == o){
                opponent();
            }
            else{
                board4 = o;
            }
        }
        if(opchoice == 5){
            if(board5 == x || board5 == o){
                opponent();
            }
            else{
                board5 = o;
            }
        }
        if(opchoice == 6){
            if(board6 == x || board6 == o){
                opponent();
            }
            else{
                board6 = o;
            }
        }
        if(opchoice == 7){
            if(board7 == x || board7 == o){
                opponent();
            }
            else{
                board7 = o;
            }
        }
        if(opchoice == 8){
            if(board8 == x || board8 == o){
                opponent();
            }
            else{
                board8 = o;
            }
        }
        if(opchoice == 9){
            if(board9 == x || board9 == o){
               opponent();
            }
            else{
                board9 = o;
            }
        }
    }
    private static void CheckGrid(){
        if ((board1 == x && board2 == x && board3 == x) || (board4 == x && board5 == x && board6 == x) || (board7 == x && board8 == x && board9 == x)|| (board1 == x && board4 == x && board7 == x)|| (board2 == x && board5 == x && board8 == x)|| (board3 == x && board6 == x && board9 == x)|| (board1 == x && board5 == x && board9 == x)|| (board3 == x && board5 == x && board7 == x)){
            System.out.println("You won");
            System.exit(1);
        }
        else if ((board1 == o && board2 == o && board3 == o) || (board4 == o && board5 == o && board6 == o) || (board7 == o && board8 == o && board9 == o)|| (board1 == o && board4 == o && board7 == o)|| (board2 == o && board5 == o && board8 == o)|| (board3 == o && board6 == o && board9 == o)|| (board1 == o && board5 == o && board9 == o)|| (board3 == o && board5 == o && board7 == o)){
            System.out.println("You lost");
            System.exit(1);
        }
    }
}

