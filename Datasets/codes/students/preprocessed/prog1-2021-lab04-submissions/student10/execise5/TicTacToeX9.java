import java.util.Scanner;

public class TicTacToeX9 {


    public static void outputArray(int[] array){

        for(int i=0; i<9;i++){

            if((i+1)%3==1)
                System.out.println("\n\n");

            if(array[i]%10==0){
                System.out.print("|\t"+(i+1)+"\t|");
            }
            else if(array[i]%10==1){
                System.out.print("|\tO\t|");
            }
            else if(array[i]%10==2){
                System.out.print("|\tX\t|");
            }
            if(i==8)
                System.out.println("\n\n");
        }
    }
    public static boolean verify(int nbr,int[] array) {
        if(nbr<1||nbr>9)
            return false;
        
        else if(array[(nbr-1)]%10 != 0) // verify to check if case is already taken 
            return false;
        
        else
            return true;
    }

    public static void main(String[] args) {

        int[] field = {10 ,20 ,30 ,40 ,50 ,60 ,70 ,80 ,90};//example 10: 1 number of cell 0 state of cell
        //states possibles 0 = empty 1=circle 2=cross; cells possible 1-9
        
        Scanner scanner = new Scanner(System.in);

        boolean isP1=true;
        int chosenfield;
        outputArray(field);
        
        for(int i=0;i<9;i++){
            
        do {
            System.out.println("Please choose one new number");
            chosenfield=scanner.nextInt();
        }
        while(verify(chosenfield, field)==false);//checks if valid
        
        if(isP1)
            field[chosenfield-1] += 1; //add a circle
        else
            field[chosenfield-1] += 2; //add a cross

        isP1= !isP1;

        outputArray(field);
    }
        
        scanner.close();
    }
    
    
}
