import java.util.Scanner;

public class SortWithNestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int first, second, third;

        if (a <= b) {
            if (b <= c) {
                first = a; second = b; third = c;
            } else if (a <= c) {
                first = a; second = c; third = b;
            } else {
                first = c; second = a; third = b;
            }
        } else {
            if (a <= c) {
                first = b; second = a; third = c;
            } else if (b <= c) {
                first = b; second = c; third = a;
            } else {
                first = c; second = b; third = a;
            }
        }

        System.out.println("Sorted: " + first + " " + second + " " + third);
    }
}