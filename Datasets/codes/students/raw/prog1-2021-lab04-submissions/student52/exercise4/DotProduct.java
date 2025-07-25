import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), s = 0;
        int[] v = new int[N];
        int[] u = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            u[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++)
            s += v[i] * u[i];
        System.out.println("the dot product is " + s);

        scanner.close();
    }
}
