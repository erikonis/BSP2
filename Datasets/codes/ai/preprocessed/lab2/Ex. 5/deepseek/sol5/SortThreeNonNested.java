import java.util.Scanner;

public class SortThreeNonNested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integers separated by spaces: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.print("Sorted numbers (non-nested): ");

        // Find the smallest
        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        // Find the largest
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        // Find the middle by elimination
        int middle = (a + b + c) - smallest - largest;

        System.out.println(smallest + " " + middle + " " + largest);

        scanner.close();
    }
}