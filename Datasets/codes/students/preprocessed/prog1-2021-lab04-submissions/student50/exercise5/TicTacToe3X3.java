import java.util.Scanner;

public class TicTacToe3X3 {

    static Scanner scanner = new Scanner(System.in);
    static int rounds = 0;
    // Two dimensional array for the board
    static char[][] board = new char[3][3];

    // Fills boardarray with ' ' for better looks
    public static void emptyBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3; j++){
                board[i][j] = ' ';
            }
        }
    }

    // Displays board
    public static void display(){
        System.out.println("  0 1 2");
        System.out.println("0 " + board[0][0] + "|" + board[1][0] + "|" + board[2][0]);  
        System.out.println("  -+-+-");
        System.out.println("1 " + board[0][1] + "|" + board[1][1] + "|" + board[2][1]);  
        System.out.println("  -+-+-");
        System.out.println("2 " + board[0][2] + "|" + board[1][2] + "|" + board[2][2]);                        
    }

    // Switches player and adds 1 round to the game
    public static char nextRound(char player){
        if(player == 'X')
            player = 'O';
        else
            player = 'X'; 
        rounds++;
        return player;
       
    }

    // Checks for valid input and stores it in coordinates
    public static short input(){
        short input = scanner.nextShort();
        while(input < 0 || input > 2){
            System.out.println("Please enter a valid coordinate (0-2):");
            input = scanner.nextShort();
        }
        return input;
    }

    // Checks if space is occupied
    public static boolean hasFreeSpace(short x, short y){
        if(board[x][y] == 'X' || board[x][y] == 'O')
            return false;
        else 
            return true;
    }

    // Checks for winner
    public static boolean isWinner(){
        boolean check = false;
        // Check col
        for(int i=0; i<3; i++){
            if(board[i][0] == 'X' || board[i][0] == 'O'){
                if(board[i][0] == board[i][1] && board[i][0] == board[i][2])
                check = true;
            }
        }
        // Check row
        for(int i=0; i<3; i++){
            if(board[0][i] == 'X' || board[0][i] == 'O'){
            if(board[0][i] == board[1][i] && board[0][i] == board[2][i])
                check = true;
            }
        }
        // Check diag
        if(board[0][0] == 'X' || board[0][0] == 'O'){
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2])
            check = true;
        }
        // Check back diag
        if(board[2][0] == 'X' || board[2][0] == 'O'){
        if(board[2][0] == board[1][1] && board[2][0] == board[0][2])
            check = true;
        }
        return check;
    }
    public static void main(String[] args) {
        short x = -1, y = -1;
        char player = 'X';
        emptyBoard();
        display();

        while(!isWinner() ^ rounds == 9){
            player = nextRound(player);
            System.out.println("Player " + player + ":");
            System.out.println("Please enter x coordinate (0-2):");
            x = input();
            System.out.println("Please enter y coordinate (0-2):");
            y = input();
            // Checks for valid input
            while(!hasFreeSpace(x,y)){
                System.out.println("This spot is occupied, try another one.");
                System.out.println("Please enter x coordinate (0-2):");
                x = input(); 
                System.out.println("Please enter y coordinate (0-2):");
                y = input();
            }
            // Ads player sign to board position
            board[x][y] = player;
            // Displays board
            display();
        }
        if(isWinner()){
            System.out.println("Congrats player " + player + " you won!");
        }
        else{
            System.out.println("Board is full, nobody won!");
        }

        scanner.close();
    }
}
