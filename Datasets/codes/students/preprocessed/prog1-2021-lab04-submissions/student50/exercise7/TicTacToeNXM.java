import java.util.Scanner;

//UNFINISHED
public class TicTacToeNXM {
  
    static Scanner scanner = new Scanner(System.in);
    // Fills array with ' '
    public static void emptyBoard(char[][]board, int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <n; j++){
                board[i][j] = ' ';
            }
        }
    }
    // Displays board
    public static void display(char[][] board, int n){
        System.out.print(" -");
        for(int i=0; i<n; i++){
            for(int x=0; x<n; x++){
                System.out.print("----");
            }
            System.out.println();
            for(int j=0; j<n; j++){
                System.out.print(" | " + board[i][j]);
            }
            System.out.print(" | \n -");
        }  
        for(int x=0; x<n; x++){
            System.out.print("----");
        }          
        System.out.println();           
    }

    // Switches player and adds 1 round to the game
    public static char nextRound(char player){
        if(player == 'X')
            player = 'O';
        else
            player = 'X';
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
    public static boolean hasFreeSpace(short x, short y,char[][] board){
        if(board[x][y] == 'X' || board[x][y] == 'O')
            return false;
        else 
            return true;
    }

    // Checks for winner
    public static boolean isWinner(char[][] board, int n){
        boolean check = false;
        // Check col
        for(int i=0; i<n; i++){
            if(board[i][0] == 'X' || board[i][0] == 'O'){
                if(board[i][0] == board[i][1] && board[i][0] == board[i][2])
                check = true;
            }
        }
        // Check row
        for(int i=0; i<n; i++){
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
        char player = 'O';
        short rounds = 0;
        // Creates arr with size n
        System.out.println("How big should the board be? (n*n) \nn:");
        int n = scanner.nextInt();
        char[][] board = new char[n][n];
        emptyBoard(board,n);
        display(board,n);

        // While there is no winner or rounds < 9
        while(!isWinner(board,n) ^ rounds == 9){
            player = nextRound(player);
            System.out.println("Player " + player + ":");
            System.out.println("Please enter x coordinate (0-2):");
            x = input();
            System.out.println("Please enter y coordinate (0-2):");
            y = input();
            // Checks for valid input
            while(!hasFreeSpace(x,y,board)){
                System.out.println("This spot is occupied, try another one.");
                System.out.println("Please enter x coordinate (0-2):");
                x = input(); 
                System.out.println("Please enter y coordinate (0-2):");
                y = input();
            }
            // Ads player sign to board position
            board[x][y] = player;
            // Displays board
            display(board,n);
            rounds++;
        }
        if(isWinner(board,n)){
            System.out.println("Congrats player " + player + " you won!");
        }
        else{
            System.out.println("Board is full, nobody won!");
        }

        scanner.close();
    }
}
