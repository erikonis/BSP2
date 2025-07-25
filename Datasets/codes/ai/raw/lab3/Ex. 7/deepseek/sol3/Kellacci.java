import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        System.out.println("Kellacci sequence up to term " + n + ":");
        
        if (n >= 1) {
            System.out.print("K1 = 1");
        }
        if (n >= 2) {
            System.out.print(", K2 = 1");
        }
        
        if (n > 2) {
            long knMinus2 = 1;  // K1
            long knMinus1 = 1;  // K2
            long kn;
            
            for (int i = 3; i <= n; i++) {
                kn = (knMinus1 - 1) + (knMinus2 * 2);
                System.out.print(", K" + i + " = " + kn);
                
                // Update values for next iteration
                knMinus2 = knMinus1;
                knMinus1 = kn;
            }
        }
        
        System.out.println();
        scanner.close();
    }
}