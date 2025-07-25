package lu.uni.programming1.lab4.exercise5;

import java.util.Scanner;

public class TicTacToe3x3 {

    private static int EMPTY =0;
    private static int CIRCLE =1;
    private static int CROSS =2;

    private static int[][] tic = new int[3][3];

    public TicTacToe3x3()
    {
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                tic[i][j] = EMPTY;
            }
        }
    }

    public static void main(String[] args) {

        int player = CROSS;

        int x;
        int y;
        Scanner scanner = new Scanner(System.in);


        for(int i=0; i <9; i++)
        {
            System.out.println("Please put in your x coordinate: ");
            x = scanner.nextInt();
            
            System.out.println("Please put in your y coordinate: ");
            y = scanner.nextInt();

            if(player == CROSS)
            {
                if(!checkIfUsedAlready(x, y))
                {
                    tic[x][y] = CROSS;

                    if(totalWin(player))
                    {
                        String winner = winnerCheck(CROSS);
                        System.out.println("The Winner is " + winner);
                        printArray();
                        break;
                    }
                    
                    player = CIRCLE;
                }
                else 
                {
                    System.out.println("ATTENTION: This space is already taken try again!");
                }
            }
            else
            {
                if(!checkIfUsedAlready(x, y))
                {
                    tic[x][y] = CIRCLE;

                    if(totalWin(CIRCLE))
                    {
                        String winner = winnerCheck(player);
                        System.out.println("The Winner is " + winner);
                        printArray();
                        break;
                    }

                    player = CROSS;
                }
                else 
                {
                    System.out.println("ATTENTION: This space is already taken try again!");
                }
            }
            printArray();
            
        }
        scanner.close();

        
    }

    public static boolean checkIfUsedAlready(int x, int y)
    {
        if(tic[x][y] == CIRCLE || tic[x][y] == CROSS)
        {
            return true;
        }
        return false;
    }

    public static void printArray()
    {
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(tic[i][j] == CROSS)
                {
                    System.out.print("X | ");
                }
                else if(tic[i][j] == CIRCLE)
                {
                    System.out.print("O | ");
                }
                else
                {
                    System.out.print("- | ");
                }

                if(j==2)
                {
                    System.out.println();
                    System.out.println("_________");
                }
            }
        }
    }

    public static boolean checkWinHorizontal(int sign)
    {
        int winCheck =0;
        for (int i = 0; i < tic.length; i++) 
        {
            for (int j = 0; j < tic.length; j++) 
            {
                if(tic[i][j] == sign)
                {
                    winCheck++;
                }
            }

            if(winCheck == 3)
            {
                return true;
            }
            winCheck =0;
        }
        return false;
    }

    public static boolean checkWinVertically(int sign)
    {
        int wincheck =0;

        for (int i = 0; i < tic.length; i++)
        {
            for (int j = 0; j < tic.length; j++) 
            {
                if(tic[j][i] == sign)
                {
                    wincheck++;
                }
            }
            
            if(wincheck == 3)
            {
                return true;
            }
            wincheck=0;
        }
        return false;
    }

    public static boolean fromLeftToRight(int sign)
    {
        int wincheck =0;

        for (int i = 0; i < tic.length; i++) 
        {
                if(tic[i][i] == sign)
                {
                    wincheck++;
                }
        }

        if(wincheck == 3)
        {
            return true;
        }
        return false;
    }

    public static boolean fromRightToLeft(int sign)
    {
        int winCheck =0;

        for (int j = tic.length-1; j >= 0; j--) 
        {
            int i= Math.abs(j-2);

            if(tic[i][j] == sign)
            {
                winCheck++;
            }
        }

        if(winCheck == 3)
        {
            return true;
        }
        return false;
    }

    public static boolean totalWin(int sign)
    {
        if(checkWinHorizontal(sign) || checkWinVertically(sign) || fromLeftToRight(sign) || fromRightToLeft(sign))
        {
            return true;
        }
        return false;
    }

    public static String winnerCheck(int sign)
    {
        String winner ="";

        if(sign == 1)
        {
            winner = "circle";
        }
        else if(sign == 2)
        {
            winner = "cross";
        }
        return winner;
    }
}