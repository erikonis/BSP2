import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input
        System.out.println("a :");
        double a = scan.nextDouble();

        System.out.println("b :");
        double b = scan.nextDouble();

        System.out.println("c :");
        double c = scan.nextDouble();

        //Computation
        Quadratic q = new Quadratic(a, b, c);

        double disc = q.getDiscriminant();

        double[] roots = {q.getRoot1(), q.getRoot2()};

        //Display
        String msg = "";

        if (disc > 0){msg = "Root 1 = " + roots[0] + "\nRoot 2 = " + roots[1];}
        else if (disc == 0) {msg = "Double Root = " + roots[0];}//Could be roots[1] since they are the same
        else if (disc < 0) {msg = "There are no real root for this equation";}

        System.out.println(msg);

        scan.close();
    }
    
}
