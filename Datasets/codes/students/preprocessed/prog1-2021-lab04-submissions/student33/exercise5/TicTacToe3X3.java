

import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        char[][] b = new char [3][3];
       Scanner scanner = new Scanner(System.in);
       System.out.println("Welcome to TicTacToe3X3 game!");
       System.out.println("in each round a palyer will pick coordinates to place his mark.");
       
 int x ,y;
 int r =1;
 

      while (true){
           
         
        System.out.println(" enter your coordinates(x,y)");
         
        System.out.print("x = ");
             x = scanner.nextInt();

        System.out.print("\ny = ");
              y = scanner.nextInt();

             if(r==1 || r==3 ||r==5 || r==7 || r ==9){

                b [x][y] = 'O';
             }else {
                b[x][y] = 'X';

             }
    
              for(int i = 0 ; i<=2; ++i){
                    for(int j = 0 ; j<=2 ; ++j){
                       System.out.print( "\t" +"|" + b[i][j] );
                    }
                  System.out.println();

              }
            if((b[0][0]=='O'&& b[0][1]=='O' &&b[0][2]=='O' ) || (b[0][2]=='O'&&b[1][2]=='O'&& b[2][2]=='O')
           || (b[2][2]=='O' && b[2][1]=='O' && b[2][0]=='O') || (b[2][0]=='O'&&b[1][0]=='O'&& b[0][0]=='O') 
           || (b[0][1]=='O' && b[1][1]=='O' &&b[2][1]=='O' ) || (b[0][2]=='O'&&b[1][1]=='O'&& b[2][0]=='O')
           || (b[0][0]=='O' && b[1][1]=='O' && b[2][2]=='O') ){
                System.out.println("player O won!");
                break;

           }
            if((b[0][0]=='X'&& b[0][1]=='X' &&b[0][2]=='X' ) || (b[0][2]=='X'&&b[1][2]=='X'&& b[2][2]=='X')
           || (b[2][2]=='X' && b[2][1]=='X' && b[2][0]=='X') || (b[2][0]=='O'&&b[1][0]=='X'&& b[0][0]=='X') 
           || (b[0][1]=='X' && b[1][1]=='X' &&b[2][1]=='X' ) || (b[0][2]=='O'&&b[1][1]=='X'&& b[2][0]=='X')
           || (b[0][0]=='X' && b[1][1]=='X' && b[2][2]=='X') ){
              System.out.println("player X won!");
              break;
           } 
             
     ++r;
     
     if (r >9){
         break;

        }


        

  
   }
   scanner.close();
      } 
        }    

      
     
      
    
    

