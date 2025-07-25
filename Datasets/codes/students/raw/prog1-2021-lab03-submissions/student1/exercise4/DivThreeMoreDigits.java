package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long num, sum = 0, digit;

        System.out.println("Type a long number: ");
        num = scanner.nextLong();

        while (num > 0) {
            digit = (num % 10);
            sum = sum + digit;
            num = num / 10;

            if (num == 0 && sum > 9){
                System.out.println("\nSum of a long number's digits: " + sum);
                num = sum;
                sum = 0;
            }
            
        }
        
        System.out.println("Sum of the remainder number's digits: " + sum);

        if (sum%3==0){
            System.out.println("\nThe number "+sum+" is divisible by 3");
        }else{
            System.out.println("\nThe number "+sum+" is not divisible by 3");
        }

        scanner.close();
    }

}
