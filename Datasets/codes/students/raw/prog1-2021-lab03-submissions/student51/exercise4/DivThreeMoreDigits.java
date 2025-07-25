package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input of n
        System.out.println("Please enter the number:");
        long n = sc.nextLong();
        long temp = Math.abs(n);

        // Calculates the sum of digits
        long sum = 0;
        while(Math.abs(temp) > 10){
            long digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        // Checks if sum of digits is divisible by 3 and outputs result
        String result = ((int)sum % 3 == 0) ? "Number " + n + " is divisible by 3!" : "Number " + n + " is not divisible by 3!";
        System.out.println(result);
        sc.close();
    }
}
