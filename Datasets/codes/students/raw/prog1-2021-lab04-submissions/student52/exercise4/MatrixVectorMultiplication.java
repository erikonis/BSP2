import java.util.Scanner;

public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] v = new int[N];
        int[] s = new int[N];
        int[][] m = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                m[i][j] = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            v[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            s[i] = 0;
            for (int j = 0; j < N; j++)
                s[i] += m[i][j] * v[j];
            System.out.println(s[i] + " ");
        }

        scanner.close();
    }

}
