import java.util.Scanner;
 


public class QuadraticEquation {

   

    public static void main(String[] args) {

       double a =  getA();
       double b = getB();
       double c = getC();
       double Discriminant = getDiscriminant(a,b,c);

       System.out.println("The discriminant is: "+Discriminant);
        System.out.println();
        

if (getDiscriminant(a,b,c) > 0){

    System.out.println("The coefficcients are: "+a+" "+b+" "+c);
    System.out.println("Root1: "+getroot1(a,b,c));
    System.out.println("Root2: "+getroot2(a,b,c));}

 else if (Discriminant < 0){

        System.out.println("The equation has no roots");
    }

else if (Discriminant == 0){

    System.out.println("The equation has one root");
    System.out.println("Root: "+(getroot2(a,b,c)));
}    


}


    private static double getroot1(double x ,double y ,double z) {

        double root1 = (-y + Math.sqrt(getDiscriminant(x, y, z))/2*x);

return (root1);

    }


    private static double getroot2(double x, double y, double z) {

        return (-y -(Math.sqrt(getDiscriminant(x, y, z)))/2*x);
    }

    private static double getDiscriminant(double x, double y, double z) {

        return ((y*y)-4*x*z);
    }
    
    static Scanner scanner = new Scanner(System.in);

    public static double getA(){
       System.out.println("Please enter the value of a: ");

        double a = scanner.nextDouble();
        return a;


    }

    public static double getB(){
        System.out.println("Please enter the value of b: ");
double b = scanner.nextDouble();

return b;

    }

    public static double getC(){
        System.out.println("Please enter the value of c: ");

        double c = scanner.nextDouble();

        return c;
    }

}
