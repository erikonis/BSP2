import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Start nulber...");
        double x = scan.nextDouble();

        System.out.println("...End number");
        double y = scan.nextDouble();

        System.out.println("Step");
        double d = scan.nextDouble();

        for (x=x; x<y; x+=d){
            System.out.println(x);
        }

        scan.close();
    }
    
}
