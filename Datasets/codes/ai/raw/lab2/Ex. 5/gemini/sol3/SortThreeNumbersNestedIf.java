import java.util.Scanner;

public class SortThreeNumbersNestedIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int smallest, middle, largest;

        if (num1 <= num2) {
            if (num1 <= num3) { // num1 is the smallest
                smallest = num1;
                if (num2 <= num3) {
                    middle = num2;
                    largest = num3;
                } else {
                    middle = num3;
                    largest = num2;
                }
            } else { // num3 is the smallest
                smallest = num3;
                middle = num1;
                largest = num2;
            }
        } else { // num2 < num1
            if (num2 <= num3) { // num2 is the smallest
                smallest = num2;
                if (num1 <= num3) {
                    middle = num1;
                    largest = num3;
                } else {
                    middle = num3;
                    largest = num1;
                }
            } else { // num3 is the smallest
                smallest = num3;
                middle = num2;
                largest = num1;
            }
        }

        System.out.println("Ascending order: " + smallest + ", " + middle + ", " + largest);
        scanner.close();
    }
}