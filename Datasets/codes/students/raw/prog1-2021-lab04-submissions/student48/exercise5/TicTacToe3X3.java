package lu.uni.programming1.lab4.exercise5;

import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        String[][] field = {{".",".","."},
                            {".",".","."},
                            {".",".","."}};

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<9;i++)
        {       
            printGame(field);

            int x = 0;
            int y = 0;

            String currentPlayer = i%2==0?"Cross":"Circle";

            do{
                x = 0;
                y = 0;
                while(!(0<x&&x<4))
                {
                    System.out.println("Player "+currentPlayer+" please enter x :");
                    x = scanner.nextInt();
                }
                while(!(0<y&&y<4))
                {
                    System.out.println("Player "+currentPlayer+" please enter y :");
                    y=scanner.nextInt();
                }
            }while(!(field[x-1][y-1].equals(".")));

            field[x-1][y-1] = currentPlayer.equals("Cross")?"X":"O";

            if(!checkWinner(field).equals("no Winner Yet")){System.out.println("The "+(checkWinner(field).equals("X")?"Cross":"Circle")+" player wins"); break;}
        }
        scanner.close();
    }

    public static void printGame(String[][] field)
    {
        System.out.println("\n"+field[0][0]+"\t"+field[1][0]+"\t"+field[2][0]+"\n"+field[0][1]+"\t"+field[1][1]+"\t"+field[2][1]+"\n"+field[0][2]+"\t"+field[1][2]+"\t"+field[2][2]);
    }

    public static String checkWinner(String[][] field)
    {
        //horizontal
                 if(!field[0][0].equals(".")&&(field[0][0].equals(field[1][0])&&field[0][0].equals(field[2][0]))){return field[0][0];}
            else if(!field[0][1].equals(".")&&(field[0][1].equals(field[1][1])&&field[0][1].equals(field[2][1]))){return field[0][1];}
            else if(!field[0][2].equals(".")&&(field[0][2].equals(field[1][2])&&field[0][2].equals(field[2][2]))){return field[0][2];}
        //vertical
            else if(!field[0][0].equals(".")&&(field[0][0].equals(field[0][1])&&field[0][0].equals(field[0][2]))){return field[0][0];}
            else if(!field[1][0].equals(".")&&(field[1][0].equals(field[1][1])&&field[1][0].equals(field[1][2]))){return field[1][0];}
            else if(!field[2][0].equals(".")&&(field[2][0].equals(field[2][1])&&field[2][0].equals(field[2][2]))){return field[2][0];}
        //diagonal
            else if(!field[0][0].equals(".")&&(field[0][0].equals(field[1][1])&&field[0][0].equals(field[2][2]))){return field[0][0];}
            else if(!field[0][2].equals(".")&&(field[0][2].equals(field[1][2])&&field[0][2].equals(field[2][0]))){return field[0][2];}
            else return "no Winner Yet";

    }
}
