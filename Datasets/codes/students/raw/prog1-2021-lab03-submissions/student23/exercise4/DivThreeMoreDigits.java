package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number :");
        long nb = scan.nextLong();

        int sum = 0;

        while (nb > 10){
            sum += nb%10;

            nb = nb/10;
        }

        if (sum%3 == 0){
            System.out.println("Number is divisible by three");
        } else {System.out.println("Number is not divisible by three");}

        scan.close();
    }
    
}
