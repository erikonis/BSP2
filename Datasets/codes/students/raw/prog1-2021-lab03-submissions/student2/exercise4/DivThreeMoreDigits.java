package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please input a number: ");
        
         long value = scanner.nextLong();

         long digits = 0;

         long addeddiggits = 0;

        while (value > 0) {
            digits = value % 10;
            addeddiggits = addeddiggits + digits;
            value = value / 10;
        }

        if (addeddiggits % 3 == 0) {
            System.out.println("The number you entered IS DIVISABLE BY 3");
        } else if (addeddiggits % 3 > 0) {
            System.out.println("The number you entered IS NOT DIVISABLE BY 3");
        }


        scanner.close();
    }
}
