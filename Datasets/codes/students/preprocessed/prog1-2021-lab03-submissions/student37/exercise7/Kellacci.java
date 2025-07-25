import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please the number of terms n to print in the sequence (greater than 2): ");
        int kn = scanner.nextInt();  
        scanner.close();

        int a = 1, k1 = 1, k2 = 1;
        System.out.print("Kellacci sequence of " + kn + " terms: ");
        while(a <= kn)
        {
            System.out.print(k1 + " " );
            int total = (k2 - 1) + (k1 * 2);
            k1 = k2;
            k2 = total;
            a++;
        } 
    }
}
