import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficient for a: ");
        double a = sc.nextDouble();
        System.out.println("Enter the coefficient for b: ");
        double b = sc.nextDouble();
        System.out.println("Enter the coefficient for c: ");
        double c = sc.nextDouble();


        Quadratic quad = new Quadratic(a, b, c);
        quad.getDiscriminant();
        if (quad.getDiscriminant() < 0){
            System.out.println("The equation has no roots!");  
        }
        else if (quad.getDiscriminant() == 0){
            System.out.print("There is one root: "+(-1*(b/2*a)));                
        }
        else {
            System.out.println("The equation has two roots:");
            System.out.println("Root 1: " + quad.getRoot1());
            System.out.println("Root 2: " + quad.getRoot2());
        }
        sc.close();
    }
}
