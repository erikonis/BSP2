import java.util.Scanner;

public class TicTacToe3X3 {

public static void main (String[]args){
    int y = 0 ;
    int x = 0 ;
    String gamer1 = "O";
    String gamer2 = "X";
    String [][] grid = new String [3][3];
    boolean winX = false;
    boolean winO = false;

    Scanner scanner = new Scanner(System.in);

    for(int i=0  ; i<9 ; ++i){
            System.out.println((i%2==0 ?"Gamer 1 play O ":"Gamer 2 play X ")+",enter coordinate x (0,1 or 2) :");
            x =scanner.nextInt();
            System.out.println((i%2==0 ?"Gamer 1 play O ":"Gamer 2 play X ")+",enter coordinate y (0,1 or 2) :");
            y =scanner.nextInt(); 
            grid [x][y] = (i%2==0 ? "O" : "X" );
    
        for (int row=0 ; row<grid.length ; ++row){
            for(int column=0 ; column<grid.length ; ++column){
                System.out.print(grid[row][column]+ " \t");
            }
            System.out.println();
        }
            
        for ( int j = 0; j < grid.length; j++) {
            winO = winO || ( (gamer1.equals(grid[0][j])) && (gamer1.equals(grid [1][j])) && (gamer1.equals(grid[2][j]))
                    || (gamer1.equals(grid[j][0])) && (gamer1.equals(grid[j][1])) && (gamer1.equals(grid[j][2]))
                    || (gamer1.equals(grid[0][0])) && (gamer1.equals(grid[1][1])) && (gamer1.equals(grid[2][2]))
                    || (gamer1.equals(grid[2][0])) && (gamer1.equals(grid[1][1])) && (gamer1.equals(grid[0][2])));
        } 
        for (int h = 0; h < grid.length; h++) {
            winX = winX || ( (gamer2.equals(grid[0][h])) && (gamer2.equals(grid [1][h])) && (gamer2.equals(grid[2][h]))
                    || (gamer2.equals(grid[h][0])) && (gamer2.equals(grid[h][1])) && (gamer2.equals(grid[h][2]))
                    || (gamer2.equals(grid[0][0])) && (gamer2.equals(grid[1][1])) && (gamer2.equals(grid[2][2]))
                    || (gamer2.equals(grid[2][0])) && (gamer2.equals(grid[1][1])) && (gamer2.equals(grid[0][2])));  
        }     
        if (winO) break;   
        if (winX) break; 
        
    }
  
    System.out.println(winO ? "Gamer 1 win :) " : "Gamer 1 lost :'( ");
    System.out.println(winX ? "Gamer 2 win :) " : "Gamer 2 lost :'( ");
   

    scanner.close();

    }
}