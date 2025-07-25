import java.util.Arrays;
import java.util.Scanner;

public class SortThreeNumbersNoNesting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);

        System.out.println("Ascending order: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        scanner.close();
    }
}