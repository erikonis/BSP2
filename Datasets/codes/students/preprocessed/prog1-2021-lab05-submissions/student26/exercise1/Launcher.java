import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coefficients a b c (separate them with a space) : ");
        String input = scanner.nextLine();
        scanner.close();

        double a,b,c;
        String coefficients [] = input.split(" ");
        
        a = Double.parseDouble(coefficients[0]);
        b = Double.parseDouble(coefficients[1]);
        c = Double.parseDouble(coefficients[2]);
        
        Quadratic quadratic = new Quadratic(a, b, c);
        if (quadratic.getDiscriminant() > 0) {
            System.out.printf("There are two roots: \nRoot1: %.1f \nRoot2: %.1f", quadratic.getRoot1(), quadratic.getRoot2());
        }else if (quadratic.getDiscriminant() == 0) {
            System.out.printf("There is one root: %.1f", quadratic.getRoot1());
        }else {
            System.out.print("The equation has no roots!");
        }
        
    }
}
