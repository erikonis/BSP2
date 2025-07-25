import java.util.Scanner;

// DivThreeMoreDigitsAgain.java
public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long integer: ");
        long num = Math.abs(scanner.nextLong()); // Read and handle negative

        long sum = 0;
        for (long temp = num; temp > 0; sum += temp % 10, temp /= 10);

        System.out.println(num + (num == 0 || sum % 3 == 0 ? " is divisible by 3 (sum: " + sum + ")" : " is not divisible by 3 (sum: " + sum + ")") + ".");
        scanner.close();
    }
}