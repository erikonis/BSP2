import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        // Sort the numbers
        int[] numbers = {a, b, c};
        NumberSorter.sort(numbers);

        // Display the sorted numbers
        System.out.println("Sorted numbers: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
    }
}