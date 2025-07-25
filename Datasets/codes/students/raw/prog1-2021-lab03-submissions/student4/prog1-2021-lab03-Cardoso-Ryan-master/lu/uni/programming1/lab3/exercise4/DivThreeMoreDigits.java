package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, sum;
        System.out.print("Enter a number: ");
        n = scan.nextInt();
        sum = 0;

        scan.close();

        for (sum = 0; n != 0;) {
            sum = sum +(n%10);
            n /= 10;
            if (n == 0 && sum > 9) {
                n = sum;
                System.out.println("Sum of the digits: " + sum);
                sum = 0;
            }
        }

        System.out.println("Sum of the digits: " + sum);    
        

        if (sum % 3 == 0) {
            System.out.println("The number can be divided by 3");
        }
        else System.out.println("The number cannot be divided by 3");

    }
}
