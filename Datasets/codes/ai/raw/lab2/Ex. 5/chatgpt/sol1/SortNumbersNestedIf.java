import java.util.Scanner;

public class SortNumbersNestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        scanner.close();

        int temp;
        if (a > b) { temp = a; a = b; b = temp; }
        if (b > c) { temp = b; b = c; c = temp; }
        if (a > b) { temp = a; a = b; b = temp; }

        System.out.println("Sorted: " + a + " " + b + " " + c);
    }
}
