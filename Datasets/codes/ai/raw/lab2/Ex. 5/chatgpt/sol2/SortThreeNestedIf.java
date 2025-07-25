import java.util.Scanner;

public class SortThreeNestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int smallest, middle, largest;

        if (a <= b) {
            if (a <= c) {
                smallest = a;
                if (b <= c) {
                    middle = b;
                    largest = c;
                } else {
                    middle = c;
                    largest = b;
                }
            } else {
                smallest = c;
                middle = a;
                largest = b;
            }
        } else {
            if (b <= c) {
                smallest = b;
                if (a <= c) {
                    middle = a;
                    largest = c;
                } else {
                    middle = c;
                    largest = a;
                }
            } else {
                smallest = c;
                middle = b;
                largest = a;
            }
        }

        System.out.println("Sorted: " + smallest + " " + middle + " " + largest);
    }
}
