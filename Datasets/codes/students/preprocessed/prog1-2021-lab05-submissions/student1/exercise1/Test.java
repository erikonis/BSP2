import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quadratic result;

        double a, b, c;

        System.out.print("Enter the coefficients a, b, c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        result = new Quadratic(a, b, c);
        result.calculate();
        scanner.close();
    }
    
}
