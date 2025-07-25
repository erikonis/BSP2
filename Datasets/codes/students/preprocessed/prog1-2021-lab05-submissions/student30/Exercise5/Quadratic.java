import java.lang.Math;
import java.util.Scanner;
public class Quadratic {
    double a,b,c,result,root;

    public Quadratic(double value1,double value2,double value3){
        a = value1;
        b = value2;
        c = value3;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        result = b*b-4*a*c;
        return result;
    }
    public double getRoot1(){
        root = -b-(Math.sqrt(b*b-4*a*c))/2*a;
        return root;
    }
    public double getRoot2(){
        root = -b+(Math.sqrt(b*b-4*a*c))/2*a;
        return root;
    }
    public double getRoot(){
        root = -b/(2*a);
        return root;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double one = scanner.nextFloat();
        double two = scanner.nextFloat();
        double three = scanner.nextFloat();

        Quadratic initial = new Quadratic(one,two,three);  
        double discriminant = initial.getDiscriminant();
        System.out.println(discriminant);
        
        if (discriminant > 0){
            double root1 = initial.getRoot1();
            double root2 = initial.getRoot2();
            System.out.println(root1 + ", " + root2);
        }
        if (discriminant == 0){
            double root = initial.getRoot();
            System.out.println(root);
        }
        if (discriminant < 0){
            System.out.println("The equation has no roots!");
        }
    }
}



        

