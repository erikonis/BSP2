import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number (n):");
        int n = scanner.nextInt();
        System.out.println("Enter the ending number (m):");
        int m = scanner.nextInt();

        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }
    }
}
