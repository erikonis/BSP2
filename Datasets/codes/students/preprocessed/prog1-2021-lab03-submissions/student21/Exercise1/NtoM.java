import java.util.Scanner;

public class NtoM {

    public static void main(String[] args) {

        int n, m , number;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter your first value : ");
         n = scanner.nextInt();

         System.out.println("Please enter your second value : ");
         m = scanner.nextInt();
  

        scanner.close();


        for  ( number = n  ; number <= m ; number++ ){;

            System.out.println(number); }

            
        
    }
    
}
