package lu.uni.programming1.lab4.exercise1.exercise5;
import java.util.Scanner;

public class TicTacToe3x3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] field = new char[3][3];
        int x = 0;
        int y = 0;

        int counter = 0;

        for (int i = 0; i < 9; i++) {
            do{
                System.out.println("Please enter the x,y coordinates (0, 1, 2) to place your mark!");
                x = Math.max(0, Math.min(2, scanner.nextInt()));
                y = Math.max(0, Math.min(2, scanner.nextInt()));
            
            }while(field[x][y] == 'x' || field[x][y] == 'o');

            if (counter%2 == 0) {
                field[x][y] = 'o';
            } else {
                field[x][y] = 'x';
            }
            drawField(field);
            if(checkWinner(field) == 'o'){
                System.out.println("The Player1 has won!");
                i = 10;
            }else if(checkWinner(field) == 'x'){
                System.out.println("The Player2 has won!");
                i = 10;
            }
            ++counter;

            if(counter == 9 && i<10){
                System.out.println("It's a TIE!");
            }
        }

        scanner.close();             
}

    public static void drawField(char[][] field){
        System.out.println((field[0][0]) + "|" + (field[0][1]) + "|" + (field[0][2]));
        System.out.println("---");
        System.out.println((field[1][0]) + "|" + (field[1][1]) + "|" + (field[1][2]));
        System.out.println("---");
        System.out.println((field[2][0]) + "|" + (field[2][1]) + "|" + (field[2][2]));
    }

    public static char checkWinner(char[][] field){
        for(int i=0; i<3; i++){
            if(field[i][0] == field[i][1] && field[i][1] == field[i][2]){
                return field[i][0];
            }
        }

        for(int j=0; j<3; j++){
            if(field[0][j] == field[1][j] && field[1][j] == field[2][j]){
                return field[0][j];
            }
        }

        if(field[2][0] == field[1][1] && field[1][1] == field[0][2]){
            return field[2][0];
        }
        if(field[0][0] == field[1][1] && field[1][1] == field[2][2]){
            return field[0][0];
        }

        return 'l';
    }

}
