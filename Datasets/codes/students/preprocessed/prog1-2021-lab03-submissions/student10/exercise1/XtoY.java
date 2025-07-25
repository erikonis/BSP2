import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("value of X: ");

        double x = scanner.nextDouble();

        System.out.println("value of Y: " );

        double y = scanner.nextDouble();

        System.out.println("value of D: " );

        double d = scanner.nextDouble();

        System.out.println("");

        if(x>y){
            double temp=x;
            x=y;
            y=temp;
        }

        for(double i=x;i<=y;i=i+d)
            System.out.printf( "\n %.2f ", i);

        scanner.close();
    }
}

