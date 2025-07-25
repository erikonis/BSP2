import java.util.Scanner;

public class AscendingOrderNestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();
        System.out.print("Enter third integer: ");
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

        System.out.println("Ascending order: " + first + " " + second + " " + third);
    }
}