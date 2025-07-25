import java.util.Scanner;

public class Quadratic {

    private static double A;
    private static double B;
    private static double C;

        public Quadratic(double a, double b, double c)
    {
        A = a;
        B = b;
        C = c;
    }
    
    private static double getDiscriminant()
    {
        double discriminant = (B * B) - (4 * A * C);
        return discriminant;
    }
    static double getRoot1()
    {
        double root1 = (-B + Math.sqrt(getDiscriminant()))/ (2 * A);
        return root1;
    
    }
    static double getRoot2()
    {
        double root2 = (-B - Math.sqrt(getDiscriminant()))/ (2 * A);
        return root2;
    
    }
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a, b and c for a Quadratic: ");
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
    
        double discriminant = getDiscriminant();
    
        if (discriminant < 0)
        {
            System.out.println("The equation has no roots!");
    
        }
        else if (discriminant == 0)
        {
            System.out.println("There is one root: "+getRoot1());
        }
        else
        {
            System.out.println("There are two roots: ");
            System.out.println("Root1: "+getRoot1());
            System.out.println("Root2: "+getRoot2());
        }
    scan.close();
    }

}