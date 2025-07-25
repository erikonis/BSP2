import java.util.Scanner; 

public class OneToFive {


    
    /**
     *
     */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter number: ");
            int n = sc.nextInt();
            sc.close();   
        
            if (n>=1 && n<=5){
                System.out.println("Number : " + n );
            }  
            else {
                System.out.println("Invalid number");
                     }
                   
             }   
            } 
    }

