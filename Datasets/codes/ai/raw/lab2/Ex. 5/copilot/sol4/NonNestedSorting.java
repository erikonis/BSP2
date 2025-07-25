import java.util.Scanner;
import java.util.Arrays;

public class NonNestedSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int[] numbers = new int[3];
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();

        // Sorting using Arrays.sort() method
        Arrays.sort(numbers);

        System.out.println("Sorted order: " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
    }
}
