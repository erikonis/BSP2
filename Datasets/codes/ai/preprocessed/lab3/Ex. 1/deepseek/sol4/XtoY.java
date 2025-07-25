import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] inputs = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
        for (double i = inputs[0]; i <= inputs[1]; i += inputs[2])
            System.out.printf("%.2f%n", i);
        sc.close();
    }
}