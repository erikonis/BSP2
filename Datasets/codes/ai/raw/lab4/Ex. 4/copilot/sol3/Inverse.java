import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N: ");
        int N = scanner.nextInt();
        double[] vector = new double[N];
        
        System.out.println("Enter the vector elements:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }
        
        double[] inverseVector = new double[N];
        for (int i = 0; i < N; i++) {
            inverseVector[i] = -vector[i];
        }
        
        System.out.println("Inverse vector:");
        for (double v : inverseVector) {
            System.out.print(v + " ");
        }
    }
}
