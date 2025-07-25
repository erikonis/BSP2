public class QuadraticEquationTest {
    public static void main(String[] args) {

        // Declare scanner object to read data from key board
        Scanner sc = new Scanner(System.in);
 
        int a, b, c;
        // Read all coefficients
        System.out.print("Enter coefficient a: ");
        a = sc.nextInt();
 
        System.out.print("Enter coefficient b: ");
        b = sc.nextInt();
 
        System.out.print("Enter coefficient c: ");
        c = sc.nextInt();
 
        // Create object of QuadraticEquation class
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
 
        // Get discriminant
        int discriminant = qe.getDiscriminat();
 
        if (discriminant > 0) {
            System.out.println("\nThe equation has two rootse: ");
            System.out.println("Root1 : " + qe.getRoot1());
            System.out.println("Root2 : " + qe.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("\nThe equation has one root: ");
            System.out.println("Root : " + qe.getRoot1());
        } else {
            System.out.println("\nEquation has no roots.");
        }
    }
 
 }
    
}
