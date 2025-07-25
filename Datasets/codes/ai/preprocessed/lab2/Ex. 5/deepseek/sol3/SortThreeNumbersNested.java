import java.util.Scanner;

public class SortThreeNumbersNested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int first, second, third;

        if (a <= b) {
            if (a <= c) {
                first = a;
                if (b <= c) {
                    second = b;
                    third = c;
                } else {
                    second = c;
                    third = b;
                }
            } else {
                first = c;
                second = a;
                third = b;
            }
        } else {
            if (b <= c) {
                first = b;
                if (a <= c) {
                    second = a;
                    third = c;
                } else {
                    second = c;
                    third = a;
                }
            } else {
                first = c;
                second = b;
                third = a;
            }
        }

        System.out.println("Numbers in ascending order: " + first + ", " + second + ", " + third);
    }
}