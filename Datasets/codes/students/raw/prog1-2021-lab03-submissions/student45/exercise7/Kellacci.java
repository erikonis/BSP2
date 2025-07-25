package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter integer number: ");

        int n = scanner.nextInt();

        int x = 1;
        int y = 1;

        if (n == 1) {System.out.println("For n = " + 1 + " ; Kellacci value = " + 1);}
        
        if (n == 2) {
            System.out.println("For n = " + 1 + " ; Kellacci value = " + 1);
            System.out.println("For n = " + 2 + " ; Kellacci value = " + 1);}

        if (n > 2) {
            System.out.println("For n = " + 1 + " ; Kellacci value = " + 1);
            System.out.println("For n = " + 2 + " ; Kellacci value = " + 1);
            int k = 3;
            while (k <= n) {
                int kel = (y - 1) + (x * 2);
                x = y;
                y = kel;
                System.out.println("For n = " + k + " ; Kellacci value = " + kel);
                k++;
            }
        }

        scanner.close();
    }
}
