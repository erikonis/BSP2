import java.util.Scanner;

public class SortThreeNumbersNoNesting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int smallest, middle, largest;

        // Find the smallest
        smallest = a;
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }

        // Find the largest
        largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        // Find the middle (the one that's neither the smallest nor the largest)
        middle = a;
        if ((middle == smallest) || (middle == largest)) {
            middle = b;
            if ((middle == smallest) || (middle == largest)) {
                middle = c;
            }
        }

        System.out.println("Ascending order: " + smallest + ", " + middle + ", " + largest);
        scanner.close();
    }
}