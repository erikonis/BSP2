import java.util.Scanner;

public class SortWithNestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min, mid, max;

        if (a <= b) {
            if (b <= c) {
                min = a; mid = b; max = c;
            } else if (a <= c) {
                min = a; mid = c; max = b;
            } else {
                min = c; mid = a; max = b;
            }
        } else {
            if (a <= c) {
                min = b; mid = a; max = c;
            } else if (b <= c) {
                min = b; mid = c; max = a;
            } else {
                min = c; mid = b; max = a;
            }
        }

        System.out.println("Sorted: " + min + " " + mid + " " + max);
    }
}
