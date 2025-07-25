import java.util.Scanner;

public class XtoY {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter beginning number: ");

                double x = scanner.nextDouble();

            System.out.println("Please enter ending number: ");

                double y = scanner.nextDouble();

            System.out.println("Please enter step length: ");

                double d = scanner.nextDouble();

        scanner.close();

            for (double z = x; z <= y ; z += d)
                {
                    System.out.printf("%.5f", z);
                    System.out.println("");
                }
        
    }
    
}
