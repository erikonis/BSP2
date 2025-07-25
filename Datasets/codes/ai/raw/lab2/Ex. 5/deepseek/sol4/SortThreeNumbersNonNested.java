import java.util.Scanner;

public class SortThreeNumbersNonNested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        System.out.println("Sorted numbers (without nesting):");
        
        // Find the smallest
        int smallest = Math.min(Math.min(a, b), c);
        
        // Find the largest
        int largest = Math.max(Math.max(a, b), c);
        
        // Find the middle by elimination
        int middle = a + b + c - smallest - largest;
        
        System.out.println(smallest + " " + middle + " " + largest);
        
        scanner.close();
    }
}