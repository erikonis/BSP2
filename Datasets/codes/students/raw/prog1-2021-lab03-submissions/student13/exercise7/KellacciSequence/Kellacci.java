package lu.uni.programming1.lab3.exercise7.KellacciSequence;

import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        int number1;
        int number2;
        int kn1 = 0;
        int kn2 = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a value for the number:");
        number1 = number2 = scanner.nextInt();
        scanner.close();

        if (number1 == 1 || number2 == 2)
        {
            sum = 1;
        } 
        else 
        {
            while (number1 > 2)
            {
                number1--;
                kn1++;
            }
            while (number2 > 2) 
            {
                number2 -= 2;
                kn2++;
            }   
            sum = (kn1 - 1) + (kn2 * 2);
        }
        System.out.println(sum);
    }
}
