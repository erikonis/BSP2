package lu.uni.programming1.lab4.execise5;

import java.util.Scanner;

public class TicTacToe3X3 {

   public static boolean checkWin(char[][] array) {
       String str="";
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){               

                str += array[i][j];             //every step in one line the char gets added to the string
            } 
        if(str.equals("XXX")||str.equals("OOO")) //checks every 3 step if the string is XXX or OOO
            return true;
        str="";                                 //reintitializing the string every 3 steps
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){               

                str += array[j][i];             //i changed i and j so that now it searches in the horizotal
            } 
        if(str.equals("XXX")||str.equals("OOO")) //checks every 3 step if the string is XXX or OOO
            return true;
        str="";                                 //reintitializing the string every 3 steps
        }

        for(int i=0;i<3;i++)
            str += array[i][i];             //look the first diagonal
            
        if(str.equals("XXX")||str.equals("OOO")) //checks after 3 step if the string is XXX or OOO
            return true;
        str="";                                 //reintitializing the string every 3 steps
        

        for(int i=0;i<3;i++)
            str += array[i][2-i];             //look the second diagonal
            
        if(str.equals("XXX")||str.equals("OOO")) //checks after 3 step if the string is XXX or OOO
            return true;
        str="";                                 //reintitializing the string every 3 steps
        

        return false;
   }

    public static void updateField(char[][] array){

        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){

                if(j==0)                        //decoration
                    System.out.print("\n-------------------------------------------------\n");
                
                if(array[i][j] == 0)            //checks if the char is empty to then input the coordonates in the terminal
                    System.out.print("|    x:"+i+" y:"+j+"\t|");
                else                            //else outputs the char itself
                    System.out.print("|\t"+array[i][j]+"\t|"); 
                
            }
        }
        System.out.print("\n-------------------------------------------------\n");      //decoration
    }
    public static boolean verify(char[][] array,int x,int y) {
        if(x>2||y>2||x<0||x<0)  //checks if values are not in the game field
            return false;
        if(array[x][y]==0)      //if char in the array is empty, you can place a new X/O
            return true;
        else                    //if char already contains X/O, the position is occupied
            return false;
    }

    public static void main(String[] args) {

        

        char[][] field = new char[3][3];    //initializing 2dimensions array, scanner and variables
        
        Scanner scanner = new Scanner(System.in); 

        boolean isP1=true;
        int chosenX,chosenY;

        updateField(field);                 //first look at the fied to know which coordinate to choose from
        
        for(int i=0; i<9; i++){             //maximal nine round game
            
        do {
            if(isP1)
                System.out.println("Player 1:");
            else
                System.out.println("Player 2:");
                                                                        
            System.out.print("Please choose X and Y coordinates : \nX: ");
            chosenX=scanner.nextInt();                                          //takes the input from the terminal
            System.out.print("Y: ");
            chosenY=scanner.nextInt();
        }
        while(verify(field,chosenX,chosenY)==false);                            //checks if valid

        
        if(isP1)
            field[chosenX][chosenY]= 'O' ; //add a circle
        else
            field[chosenX][chosenY]= 'X' ; //add a cross

        updateField(field);                 //outputs the updated field

        if(checkWin(field)){ //announces the winner
            if(isP1)
                System.out.println("Congrats ! Player 1 won");
            else
                System.out.println("Congrats ! Player 2 won");
            break;          //breaks out of the for loop
        }

        if(i==8) //last round and still no winner
            System.out.println("Nobody won");

        isP1= !isP1; //change players every round
        }
        
        scanner.close();
    }
    
    
}
