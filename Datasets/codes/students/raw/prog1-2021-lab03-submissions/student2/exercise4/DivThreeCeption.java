package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {
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

        long addeddiggits2 = addeddiggits;
        
        
         do  {
            digits = addeddiggits2 % 10;
            addeddiggits = addeddiggits + digits;
            addeddiggits2 = addeddiggits2 / 10;
         } while (addeddiggits2 >= 10);


        scanner.close();
    }
}
