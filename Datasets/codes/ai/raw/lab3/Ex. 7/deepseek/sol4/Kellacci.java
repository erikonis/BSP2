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
            int kPrev2 = 1;  // K(n-2)
            int kPrev1 = 1;  // K(n-1)
            int current;
            
            for (int i = 3; i <= n; i++) {
                current = (kPrev1 - 1) + (kPrev2 * 2);
                System.out.print(", K" + i + " = " + current);
                
                // Update previous values for next iteration
                kPrev2 = kPrev1;
                kPrev1 = current;
            }
        }
        
        System.out.println();
        scanner.close();
    }
}