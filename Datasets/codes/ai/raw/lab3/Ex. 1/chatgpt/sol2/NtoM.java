import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        scanner.close();

        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }
    }
}
