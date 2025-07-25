import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        //initialze scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number to stat with: ");
        double x = scanner.nextDouble();
        System.out.println("Please enter the number until then you want to count: ");
        double y = scanner.nextDouble();
        System.out.println("Please enter the number of steps: ");
        double d = scanner.nextDouble();
        System.out.println("Counting:");
        for(double i =x; i<y+d;i=i+d)
        { 
            System.out.println(i);
            
        }
        //scanner close
        scanner.close();
    }
}
