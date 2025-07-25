import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,m;
        System.out.print("Enter counter starting number: ");
        n = scanner.nextInt();
        System.out.print("Enter counter ending number: ");
        m = scanner.nextInt();
        scanner.close();

        for (int i = n; i < m+1; i++) {
            System.out.println(i);
        }
    }
}
