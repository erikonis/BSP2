package lu.uni.programming1.lab5.exercise1;
import java.util.Scanner;

@SuppressWarnings("all")
public class Launcher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the variable a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the variable b: ");
        int b = scanner.nextInt();
        System.out.println("Enter the variable c: ");
        int c = scanner.nextInt();
        Quadratic Q = new Quadratic(a, b, c);

        double D = Q.getDiscriminant();

        if (D>0){
            System.out.println("There are two roots\n" + "Root1: " + Q.getRoot1()+ "\nRoot2: " + Q.getRoot2());
        }
        else if (D<0) {
            System.out.println("The equation has no roots!");    
        }
        else if (D==0){
            System.out.println("There is one root: " +  Q.getRoot1());
        } 
        
	}

}
