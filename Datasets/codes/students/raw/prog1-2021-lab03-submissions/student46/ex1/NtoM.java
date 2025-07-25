package lu.uni.programming1.lab3.ex1;

import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // This method reads the number provided using keyboard
        System.out.print("Enter a number for N: ");
        int n = scanner.nextInt();

        System.out.print("Enter a number for M: ");
        int m = scanner.nextInt();
        int i;
        // Closing Scanner after the use
        scanner.close();
        for (i = n; i <= m; i++) {
            System.out.println(i);
        }
    }
}
