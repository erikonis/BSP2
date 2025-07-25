import java.util.Scanner;

public class SortThreeNumbersNonNested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        
        int first = Math.min(Math.min(a, b), c);
        int third = Math.max(Math.max(a, b), c);
        int second = a + b + c - first - third;
        
        System.out.println("Numbers in ascending order: " + first + ", " + second + ", " + third);
    }
}