package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers from the Kellacci sequence do you want? ");
        int n = scanner.nextInt();
        int Kn, Kn1 = 1, Kn2 = 1;
        if (n == 1) {
            System.out.println(Kn1);
        } else if (n == 2) {
            System.out.println(Kn2);
        } else {
            System.out.println(Kn1 + "\n" + Kn2);
            for (int i = 3; i <= n; i++) {
                Kn = (Kn2 - 1) + (Kn1 * 2);
                System.out.println(Kn);
                Kn1 = Kn2; //Kn2 becomes k-1 and Kn1 becomes k-2
                Kn2 = Kn;

            }
        }

        scanner.close();
    }
}
