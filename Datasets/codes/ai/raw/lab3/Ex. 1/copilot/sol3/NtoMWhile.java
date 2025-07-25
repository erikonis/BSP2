package exercise1;

import java.util.Scanner;

public class NtoMWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        int i = n;
        while (i <= m) {
            System.out.println(i);
            i++;
        }
    }
}