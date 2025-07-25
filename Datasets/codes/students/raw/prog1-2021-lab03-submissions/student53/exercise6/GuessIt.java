package lu.uni.programming1.lab3.exercise6;

import java.util.Scanner;

public class GuessIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i = 1;
        int rand = (int) Math.floor(Math.random() * 100 + 1);

        System.out.print("Guess the number: ");
        n = scanner.nextInt();
        while (n != rand) {
            if (n > rand) {
                System.out.print("Try a SMALLER number: ");
                n = scanner.nextInt();
            } else {
                System.out.print("Try a BIGGER number: ");
                n = scanner.nextInt();
            }
            i++;
        }
        System.out.println("Nice! You guessed the number in " + i + " tries :)");
        scanner.close();
    }
}
