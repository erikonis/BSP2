import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = scanner.nextInt();
            v[i] = -v[i];
        }
        for (int i = 0; i < N; i++)
            System.out.print(v[i] + ",");

        scanner.close();
    }

}
