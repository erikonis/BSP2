package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide a number n: ");

         int n = scanner.nextInt();
         
         int k1 = (n - 1) - 1;

         int k2 = (n - 2) * 2;

        if (n <= 2) {
            System.out.print("Please try again with numbers higher than 1 or 2.");
        
        }
        
         for (int number = 2; number < n; ++number) {
            System.out.print(k1 + "+");
            
            int sum = k1 + k2;
            
            k1 = k2;
             
            k2 = sum;
        }
    
    scanner.close();
    }
}
