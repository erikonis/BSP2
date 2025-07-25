package lu.uni.programming1.lab4.exercise5;

import java.util.Scanner;

public class TicTacToe3X3 {

    private static String[][] field = new String[3][3];
    
    private static final String EMPTY = "";
    private static final String CROSS = "X";
    private static final String CIRCLE = "O";

    private static String player;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<=2; j++)
            {
                field[j][i] = EMPTY;
            }
        }

        player=CIRCLE;

        drawBoard();

        while(!winnerCheck())
        {
            System.out.println();

            if(player.equals(CIRCLE))
            {
                System.out.println("Turn circle!");

                System.out.print("Enter x coordinates: ");
                int x= scanner.nextInt();

                System.out.print("Enter y coordinates: ");
                int y= scanner.nextInt();

                while(x<0 || x>2 || y<0 || y>2)
                {
                    System.out.println("Invalid coordinates! Try again!");
                    
                    System.out.print("Enter x coordinates: ");
                    x= scanner.nextInt();

                    System.out.print("Enter y coordinates: ");
                    y= scanner.nextInt();
                }

                field[x][y]= player;
            }
            else
            {
                System.out.println("Turn cross!");

                System.out.print("Enter x coordinates: ");
                int x= scanner.nextInt();

                System.out.print("Enter y coordinates: ");
                int y= scanner.nextInt();

                while(x<0 || x>2 || y<0 || y>2)
                {
                    System.out.println("Invalid coordinates! Try again!");
                    
                    System.out.print("Enter x coordinates: ");
                    x= scanner.nextInt();

                    System.out.print("Enter y coordinates: ");
                    y= scanner.nextInt();
                }

                field[x][y]= player;
            }

            System.out.println();

            drawBoard();

            System.out.println();

            if(winnerCheck())
            {
                break;
            }

            playerSwap();
        }

        scanner.close();
    }

    public static void playerSwap()
    {
        switch(player)
        {
            case CROSS:
                player=CIRCLE;
            break;
            case CIRCLE:
                player=CROSS;
            break;
        }
    }

    public static void drawBoard()
    {
        System.out.println("\t" + field[0][0] + "\t | \t" + field[1][0] + "\t | \t" + field[2][0]);
        System.out.println("-----------------+---------------+-----------------");
        System.out.println("\t" + field[0][1] + "\t | \t" + field[1][1] + "\t | \t" + field[2][1]);
        System.out.println("-----------------+---------------+-----------------");
        System.out.println("\t" + field[0][2] + "\t | \t" + field[1][2] + "\t | \t" + field[2][2]);
    }

    public static boolean winnerCheck()
    {
        //horizontal check

        if(field[0][0].equals(player) && field[1][0].equals(player) && field[2][0].equals(player))
        {
            System.out.println("The winner is " + player + "!");
            return true;
        }
        else if(field[0][1].equals(player) && field[1][1].equals(player) && field[2][1].equals(player))
        {
            System.out.println("The winner is " + player + "!");
            return true;
        }
        else if(field[0][2].equals(player) && field[1][2].equals(player) && field[2][2].equals(player))
        {
            System.out.println("The winner is " + player + "!");
            return true;
        }

        //vertical check

        else if(field[0][0].equals(player) && field[0][1].equals(player) && field[0][2].equals(player))
        {
            System.out.println("The winner is " + player + "!");
            return true;
        }
        else if(field[1][0].equals(player) && field[1][1].equals(player) && field[1][2].equals(player))
        {
            System.out.println("The winner is " + player + "!");
            return true;
        }
        else if(field[2][0].equals(player) && field[2][1].equals(player) && field[2][2].equals(player))
        {
            System.out.println("The winner is " + player + "!");
            return true;
        }

        //diagonal check

        else if(field[2][0].equals(player) && field[1][1].equals(player) && field[0][2].equals(player))
        {
            System.out.println("The winner is " + player + "!");
            return true;
        }
        else if(field[0][0].equals(player) && field[1][1].equals(player) && field[2][2].equals(player))
        {
            System.out.println("The winner is " + player + "!");
            return true;
        }

        else
        {
            return false;
        }
    }
}
