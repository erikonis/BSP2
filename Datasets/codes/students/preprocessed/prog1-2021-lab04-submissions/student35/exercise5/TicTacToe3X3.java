
import java.util.Scanner;

public class TicTacToe3X3 {   
    public static void main(String[] args) {
        //scanner
        
        Scanner scanner = new Scanner(System.in);

        //array
        char arr[][] = new char [3][3];
        for(int i = 0;i<3;i++)
        {
            for(int j = 0; j<3;j++){
              arr[i][j] = '-';  
            }
        }
        //condtion after 9 round
        boolean condtion = false;
        System.out.println("The Playser O starts: ");

        for(int i = 0; i<9;i++)
        {  
            System.out.println("The game board:");
            System.out.println("\t" + "1" + "\t" + "2" + "\t" + "3");
            System.out.println();
            System.out.println("1" + "\t" +arr[0][0] + "\t" + arr[0][1] +"\t" + arr[0][2]);
            System.out.println();
            System.out.println("2" + "\t" + arr[1][0] +"\t" + arr[1][1] +"\t" + arr[1][2]);
            System.out.println();
            System.out.println("3" + "\t" +arr[2][0] +"\t" + arr[2][1] +"\t" + arr[2][2]);

            System.out.println("Please enter the X and than the Y coordinates of your turn");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            

            switch(i){
                case 0,2,4,6,8 -> {
                    char c = 'O';
                    if(x == 1)
                    {
                        if(y == 1)
                        {
                            arr[0][0] = c;
                        }
                        if(y == 2)
                        {
                            arr[0][1] = c;  
                        }
                        if(y == 3)
                        {
                            arr[0][2] = c;
                        }

                    }
                    if(x == 2)
                    {
                        if(y == 1)
                        {
                            arr[1][0] = c;

                        }
                        if(y == 2)
                        {
                            arr[1][1] = c;
                            
                        }
                        if(y == 3)
                        {
                            arr[1][2] = c;
                        }

                    }
                    if(x == 3)
                    {
                        if(y == 1)
                        {
                            arr[2][0] = c;

                        }
                        if(y == 2)
                        {
                            arr[2][1] = c;
                            
                        }
                        if(y == 3)
                        {
                            arr[2][2] = c;
                        }
                    }
                }
                case 1,3,5,7 ->{
                    char c = 'X';
                    if(x == 1)
                    {
                        if(y == 1)
                        {
                            arr[0][0] = c;

                        }
                        if(y == 2)
                        {
                            arr[0][1] = c;
                            
                        }
                        if(y == 3)
                        {
                            arr[0][2] = c;
                        }

                    }
                    if(x == 2)
                    {
                        if(y == 1)
                        {
                            arr[1][0] = c;

                        }
                        if(y == 2)
                        {
                            arr[1][1] = c;;
                            
                        }
                        if(y == 3)
                        {
                            arr[1][2] = c;
                        }

                    }
                    if(x == 3)
                    {
                        if(y == 1)
                        {
                            arr[2][0] = c;

                        }
                        if(y == 2)
                        {
                            arr[2][1] = c;
                            
                        }
                        if(y == 3)
                        {
                            arr[2][2] = c;
                        }

                    }
                }
                default -> System.out.println("Invalid input");
            };
            

            //checker
            //row
            for(int j = 0; j<3 ;j++)
            {
                if(arr[j][0]!='-' && arr[j][0]==arr[j][1] && arr[j][1]==arr[j][2])
                {
                    System.out.println("The player " + arr[j][0] + " wins!");
                    //stops the game
                    i = 9;
                    condtion = true;
                }
           
            }
            //colume
            for(int j = 0; j<3 ;j++)
            {
                if(arr[0][j]!='-' && arr[0][j]==arr[1][j] && arr[1][j]==arr[2][j])
                {
                    System.out.println("The player " + arr[0][j] + " wins!");
                    //stops the game
                    i = 9;
                    condtion = true;
                }
            }
            //diagonal
            if(arr[0][0]!='-' && arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2])
            {
                System.out.println("The player " + arr[0][0] + " wins!");
                //stops the game
                i = 9;
                condtion = true;
            }
            if(arr[0][2]!='-' && arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0])
            {
                System.out.println("The player " + arr[0][2] + " wins!");
                //stops the game
                i = 9;
                condtion = true;
            }
            if(condtion == false && i == 8)
            {
                System.out.println("No one wins. The game is a tie ");
            }
        }
        //close
        scanner.close();
    }
    
}
