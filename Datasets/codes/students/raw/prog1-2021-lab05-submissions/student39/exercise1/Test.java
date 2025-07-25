package exercise1;
import java.util.*;
public class Test {
    public static void main(String args[]) {
 
        Scanner console = new Scanner(System.in);
 // Get a, b, c  
        
	System.out.println("Please enter value A: ");
        int a  = console.nextInt();

        System.out.println("Please enter value B: ");
        int b  = console.nextInt();

        System.out.println("Please enter value C: ");
        int c  = console.nextInt();
//Quadradic

    Quadratic myObj = new Quadratic(a,b,c);
	double  d = myObj.getDiscriminant();
	double r1 = myObj.getRoot1();
	double  r2 = myObj.getRoot2();
	if (d >0) {
		System.out.println("There are two roots:");
		System.out.println("Root 1: " + r1);
		System.out.println("Root 2: " + r2);
	} 
	else if (d == 0){
		System.out.println("There is one root: " + r1);
	} 
	else {
		System.out.println("The equation has no roots!");
	}   
}
}
