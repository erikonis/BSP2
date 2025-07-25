import java.util.Scanner;

public class TicTacToe3X3 {

    private static int[][] arTictactoe = new int[3][3]; //type int --> 0 = empty, 1 = circle, 2 = cross
    
    public static void main(String[] args){
        init();
        Scanner scanner = new Scanner(System.in);
        int round = 1;
        boolean win = false;
        while(round <= 9 && win == false){
            if(round%2!=0){
                System.out.println("Player circle, please enter in which row you would like to place your circle :");
                int row = scanner.nextInt();
                System.out.println("Player circle, please enter in which column you would like to place your circle :");
                int col = scanner.nextInt();
                play(true, row, col);
                win = hasWon(1);
                if(win == true){
                    System.out.println("Player circle has won the game !");
                }
            }
            else{
                System.out.println("Player cross, please enter in which row you would like to place your cross :");
                int row = scanner.nextInt();
                System.out.println("Player cross, please enter in which column you would like to place your cross :");
                int col = scanner.nextInt();
                play(false, row, col);
                win = hasWon(2);
                if(win == true){
                    System.out.println("Player cross has won the game !");
                }
            }
            round++;
        }
        if(win == false){
            System.out.println("Nobody won this game !");
        }
        scanner.close();
    }

    public static void init(){
        for (int i = 0; i < arTictactoe.length; i++) {
            for (int j = 0; j < arTictactoe.length; j++) {
                arTictactoe[i][j]=0;
            }
        }
    }

    public static void play(boolean circle, int row, int col){
        if(arTictactoe[row][col]==0){
            arTictactoe[row][col] = circle==true ? 1 : 2;
        }
        else{
            System.out.println("This field is already in use ! Your turn is passed");
        }
        System.out.println(arTictactoe[0][0]+"\t"+arTictactoe[0][1]+"\t"+arTictactoe[0][2]);
        System.out.println(arTictactoe[1][0]+"\t"+arTictactoe[1][1]+"\t"+arTictactoe[1][2]);
        System.out.println(arTictactoe[2][0]+"\t"+arTictactoe[2][1]+"\t"+arTictactoe[2][2]);
    }

    public static boolean hasWon(int player){
        for (int i = 0; i < arTictactoe.length; i++) {
            if(arTictactoe[i][0] == player && arTictactoe[i][1] == player && arTictactoe[i][2] == player){
                return true;
            }
        }
        for (int i = 0; i < arTictactoe.length; i++) {
            if(arTictactoe[0][i] == player && arTictactoe[1][i] == player && arTictactoe[2][i] == player){
                return true;
            }
        }
        if(arTictactoe[0][0]==player && arTictactoe[1][1]==player && arTictactoe[2][2]==player){
            return true;
        }
        if(arTictactoe[2][0]==player && arTictactoe[1][1]==player && arTictactoe[0][2]==player){
            return true;
        }
        return false;
    }
}
