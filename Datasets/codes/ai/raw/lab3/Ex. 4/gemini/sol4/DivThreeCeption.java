import java.util.Scanner;

// DivThreeCeptionAgain.java
public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long integer: ");
        long num = Math.abs(scanner.nextLong()); // Read and handle negative

        long digitSum = num;
        System.out.print(num + " -> sum of digits");

        while (digitSum >= 10) {
            long nextSum = 0;
            for (long temp = digitSum; temp > 0; nextSum += temp % 10, temp /= 10);
            System.out.print(": " + nextSum);
            digitSum = nextSum;
        }

        System.out.print(" -> " + digitSum + " -> ");
        switch ((int) digitSum) {
            case 0, 3, 6, 9 -> System.out.println("Divisible by 3!");
            default -> System.out.println("Not divisible by 3!");
        }
        scanner.close();
    }
}