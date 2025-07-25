import java.util.Scanner;

// DivisibleByThreeSimple.java (Combines both functionalities for brevity)
public class DivisibleByThreeSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long integer: ");
        long number = Math.abs(scanner.nextLong());

        // --- Part 1: Single Sum and Modulo ---
        long sumOnce = 0;
        for (long temp = number; temp > 0; sumOnce += temp % 10, temp /= 10);
        boolean divisibleOnce = (number == 0) || (sumOnce % 3 == 0);
        System.out.println(number + " (single sum: " + sumOnce + ") is " + (divisibleOnce ? "" : "not ") + "divisible by 3.");

        // --- Part 2: Repeated Sum and Switch ---
        long finalSum = number;
        System.out.print(number + " -> sum");
        while (finalSum >= 10) {
            long nextSum = 0;
            for (long temp = finalSum; temp > 0; nextSum += temp % 10, temp /= 10);
            System.out.print(": " + nextSum);
            finalSum = nextSum;
        }
        System.out.print(" -> " + finalSum + " -> ");
        switch ((int) finalSum) {
            case 0, 3, 6, 9 -> System.out.println("Divisible by 3!");
            default -> System.out.println("Not divisible by 3!");
        }
        scanner.close();
    }
}