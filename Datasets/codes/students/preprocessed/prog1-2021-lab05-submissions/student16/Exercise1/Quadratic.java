import java.util.Scanner;

public class Quadratic {

    private static int a, b, c;
    
    public Quadratic(int a, int b, int c)
    {
        Quadratic.a=a;
        Quadratic.b=b;
        Quadratic.c=c;
    }
    
    public static int getA()
    { 
        return a;
    }

    public static int getB()
    { 
        return b;
    }

    public static int getC()
    { 
        return c;
    }

    public static int getDiscriminant()
    {
        return (b*b)-(4*a*c);
    }

    public static double getRoot1()
    {
        return (-b+Math.sqrt(getDiscriminant()))/2*a;
    }

    public static double getRoot2()
    {
        return (-b-Math.sqrt(getDiscriminant()))/2*a;
    }

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the coefficients a b c: ");

        String text= scanner.nextLine();
        String[] x= text.split(" ");

        a= Integer.valueOf(x[0]);
        b= Integer.valueOf(x[1]);
        c= Integer.valueOf(x[2]);

        if(getDiscriminant()<0)
        {
            System.out.println("The equation has no roots!");
        }
        else if(getDiscriminant()==0)
        {
            System.out.print("There is one root: ");
            System.out.println(getRoot1());
        }
        else
        {
            System.out.println("There are two roots: ");

            System.out.print("Root1: ");
            System.out.println(getRoot1());

            System.out.print("Root2: ");
            System.out.println(getRoot2());
        }

        scanner.close();
    }

}
