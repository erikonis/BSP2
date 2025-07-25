import java.util.Scanner;

public class test {
    
    
    public static void main(String[] args) {

        System.out.println("Please enter the value for a, then b, then c. ax² + bx + c = 0");

        Scanner scanner = new Scanner(System.in);

        Quadratic abc = new Quadratic(0, 0, 0);

        abc.a = scanner.nextDouble();
        abc.b = scanner.nextDouble();
        abc.c = scanner.nextDouble();

        scanner.close();

        System.out.println(abc.getDiscriminant());

        if (abc.getDiscriminant() > 0) 
        {
            System.out.println("There are 2 roots: \nRoot1: " + abc.getRoot1() + "\nRoot2: " + abc.getRoot2());
        } 
        else if (abc.getDiscriminant() == 0)
        {
            System.out.println("There is 1 root: " + abc.getRoot1());
        }
        else 
        {
            System.out.println("The equation has no roots!");
        }

        
    }
    
    
}
