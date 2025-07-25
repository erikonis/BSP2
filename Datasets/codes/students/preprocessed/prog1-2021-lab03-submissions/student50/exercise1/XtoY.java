import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please input a value for x: ");
        double x = sc.nextDouble();
        System.out.println("Please input a value for y: ");
        double y = sc.nextDouble();
        System.out.println("Please number of steps in for d: ");
        double d = sc.nextDouble();

        for (double i= x; i < y;i+=d){
             System.out.printf("\n %.2f", i);
        }

        //System.out.printf("\n %.2f", y);
        sc.close();
       
    }
}
