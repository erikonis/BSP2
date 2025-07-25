import java.util.Scanner;

public class Kellacci {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input 
        int num1 = 1, num2 = 1;
        System.out.println("n:");
        int n = sc.nextInt();

        	// Kellacci -> works till n=32 overflow on 33 and upwards
            int i =1 ;
            while(i <= n){
                System.out.println(num1+" ");
                int previous = (num2 - 1) + (num1 * 2);
                num1 = num2;
                num2 = previous;
                i++;
            }

        sc.close();
    }
}
