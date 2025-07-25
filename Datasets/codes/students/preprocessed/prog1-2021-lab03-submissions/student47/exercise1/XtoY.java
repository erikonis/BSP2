import java.util.Scanner;

public class XtoY {
    
    public static void main (String[]args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number Y : ");
        double Y = scanner.nextDouble();
        System.out.println("Enter the number D : ");
        double D = scanner.nextDouble();
        System.out.println("Enter the number X : ");
        double X = scanner.nextDouble();

        for (double i = X; i <= Y+0.0001 ; i=i+D)
            System.out.printf("%,.2f\n",i); 
        for (double j = Y; j <= X+0.0001 ; j=j+D)
            System.out.printf("%,.2f\n",j);

        scanner.close();    
    }

}
