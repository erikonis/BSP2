import java.util.Scanner;
import java.lang.Math;

public class Norm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), s = 0;
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = scanner.nextInt();
            s += v[i] * v[i];
        }
        System.out.println("The euclidian norm of this vector is " + Math.sqrt(s));
        scanner.close();
    }
}