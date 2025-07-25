package lu.uni.programming1.lab4.exercise5;
import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    boolean playerOturn = true;
    boolean endgame = false;

    char[][] board = new char[3][3];

    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            board[i][j] = '-';  
        }
    }



while(!endgame){
    
drawboard(board);

char symbol = ' ';

int row = 0;
int col = 0;

if(playerOturn){
    symbol = 'o';
}
else{
    symbol = 'x';
}

if(playerOturn){
    System.out.println("Turn o");
}
else{
    System.out.println("Turn x");
}




while(true){
    System.out.print("Enter a row (0, 1, or 2): ");
    row = scanner.nextInt();
    System.out.print("Enter a col (0, 1, or 2): ");
    col = scanner.nextInt();
    
    
    if(row < 0 || col < 0 || row > 2 || col > 2){
        System.out.println("Your row and col are out of bounds");
    }
    else if(board[row][col] != '-') {
     System.out.println("Someone has already made a move there!");
    }
    else{

        break;
    }
    
}

board[row][col] = symbol;

if(Winner(board) == 'o'){
    System.out.println("Player O has won");
    endgame = true;
}
else if(Winner(board) == 'x'){
    System.out.println("Player X has won");
    endgame = true;
}
else{
    if(Tied(board)){
        System.out.println("It is a tie");
        endgame = true;
    }
    else{
        playerOturn = !playerOturn;
    }
}
}

drawboard(board);

scanner.close();

}

public static void drawboard(char[][] board) {
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            System.out.print(board[i][j]);  
        }
        System.out.println(); 
    }
}

public static char Winner(char[][] board) {
    //Check row
    for (int i = 0; i < 3; i++) {
        if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-'){
            return board[i][0];
        }
    }
    //Check col
    for (int j = 0; j < 3; j++) {
        if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-'){
            return board[0][j];
        }
    }
    //Check diagonal
    if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-'){
        return board[0][0];
    }
    if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-'){
        return board[2][0];
    }

    return '-';
}

public static boolean Tied(char[][] board) {
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            if(board[i][j] == '-'){
                return false;
            }
        }
    }
    return true;
}

}