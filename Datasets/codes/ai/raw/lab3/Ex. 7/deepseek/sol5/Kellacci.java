import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms (n ≥ 1): ");
        int n = input.nextInt();
        
        if (n < 1) {
            System.out.println("Invalid input. Please enter n ≥ 1.");
            return;
        }

        System.out.println("Kellacci Sequence:");
        
        if (n >= 1) System.out.print("K1 = 1");
        if (n >= 2) System.out.print(", K2 = 1");
        
        // Initialize first two terms
        int kn2 = 1; // K(n-2)
        int kn1 = 1;  // K(n-1)
        int current;
        
        // Generate terms starting from K3
        for (int i = 3; i <= n; i++) {
            current = (kn1 - 1) + (kn2 * 2);
            System.out.print(", K" + i + " = " + current);
            
            // Update previous terms
            kn2 = kn1;
            kn1 = current;
        }
        
        System.out.println();
        input.close();
    }
}