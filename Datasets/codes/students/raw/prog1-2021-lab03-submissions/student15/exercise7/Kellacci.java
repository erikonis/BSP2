package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter an integer: (>2)");

                int n = scanner.nextInt();

        while (n <= 2)
            {
                System.out.println("Input is less than 3.Please retry.");
                n = scanner.nextInt();
            }

        scanner.close();
        
        int kellacci1 = 1;
        int kellacci2 = 1;
        int kellacciN = 0;
        int counter = 0;

        System.out.println("K" + ++counter + " = " + kellacci1);
        System.out.println("K" + ++counter + " = " + kellacci2);

        while (n > 2)
            {
                kellacciN = (kellacci2 - 1) + (kellacci1 * 2);
                System.out.println("K" + ++counter + " = " + kellacciN);
                kellacci1 = kellacci2;
                kellacci2 = kellacciN;
                --n;
            }
    }
    
}
