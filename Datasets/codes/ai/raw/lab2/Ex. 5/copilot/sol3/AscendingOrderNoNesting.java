import java.util.Scanner;
import java.util.Arrays;

public class AscendingOrderNoNesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int c = scanner.nextInt();

        int[] numbers = {a, b, c};
        Arrays.sort(numbers);

        System.out.println("Ascending order: " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
    }
}
