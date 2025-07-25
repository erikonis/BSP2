import java.util.Scanner;

public class SortThreeNumbersNestedIfAlternative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int smallest, middle, largest;

        if (a <= b) {
            if (b <= c) { // a <= b <= c
                smallest = a;
                middle = b;
                largest = c;
            } else if (a <= c) { // a <= c < b
                smallest = a;
                middle = c;
                largest = b;
            } else { // c < a <= b (impossible if a <= b in outer if) - corrected logic
                smallest = c;
                middle = a;
                largest = b;
            }
        } else { // b < a
            if (a <= c) { // b < a <= c
                smallest = b;
                middle = a;
                largest = c;
            } else if (b <= c) { // b <= c < a
                smallest = b;
                middle = c;
                largest = a;
            } else { // c < b < a
                smallest = c;
                middle = b;
                largest = a;
            }
        }

        System.out.println("Ascending order: " + smallest + ", " + middle + ", " + largest);
        scanner.close();
    }
}